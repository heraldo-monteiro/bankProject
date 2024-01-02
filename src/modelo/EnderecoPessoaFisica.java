package modelo;

public class EnderecoPessoaFisica extends Endereco {
    Fisica fisica;
    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public EnderecoPessoaFisica() {
    }

    public EnderecoPessoaFisica(Fisica fisica, int code, String cep, String endereco, String bairro, String cidade, String estado, int numero) {
        super(code,cep, endereco, bairro, cidade, estado, numero);
        this.fisica = fisica;
    }

    public String toString() {
        return "\nEndereço Pessoa Fisica"
                + "\n      Cep: " + getCep()
                + "\n      Endereço: " + getEndereco()
                + "\n      Número: " + getNumero()
                + "\n      Bairro: " + getBairro()
                + "\n      Cidade: " + getCidade()
                + "\n      Estado: " + getEstado()
                + "\n" + getFisica()
                + "\n_____________________________________________________________";
    }

}


