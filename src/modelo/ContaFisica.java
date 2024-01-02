
package modelo;

import java.text.DecimalFormat;

public class ContaFisica extends Conta{
    private Fisica fisica;   
    
    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public ContaFisica() {
    }

    public ContaFisica(int codAgencia, int operacao, String numeroConta, Double saldo, String senha, Fisica fisica) {
        super(codAgencia, operacao, numeroConta, saldo, senha, fisica);
        this.fisica = fisica;
    }

    public String toString(){
        return "\nDADOS DA CONTA"+
                "\n     CONTA:"+
                getCodAgencia()+
                " "+getOperacao()+
                " "+getNumeroConta()+
                "\n     SALDO: "+df.format(getSaldo())+               
                getFisica();
             
    }    
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
}
