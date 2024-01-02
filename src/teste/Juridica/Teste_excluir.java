package teste.Juridica;

import teste.Fisica.*;
import java.util.Scanner;
import persistencia.JuridicaDAO;

public class Teste_excluir {

    public static void main(String[] args) throws Exception {
        Teste_excluir novo = new Teste_excluir();
        novo.Teste_excluir();
        
        }
        public void Teste_excluir() throws Exception{
            
        Scanner input = new Scanner(System.in); 
        
            System.out.println("Rescindir Contrato");  
            System.out.println("-------------------");
            System.out.print("  CNPJ do Titular: "); String cnpj = input.next(); 
            System.out.println(JuridicaDAO.consultarPessoaJuridica(cnpj));
            
            System.out.print("Deseja Rescidir seu Contrato? \n[1]Sim | [0]Não \n- - - - - - - -\n");
           
            System.out.print("Opção: "); int opcao = input.nextInt();
            if(opcao == 0){             
                System.out.println("Agradecemos por te-lo(a) como nosso(a) Cliente!");
                
            }else if(opcao == 1){               
                System.out.println("Seu Contrato foi rescidido com SUCESSO!");
                System.out.println("Foi uma enorme satisfação te-lo(a) como(a) nosso Cliente!");
                System.out.println(JuridicaDAO.excluirPessoaJuridica(cnpj)); 
                 
            }
  
    }
    
}
