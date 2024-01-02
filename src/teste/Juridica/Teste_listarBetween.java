
package teste.Juridica;

import java.util.Scanner;
import persistencia.JuridicaDAO;

public class Teste_listarBetween {

   
    public static void main(String[] args) throws Exception {
        Teste_listarBetween novo = new Teste_listarBetween();
        novo.Teste_listarBetween();
        }
        public void Teste_listarBetween() throws Exception{            
           Scanner input = new Scanner(System.in);
           System.out.println("Lista as  Pessoas Juridicas entre as idades informadas\n");
           System.out.print("Idade Minima: "); int menor_idade = input.nextInt();
           System.out.print("Idade Maxima: "); int maior_idade = input.nextInt();
           System.out.print("-  -  -  -  -  -  -  -  -  -\n");
           System.out.println(JuridicaDAO.listaBetweenPessoJuridica(menor_idade, maior_idade));
           System.out.println("--------------------------------------------");

    }
    
}
