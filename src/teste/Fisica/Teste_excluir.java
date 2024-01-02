package teste.Fisica;

import java.util.Scanner;
import persistencia.FisicaDAO;

public class Teste_excluir {

    public static void main(String[] args) throws Exception {
        Teste_excluir novo = new Teste_excluir();
        novo.Teste_excluirPessoaFisica();   
    }
        
    public void Teste_excluirPessoaFisica() throws Exception{
             Scanner input = new Scanner(System.in);  
 
            System.out.println("EXCLUSÃO PESSOA FISICA");  
            System.out.println("----------------------");
            System.out.println("Localizar Antes de Excluir");
            System.out.print("  CPF: "); String cpf = input.next(); 
            System.out.println("_____________________________________________________________");
            System.out.println(FisicaDAO.consultarPessoaFisica(cpf));
            System.out.println("_____________________________________________________________");
            System.out.print("Deseja Realmente Excluir Esse Registro? \n[1]Sim | [0]Não \n- - - - - - - -\n");
           
            System.out.print("Opção: "); int opcao = input.nextInt();
            if(opcao == 0){             
                System.out.println("Agradecemos por Permanecer Conosco!");
                
            }else if(opcao == 1){
                System.out.println("Seu Registro Foi Deletado com SUCESSO!");                     
                System.out.println(FisicaDAO.excluirPessoaFisica(cpf)+" RECORD DELETED");  
            } 
    } 
    
}
