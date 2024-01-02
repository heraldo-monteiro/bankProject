
package modelo;


public class Deposito {
    private String code;
    private String  data;
    private Double valor;
    private Conta conta;


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

    public Deposito() {
    }

    public Deposito(String code, String data, Double valor, Conta conta) {
        this.code = code;
        this.data = data;
        this.valor = valor;
        this.conta = conta;
    }
    
    public String toString(){
        return "\nDADOS DE DEPOSITO EM CONTA"+
                "\n     Código da Operação: "+getCode()+
                "\n     Data: "+getData()+
                "\n     Valor: "+getValor()+
                getConta()+
                "\n_____________________________________________________________";
        
    }


    
    


    
    
}
