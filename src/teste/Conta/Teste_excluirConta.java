package teste.Conta;

import java.util.Scanner;
import persistencia.ContaDAO;
import persistencia.FisicaDAO;
import persistencia.JuridicaDAO;

public class Teste_excluirConta {

    public static void main(String[] args) throws Exception {
        Teste_excluirConta novo = new Teste_excluirConta();
        novo.Teste_excluirConta();        
    }
    public void  Teste_excluirConta() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("EXCLUSÃO DE CONTA");
        System.out.println("[1]Conta Pessoa Fisica \n[2]Conta Pessoa Juridica \n[3]Conta Modelo");
        System.out.println("_____________________________________________________________");
        System.out.print("Opção: "); int opcao = input.nextInt();
        System.out.println("_____________________________________________________________");
        
        if (opcao == 1) {
            System.out.println("CONFIRME OS DADOS ANTES DE EXCLUI-LA");
            System.out.print("CPF: "); String cpf = input.next();     
            System.out.print("CONTA: "); String numeroConta = input.next();
            System.out.println("_____________________________________________________________");
            System.out.println(FisicaDAO.consultarPessoaFisica(cpf));  
            System.out.println(ContaDAO.consultarConta(numeroConta));
            System.out.println("_____________________________________________________________");
            System.out.println("GOSTARIA DE EXLUIR ESSA CONTA?");
            System.out.println("[1]Sim [0]Não \n");
            System.out.print("Opção: "); opcao = input.nextInt();
            
            if (opcao == 0) {
                System.out.println("_____________________________________________________________");
                System.out.println("Rescisão Cancelada!");
                System.out.println("Agradecemos por Permanecer  Conosco!");
            } 
            else if (opcao == 1) {
                System.out.println("_____________________________________________________________");
                System.out.println("Conta Excluida Com SUCESSO!");
                System.out.println(FisicaDAO.excluirPessoaFisica(cpf)+" RECORD DELETED");

            }
        }
        else if (opcao == 2) {
            System.out.println("EXCLUSÃO DE CONTA");
             System.out.print("CNPJ: "); String cnpj = input.next();
            System.out.print("CONTA: "); String numeroConta = input.next();            
            System.out.println("_____________________________________________________________"); 
            System.out.println(JuridicaDAO.excluirPessoaJuridica(cnpj));
            
            System.out.println("_____________________________________________________________");            
            System.out.println("GOSTARIA DE EXLUIR ESSA CONTA?");          
            System.out.println("[1]Sim [0]Não\n");
            System.out.print("Opção: "); opcao = input.nextInt();
            if (opcao == 0) {
                System.out.println("Rescisão Cancelada!");
                System.out.println("É uma enorme fatisfação te-lo(a) como nosso Cliente!");
            } 
            else if (opcao == 1) {
                System.out.println("_____________________________________________________________");
                System.out.println("Conta Excluida com SUCESSO!");                  
                System.out.println(ContaDAO.excluirConta(numeroConta)+" RECORD DELETED");
            }
        }
        else if (opcao == 3) {
            System.out.println("CONFIRME SUA CONTA ANTES DE EXCLUI-LA");
            System.out.print("CONTA: "); String numeroConta = input.next();
            System.out.println("_____________________________________________________________");
            System.out.println(ContaDAO.consultarConta(numeroConta));
           

            System.out.println("Excluir Conta Modelo");
            System.out.println("[1]Sim [0]Não\n");           
            
            System.out.print("Opção: ");
            opcao = input.nextInt();
            if (opcao == 0) {
                System.out.println("_____________________________________________________________");
                System.out.println("Rescisão Cancelada!");
                System.out.println("É uma enorme fatisfação te-lo(a) como nosso Cliente!");
            } 
            else if (opcao == 1) {
                System.out.println("_____________________________________________________________");
                System.out.println(""
                        + ""
                        + ""
                        + "Conta Excluida com SUCESSO!");
                System.out.println(ContaDAO.excluirConta(numeroConta)+" RECORD DELETED");

            }
        }
    }
}
    


