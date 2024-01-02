
package teste.Endereco;

import java.util.Scanner;
import modelo.Endereco;
import modelo.Fisica;
import modelo.Juridica;
import persistencia.EnderecoDAO;


public class Teste_pesquisarEndereco {


    public static void main(String[] args) throws Exception {
        Teste_pesquisarEndereco novo = new Teste_pesquisarEndereco();
        novo.Teste_pesquisarEndereco();
    }
    public void Teste_pesquisarEndereco() throws Exception{
           Scanner input = new Scanner(System.in);   
        
        System.out.println("SELECIONE UMA OPÇÃO PARA PROCEGUIR\n\n\uFD3E\u2460 Pessoa Fisica\uFD3F  \uFD3E\u2461 Pessoa Juridica\uFD3F");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Opção: "); int opcao = input.nextInt();
        System.out.println("_____________________________________________________________");
        if(opcao == 1){
            System.out.println("Consultar Endereço de Pessoa Fisica");
            System.out.println("_____________________________________________________________");
            System.out.println("Peencha o Campo (CPF) Com Um Valor Valido ");
            System.out.print("CPF: "); String cpf = input.next();   
            System.out.println(EnderecoDAO.consultarEnderecoPessoaFisica(cpf));
            
        }
        else if(opcao == 2){
            System.out.println("Consultar Endereço de Pessoa Juridica");
            System.out.println("_____________________________________________________________");
            System.out.println("Peencha o Campo (CNPJ) Com Um Valor Valido ");
            System.out.print("CNPJ: "); String cnpj = input.next();
            System.out.println(EnderecoDAO.consultarEnderecoPessoaJuridica(cnpj));  
            
        }         
       
    }
    
}
