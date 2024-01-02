
package teste.Endereco;

import java.util.Scanner;
import persistencia.EnderecoDAO;

public class Teste_listarEndereco {

    public static void main(String[] args) throws Exception {   
        Teste_listarEndereco novo = new Teste_listarEndereco();
        novo.Teste_listarEnderecos();
    }
    public void Teste_listarEnderecos() throws Exception{
         Scanner input = new Scanner(System.in);         
             
        System.out.println("CONSULTAR LISTA DE ENDEREÇOS");
        System.out.println("[1]Endereço Pessoa Fisica \n[2]Endereço Pessoa Juridica\n[3]Endereço Pessoa Fisica/Juridica");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");
        
        if(opcao == 1){           
            System.out.println(EnderecoDAO.listarEnderecosPessoasFisicas());             
        }
        else if(opcao == 2){                
            System.out.println(EnderecoDAO.listarEnderecosPessoasJuridicas());   
            
        }
        else if(opcao == 3){
            System.out.println(EnderecoDAO.listarEnderecosPessoasFisicas());
            System.out.println(EnderecoDAO.listarEnderecosPessoasJuridicas());
        }
    }
    
}
