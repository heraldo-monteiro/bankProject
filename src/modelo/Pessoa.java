package modelo;

public abstract class Pessoa {
    private String nome;
    private String paisOrigem;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String paisOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.paisOrigem = paisOrigem;
       
    }
    
}
