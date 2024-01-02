package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenteDeConexao {
    
    protected static GerenteDeConexao connect;
    
    protected static String driver = "com.mysql.cj.jdbc.Driver";
    protected static String conexao = "jdbc:mysql://localhost:3306/sistemabancario";
    protected static String user = "root";
    protected static String password = "";    
    
    public static GerenteDeConexao getInstance(){
        if(connect == null){
            return connect = new GerenteDeConexao();  
        }else{
            return connect;
        }        
    }
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        return DriverManager.getConnection(conexao, user, password);
        
    }  
}
