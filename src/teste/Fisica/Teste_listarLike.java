
package teste.Fisica;

import java.util.Scanner;
import persistencia.FisicaDAO;

public class Teste_listarLike {

    public static void main(String[] args) throws Exception {
        Teste_listarLike novo = new Teste_listarLike();
        novo.Teste_likeListarPessoasFisicas();
        
    }
    
    public void Teste_likeListarPessoasFisicas() throws Exception{
            Scanner input = new Scanner(System.in);
            System.out.println("\nSOMENTE VALORES ALFABETICOS SÃO PERMITIDOS");
            System.out.print("Referência: "); String nome = input.next();            
            System.out.print("-  -  -  -  -  -  -  -  -  -\n");
            System.out.println(FisicaDAO.like_ListarPessoasFisicas(nome));
            System.out.println("--------------------------------------------");  
            
    }
    
}
