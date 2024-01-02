

package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import modelo.Conta;
import modelo.ContaFisica;

public class ContaDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;    
    
    public static int abrirConta(Conta conta) throws Exception {
        int ret = 0;

        try {
            String sql = "Insert Into Conta (codAgencia, operacao, numeroConta, saldo, senha) VALUES (?,?,?,?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, conta.getCodAgencia());
            st.setInt(2, conta.getOperacao());
            st.setString(3, conta.getNumeroConta());
            st.setDouble(4, conta.getSaldo());
            st.setString(5, conta.getSenha());
            
            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "ContaDAO! abrirConta! "+ erro);
        }
        return ret;
    }
    
    public static Conta consultarConta(String numeroConta)throws Exception{
        Conta conta = new Conta();
        
        try {
            String sql = "Select codAgencia, operacao, numeroConta, saldo From  Conta where  numeroConta= ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, numeroConta);
            rs = st.executeQuery();
            
            if(rs.next()){
                conta.setCodAgencia(rs.getInt("codAgencia"));
                conta.setOperacao(rs.getInt("operacao"));
                conta.setNumeroConta(rs.getString("numeroConta"));
                conta.setSaldo(rs.getDouble("saldo"));
               
            }
            st.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO! consultarConta! "+ erro);
        }
        return conta;
    }
    
    public static List<Conta> listarContas() throws Exception {
        List<Conta> listarContas = new ArrayList<Conta>();
        try {
            String sql = "Select codAgencia, operacao, numeroConta, saldo, Fisica_cpf From Conta Where Fisica_cpf = Fisica_cpf";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Conta conta = new Conta();                
                conta.setCodAgencia(rs.getInt("codAgencia"));
                conta.setOperacao(rs.getInt("operacao"));
                conta.setNumeroConta(rs.getString("numeroConta"));
                conta.setSaldo(rs.getDouble("saldo"));    
                
                listarContas.add(conta);
            }
            st.close();
        } catch (Exception erro) {
            System.out.println("ContaDAO! listarContas! "+erro.getMessage());
        }
        return listarContas;

    }  
    //****** Testando.**********************************************************
    public ResultSet Contas()throws Exception{        
        try {
            String sql = "Select codAgencia, operacao, numeroConta, saldo From Conta";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            
             
            
        } catch (Exception erro) {
            System.out.println("ContaDAO ResultSet Contas!"+ erro.getMessage());
        }
        
        return rs;   
    }
   
    //**************************************************************************    
    public static int atualizarConta(Conta conta, String numeroConta)throws Exception{
        int ret = 0;
        
        try {
            String sql = "Update Conta Set codAgencia=?, operacao=?, numeroConta=? Where numeroConta=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setInt(1, conta.getCodAgencia());
            st.setInt(2, conta.getOperacao());
            st.setString(3, conta.getNumeroConta());   
            st.setString(4, numeroConta);
            
            ret = st.executeUpdate();
            st.close();
        } catch (Exception erro) {
            System.out.println("ContaDAO! atualizarConta! "+erro.getMessage());            
        }
        return ret;
    }
         
    public static int excluirConta(String numeroConta)throws Exception{
        int ret = 0;
        
        try {
            String sql = "Delete From Conta Where numeroConta=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql); 
            
            st.setString(1, numeroConta);
            
            ret = st.executeUpdate();
            st.close();           
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO!  excluirConta!"+ erro.getMessage());
        }
        return ret;
    }  
        
    public static int atualizarSaldo(Conta conta, String numeroConta)throws Exception{
        int ret = 0;
        
        try {
            String sql = "Update Conta Set saldo= ? Where numeroConta=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql); 
            
            st.setDouble(1, conta.getSaldo());      
            st.setString(2, numeroConta);
            
          ret = st.executeUpdate();
            st.close();
        } catch (Exception erro) {
            System.out.println("ContaDAO! atualizarSaldo! "+erro.getMessage());            
        }
        return ret;
    }      

    public ResultSet autenticarContaFisica(Conta conta) throws Exception{        
        try {
            String sql = "Select * From Conta Where Fisica_cpf = ? and senha = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);          
            
            st.setString(1, conta.getFisica().getCpf());
            st.setString(2, conta.getSenha());  
            rs = st.executeQuery();
          
            return rs;
        } catch (SQLException erro) {
            System.out.println("ContaDAO! autenticarContaFisica! "+ erro.getMessage());
            return null;
        }        
      
    }
    public ResultSet autenticarContaJuridica(Conta conta) throws Exception{   
        try {
            String sql = "Select * From Conta Where Juridica_cnpj = ? and senha = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);          

            st.setString(1, conta.getJuridica().getCnpj());
            st.setString(2, conta.getSenha());  
            rs = st.executeQuery();

            return rs;
        } catch (SQLException erro) {
            System.out.println("ContaDAO! autenticarContaJuridica! "+ erro.getMessage());
            return null;
        }        

    }
    
    public static int agenciaConta(String usuario)throws Exception{
        int agenciaConta = 0;
        try {
            String sql = "Select codAgencia From Conta  Where Fisica_cpf = ? or Juridica_cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);  
            st.setString(1, usuario);
            st.setString(2, usuario);
            rs = st.executeQuery();              
            if(rs.next()){   
               agenciaConta = rs.getInt("codAgencia");               
            }
            st.close();
            
        } catch (Exception erro) {
            System.out.println("ContaDAO! agenciaConta! "+erro.getMessage());
          
        }
        return agenciaConta;  
        
    }
        
    public static int operacaoConta(String usuario)throws Exception{
        int operacaoConta = 0;
        try {
            String sql = "Select operacao From Conta  Where Fisica_cpf = ? or Juridica_cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);  
            st.setString(1, usuario);
            st.setString(2, usuario);
            rs = st.executeQuery();              
            if(rs.next()){   
               operacaoConta = rs.getInt("operacao");               
            }
            st.close();
            
        } catch (Exception erro) {
            System.out.println("ContaDAO! operacaoConta! "+erro.getMessage());
          
        }
        return operacaoConta;  
        
    }
    
    public static String numeroConta(String usuario)throws Exception{
        String numeroConta = "";
        try {
            String sql = "Select numeroConta From Conta  Where Fisica_cpf = ? or Juridica_cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);  
            st.setString(1, usuario);
            st.setString(2, usuario);
            rs = st.executeQuery();              
            if(rs.next()){   
               numeroConta = rs.getString("numeroConta");               
            }
            st.close();
            
        } catch (Exception erro) {
            System.out.println("ContaDAO! numeroConta! "+erro.getMessage());
          
        }
        return numeroConta;  
        
    }
    
    public static Double saldoConta(String usuario) throws Exception{           
        Double saldo = 0.0;        
        try {           
            String sql = "Select saldo From Conta Where Fisica_cpf = ? or Juridica_cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);              
            st.setString(1, usuario);
            st.setString(2, usuario);
            rs = st.executeQuery();
            
            if(rs.next()){   
               saldo = rs.getDouble("saldo");               
            }
            st.close();
            
        } catch (Exception erro) {
            System.out.println("DepositoDAO! carregarSaldo! "+erro.getMessage());
          
        }
        return saldo;    
    }
    
    public static Double saque_deposito(String numeroConta) throws Exception{           
        Double saldo = 0.0;        
        try {           
            String sql = "Select saldo From Conta Where numeroConta = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);              
            st.setString(1, numeroConta);          
            rs = st.executeQuery();
            
            if(rs.next()){   
               saldo = rs.getDouble("saldo");               
            }
            st.close();
            
        } catch (Exception erro) {
            System.out.println("DepositoDAO! carregarSaldo! "+erro.getMessage());
          
        }
        return saldo;    
    }
    /*
    public ResultSet saldoDaConta(String usuario) throws Exception{           
          
        try {           
            String sql = "Select saldo From Conta Where Fisica_cpf = ? or Juridica_cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, usuario);    
            st.setString(2, usuario);   
            rs = st.executeQuery();    
            st.close();
            
            return rs;
            
        } catch (Exception erro) {
            System.out.println("ContaDAO! saldoDaConta! "+erro.getMessage());
            return null;
        }       
    }*/   
    
}
