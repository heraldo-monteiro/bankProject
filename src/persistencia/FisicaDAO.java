package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Fisica;
import modelo.Juridica;

import static persistencia.JuridicaDAO.rs;

public class FisicaDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static Fisica consultarPessoaFisica(String cpf) throws Exception {
        Fisica fisica = new Fisica();

        try {
            String sql = "Select * From  Fisica Where cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            rs = st.executeQuery();

            if (rs.next()) {
                fisica.setCpf(rs.getString("cpf"));
                fisica.setNome(rs.getString("nome"));
                fisica.setIdade(rs.getInt("idade"));
                fisica.setDataNasc(rs.getString("dataNasc"));
                fisica.setSexo(rs.getString("sexo"));
                fisica.setPaisOrigem(rs.getString("paisOrigem"));
                fisica.setEstadoCivil(rs.getString("estadoCivil"));

            }
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! " + erro);
        }
        return fisica;
    }

    public static List<Fisica> listarPessoasFisicas() throws Exception {
        List<Fisica> listarPessoasJuridicas = new ArrayList<Fisica>();

        try {
            String sql = "Select * From Fisica";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Fisica fisica = new Fisica();
                fisica.setCpf(rs.getString("cpf"));
                fisica.setNome(rs.getString("nome"));
                fisica.setIdade(rs.getInt("idade"));
                fisica.setDataNasc(rs.getString("dataNasc"));
                fisica.setSexo(rs.getString("sexo"));
                fisica.setPaisOrigem(rs.getString("paisOrigem"));
                fisica.setEstadoCivil(rs.getString("estadoCivil"));

                listarPessoasJuridicas.add(fisica);
            }
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! listarPessoasFisicas! " + erro);
        }
        return listarPessoasJuridicas;
    }

    public static int cadastarPessoaFisica(Fisica fisica) throws Exception {
        int ret = 0;

        try {
            String sql = "Insert Into Fisica (cpf, nome, idade, dataNasc, sexo, paisOrigem, estadoCivil) Values(?,?,?,?,?,?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, fisica.getCpf());
            st.setString(2, fisica.getNome());
            st.setInt(3, fisica.getIdade());
            st.setString(4, fisica.getDataNasc());
            st.setString(5, fisica.getSexo());
            st.setString(6, fisica.getPaisOrigem());
            st.setString(7, fisica.getEstadoCivil());

            ret = st.executeUpdate();
            st.close();

        } catch (Exception erro) {
            System.out.println("FisicaDAO! cadastarPessoaFisica! " + erro.getMessage());
        }

        return ret;
    }

    public static int atualizarPessoaFisica(Fisica fisica, String cpf) throws Exception {
        int ret = 0;

        try {
            String sql = "Update Fisica Set cpf=?, nome=?, idade=?, dataNasc=?, sexo=?, paisOrigem=?, estadoCivil=?  Where cpf=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, fisica.getCpf());
            st.setString(2, fisica.getNome());
            st.setInt(3, fisica.getIdade());
            st.setString(4, fisica.getDataNasc());
            st.setString(5, fisica.getSexo());
            st.setString(6, fisica.getPaisOrigem());
            st.setString(7, fisica.getEstadoCivil());
            st.setString(8, cpf);

            ret = st.executeUpdate();
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! atualizarPessoaFisica! " + erro);
        }

        return ret;

    }

    public static int excluirPessoaFisica(String cpf) throws Exception {
        int ret = 0;

        try {
            String sql = "Delete From Fisica Where cpf=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);

            ret = st.executeUpdate();
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! excluirPessoaFisica! " + erro);
        }
        return ret;
    }
    
    public static List<Fisica> listaBetweenPessoFisica(int menor_idade, int maior_idade) throws Exception {
        List<Fisica> listaBetweenPessoFisica = new ArrayList<Fisica>();
        try {
            String sql = "select * from  fisica  where idade between ? and ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, menor_idade);
            st.setInt(2, maior_idade);
            rs = st.executeQuery();

            while (rs.next()) {
                Fisica fisica = new Fisica();
                fisica.setCpf(rs.getString("cpf"));
                fisica.setNome(rs.getString("nome"));
                fisica.setIdade(rs.getInt("idade"));
                fisica.setDataNasc(rs.getString("dataNasc"));
                fisica.setSexo(rs.getString("sexo"));
                fisica.setPaisOrigem(rs.getString("paisOrigem"));
                fisica.setEstadoCivil(rs.getString("estadoCivil"));   
           
                
                listaBetweenPessoFisica.add(fisica);
            }
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! listaBetweenPessoFisica! " + erro);
        }
        return listaBetweenPessoFisica;

    }
    
    public static List<Fisica> like_ListarPessoasFisicas(String nome) throws Exception {
        List<Fisica> like_ListarPessoasFisicas = new ArrayList<Fisica>();

        try {
            String sql = "Select * From Fisica Where nome Like ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, nome+"%");
            
            rs = st.executeQuery();

            while (rs.next()) {
                Fisica fisica = new Fisica();
                fisica.setCpf(rs.getString("cpf"));
                fisica.setNome(rs.getString("nome"));
                fisica.setIdade(rs.getInt("idade"));
                fisica.setDataNasc(rs.getString("dataNasc"));
                fisica.setSexo(rs.getString("sexo"));
                fisica.setPaisOrigem(rs.getString("paisOrigem"));
                fisica.setEstadoCivil(rs.getString("estadoCivil"));

                like_ListarPessoasFisicas.add(fisica);
            }
            st.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! likeListarPessoasFisicas! " + erro);
        }
        return like_ListarPessoasFisicas;
    }
    
    public static String nomeUsuario(String usuario){
        String  nome = "";        
        try {           
            String sql = "Select nome From Fisica Where cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);              
            st.setString(1, usuario);       
            rs = st.executeQuery();
            
            if(rs.next()){   
               nome = rs.getString("nome");               
            }
            st.close();
            
        } catch (Exception erro) {
            System.out.println("FisicaDAO! nomeUsuario! "+erro.getMessage());          
        }
        return nome;    
    }
    
}


