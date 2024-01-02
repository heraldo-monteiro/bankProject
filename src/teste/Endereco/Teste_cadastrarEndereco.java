package teste.Endereco;

import java.util.Scanner;
import modelo.EnderecoPessoaFisica;
import modelo.EnderecoPessoaJuridica;
import persistencia.EnderecoDAO;
import modelo.Fisica;
import modelo.Juridica;

public class Teste_cadastrarEndereco {

    public static void main(String[] args) throws Exception {
        Teste_cadastrarEndereco novo = new Teste_cadastrarEndereco();
        novo.Teste_cadastrarEndereco();
    }
    public void Teste_cadastrarEndereco() throws Exception{
    
        Scanner input = new Scanner(System.in);
        EnderecoPessoaFisica enderecoFisica = new EnderecoPessoaFisica();
        EnderecoPessoaJuridica enderecoJuridica = new EnderecoPessoaJuridica();
        Fisica fisica = new Fisica();
        Juridica juridica = new Juridica();
        

        System.out.println("CADASTRAR ENDEREÇO \n[1]Pessoa Fisica \n[2]Pessoa Juridica");
        System.out.println("_____________________________________________________________");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        if (opcao == 1) {
            System.out.println("ENDEREÇO DE PESSOA FISICA");
            System.out.println("_____________________________________________________________");
            System.out.print("CEP: ");
            String cep = input.next();
            System.out.print("Endereoo: ");
            String enderec = input.next();
            System.out.print("Número: ");
            int numero = input.nextInt();
            System.out.print("Bairo: ");
            String bairro = input.next();
            System.out.print("Cidade: ");
            String cidade = input.next();
            System.out.print("Estado: ");
            String estado = input.next();
            
            System.out.println("_____________________________________________________________");
            System.out.println("Peencha o Campo (CPF) Com Um Valor Valido ");
            System.out.print("CPF: ");            
            String cpf = input.next();
            enderecoFisica.setCep(cep);
            enderecoFisica.setEndereco(enderec);
            enderecoFisica.setNumero(numero);
            enderecoFisica.setBairro(bairro);
            enderecoFisica.setCidade(cidade);
            enderecoFisica.setEstado(estado);
            fisica.setCpf(cpf);
            enderecoFisica.setFisica(fisica);
     
            System.out.println("_____________________________________________________________");
            System.out.println(EnderecoDAO.cadastrarEnderecoPessoaFisica(enderecoFisica) + " REGISTRATION INSERTED");

        } else if (opcao == 2) {
            System.out.println("ENDEREÇO DE PESSOA JURIDICA");
            System.out.println("_____________________________________________________________");
            System.out.print("CEP: ");
            String cep = input.next();
            System.out.print("Endereço: ");
            String enderec = input.next();
            System.out.print("Número: ");
            int numero = input.nextInt();
            System.out.print("Bairo: ");
            String bairro = input.next();
            System.out.print("Cidade: ");
            String cidade = input.next();
            System.out.print("Estado: ");
            String estado = input.next();
            System.out.println("_____________________________________________________________");
            System.out.println("Peencha o Campo (CNPJ) Com Um Valor Valido ");
            System.out.print("CNPJ: ");
            String cnpj = input.next();
            enderecoJuridica.setCep(cep);
            enderecoJuridica.setEndereco(enderec);
            enderecoJuridica.setNumero(numero);
            enderecoJuridica.setBairro(bairro);
            enderecoJuridica.setCidade(cidade);
            enderecoJuridica.setEstado(estado);
            juridica.setCnpj(cnpj);
            enderecoJuridica.setJuridica(juridica);
            
            System.out.println("_____________________________________________________________");
            System.out.println(EnderecoDAO.cadastrarEnderecoPessoaJuridica(enderecoJuridica) + " REGISTRATION INSERTED");

        } else {
            System.out.println("Opção não Existente! ");
            System.exit(0);
        }
    }

}
