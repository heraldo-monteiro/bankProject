
package teste.Saque;

import teste.Deposito.*;
import java.util.Scanner;
import persistencia.ContaDAO;
import persistencia.SaqueDAO;


public class Teste_listarSaque {


    public static void main(String[] args) throws Exception {      
        Teste_listarSaque novo = new Teste_listarSaque();
        novo.Teste_listarSaques();
    }
    public void Teste_listarSaques() throws Exception{        
        Scanner input = new Scanner(System.in);         
             
        System.out.println("LISTA DOS SAQUES EFETUADOS ATÉ O MOMENTO"); 
        System.out.println("_____________________________________________________________");
        System.out.println(SaqueDAO.listarSaques());
            

    }
    
}
