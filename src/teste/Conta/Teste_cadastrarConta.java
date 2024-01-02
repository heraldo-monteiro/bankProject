
package teste.Conta;

import java.util.Random;
import java.util.Scanner;
import modelo.Conta;
import modelo.ContaFisica;
import modelo.ContaJuridica;
import modelo.Fisica;
import modelo.Juridica;

import persistencia.FisicaDAO;
import persistencia.JuridicaDAO;

import persistencia.ContaDAO;
import persistencia.ContaFisicaDAO;
import persistencia.ContaJuridicaDAO;


public class Teste_cadastrarConta {
  
    public static void main(String[] args) throws Exception {
        Teste_cadastrarConta novo = new Teste_cadastrarConta();
        novo.Teste_cadastrarConta();
    }
    public void Teste_cadastrarConta() throws Exception{        
        Scanner input = new Scanner(System.in);      
        
        System.out.println("ABERTURA DE CONTA");
        System.out.println("[1]Conta Pessoa Fisica \n[2]Conta Pessoa Juridica \n[3]Conta Modelo");
        System.out.println("_____________________________________________________________");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");
        
        if(opcao == 1){     
            System.out.println("CADASTRO DE PESSOA FISICA"); 
            System.out.print("  CPF: "); String cpf = input.next();
            System.out.print("  Nome: "); String nome = input.next(); 

            System.out.print("Data Nascimento\n");            
            System.out.print("  Dia: "); int dia = input.nextInt();
            System.out.print("  Mês: "); int mes = input.nextInt();
            System.out.print("  Ano: "); int ano = input.nextInt(); 

            System.out.print("  Sexo: "); String sexo = input.next();
            System.out.print("  País: "); String paisOrigem = input.next();
            System.out.print("  Estado Civil: "); String estadoCivil = input.next();   
                    String dia_nasc = ""+dia;
                    String mes_nasc = ""+mes;
                    String ano_nasc = ""+ano;
                    int idade =  (2023 - ano); 
                Fisica fisica = new Fisica();
                fisica.setCpf(cpf);
                fisica.setNome(nome);
                fisica.setIdade(idade);
                fisica.setDataNasc(dia_nasc+"/"+mes_nasc+"/"+ano_nasc);
                fisica.setSexo(sexo);
                fisica.setPaisOrigem(paisOrigem);
                fisica.setEstadoCivil(estadoCivil);          
            System.out.println("_____________________________________________________________");    
            
            // O Trecho de código abaixo tem como função, cadastrar uma nova conta
            System.out.println("ABERTURA DE CONTA\n__________________");           
            System.out.print("  Agência: "); int agencia = input.nextInt();
            System.out.print("  Operação: "); int operacao = input.nextInt();
            System.out.print("  Conta: "); String numeroConta = input.next();      
            System.out.print("  Deposito Inicial: "); Double deposito = input.nextDouble();
            System.out.println("Crie uma senha");
            System.out.print("Senha: "); String senha = input.next();
                ContaFisica contaFisica = new  ContaFisica();
                contaFisica.setCodAgencia(agencia);
                contaFisica.setOperacao(operacao);
                contaFisica.setNumeroConta(numeroConta);                
                contaFisica.setSaldo(deposito);
                contaFisica.setFisica(fisica);
                contaFisica.setSenha(senha);
            System.out.println("_____________________________________________________________");             
            System.out.println(FisicaDAO.cadastarPessoaFisica(fisica)+" REGISTRATION INSERTED");             
            System.out.println(ContaFisicaDAO.abrirContaFisica(contaFisica)+" REGISTRATION INSERTED");   
           
            System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - -");/**/              

        }
        else if(opcao == 2){  
            System.out.println("CADASTRO DE PESSOA JURIDICA"); 
            System.out.print("  CNPJ: "); String cnpj = input.next();
            System.out.print("  Nome: "); String nome = input.next(); 
            System.out.print("  Razão Social: "); String razaoSocial = input.next(); 

            System.out.print("Data da Aquisição\n");            
            System.out.print("  Dia: "); int dia = input.nextInt();
            System.out.print("  Mês: "); int mes = input.nextInt();
            System.out.print("  Ano: "); int ano = input.nextInt();   
            
            System.out.print("  País: "); String paisOrigem = input.next();
                    String dia_aquisicao = ""+dia;
                    String mes_aquisicao = ""+mes;
                    String ano_aquisicao = ""+ano;
                    int idade =  (2023 - ano);     
                Juridica juridica = new  Juridica();
                juridica.setCnpj(cnpj);
                juridica.setNome(nome);
                juridica.setRazaoSocial(razaoSocial);
                juridica.setIdade(idade);
                juridica.setDataAquisicao(dia_aquisicao+"/"+mes_aquisicao+"/"+ano_aquisicao);
                juridica.setPaisOrigem(paisOrigem);                           
            System.out.println("_____________________________________________________________");
            
            // O Trecho de código abaixo tem como função, cadastrar uma nova conta
            System.out.println("ABERTURA DE CONTA");
            System.out.print("  Agência: "); int codAgencia = input.nextInt();
            System.out.print("  Operação: "); int operacao = input.nextInt();
            System.out.print("  Conta: "); String numeroConta = input.next();
            System.out.print("  Deposito Inicial: "); Double deposito = input.nextDouble();   
            System.out.println("Crie uma senha");
            System.out.print("Senha: "); String senha = input.next();
                ContaJuridica  contaJuridica = new ContaJuridica();
                contaJuridica.setCodAgencia(codAgencia);
                contaJuridica.setOperacao(operacao);
                contaJuridica.setNumeroConta(numeroConta);                
                contaJuridica.setSaldo(deposito);           
                contaJuridica.setJuridica(juridica);
                contaJuridica.setSenha(senha);
                
            System.out.println("_____________________________________________________________");            
            System.out.println(JuridicaDAO.cadastarPessoaJuridica(juridica)+" REGISTRATION INSERTED");
            System.out.println(ContaJuridicaDAO.abrirContaJuridica(contaJuridica)+" REGISTRATION INSERTED");
            System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - -"); /**/
          
        }
        else if(opcao == 3){
            System.out.println("ABERTURA DE CONTA");       
            System.out.print("  Agência: "); int codAgencia = input.nextInt();
            System.out.print("  Operação: "); int operacao = input.nextInt();
            System.out.print("  Conta: "); String numeroConta = input.next();         
            System.out.print("  Deposito Inicial: "); Double deposito = input.nextDouble(); 
            System.out.println("Crie uma senha");
            System.out.print("Senha: "); String senha = input.next();   
                Conta conta = new Conta();
                conta.setCodAgencia(codAgencia);
                conta.setOperacao(operacao);
                conta.setNumeroConta(numeroConta);
                conta.setSaldo(deposito); 
                conta.setSenha(senha);
            System.out.println("_____________________________________________________________");           
            System.out.println(ContaDAO.abrirConta(conta)+" REGISTRATION INSERTED");            
            System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - -"); /**/
                      
        }
    }
    
}


