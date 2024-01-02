
package teste.Fisica;

import java.util.Scanner;
import modelo.Fisica;
import persistencia.FisicaDAO;
import teste.Fisica.Teste_pesquisarPessoaFisica;

public class Teste_atualizar {

    public static void main(String[] args) throws Exception{
        Teste_atualizar novo = new Teste_atualizar();
        novo.Teste_atualizarPessoaFisica();
    }
    
    public void Teste_atualizarPessoaFisica() throws Exception{
                Scanner input = new Scanner(System.in);     
        
        
        System.out.print("Consultar Pessoa Fisica\nCPF: "); String cpf = input.next();        
        System.out.println(FisicaDAO.consultarPessoaFisica(cpf));  /**/
        System.out.println("_____________________________________________________________");
        System.out.println("ATUALIZAR REGISTRO");
            System.out.print("  CPF: ");String novo_cpf = input.next();
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
            fisica.setCpf(novo_cpf);
            fisica.setNome(nome);
            fisica.setIdade(idade);
            fisica.setDataNasc(dia_nasc+"/"+mes_nasc+"/"+ano_nasc);
            fisica.setSexo(sexo);
            fisica.setPaisOrigem(paisOrigem);
            fisica.setEstadoCivil(estadoCivil); 
            System.out.println(FisicaDAO.atualizarPessoaFisica(fisica, cpf));                      
    
    }
        

    
}
