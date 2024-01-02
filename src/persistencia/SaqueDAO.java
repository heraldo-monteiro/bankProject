
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
import modelo.ContaFisica;
import modelo.ContaJuridica;
import modelo.Saque;

public class SaqueDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;    
         
    public static int efetuarSaques(Saque saque) throws Exception{
        int ret = 0;
        
        try {
            String sql = "Insert Into Saque (code, data, valor, Conta_numeroConta) Values (?,?,?,?)";
            connection =  GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, saque.getCode());
            st.setString(2, saque.getData());
            st.setDouble(3, saque.getValor());
            st.setString(4, saque.getConta().getNumeroConta());
            
            ret = st.executeUpdate();
            st.close();  
            
        } catch (Exception erro) {
            System.out.println("SaqueDAO! efetuarSaque! "+erro.getMessage());
        }
        
        return ret;
        
    }
    public static List<Saque> listarSaques() throws Exception {
        List<Saque> listarSaques = new ArrayList<Saque>();

        try {
            String sql = "Select code, data, valor, Conta_numeroConta From Saque";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Saque saque = new Saque();                
                saque.setCode(rs.getString("code"));
                saque.setData(rs.getString("data"));
                saque.setValor(rs.getDouble("valor"));          
                saque.setConta(ContaDAO.consultarConta(rs.getString("Conta_numeroConta")));

                
                listarSaques.add(saque);
            }
            st.close();
        } catch (Exception erro) {
            System.out.println("SaqueDAO! listarSaques! "+erro.getMessage());
        }
        return listarSaques;

    }
    
    public static Saque consultarSaque(String numeroConta)throws Exception{
        Saque saque = new Saque();
        
        try {
            String sql = "Select * From Saque Where Conta_numeroConta = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, numeroConta);
            rs = st.executeQuery();
            
            if(rs.next()){                             
                saque.setCode(rs.getString("code"));
                saque.setData(rs.getString("data"));
                saque.setValor(rs.getDouble("valor")); 
                saque.setConta(ContaDAO.consultarConta(rs.getString("Conta_numeroConta")));
               
            }
            st.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "SaqueDAO! consultarSaque! "+ erro);
        }
        return saque;
    }
}
    