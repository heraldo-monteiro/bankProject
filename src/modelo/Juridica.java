

package modelo;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class Juridica extends Pessoa{
    private String cnpj;
    private String razaoSocial;
    private String dataAquisicao;


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Juridica() {
    }

    public Juridica(String cnpj, String nome, String razaoSocial, int idade, String dataAquisicao, String nacionalidade) {
        super(nome, idade, nacionalidade);
        this.cnpj = cnpj;       
        this.razaoSocial = razaoSocial;
        this.dataAquisicao = dataAquisicao;
      
    }
    
    public void fotmatCNPJ() throws ParseException{      
            MaskFormatter  mask = new  MaskFormatter("###.###.###/####-##");
              
    }
    
    public String toString(){        
        return "\nDADOS PESSOAIS"+
                "\n     CNPJ: "+getCnpj()+
                "\n     Nome: "+getNome()+
                "\n     Razão Sicial: "+getRazaoSocial()+
                "\n     Tempo de Atuação: "+getIdade()+" anos"+
                "\n     Data de Aquisição da Empresa: "+getDataAquisicao()+
                "\n     País de Origem: "+getPaisOrigem()+
                "\n_____________________________________________________________";        
               
        
    }
    
    
}
