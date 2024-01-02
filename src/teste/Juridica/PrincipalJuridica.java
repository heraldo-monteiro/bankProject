
package teste.Juridica;
import teste.Juridica.*;
import java.util.Scanner;
import teste.Juridica.Teste_cadastrar; // Cadastrar 1
import teste.Juridica.Teste_atualizar; // Alterar 2
import teste.Juridica.Teste_excluir; // Excluir 3
import teste.Juridica.Teste_listar; // Listar
import teste.Juridica.Teste_pesquisarPessoaJuridica; // Pesquisar
import teste.Juridica.Teste_listarBetween; // Listar com Between
import teste.Juridica.Teste_listarLike; // Listar com Like


public class PrincipalJuridica {

    public static void main(String[] args) throws Exception {
        PrincipalJuridica novo = new PrincipalJuridica();
        novo.PrincipaJuridica();
    }
    
    public void PrincipaJuridica() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("MENU PESSOA JURIDICA");
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
                cadastrar.Teste_cadastrar();
            }
            else if(opcao == 2){
                Teste_atualizar alterar = new Teste_atualizar();
                alterar.Teste_atualizar();
            }
            else if(opcao == 3){
                Teste_excluir excluir = new Teste_excluir();
                excluir.Teste_excluir();
            }
            else if(opcao == 4){
                Teste_listar listar = new Teste_listar();
                listar.Teste_listar();            
            }
            else if(opcao == 5){
                Teste_pesquisarPessoaJuridica pesquisar = new Teste_pesquisarPessoaJuridica();
                pesquisar.Teste_pesquisarPessoaJuridica();                    

            }
            else if(opcao == 6){
            Teste_listarBetween between = new Teste_listarBetween();
                between.Teste_listarBetween(); 
                
            }
            else if(opcao == 7){
                Teste_listarLike like = new Teste_listarLike();
                like.Teste_listarLike();

            }        
        }        
       
}
