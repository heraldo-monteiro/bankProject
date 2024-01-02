
package teste.Fisica;
import java.util.Scanner;
import teste.Fisica.Teste_cadastrar; // Cadastrar 1
import teste.Fisica.Teste_atualizar; // Alterar 2
import teste.Fisica.Teste_excluir; // Excluir 3
import teste.Fisica.Teste_listar; // Listar
import teste.Fisica.Teste_pesquisarPessoaFisica; // Pesquisar
import teste.Fisica.Teste_listarBetween; // Listar com Between
import teste.Fisica.Teste_listarLike; // Listar com Like


public class PrincipalFisica {

    public static void main(String[] args) throws Exception {
        PrincipalFisica novo = new PrincipalFisica();
        novo.PrincipalFisica();
        }
        public void PrincipalFisica() throws Exception{
        
        Scanner input = new Scanner(System.in);
        System.out.println("MENU PESSOA FISICA");
        System.out.println("\n[1].......... Cadastrar"
                +"\n[2].......... Alterar"
                +"\n[3].......... Excluir"
                +"\n[4].......... Listar"
                +"\n[5].......... Pesquisar"  
                +"\n[6].......... Listar Com Between"
                +"\n[7].......... Listar Com Like");
        System.out.println("_____________________________________________________________");
        System.out.println("ESCOLHA UMA DAS OPÇÕES");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");        
    
            if(opcao == 1){
            Teste_cadastrar cadastrar = new Teste_cadastrar();
                cadastrar.Teste_cadastrarPesoaFisica();            
            }
            else if(opcao == 2){
                Teste_atualizar alterar = new Teste_atualizar();
                alterar.Teste_atualizarPessoaFisica();
            }
            else if(opcao == 3){
                Teste_excluir excluir = new Teste_excluir();
                excluir.Teste_excluirPessoaFisica();
            }
            else if(opcao == 4){
                Teste_listar listar = new Teste_listar();
                listar.Teste_listarPessoasFisicas();            
            }
            else if(opcao == 5){
                Teste_pesquisarPessoaFisica pesquisar = new Teste_pesquisarPessoaFisica();
                pesquisar.Teste_pesquisarPessoaFisica();                    

            }
            else if(opcao == 6){
            Teste_listarBetween between = new Teste_listarBetween();
                between.Teste_betweenListarPessoasFisicas(); 


            }
            else if(opcao == 7){
                Teste_listarLike like = new Teste_listarLike();
                like.Teste_likeListarPessoasFisicas();

            }        
        }  
        
}
