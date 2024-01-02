
package teste.Fisica;

import persistencia.FisicaDAO;

public class Teste_listar {

    public static void main(String[] args) throws Exception {   
       Teste_listar novo = new Teste_listar();
        novo.Teste_listarPessoasFisicas();        
    }
    
    public void Teste_listarPessoasFisicas() throws Exception{        
        System.out.println(FisicaDAO.listarPessoasFisicas());
      
    }
    
}
