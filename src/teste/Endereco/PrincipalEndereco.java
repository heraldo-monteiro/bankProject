
package teste.Endereco;

import java.util.Scanner;
import teste.Endereco.*;


public class PrincipalEndereco {

  
    public static void main(String[] args) throws Exception {
        PrincipalEndereco novo = new PrincipalEndereco();
        novo.PrincipalEndereco();
        }
    public void PrincipalEndereco() throws Exception{
        
      Scanner input = new Scanner(System.in);
        System.out.println("MENU ENDEREÇO");
        System.out.println("\n[1].......... Cadastrar"
                +"\n[2].......... Alterar"
                +"\n[3].......... Excluir"
                +"\n[4].......... Listar"
                +"\n[5].......... Pesquisar" );
        System.out.println("_____________________________________________________________");
        System.out.println("ESCOLHA UMA DAS OPÇÕES");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");        
    
            if(opcao == 1){
            Teste_cadastrarEndereco cadastrar = new Teste_cadastrarEndereco();
                cadastrar.Teste_cadastrarEndereco();
            }
            else if(opcao == 2){
                Teste_atualizarEndereco alterar = new Teste_atualizarEndereco();
                alterar.Teste_atualizarEndereco();
            }
            else if(opcao == 3){
                Teste_excluirEndereco excluir = new Teste_excluirEndereco();
                excluir.Teste_excluirEndereco();
            }
            else if(opcao == 4){
                Teste_listarEndereco listar = new Teste_listarEndereco();
                listar.Teste_listarEnderecos();
            }
            else if(opcao == 5){
                Teste_pesquisarEndereco pesquisar = new Teste_pesquisarEndereco();
                pesquisar.Teste_pesquisarEndereco();

            }
        
    }
    
}
