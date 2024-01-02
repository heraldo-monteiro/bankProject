 
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Conta;
import modelo.ContaFisica;
import modelo.Fisica;
import static persistencia.ContaDAO.connection;


public class ContaFisicaDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;    
         
    public static int abrirContaFisica(ContaFisica conta) throws Exception {
        int ret = 0;

        try {
            String sql = "Insert Into Conta(codAgencia, operacao, numeroConta, saldo, Fisica_cpf, senha) VALUES(?,?,?,?,?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, conta.getCodAgencia());
            st.setInt(2, conta.getOperacao());
            st.setString(3, conta.getNumeroConta());            
            st.setDouble(4, conta.getSaldo());
            st.setString(5, conta.getFisica().getCpf());
            st.setString(6, conta.getSenha());
            
            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "ContaDAO! abrirContaFisica! "+ erro);
        }
        return ret;
    }
    public static ContaFisica consultarContaFisica(String cpf)throws Exception{
        ContaFisica conta = new ContaFisica();
        
        try {
            String sql = "Select * From  Conta where Fisica_cpf= ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            rs = st.executeQuery();
            
            if(rs.next()){
                conta.setCodAgencia(rs.getInt("codAgencia"));
                conta.setOperacao(rs.getInt("operacao"));
                conta.setNumeroConta(rs.getString("numeroConta"));
                conta.setSaldo(rs.getDouble("saldo"));
                conta.setFisica(FisicaDAO.consultarPessoaFisica(rs.getString("Fisica_cpf")));  
    
            }
            st.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO! consultarContaFisica! "+ erro);
        }
        return conta;
    }     
       
    public static List<ContaFisica> listarContasFisicas() throws Exception {
        List<ContaFisica> listarContasFisicas = new ArrayList<ContaFisica>();

        try {
            String sql = "Select codAgencia, operacao, numeroConta, saldo, Fisica_cpf From Conta Where Fisica_cpf = Fisica_cpf";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                ContaFisica contaPF = new ContaFisica();                
                contaPF.setCodAgencia(rs.getInt("codAgencia"));
                contaPF.setOperacao(rs.getInt("operacao"));
                contaPF.setNumeroConta(rs.getString("numeroConta"));
                contaPF.setSaldo(rs.getDouble("saldo"));  
                contaPF.setFisica(FisicaDAO.consultarPessoaFisica(rs.getString("Fisica_cpf")));    

                
                listarContasFisicas.add(contaPF);
            }
            st.close();
        } catch (SQLException erro) {
            System.out.println("ContaDAO! listarContasFisicas! "+erro.getMessage());
        }
        return listarContasFisicas;

    }
    
    public static int atualizarContaFisica(ContaFisica conta, String cpf)throws Exception{
        int ret = 0;
        
        try {
            String sql = "Update Conta Set codAgencia=?, operacao=?, numeroConta=? Where Fisica_cpf=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setInt(1, conta.getCodAgencia());
            st.setInt(2, conta.getOperacao());
            st.setString(3, conta.getNumeroConta());   
            st.setString(4, cpf);            
            
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException erro) {
            System.out.println("ContaDAO! atualizarContaFisica! "+erro.getMessage());            
        }
        return ret;
    } 
   
}
