
package teste.Deposito;

import java.util.Scanner;
import persistencia.ContaDAO;
import persistencia.DepositoDAO;


public class Teste_listarDepositos {


    public static void main(String[] args) throws Exception {       
            Teste_listarDepositos novo = new Teste_listarDepositos();
            novo.Teste_listarDepositos();
        }
        public void Teste_listarDepositos() throws Exception{
        Scanner input = new Scanner(System.in);         
             
        System.out.println("LISTA DOS DEPOSITOS EFETUADOS ATÉ O MOMENTO"); 
        System.out.println("_____________________________________________________________");
        System.out.println(DepositoDAO.listarDepositos());
            

    }
    
}
