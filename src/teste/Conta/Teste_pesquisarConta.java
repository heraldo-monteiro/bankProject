
package teste.Conta;

import java.util.Scanner;
import modelo.Fisica;
import modelo.ContaFisica;
import modelo.ContaFisica;
import persistencia.ContaDAO;
import persistencia.ContaFisicaDAO;
import persistencia.ContaJuridicaDAO;
import persistencia.FisicaDAO;

public class Teste_pesquisarConta {


    public static void main(String[] args) throws Exception {
        Teste_pesquisarConta novo = new Teste_pesquisarConta();
        novo.Teste_pesquisarConta();
    }
    public void Teste_pesquisarConta() throws Exception{        
        Scanner input = new Scanner(System.in);    
            
        System.out.println("CONSULTAR CONTA");
        System.out.println("[1]Conta Pessoa Fisica \n[2]Conta Pessoa Juridica");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");
        
        
        if(opcao == 1){           
            System.out.print("Consultar Conta Pessoa Fisica\nCPF do Titular: "); String cpf = input.next();        
            System.out.println("-   -   -   -   -   -   -\n");    
            System.out.println(ContaFisicaDAO.consultarContaFisica(cpf));                  
        }
        else if(opcao == 2){                
            System.out.print("Consultar Conta Pessoa Juridica\nCNPJ do Titular: "); String cnpj = input.next();        
            System.out.println("-   -   -   -   -   -   -\n");    
            System.out.println(ContaJuridicaDAO.consultarContaJuridica(cnpj)); 
        }
            
    }
    
}
