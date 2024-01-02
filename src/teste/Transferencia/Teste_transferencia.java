
package teste.Transferencia;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import modelo.Conta;
import modelo.Deposito;
import modelo.Saque;
import persistencia.ContaDAO;
import persistencia.DepositoDAO;
import persistencia.SaqueDAO;
import teste.Saque.*;
import teste.Deposito.*;
import java.util.Scanner;

public class Teste_transferencia {

  
    public static void main(String[] args) throws Exception {  
        Teste_transferencia novo = new Teste_transferencia();
        novo.Teste_transferencia();      
    }
    public void Teste_transferencia() throws Exception{
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta();
        
        System.out.println("TRANSFERENCIA BANCÁRIA");        
        System.out.println("_____________________________________________________________");
                
        System.out.print("Conta de Origem:"); String contaSaque = input.next(); 
         System.out.print("Conta de Destino:"); String contaDeposito = input.next(); 
        System.out.print("Valor da Tranferência: "); Double valor = input.nextDouble();

        Random codSaque = new Random();      
        String code =""+codSaque.nextInt(999999999);        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);         
        
        Saque saque = new Saque();
        saque.setCode(code);
        saque.setData(dateFormat.format(date));
        saque.setValor(valor); 
        
        conta.setNumeroConta(contaSaque);         
        saque.setConta(conta);
        conta.setSaldo(ContaDAO.saque_deposito(contaSaque) - valor);
        
        System.out.println(ContaDAO.atualizarSaldo(conta, contaSaque));
        System.out.println(SaqueDAO.efetuarSaques(saque));   
    //--------------------------------------------------------------------------      
        
        Deposito deposito = new Deposito();
        deposito.setCode(code);
        deposito.setData(dateFormat.format(date));
        deposito.setValor(valor);            
        
        conta.setNumeroConta(contaDeposito);         
        deposito.setConta(conta);
        conta.setSaldo(ContaDAO.saque_deposito(contaDeposito) + valor);  
        
        System.out.println(ContaDAO.atualizarSaldo(conta, contaDeposito));  
        System.out.println(DepositoDAO.efetuarDeposito(deposito)); 
        
        
        
        
    }
    
}
