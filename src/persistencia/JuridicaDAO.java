package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Juridica;
import static persistencia.FisicaDAO.connection;

public class JuridicaDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;
  
    public static Juridica consultarPessoaJuridica(String cnpj) throws Exception {
        Juridica juridica = new Juridica();
        try {
            String sql = "Select * From  Juridica where cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cnpj);
            rs = st.executeQuery();

            if (rs.next()) {
                juridica.setCnpj(rs.getString("cnpj"));
                juridica.setNome(rs.getString("nome"));
                juridica.setRazaoSocial(rs.getString("razaoSocial"));
                juridica.setIdade(rs.getInt("idade"));
                juridica.setDataAquisicao(rs.getString("dataAquisicao"));
                juridica.setPaisOrigem(rs.getString("paisOrigem"));               

            }
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JuridicaDAO!  consultarPessoaJuridica! " + erro);
        }
        return juridica;
    }
   
    public static List<Juridica> listarPessoasJuridicas() throws Exception {
        List<Juridica> listarPessoasJuridicas = new ArrayList<Juridica>();

        try {
            String sql = "Select * From Juridica";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Juridica juridica = new Juridica();
                
                juridica.setCnpj(rs.getString("cnpj"));
                juridica.setNome(rs.getString("nome"));
                juridica.setRazaoSocial(rs.getString("razaoSocial"));
                juridica.setIdade(rs.getInt("idade"));
                juridica.setDataAquisicao(rs.getString("dataAquisicao"));
                juridica.setPaisOrigem(rs.getString("paisOrigem"));              
                listarPessoasJuridicas.add(juridica);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JuridicaDAO! listarPessoasJuridicas! " + erro);
        }
        return listarPessoasJuridicas;
    }

    public static int cadastarPessoaJuridica(Juridica juridica) throws Exception {
        int ret = 0;

        try {
            String sql = "Insert Into Juridica (cnpj, nome, razaoSocial, idade, dataAquisicao, paisOrigem) Values(?,?,?,?,?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, juridica.getCnpj());
            st.setString(2, juridica.getNome());
            st.setString(3, juridica.getRazaoSocial());
            st.setInt(4, juridica.getIdade());
            st.setString(5, juridica.getDataAquisicao());
            st.setString(6, juridica.getPaisOrigem());          

            ret = st.executeUpdate();
            st.close();

        } catch (Exception erro) {
            System.out.println("JuridicaDAO! cadastarPessoaJuridica! " + erro.getMessage());
        }

        return ret;
    }
 
    public static int atualizarPessoaJuridica(Juridica juridica, String cnpj) throws Exception {
        int ret = 0;

        try {
            String sql = "Update Juridica Set cnpj=?, nome=?, razaoSocial=? Where cnpj=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, juridica.getCnpj());
            st.setString(2, juridica.getNome());
            st.setString(3, juridica.getRazaoSocial());
            st.setString(4, cnpj);

            ret = st.executeUpdate();
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JuridicaDAO!  atualizarPessoaJuridica! " + erro);
        }
        return ret;

    }
    
    public static int excluirPessoaJuridica(String cnpj) throws Exception {
        int ret = 0;

        try {
            String sql = "Delete From Juridica Where cnpj=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cnpj);

            ret = st.executeUpdate();
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JuridicaDAO! rescindirPessoaJuridica! " + erro);
        }
        return ret;
    }
    public static List<Juridica> listaBetweenPessoJuridica(int menor_idade, int maior_idade) throws Exception {
        List<Juridica> listaBetweenPessoJuridica = new ArrayList<Juridica>();
        try {
            String sql = "select * from Juridica where idade between ? and ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, menor_idade);
            st.setInt(2, maior_idade);
            rs = st.executeQuery();

            while (rs.next()) {
                Juridica juridica = new Juridica();
                juridica.setCnpj(rs.getString("cnpj"));
                juridica.setNome(rs.getString("nome"));
                juridica.setRazaoSocial(rs.getString("razaoSocial"));
                juridica.setIdade(rs.getInt("idade"));
                juridica.setDataAquisicao(rs.getString("dataAquisicao"));
                juridica.setPaisOrigem(rs.getString("paisOrigem"));   
                listaBetweenPessoJuridica.add(juridica);
            }
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JuridicaDAO! listaBetweenPessoJuridica! " + erro);
        }
        return listaBetweenPessoJuridica;

    }
    
    public static List<Juridica> likeListarPessoasJuridicas(String nome) throws Exception {
        List<Juridica> likeListarPessoasJuridicas = new ArrayList<Juridica>();

        try {
            String sql = "Select * From Juridica Where nome Like ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, nome+"%");
            
            rs = st.executeQuery();

            while (rs.next()) {
                Juridica juridica = new Juridica();
                juridica.setCnpj(rs.getString("cnpj"));
                juridica.setNome(rs.getString("nome"));
                juridica.setRazaoSocial(rs.getString("razaoSocial"));
                juridica.setIdade(rs.getInt("idade"));
                juridica.setDataAquisicao(rs.getString("dataAquisicao"));
                juridica.setPaisOrigem(rs.getString("paisOrigem"));   

                likeListarPessoasJuridicas.add(juridica);
            }
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JuridicaDAO! likeListarPessoasJuridicas! " + erro);
        }
        return likeListarPessoasJuridicas;
    }
    
    public static String nomeUsuario(String usuario){
        String  nome = "";        
        try {           
            String sql = "Select nome From Juridica Where cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);              
            st.setString(1, usuario);       
            rs = st.executeQuery();
            
            if(rs.next()){   
               nome = rs.getString("nome");               
            }
            st.close();
            
        } catch (Exception erro) {
            System.out.println("JuridicaDAO! nomeUsuario! "+erro.getMessage());          
        }
        return nome;    
    }

}
