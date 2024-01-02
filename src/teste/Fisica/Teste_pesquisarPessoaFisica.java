
package teste.Fisica;

import java.util.Scanner;
import persistencia.FisicaDAO;

public class Teste_pesquisarPessoaFisica {    

    public static void main(String[] args) throws Exception{
        Teste_pesquisarPessoaFisica novo = new Teste_pesquisarPessoaFisica();
        novo.Teste_pesquisarPessoaFisica();
    }
    
    public void Teste_pesquisarPessoaFisica() throws Exception{
    
        Scanner input = new Scanner(System.in);              
            System.out.println("CONSULTAR PESSOA FISICA\n________________________");        
            System.out.print("Peencha o Campo abaixo com um valor valido\nCPF:"); String cpf = input.next();
            System.out.println("_____________________________________________________________");
            System.out.println(FisicaDAO.consultarPessoaFisica(cpf));           
            
    }
    
}
