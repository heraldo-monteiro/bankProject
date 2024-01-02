
package teste.Conta;

import java.util.Scanner;
import modelo.ContaFisica;
import modelo.ContaJuridica;
import persistencia.ContaFisicaDAO;
import persistencia.ContaJuridicaDAO;

public class Teste_atualizarConta {

    public static void main(String[] args) throws Exception{
        Teste_atualizarConta novo = new Teste_atualizarConta();
        novo.Teste_atualizarConta();
    }
    public void Teste_atualizarConta() throws Exception{
        Scanner input = new Scanner(System.in);           
            System.out.println("ATUALIZAÇÃO DE CONTA");
            System.out.println("[1]Conta Pessoa Fisica \n[2]Conta Pessoa Juridica");
            System.out.println("_____________________________________________________________");
            System.out.print("Opção: "); int opcao = input.nextInt();       
            System.out.println("- - - - -\n");                
                if(opcao == 1){                    
                System.out.println("CONSULTAR CONTA");
                System.out.print("CPF: "); String  cpf = input.next();
                System.out.println(ContaFisicaDAO.consultarContaFisica(cpf));                

                System.out.println("ATUALIZAR CONTA");
                System.out.print("Agência: "); int codAgencia = input.nextInt();
                System.out.print("Operação: "); int operacao = input.nextInt();
                System.out.print("Conta: "); String numeroConta = input.next();                    
                ContaFisica contaFisica = new ContaFisica();    
                    contaFisica.setCodAgencia(codAgencia);
                    contaFisica.setOperacao(operacao);
                    contaFisica.setNumeroConta(numeroConta);                        
                    System.out.println(ContaFisicaDAO.atualizarContaFisica(contaFisica, cpf));
                    System.out.println("------------------------------");
              
                }
                else if(opcao == 2){
                System.out.println("CONSULTAR CONTA");
                System.out.print("CNPJ: "); String  cnpj = input.next();
                System.out.println(ContaJuridicaDAO.consultarContaJuridica(cnpj));

                System.out.println("ATUALIZAR CONTA");
                System.out.print("Agência: "); int codAgencia = input.nextInt();
                System.out.print("Operação: "); int operacao = input.nextInt();
                System.out.print("Conta: "); String numeroConta = input.next();
                    ContaJuridica contaJuridica = new ContaJuridica();    
                    contaJuridica.setCodAgencia(codAgencia);
                    contaJuridica.setOperacao(operacao);
                    contaJuridica.setNumeroConta(numeroConta);                        
                    System.out.println(ContaJuridicaDAO.atualizarContaJuridica(contaJuridica, cnpj));
                    System.out.println("------------------------------");
              
                    
     
 
        }
    }
}

