
package modelo;

public class Fisica extends Pessoa{
    private String cpf;
    private String dataNasc;
    private String sexo;
    private String estadoCivil;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }   

    public Fisica() {
    }

    public Fisica(String cpf,String nome ,int idade, String dataNasc, String sexo, String paisOrigem, String estadoCivil) {
        super(nome,idade, paisOrigem);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }
    
    public String toString(){
        return "\nDADOS PESSOAIS"+
                "\n     CPF: "+getCpf()+
                "\n     Nome: "+getNome()+
                "\n     Idade: "+getIdade()+" anos"+
                "\n     Data Nascimento: "+getDataNasc()+
                "\n     Sexo: "+getSexo()+
                "\n     País: "+getPaisOrigem()+
                "\n     Estado Civil: "+getEstadoCivil()+
                "\n_____________________________________________________________";
                
                
    }   
    
    
}
