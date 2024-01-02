
package modelo;

import java.text.DecimalFormat;


public class ContaJuridica extends Conta{
    private Juridica juridica;
    

    
    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public ContaJuridica() {
    }

    public ContaJuridica(int codAgencia, int operacao, String numeroConta, Double saldo, String senha, Juridica juridica) {
        super(codAgencia, operacao, numeroConta, saldo, senha, juridica);
        this.juridica = juridica;
    }
    
    public String toString(){
        return "\nDADOS DA CONTA:"+
                "\n     Conta: "+getCodAgencia()+
                " "+getOperacao()+
                " "+getNumeroConta()+
                 "\n     SALDO: "+df.format(getSaldo())+ 
                getJuridica();        
    }
    
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
}
