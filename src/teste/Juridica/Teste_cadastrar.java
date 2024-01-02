
package teste.Juridica;

import java.util.Scanner;
import modelo.Juridica;
import persistencia.JuridicaDAO;


public class Teste_cadastrar {    

    public static void main(String[] args) throws Exception{
        Teste_cadastrar novo = new Teste_cadastrar();
        novo.Teste_cadastrar();
        
        }
        public void Teste_cadastrar() throws Exception{                
            Scanner input = new Scanner(System.in);     
            Juridica juridica = new Juridica();             
            System.out.println("CADASTRAR PESSOA JURIDICA");
            System.out.print("  CNPJ: "); String cnpj = input.next();      
            System.out.print("  Nome: "); String nome = input.next();  
             System.out.print("  Razão Social: "); String razaoSocial = input.next();   
            System.out.print("Data Nascimento\n");            
            System.out.print("  Dia: "); int dia = input.nextInt();
            System.out.print("  Mês: "); int mes = input.nextInt();
            System.out.print("  Ano: "); int ano = input.nextInt();
            System.out.print("  Sexo: "); String sexo = input.next();
            System.out.print("  País: "); String paisOrigem = input.next();        
                String dia_aqusicao = ""+dia;
                String mes_aqusicao = ""+mes;
                String ano_aqusicao = ""+ano;
                int idade =  (2023 - ano);             
            juridica.setCnpj(cnpj);
            juridica.setNome(nome);
            juridica.setRazaoSocial(razaoSocial); 
            juridica.setIdade(idade);
            juridica.setDataAquisicao(dia_aqusicao+"/"+mes_aqusicao+"/"+ano_aqusicao);
            juridica.setPaisOrigem(paisOrigem); 
            System.out.println(JuridicaDAO.cadastarPessoaJuridica(juridica)+" SUCCESS LINE!");
    }

  
}
    

