
package modelo;

import modelo.Conta;
import modelo.Fisica;
import modelo.Juridica;


public class Transferencia {
    private String code;
    private String data;
    private Double valor;
    private Conta conta;
    private Fisica fisica;
    private Juridica juridica;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
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

    public Transferencia() {
    }

    public Transferencia(String code, String data, Double valor, Conta conta, Fisica fisica, Juridica juridica) {
        this.code = code;
        this.data = data;
        this.valor = valor;
        this.conta = conta;
        this.fisica = fisica;
        this.juridica = juridica;
    }
    
    
    public String toString(){
        return "Transferência"+
                "Código da Transferência: "+getCode()+
                "Data da Transferência: "+getData()+
                "Valor da Transferência: "+getValor()+
                "Conta: "+getConta()+
                "Destinatario: "+getFisica()+getJuridica();
    }
    
    
    
     
    
    
}
