
package teste.Juridica;

import java.util.Scanner;
import modelo.Juridica;
import persistencia.JuridicaDAO;


public class Teste_atualizar {

    public static void main(String[] args) throws Exception{
        
        Teste_atualizar novo = new Teste_atualizar();
        novo.Teste_atualizar();
    }
    public void Teste_atualizar() throws Exception{
       Scanner input = new Scanner(System.in);     
       
            System.out.print("CONSULTE ANTES DE ALTERAR\nCNPJ: "); String cnpj = input.next();        
            System.out.println("_____________________________________________________________");
            System.out.println(JuridicaDAO.consultarPessoaJuridica(cnpj));          
            System.out.println("PARA ATUALIZAR O REGISTRO");
            System.out.println("Peencha os campos com os novos dados");
            System.out.print("  CNPJ: ");String novo_cnpj = input.next();
            System.out.print("  Nome: "); String nome = input.next();       
            System.out.print("  Razão Sicial: "); String razaoSocoal = input.next();                
            Juridica juridica = new Juridica(); 
            juridica.setCnpj(novo_cnpj);
            juridica.setNome(nome);
            juridica.setRazaoSocial(razaoSocoal); 
            System.out.println("_____________________________________________________________");
            System.out.println(JuridicaDAO.atualizarPessoaJuridica(juridica, cnpj));            
    }
       
    }
    

