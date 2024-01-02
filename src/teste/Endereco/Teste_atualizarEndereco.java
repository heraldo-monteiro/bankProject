
package teste.Endereco;

import java.util.Scanner;
import modelo.EnderecoPessoaFisica;
import modelo.EnderecoPessoaJuridica;
import persistencia.EnderecoDAO;

public class Teste_atualizarEndereco {

    public static void main(String[] args) throws Exception {
        Teste_atualizarEndereco novo = new Teste_atualizarEndereco();
        novo.Teste_atualizarEndereco();
    }
    public void Teste_atualizarEndereco() throws Exception{
        
        Scanner input = new Scanner(System.in);  
        EnderecoPessoaFisica enderecoPF = new EnderecoPessoaFisica();
        EnderecoPessoaJuridica enderecoPJ = new EnderecoPessoaJuridica();
        
        System.out.println("ATUALIZAR ENDEREÇO");
        System.out.println("[1]Endereço Pessoa Fisica \n[2]Endereço Pessoa Juridica");
        System.out.println("_____________________________________________________________");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");
        
        if(opcao == 1){
            System.out.println("Consultar Endereco Pessoa Fisica");
            System.out.print("CPF do Titula: "); String  cpf = input.next();
            System.out.println(EnderecoDAO.consultarEnderecoPessoaFisica(cpf));     

            System.out.println("Atualizar Endereço");
            System.out.print("CEP: "); String cep = input.next();
            System.out.print("Endereço: "); String enderec = input.next();
            System.out.print("Número: "); int numero = input.nextInt();
            System.out.print("Bairro: "); String bairro = input.next();
            System.out.print("Cidade: "); String cidade = input.next();
            System.out.print("Estado: "); String estado = input.next(); 
                enderecoPF.setCep(cep);
                enderecoPF.setEndereco(enderec);
                enderecoPF.setNumero(numero);
                enderecoPF.setBairro(bairro);
                enderecoPF.setCidade(cidade);
                enderecoPF.setEstado(estado);      
                        
                System.out.println(EnderecoDAO.atualizarEnderecoPessoaFisica(enderecoPF, cpf)+" UPDATED LINE");
                System.out.println("------------------------------");  
        }
        else if(opcao == 2){
            System.out.println("Consultar Endereco Pessoa Juridica");
            System.out.print("CNPJ do Titula: "); String  cnpj = input.next();
            System.out.println(EnderecoDAO.consultarEnderecoPessoaJuridica(cnpj));     

            System.out.println("Atualizar Endereço");
            System.out.print("CEP: "); String cep = input.next();
            System.out.print("Endereço: "); String enderec = input.next();
            System.out.print("Número: "); int numero = input.nextInt();
            System.out.print("Bairro: "); String bairro = input.next();
            System.out.print("Cidade: "); String cidade = input.next();
            System.out.print("Estado: "); String estado = input.next();
                enderecoPJ.setCep(cep);
                enderecoPJ.setEndereco(enderec);
                enderecoPJ.setNumero(numero);
                enderecoPJ.setBairro(bairro);
                enderecoPJ.setCidade(cidade);
                enderecoPJ.setEstado(estado);      
                        
                System.out.println(EnderecoDAO.atualizarEnderecoPessoaJuridica(enderecoPJ, cnpj)+" UPDATED LINE");
                System.out.println("------------------------------");  
        }
        else{
            System.out.println("Opção Invalida!!");
                
        }
        
        
   
         
    }
    
}
