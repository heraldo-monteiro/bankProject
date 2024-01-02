
package teste.Fisica;

import java.util.Scanner;
import modelo.Fisica;
import persistencia.FisicaDAO;


public class Teste_cadastrar {

    public static void main(String[] args) throws Exception {
        Teste_cadastrar novo = new Teste_cadastrar();
        novo.Teste_cadastrarPesoaFisica();
        }
    
    public void Teste_cadastrarPesoaFisica() throws Exception{
        
                Scanner input = new Scanner(System.in);     
        Fisica fisica = new Fisica(); 
            
            System.out.println("CADASTRAR PESSOA FISICA");
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
            fisica.setCpf(cpf);
            fisica.setNome(nome);
            fisica.setIdade(idade);
            fisica.setDataNasc(dia_nasc+"/"+mes_nasc+"/"+ano_nasc);
            fisica.setSexo(sexo);
            fisica.setPaisOrigem(paisOrigem);
            fisica.setEstadoCivil(estadoCivil); 
            System.out.println(FisicaDAO.cadastarPessoaFisica(fisica)+" SUCCESS LINE!");
    }

           
    }
    

