
package teste.Deposito;

import java.util.Scanner;
import persistencia.DepositoDAO;


public class Teste_consultarDeposito {


    public static void main(String[] args) throws Exception {    
        Teste_consultarDeposito novo = new Teste_consultarDeposito();
        novo.Teste_consultarDeposito();
    }
    public void Teste_consultarDeposito() throws Exception{        
        Scanner input = new Scanner(System.in);      
        
        System.out.println("CONSULTAR DEPOSITO");
        System.out.print("CONTA: "); String numeroConta = input.next();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(DepositoDAO.consultarDeposito(numeroConta));
    }
    
}
