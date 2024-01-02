
package teste.Juridica;

import persistencia.JuridicaDAO;

public class Teste_listar {

    public static void main(String[] args) throws Exception {
        Teste_listar novo = new Teste_listar();
        novo.Teste_listar();
        
    }
    public void Teste_listar() throws Exception{        
        System.out.println(JuridicaDAO.listarPessoasJuridicas());
       
    }
    
}
