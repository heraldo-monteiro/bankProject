
package teste.Endereco;

import java.util.Scanner;
import persistencia.EnderecoDAO;

public class Teste_excluirEndereco {

 
    public static void main(String[] args) throws Exception {
        Teste_excluirEndereco novo = new Teste_excluirEndereco();
        novo.Teste_excluirEndereco();
    }
    public void Teste_excluirEndereco() throws Exception{
            Scanner input = new Scanner(System.in);  
            System.out.println("ESCLUSÃO DE ENDEDREÇO");
            System.out.println("[1]PESSOA FISICA \n[2]PESSOA JURIDICA");
            System.out.println("_____________________________________________________________");
            System.out.println("Selecione o Opção");
            System.out.print("Opção: "); int opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("_____________________________________________________________");
                System.out.println("EXCLUIR ENDEREÇO PESSOA FISICA");  
                System.out.println("----------------------");
                System.out.println("Localizar Antes de Excluir");
                System.out.print("  CPF: "); String cpf = input.next(); 
                System.out.println("_____________________________________________________________");
                System.out.println(EnderecoDAO.consultarEnderecoPessoaFisica(cpf));
                System.out.println("_____________________________________________________________");
                System.out.print("Deseja Realmente Excluir Esse Registro? \n[1]Sim | [0]Não \n- - - - - - - -\n");

                System.out.print("Opção: "); opcao = input.nextInt();
                if(opcao == 0){             
                    System.out.println("Agradecemos por Permanecer Conosco!");

                }else if(opcao == 1){
                    System.out.println("Seu Registro Foi Deletado com SUCESSO!");                     
                    System.out.println(EnderecoDAO.excluirEnderecoPessoaFisica(cpf)+" RECORD DELETED");  
                } 
            }
            else if(opcao == 2){
                System.out.println("_____________________________________________________________");    
                System.out.println("EXCLUIR ENDEREÇO PESSOA JURIDICA");  
                System.out.println("----------------------");
                System.out.println("Localizar Antes de Excluir");
                System.out.print("  CNPJ: "); String cnpj = input.next(); 
                System.out.println("_____________________________________________________________");
                System.out.println(EnderecoDAO.consultarEnderecoPessoaJuridica(cnpj));
                System.out.println("_____________________________________________________________");
                System.out.print("Deseja Realmente Excluir Esse Registro? \n[1]Sim | [0]Não \n- - - - - - - -\n");

                System.out.print("Opção: "); opcao = input.nextInt();
                if(opcao == 0){             
                    System.out.println("Agradecemos por Permanecer Conosco!");

                }else if(opcao == 1){
                    System.out.println("Seu Registro Foi Deletado com SUCESSO!");                     
                    System.out.println(EnderecoDAO.excluirEnderecoPessoaJuridica(cnpj));
                } 
                
            }     
    }    
}
