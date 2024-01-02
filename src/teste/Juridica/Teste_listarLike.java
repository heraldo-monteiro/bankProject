
package teste.Juridica;

import java.util.Scanner;

import persistencia.JuridicaDAO;

public class Teste_listarLike {

    public static void main(String[] args) throws Exception {
        Teste_listarLike novo = new   Teste_listarLike();
        novo.Teste_listarLike();
        }
        public void Teste_listarLike() throws Exception{
            Scanner input = new Scanner(System.in);
            System.out.println("\nSOMENTE VALORES ALFABETICOS SÃO PERMITIDOS");
            System.out.print("Referência: "); String nome = input.next();            
            System.out.print("-  -  -  -  -  -  -  -  -  -\n");
            System.out.println(JuridicaDAO.likeListarPessoasJuridicas(nome));
            System.out.println("--------------------------------------------");  
            
    }
    
}
