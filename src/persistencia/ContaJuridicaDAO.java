
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.ContaJuridica;
import static persistencia.ContaDAO.connection;


public class ContaJuridicaDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;   
    
    public static int abrirContaJuridica(ContaJuridica conta) throws Exception {
        int ret = 0;

        try {
            String sql = "Insert Into Conta (codAgencia, operacao, numeroConta, saldo, Juridica_cnpj, senha) VALUES (?,?,?,?,?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, conta.getCodAgencia());
            st.setInt(2, conta.getOperacao());
            st.setString(3, conta.getNumeroConta());            
            st.setDouble(4, conta.getSaldo());
            st.setString(5, conta.getJuridica().getCnpj());
            st.setString(6, conta.getSenha());
            
            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "ContaDAO! abrirContaJuridica! "+ erro);
        }
        return ret;
    }    
        
    public static ContaJuridica consultarContaJuridica(String cnpj)throws Exception{
        ContaJuridica conta = new ContaJuridica();
        
        try {
            String sql = "Select * From  Conta where  Juridica_cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cnpj);
            rs = st.executeQuery();
            
            if(rs.next()){
                conta.setCodAgencia(rs.getInt("codAgencia"));
                conta.setOperacao(rs.getInt("operacao"));
                conta.setNumeroConta(rs.getString("numeroConta"));
                conta.setSaldo(rs.getDouble("saldo"));
                conta.setJuridica(JuridicaDAO.consultarPessoaJuridica(rs.getString("Juridica_cnpj")));
    
            }
            st.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO! consultarContaJuridica! "+ erro);
        }
        return conta;
    }
    
    public static List<ContaJuridica> listarContasJuridicas() throws Exception {
        List<ContaJuridica> listarContasJuridicas = new ArrayList<ContaJuridica>();

        try {
            String sql = "Select codAgencia, operacao, numeroConta, saldo, Juridica_cnpj From Conta Where Juridica_cnpj = Juridica_cnpj";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                ContaJuridica contaPJ = new ContaJuridica();
                contaPJ.setCodAgencia(rs.getInt("codAgencia"));
                contaPJ.setOperacao(rs.getInt("operacao"));
                contaPJ.setNumeroConta(rs.getString("numeroConta"));
                contaPJ.setSaldo(rs.getDouble("saldo"));  
                contaPJ.setJuridica(JuridicaDAO.consultarPessoaJuridica(rs.getString("Juridica_cnpj")));                
                
                listarContasJuridicas.add(contaPJ);
            }
            st.close();
        } catch (Exception erro) {
            System.out.println("ContaDAO! listarContasJuridicas! "+erro.getMessage());
        }
        return listarContasJuridicas;

    }
    
    public static int atualizarContaJuridica(ContaJuridica conta, String cnpj)throws Exception{
        int ret = 0;
        
        try {
            String sql = "Update Conta Set codAgencia=?, operacao=?, numeroConta=? Where Juridica_cnpj=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setInt(1, conta.getCodAgencia());
            st.setInt(2, conta.getOperacao());
            st.setString(3, conta.getNumeroConta());      
            st.setString(4, cnpj);
            
            ret = st.executeUpdate();
            st.close();
        } catch (Exception erro) {
            System.out.println("ContaDAO! atualizarContaJuridica! "+erro.getMessage());            
        }
        return ret;
    }  
    
}
