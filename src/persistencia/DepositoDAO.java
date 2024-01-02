
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
import modelo.ContaJuridica;
import modelo.Deposito;

public class DepositoDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;    
         
    public static int efetuarDeposito(Deposito deposito) throws Exception{
        int ret = 0;
        
        try {
            String sql = "Insert Into Deposito (code, data, valor, Conta_numeroConta) Values (?,?,?,?)";
            connection =  GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, deposito.getCode());
            st.setString(2, deposito.getData());
            st.setDouble(3, deposito.getValor());
            st.setString(4, deposito.getConta().getNumeroConta());
            
            ret = st.executeUpdate();
            st.close();  
            
        } catch (Exception erro) {
            System.out.println("DepositoDAO! efetuarDeposito! "+erro.getMessage());
        }
        
        return ret;
        
    }
    public static List<Deposito> listarDepositos() throws Exception {
        List<Deposito> listarDepositos = new ArrayList<Deposito>();

        try {
            String sql = "Select code, data, valor, Conta_numeroConta From Deposito";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Deposito deposito = new Deposito();                
                deposito.setCode(rs.getString("code"));
                deposito.setData(rs.getString("data"));
                deposito.setValor(rs.getDouble("valor"));          
                deposito.setConta(ContaDAO.consultarConta(rs.getString("Conta_numeroConta")));

                
                listarDepositos.add(deposito);
            }
            st.close();
        } catch (Exception erro) {
            System.out.println("DepositoDAO! listarDepositos! "+erro.getMessage());
        }
        return listarDepositos;

    }

    
    public static Deposito consultarDeposito(String numeroConta)throws Exception{
        Deposito deposito = new Deposito();
        
        try {
            String sql = "Select * From Deposito Where Conta_numeroConta = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, numeroConta);
            rs = st.executeQuery();
            
            if(rs.next()){                             
                deposito.setCode(rs.getString("code"));
                deposito.setData(rs.getString("data"));
                deposito.setValor(rs.getDouble("valor")); 
                deposito.setConta(ContaDAO.consultarConta(rs.getString("Conta_numeroConta")));               
            }
            st.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "DepositoDAO! consultarDeposito! "+ erro);
        }
        return deposito;
    }
    

    
    
}


