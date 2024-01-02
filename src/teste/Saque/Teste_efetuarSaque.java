
package teste.Saque;


import teste.Deposito.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Random;
import java.util.Scanner;
import modelo.Conta;
import modelo.Deposito;
import modelo.Saque;
import persistencia.ContaDAO;
import persistencia.DepositoDAO;
import persistencia.SaqueDAO;

public class Teste_efetuarSaque {
 
    public static void main(String[] args) throws Exception{
        Teste_efetuarSaque novo = new Teste_efetuarSaque();
        novo.Teste_efetuarSaques();
    }
    
    public void Teste_efetuarSaques() throws Exception{  
        Scanner input = new Scanner(System.in);  
        
        System.out.println("EFETUAR SAQUE");        
        System.out.println("_____________________________________________________________");
                
        System.out.print("Conta de Saque:"); String numeroConta = input.next();  
        System.out.print("Valor do Saque: "); Double valor = input.nextDouble();

        Random codDeposito = new Random();      
        String code =""+codDeposito.nextInt(999999999);        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	dateFormat.format(date);         
        
        Saque saque = new Saque();
        saque.setCode(code);
        saque.setData(dateFormat.format(date));
        saque.setValor(valor); 
                
        Conta conta = new Conta();
        conta.setNumeroConta(numeroConta);         
        saque.setConta(conta);
        conta.setSaldo(ContaDAO.saque_deposito(numeroConta) - valor);
       
        System.out.println(SaqueDAO.efetuarSaques(saque));    
        System.out.println(ContaDAO.atualizarSaldo(conta, numeroConta));
             
        
      
    }    
}
