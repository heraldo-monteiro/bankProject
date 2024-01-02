
package teste.Deposito;

import java.util.Scanner;
import teste.Deposito.*;


public class PrincipalDeposito {


    public static void main(String[] args) throws Exception {
        PrincipalDeposito novo = new PrincipalDeposito();
        novo.PrincipalDeposito();
        }
        public void PrincipalDeposito() throws Exception{
        
        Scanner input = new Scanner(System.in);
        System.out.println("MENU SAQUE");
        System.out.println("\n[1].......... Efetuar Deposito"
                +"\n[2].......... Consultar Deposito"
                +"\n[3].......... Listar Depositos");
        System.out.println("_____________________________________________________________");
        System.out.println("ESCOLHA UMA DAS OPÇÕES");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");
        
     
            if(opcao == 1){
                Teste_efetuarDepositos deposito = new Teste_efetuarDepositos();
                deposito.Teste_efetuarDepositos();
         
            }
            else if(opcao == 2){
                Teste_consultarDeposito consultar = new Teste_consultarDeposito();
                consultar.Teste_consultarDeposito();
            }
            else if(opcao == 3){
                    Teste_listarDepositos listar = new Teste_listarDepositos();
            listar.Teste_listarDepositos();
       
              
            }
    }
    
}
