
package teste.Saque;

import modelo.Saque;
import java.util.Scanner;
import persistencia.SaqueDAO;


public class Teste_consultarSaque {


    public static void main(String[] args) throws Exception {   
        Teste_consultarSaque novo = new Teste_consultarSaque();
        novo.Teste_consultarSaque();
    } 
    public void Teste_consultarSaque() throws Exception{
        Scanner input = new Scanner(System.in);  
        
        System.out.println("CONSULTAR SAQUE");
        System.out.print("CONTA: "); String numeroConta = input.next();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(SaqueDAO.consultarSaque(numeroConta));
    }
    
}
