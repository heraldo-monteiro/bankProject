
package teste.Juridica;

import java.util.Scanner;
import persistencia.JuridicaDAO;

public class Teste_pesquisarPessoaJuridica {


    public static void main(String[] args) throws Exception {
        Teste_pesquisarPessoaJuridica novo = new Teste_pesquisarPessoaJuridica();
        novo.Teste_pesquisarPessoaJuridica();
        }
        public void Teste_pesquisarPessoaJuridica() throws Exception{
           Scanner input = new Scanner(System.in); 
            System.out.println("CONSULTAR PESSOA JURIDICA\n________________________");        
            System.out.print("Peencha o Campo abaixo com um valor valido\nCNPJ:"); String cnpj = input.next();
            System.out.println("_____________________________________________________________");
            System.out.println(JuridicaDAO.consultarPessoaJuridica(cnpj));
            
            
    }
}
