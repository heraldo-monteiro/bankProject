
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conta;
import modelo.Transferencia;


public class TransferenciaDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;
    
    public static Conta consultarSaldo(int codAgencia, int operacao, String numeroConta) throws Exception{
        Conta conta = new Conta();          
        
        try {   
            String sql = "Select saldo From  Conta Where codAgencia= ? and operacao= ? and numeroConta= ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, codAgencia);
            st.setInt(2, operacao);
            st.setString(3, numeroConta);            
            rs = st.executeQuery();
            
            if(rs.next()){
                conta.setSaldo(rs.getDouble("saldo"));
            }        
            
            st.close();
        } catch (SQLException erro) {
            System.out.println("TransferenciaDAO! ConsultarSaldo! "+erro.getMessage());
        }
        return conta;
            
    }
}
