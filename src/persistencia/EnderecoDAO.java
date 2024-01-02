package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.EnderecoPessoaFisica;
import modelo.EnderecoPessoaJuridica;
import modelo.Fisica;

public class EnderecoDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static EnderecoPessoaFisica consultarEnderecoPessoaFisica(String cpf) throws Exception {
        EnderecoPessoaFisica endereco = new EnderecoPessoaFisica();

        try {
            String sql = "Select cep, endereco, numero, bairro, cidade, estado, Fisica_cpf From  Endereco where Fisica_cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            rs = st.executeQuery();

            if (rs.next()) {
                endereco.setCep(rs.getString("cep"));
                endereco.setEndereco(rs.getString("endereco"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setEstado(rs.getString("estado"));
                endereco.setFisica(FisicaDAO.consultarPessoaFisica(rs.getString("Fisica_cpf")));
            }
            st.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! ConsultarEndereco! " + erro);
        }
        return endereco;
    }

    public static EnderecoPessoaJuridica consultarEnderecoPessoaJuridica(String cnpj) throws Exception {
        EnderecoPessoaJuridica endereco = new EnderecoPessoaJuridica();

        try {
            String sql = "Select Select cep, endereco, numero, bairro, cidade, estado, Juridica_cnpj From  Endereco Where Juridica_cnpj = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cnpj);
            rs = st.executeQuery();

            if (rs.next()) {
                endereco.setCep(rs.getString("cep"));
                endereco.setEndereco(rs.getString("endereco"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setEstado(rs.getString("estado"));
                endereco.setJuridica(JuridicaDAO.consultarPessoaJuridica(rs.getString("Juridica_cnpj")));

            }
            st.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FisicaDAO! ConsultarEndereco! " + erro);
        }
        return endereco;
    }

    public static List<EnderecoPessoaFisica> listarEnderecosPessoasFisicas() throws Exception {
        List<EnderecoPessoaFisica> listarEnderecosPessoasFisicas = new ArrayList<EnderecoPessoaFisica>();

        try {
            String sql = "Select cep, endereco, numero, bairro, cidade, estado, Fisica_cpf From Endereco";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                EnderecoPessoaFisica enderecoPF = new EnderecoPessoaFisica();
                enderecoPF.setCep(rs.getString("cep"));
                enderecoPF.setEndereco(rs.getString("endereco"));
                enderecoPF.setNumero(rs.getInt("numero"));
                enderecoPF.setBairro(rs.getString("bairro"));
                enderecoPF.setCidade(rs.getString("cidade"));
                enderecoPF.setEstado(rs.getString("estado"));
                enderecoPF.setFisica(FisicaDAO.consultarPessoaFisica(rs.getString("Fisica_cpf")));

                listarEnderecosPessoasFisicas.add(enderecoPF);
            }
            st.close();

        } catch (SQLException erro) {
            System.out.println("EnderecoDAO! listarEnderecosPessoasFisicas! " + erro.getMessage());
        }
        return listarEnderecosPessoasFisicas;
    }

    public static List<EnderecoPessoaJuridica> listarEnderecosPessoasJuridicas() throws Exception {
        List<EnderecoPessoaJuridica> listarEnderecosPessoasJuridicas = new ArrayList<EnderecoPessoaJuridica>();

        try {
            String sql = "Select cep, endereco, numero, bairro, cidade, estado, Juridica_cnpj From Endereco";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                EnderecoPessoaJuridica enderecoPJ = new EnderecoPessoaJuridica();
                enderecoPJ.setCep(rs.getString("cep"));
                enderecoPJ.setEndereco(rs.getString("endereco"));
                enderecoPJ.setNumero(rs.getInt("numero"));
                enderecoPJ.setBairro(rs.getString("bairro"));
                enderecoPJ.setCidade(rs.getString("cidade"));
                enderecoPJ.setEstado(rs.getString("estado"));
                enderecoPJ.setJuridica(JuridicaDAO.consultarPessoaJuridica(rs.getString("Juridica_cnpj")));

                listarEnderecosPessoasJuridicas.add(enderecoPJ);

            }
            st.close();

        } catch (SQLException erro) {
            System.out.println("EnderecoDAO! listarEnderecosPessoasJuridicas! " + erro.getMessage());

        }
        return listarEnderecosPessoasJuridicas;

    }

    public static int cadastrarEnderecoPessoaFisica(EnderecoPessoaFisica endereco) throws Exception {
        int ret = 0;

        try {
            String sql = "Insert Into Endereco (code, cep, endereco, numero, bairro, cidade, estado, Fisica_cpf) Values(?,?,?,?,?,?,?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setInt(1, endereco.getCode());
            st.setString(2, endereco.getCep());
            st.setString(3, endereco.getEndereco());
            st.setInt(4, endereco.getNumero());
            st.setString(5, endereco.getBairro());
            st.setString(6, endereco.getCidade());
            st.setString(7, endereco.getEstado());
            st.setString(8, endereco.getFisica().getCpf());

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EnderecoDAO! cadastrarEnderecoPessoaFisica! " + erro);
        }
        return ret;
    }

    public static int cadastrarEnderecoPessoaJuridica(EnderecoPessoaJuridica endereco) throws Exception {
        int ret = 0;

        try {
            String sql = "Insert Into Endereco (code, cep, endereco, numero, bairro, cidade, estado, Juridica_cnpj) Values(?,?,?,?,?,?,?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setInt(1, endereco.getCode());
            st.setString(2, endereco.getCep());
            st.setString(3, endereco.getEndereco());
            st.setInt(4, endereco.getNumero());
            st.setString(5, endereco.getBairro());
            st.setString(6, endereco.getCidade());
            st.setString(7, endereco.getEstado());
            st.setString(8, endereco.getJuridica().getCnpj());

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
            System.out.println("EnderecoDAO! cadastrarEnderecoPessoaJuridica! " + erro.getMessage());
        }
        return ret;
    }

    public static int atualizarEnderecoPessoaFisica(EnderecoPessoaFisica endereco, String cpf) throws Exception {
        int ret = 0;

        try {
            String sql = "Update Endereco Set cep=?, endereco=?, numero=?, bairro=?, cidade=?, estado=?, Fisica_cpf=?  Where Fisica_cpf=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, endereco.getCep());
            st.setString(2, endereco.getEndereco());
            st.setInt(3, endereco.getNumero());
            st.setString(4, endereco.getBairro());
            st.setString(5, endereco.getCidade());
            st.setString(6, endereco.getEstado());
            st.setString(7, endereco.getFisica().getCpf());
            st.setString(8, cpf);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EnderecoDAO! atualizarEnderecoPessoaFisica! " + erro);

        }
        return ret;
    }

    public static int atualizarEnderecoPessoaJuridica(EnderecoPessoaJuridica endereco, String cnpj) throws Exception {
        int ret = 0;

        try {
            String sql = "Update Endereco Set cep=?, endereco=?, numero=?, bairro=?, cidade=?, estado=?, Juridica_cnpj=?  Where Juridica_cnpj=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, endereco.getCep());
            st.setString(2, endereco.getEndereco());
            st.setInt(3, endereco.getNumero());
            st.setString(4, endereco.getBairro());
            st.setString(5, endereco.getCidade());
            st.setString(6, endereco.getEstado());
            st.setString(7, endereco.getJuridica().getCnpj());
            st.setString(8, cnpj);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EnderecoDAO! atualizarEnderecoPessoaJuridica! " + erro);

        }
        return ret;
    }

    public static int excluirEnderecoPessoaFisica(String cpf) throws Exception {
        int ret = 0;

        try {
            String sql = "Delete From Endereco Where Fisica_cpf=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EnderecoDAO! excluirEnderecoPessoaFisica! " + erro);
        }
        return ret;
    }

    public static int excluirEnderecoPessoaJuridica(String cnpj) throws Exception {
        int ret = 0;

        try {
            String sql = "Delete From Endereco Where Juridica_cnpj=?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cnpj);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EnderecoDAO! excluirEnderecoPessoaJuridica! " + erro);
        }
        return ret;
    }

}
