
package teste.Juridica;

import teste.Fisica.*;
import java.util.Scanner;
import persistencia.JuridicaDAO;


public class carregarNome {


    public static void main(String[] args) {
        carregarNome novo = new carregarNome(); 
        novo.carregarNome();       
    }
    public void carregarNome(){
            Scanner input = new Scanner(System.in);
            System.out.print("Usuario: "); String usuario = input.next();     
            System.out.println(JuridicaDAO.nomeUsuario(usuario));
        
    }
    
}
