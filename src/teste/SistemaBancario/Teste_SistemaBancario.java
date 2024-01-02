
package teste.SistemaBancario;
import java.util.Scanner;

import teste.Conta.*;
import teste.Deposito.*;
import teste.Saque.*;
import teste.Fisica.*;
import teste.Juridica.*;
import teste.Endereco.*;



public class Teste_SistemaBancario {


    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("SITEMA BANCARIO");
        System.out.println("\n[1].......... Conta"
                +"\n[2].......... Pessoa Fisica"
                +"\n[3].......... Pessia Juridica"
                +"\n[4].......... Endereço"
                +"\n[5].......... Deposito"  
                +"\n[6].......... Saque");

        System.out.println("_____________________________________________________________");
        System.out.println("ESCOLHA UMA DAS OPÇÕES");
        System.out.print("Opção: "); int opcao = input.nextInt();       
        System.out.println("- - - - -\n");   

            if(opcao == 1){  
                PrincipalConta conta = new PrincipalConta();
                conta.PrincipalConta();             
            }
            else if(opcao == 2){
                PrincipalFisica fisica = new PrincipalFisica();
                fisica.PrincipalFisica();
            }
            else if(opcao == 3){
                PrincipalJuridica juridica = new PrincipalJuridica();
                juridica.PrincipaJuridica();
            }
            else if(opcao == 4){
                PrincipalEndereco endereco = new PrincipalEndereco();
                endereco.PrincipalEndereco();
            }
            else if(opcao == 5){
                PrincipalDeposito deposito = new PrincipalDeposito();
                deposito.PrincipalDeposito();
            }
            else if(opcao == 6){
                PrincipalSaque saque = new PrincipalSaque();
                saque.PrincipalSaque();
                
            }
            
    }  
}
    

