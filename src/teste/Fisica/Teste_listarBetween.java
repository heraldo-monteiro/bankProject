
package teste.Fisica;

import java.util.Scanner;
import persistencia.FisicaDAO;


public class Teste_listarBetween {

    public static void main(String[] args) throws Exception {
        Teste_listarBetween fisica = new Teste_listarBetween();
        fisica.Teste_betweenListarPessoasFisicas();   
    }
    
    public void Teste_betweenListarPessoasFisicas() throws Exception{
            Scanner input = new Scanner(System.in);
            System.out.println("Lista as  Pessoas Fisicas entre as idades informadas\n");
            System.out.print("Idade Minima: "); int menor_idade = input.nextInt();
            System.out.print("Idade Maxima: "); int maior_idade = input.nextInt();
            System.out.print("-  -  -  -  -  -  -  -  -  -\n");
            System.out.println(FisicaDAO.listaBetweenPessoFisica(menor_idade, maior_idade));
            System.out.println("--------------------------------------------");

                
   }
}
