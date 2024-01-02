
package teste.Conta;
import java.util.Scanner;
import teste.Conta.*;

public class PrincipalConta {

  
    public static void main(String[] args) throws Exception {
        PrincipalConta novo = new PrincipalConta();
        novo.PrincipalConta();
        }
    public void PrincipalConta() throws Exception{
        
        Scanner input = new Scanner(System.in);
        System.out.println("MENU CONTA");
        System.out.println("\n[1].......... Criar Conta"
                +"\n[2].......... Alterar"
                +"\n[3].......... Excluir"
                +"\n[4].......... Listar"
                +"\n[5].......... Pesquisar"  
                +"\n[6].......... Consultar Saldo");
        System.out.println("_____________________________________________________________");
        System.out.println("ESCOLHA UMA DAS OPÇÕES");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");        
    
            if(opcao == 1){
            Teste_cadastrarConta cadastrar = new Teste_cadastrarConta();
                cadastrar.Teste_cadastrarConta();
            }
            else if(opcao == 2){
                Teste_atualizarConta alterar = new Teste_atualizarConta();
                alterar.Teste_atualizarConta();
                        
            }
            else if(opcao == 3){
                Teste_excluirConta excluir = new Teste_excluirConta();
                excluir.Teste_excluirConta();
            }
            else if(opcao == 4){
                Teste_listarContas listar = new Teste_listarContas();
                listar.Teste_listarContas();
            }
            else if(opcao == 5){
                Teste_pesquisarConta pesquisar = new Teste_pesquisarConta();
                pesquisar.Teste_pesquisarConta();

            }
            else if(opcao == 6){
                carregarSaldo saldo = new carregarSaldo();
                saldo.carregaSaldo();
            }
            else{
                System.out.println("Opção Invalida!!!");
            }
         
        
        
    }
    
}
