
package teste.Deposito;


import java.sql.ResultSet;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

import modelo.Conta;
import modelo.Deposito;
import persistencia.ContaDAO;
import persistencia.DepositoDAO;


public class Teste_efetuarDepositos {
 
    public static void main(String[] args) throws Exception{
        Teste_efetuarDepositos novo = new Teste_efetuarDepositos();
        novo.Teste_efetuarDepositos();      
        
    }
    public void Teste_efetuarDepositos() throws Exception{  
        Scanner input = new Scanner(System.in);  
        
        System.out.println("EFETUAR DEPOSITO");        
        System.out.println("_____________________________________________________________");   
        
        System.out.print("Conta de Deposito:"); String numeroConta = input.next();  
        System.out.print("Valor do Deposito: "); Double valor = input.nextDouble();       

        Random codDeposito = new Random();      
        String code =""+codDeposito.nextInt(999999999);        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);         
        
        Deposito deposito = new Deposito();
        deposito.setCode(code);
        deposito.setData(dateFormat.format(date));
        deposito.setValor(valor);  
                
        Conta conta = new Conta();
        conta.setNumeroConta(numeroConta);         
        deposito.setConta(conta);
        conta.setSaldo(ContaDAO.saque_deposito(numeroConta)+ valor);
       
        System.out.println(DepositoDAO.efetuarDeposito(deposito)); 
        System.out.println(ContaDAO.atualizarSaldo(conta, numeroConta));
       
              
        
      
    }    
}
