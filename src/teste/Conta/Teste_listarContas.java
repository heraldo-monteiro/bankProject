
package teste.Conta;

import java.util.Scanner;
import persistencia.ContaDAO;
import persistencia.ContaFisicaDAO;
import persistencia.ContaJuridicaDAO;

public class Teste_listarContas {

    public static void main(String[] args) throws Exception {
     Teste_listarContas novo = new Teste_listarContas();
     novo.Teste_listarContas();        
    }
    public void Teste_listarContas() throws Exception{
        Scanner input = new Scanner(System.in); 
        System.out.println("CONSULTAR LISTA DAS CONTAS");
        System.out.println("[1]Conta Pessoa Fisica \n[2]Conta Pessoa Juridica\n[3]Conta Pessoa Fisica/Juridica");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");
        
        if(opcao == 1){           
            System.out.println(ContaFisicaDAO.listarContasFisicas());             
        }
        else if(opcao == 2){                
            System.out.println(ContaJuridicaDAO.listarContasJuridicas());   
            
        }
        else if(opcao == 3){
            System.out.println(ContaFisicaDAO.listarContasFisicas());
            System.out.println(ContaJuridicaDAO.listarContasJuridicas()); 
           
            
        }
    }
    
}
