
package modelo;

public abstract class Endereco {
    private int code;
    private String cep;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private int numero;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public  String getCep() {
        return cep;
    }

    public  void setCep(String cep) {
        this.cep = cep;
    }

    public  String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public  String getCidade() {
        return cidade;
    }

    public  void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Endereco() {
    }

    public Endereco(int code,String cep, String endereco, String bairro, String cidade, String estado, int numero) {
        this.code = code;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }



}
