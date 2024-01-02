
package modelo;
import java.text.DecimalFormat;

public class Conta{
    private int codAgencia;
    private int operacao;
    private String numeroConta;
    private Double saldo;
    private String senha;
    private Fisica fisica;
    private Juridica juridica;

    
    public int getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(int codAgencia) {
        this.codAgencia = codAgencia;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }    
        
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public Conta() {
    }

    public Conta(int codAgencia, int operacao, String numeroConta, Double saldo, String senha, Fisica fisica) {
        this.codAgencia = codAgencia;
        this.operacao = operacao;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
        this.fisica = fisica;      
    } 
    
    public Conta(int codAgencia, int operacao, String numeroConta, Double saldo, String senha, Juridica juridica) {
        this.codAgencia = codAgencia;
        this.operacao = operacao;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;  
        this.juridica = juridica;
    }     

    public String toString(){
        return df.format(getSaldo());  
    }      
    DecimalFormat df = new DecimalFormat("#,##0.00");
}
