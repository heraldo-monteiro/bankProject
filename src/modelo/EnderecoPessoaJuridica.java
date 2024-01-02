package modelo;

public class EnderecoPessoaJuridica extends Endereco{

    private Juridica juridica;
    
    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public EnderecoPessoaJuridica() {
    }

    public EnderecoPessoaJuridica(Juridica juridica, int code ,String cep, String endereco, String bairro, String cidade, String estado, int numero) {
        super(code,cep, endereco, bairro, cidade, estado, numero);
        this.juridica = juridica;
    }



    public String toString() {
        return "\nEndereço Pessoa Juridica"
                + "\n      Cep: " + getCep()
                + "\n      Endereço: " + getEndereco()
                + "\n      Número: " + getNumero()
                + "\n      Bairro: " + getBairro()
                + "\n      Cidade: " + getCidade()
                + "\n      Estado: " + getEstado()
                + "\n" + getJuridica();
    }

}
