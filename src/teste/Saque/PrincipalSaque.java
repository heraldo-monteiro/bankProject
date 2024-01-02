
package teste.Saque;
import java.util.Scanner;
import teste.Saque.*;


public class PrincipalSaque {


    public static void main(String[] args) throws Exception {
        PrincipalSaque novo = new PrincipalSaque();
        novo.PrincipalSaque();
        }
        
    
    
    public void PrincipalSaque() throws Exception{
        
        Scanner input = new Scanner(System.in);
        System.out.println("MENU SAQUE");
        System.out.println("\n[1].......... Efetuar Saque"
                +"\n[2].......... Consultar Saque"
                +"\n[3].......... Listar Saques");
        System.out.println("_____________________________________________________________");
        System.out.println("ESCOLHA UMA DAS OPÇÕES");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");        
     
            if(opcao == 1){
                Teste_efetuarSaque saque = new Teste_efetuarSaque();
                saque.Teste_efetuarSaques();
         
            }
            else if(opcao == 2){
                Teste_consultarSaque consultar = new Teste_consultarSaque();
                consultar.Teste_consultarSaque();   
            }
            else if(opcao == 3){
            Teste_listarSaque listar = new Teste_listarSaque();
            listar.Teste_listarSaques();
              
            }
      
   
    }
    
}
