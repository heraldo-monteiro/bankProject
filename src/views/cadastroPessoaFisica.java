package views;

import java.util.Random;
import javax.swing.JOptionPane;
import modelo.ContaFisica;
import modelo.EnderecoPessoaFisica;
import modelo.Fisica;
import persistencia.ContaDAO;
import persistencia.ContaFisicaDAO;
import persistencia.EnderecoDAO;
import persistencia.FisicaDAO;

public class cadastroPessoaFisica extends javax.swing.JFrame {    

    public cadastroPessoaFisica() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Page = new javax.swing.JPanel();
        Panel_de_Cadastro = new javax.swing.JPanel();
        txtConf_senha = new javax.swing.JPasswordField();
        abertura_de_Conta = new javax.swing.JLabel();
        Agencia = new javax.swing.JLabel();
        Operacao = new javax.swing.JLabel();
        txtOperacao = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JTextField();
        txtNumeroConta = new javax.swing.JTextField();
        CLIENTE = new javax.swing.JSeparator();
        Cpf = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Data_Nascimento = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        cadastro_de_Cliente = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        estado_Civil = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        Conta = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPaisOrigem = new javax.swing.JTextField();
        comboBoxDia = new javax.swing.JComboBox<>();
        comboBoxMes = new javax.swing.JComboBox<>();
        comboBoxAno = new javax.swing.JComboBox<>();
        comboBoxSexo = new javax.swing.JComboBox<>();
        comboBoxEstadoCivil = new javax.swing.JComboBox<>();
        ENDERECO = new javax.swing.JSeparator();
        Dados_de_Enereco = new javax.swing.JLabel();
        Cep = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        SENHA = new javax.swing.JSeparator();
        Criar_Senha = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        Confirmar_senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Panel_Titulo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(900, 800));

        Panel_Page.setBackground(new java.awt.Color(41, 111, 167));

        Panel_de_Cadastro.setBackground(new java.awt.Color(195, 214, 230));
        Panel_de_Cadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtConf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConf_senhaActionPerformed(evt);
            }
        });

        abertura_de_Conta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        abertura_de_Conta.setText("Abertura de Conta Pessoa Fisica ");

        Agencia.setText("Agência");

        Operacao.setText("Op");

        Cpf.setText("CPF");

        Nome.setText("Nome");

        Data_Nascimento.setText("Data de Nascimento");

        sexo.setText("Sexo");

        cadastro_de_Cliente.setBackground(new java.awt.Color(153, 255, 0));
        cadastro_de_Cliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cadastro_de_Cliente.setText("Cadastro de Cliente");

        pais.setText("País de Origem");

        estado_Civil.setText("Estado Civil");

        Conta.setText("Conta");

        comboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        comboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDiaActionPerformed(evt);
            }
        });

        comboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        comboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMesActionPerformed(evt);
            }
        });

        comboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", "1899", "1898", "1897", "1896", "1895", "1894", "1893", "1892", "1891", "1890", "1889", "1888", "1887", "1886", "1885", "1884", "1883", "1882", "1881", "1880", "1879", "1878", "1877", "1876", "1875", "1874", "1873", "1872", "1871", "1870", "1869", "1868", "1867", "1866", "1865", "1864", "1863", "1862", "1861", "1860", "1859", "1858", "1857", "1856", "1855", "1854", "1853", "1852", "1851", "1850", "1849", "1848", "1847", "1846", "1845", "1844", "1843", "1842", "1841", "1840", "1839", "1838", "1837", "1836", "1835", "1834", "1833", "1832", "1831", "1830", "1829", "1828", "1827", "1826", "1825", "1824", "1823", "1822", "1821", "1820", " ", " ", " " }));
        comboBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAnoActionPerformed(evt);
            }
        });

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));

        comboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro(a)", "Casado(a)", "Diviciado(a)", "Viúvo(a)", "Outo" }));

        Dados_de_Enereco.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Dados_de_Enereco.setText("Dados de Endereço");

        Cep.setText("Cep");

        Endereco.setText("Endereço");

        Numero.setText("Número");

        Bairro.setText("Bairro");

        Cidade.setText("Cidade");

        Estado.setText("Estado");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        Criar_Senha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Criar_Senha.setText("Criar Senha");

        Senha.setText("Senha");

        Confirmar_senha.setText("Confirmar senha");

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_de_CadastroLayout = new javax.swing.GroupLayout(Panel_de_Cadastro);
        Panel_de_Cadastro.setLayout(Panel_de_CadastroLayout);
        Panel_de_CadastroLayout.setHorizontalGroup(
            Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dados_de_Enereco)
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Agencia))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Operacao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cadastro_de_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Senha)
                                        .addComponent(Criar_Senha))
                                    .addComponent(abertura_de_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                                .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(pais)
                                            .addComponent(txtPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(estado_Civil)
                                            .addComponent(sexo)
                                            .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Data_Nascimento)
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addComponent(Cpf)
                                        .addGap(138, 138, 138)
                                        .addComponent(Nome))
                                    .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Endereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Cidade)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(Estado))
                                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Confirmar_senha)
                                            .addComponent(txtConf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_de_CadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(20, 20, 20))
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ENDERECO, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SENHA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CLIENTE, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        Panel_de_CadastroLayout.setVerticalGroup(
            Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abertura_de_Conta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agencia)
                    .addComponent(Operacao)
                    .addComponent(Conta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastro_de_Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf)
                    .addComponent(Nome))
                .addGap(7, 7, 7)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Data_Nascimento)
                    .addComponent(sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pais)
                    .addComponent(estado_Civil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dados_de_Enereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Numero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bairro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade)
                    .addComponent(Estado))
                .addGap(1, 1, 1)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Criar_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addComponent(Senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addComponent(Confirmar_senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Panel_Titulo.setBackground(new java.awt.Color(0, 92, 169));

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_PageLayout = new javax.swing.GroupLayout(Panel_Page);
        Panel_Page.setLayout(Panel_PageLayout);
        Panel_PageLayout.setHorizontalGroup(
            Panel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PageLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(Panel_de_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addComponent(Panel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_PageLayout.setVerticalGroup(
            Panel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PageLayout.createSequentialGroup()
                .addComponent(Panel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_de_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Page, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Page, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDiaActionPerformed

    }//GEN-LAST:event_comboBoxDiaActionPerformed

    private void comboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMesActionPerformed

    }//GEN-LAST:event_comboBoxMesActionPerformed

    private void comboBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAnoActionPerformed

    }//GEN-LAST:event_comboBoxAnoActionPerformed
   
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {           
            abriConta();          
            cadastroPessoaFisica cadastro = new cadastroPessoaFisica();  
            cadastro.setVisible(true);                
            dispose();   
        } catch (Exception erro) {
            
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
       
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtConf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConf_senhaActionPerformed
       
    }//GEN-LAST:event_txtConf_senhaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            Login ligin = new Login();  
            ligin.setVisible(true);  
            dispose();  
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroPessoaFisica().setVisible(true);
            }
        });
    }  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agencia;
    private javax.swing.JLabel Bairro;
    private javax.swing.JSeparator CLIENTE;
    private javax.swing.JLabel Cep;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Confirmar_senha;
    private javax.swing.JLabel Conta;
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Criar_Senha;
    private javax.swing.JLabel Dados_de_Enereco;
    private javax.swing.JLabel Data_Nascimento;
    private javax.swing.JSeparator ENDERECO;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Operacao;
    private javax.swing.JPanel Panel_Page;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JPanel Panel_de_Cadastro;
    private javax.swing.JSeparator SENHA;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel abertura_de_Conta;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel cadastro_de_Cliente;
    private javax.swing.JComboBox<String> comboBoxAno;
    private javax.swing.JComboBox<String> comboBoxDia;
    private javax.swing.JComboBox<String> comboBoxEstadoCivil;
    private javax.swing.JComboBox<String> comboBoxMes;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JLabel estado_Civil;
    private javax.swing.JLabel pais;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JPasswordField txtConf_senha;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroConta;
    private javax.swing.JTextField txtOperacao;
    private javax.swing.JTextField txtPaisOrigem;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    public void abriConta(){
        try {  
        //----- DADOS DO CLIENTE -----------------------------------------------
            String cpf = "";
            String nome = "";
            String dia_nasc = "";
            String mes_nasc = "";
            String ano_nasc = "";
            String sexo = "";
            String paisOrigem = "";
            String estadoCivil = "";    
            int idade = 0;

            cpf = txtCpf.getText();
            nome = txtNome.getText();
            dia_nasc = comboBoxDia.getSelectedItem().toString();
            mes_nasc = comboBoxMes.getSelectedItem().toString();
            ano_nasc = comboBoxAno.getSelectedItem().toString();
            sexo = comboBoxSexo.getSelectedItem().toString();
            paisOrigem = txtPaisOrigem.getText();
            estadoCivil = comboBoxEstadoCivil.getSelectedItem().toString();
            idade = 2023 - Integer.parseInt(ano_nasc); 
            Fisica fisica = new Fisica();
                fisica.setCpf(cpf);
                fisica.setNome(nome);
                fisica.setIdade(idade);
                fisica.setDataNasc(dia_nasc + "/" + mes_nasc + "/" + ano_nasc);
                fisica.setSexo(sexo);
                fisica.setPaisOrigem(paisOrigem);
                fisica.setEstadoCivil(estadoCivil);
                
        //----- DADOS DE ENDEREÇO ----------------------------------------------
            int code = 0;
            String cep = "";
            String endereco = "";
            String numero = "";
            String bairro = "";
            String cidade = "";
            String estado = "";      
   
            
            cpf = txtCpf.getText();
            cep = txtCep.getText();
            endereco = txtEndereco.getText();
            numero = txtNumero.getText();
            bairro = txtBairro.getText();
            cidade = txtCidade.getText();
            estado = txtEstado.getText();            
        Random codEndereco = new Random();      
        code = +codEndereco.nextInt(999999999);   
        EnderecoPessoaFisica enderecoFisica = new EnderecoPessoaFisica();  
            enderecoFisica.setCode(code);
            enderecoFisica.setCep(cep);
            enderecoFisica.setEndereco(endereco);
            enderecoFisica.setNumero(Integer.parseInt(numero));
            enderecoFisica.setBairro(bairro);
            enderecoFisica.setCidade(cidade);
            enderecoFisica.setEstado(estado);
            fisica.setCpf(cpf);
            enderecoFisica.setFisica(fisica);  
        
        
        //----- DADOS DA CONTA BANCARIA ----------------------------------------
            String agencia = "";            
            String numeroConta = "";
            String operacao = "";
            String senha = "";
            Double deposito = 0.0;
            
            agencia = txtAgencia.getText();
            operacao = txtOperacao.getText();
            numeroConta = txtNumeroConta.getText();
            senha = txtConf_senha.getText(); 
            
            ContaFisica contaFisica = new ContaFisica();
                contaFisica.setCodAgencia(Integer.parseInt(agencia));
                contaFisica.setOperacao(Integer.parseInt(operacao));
                contaFisica.setNumeroConta(numeroConta);
                contaFisica.setSaldo(deposito);
                contaFisica.setFisica(fisica);
                contaFisica.setSenha(senha);     
                
            FisicaDAO.cadastarPessoaFisica(fisica);  
            EnderecoDAO.cadastrarEnderecoPessoaFisica(enderecoFisica);  
            ContaFisicaDAO.abrirContaFisica(contaFisica);    
            
        } catch (Exception erro) {
           JOptionPane.showMessageDialog(null, "(views) cadastroPessoaFisica!  abrirConta! "+erro);
        }
        
    }
    public void numeroAgengia(){         
        int num_ag1 = 3, 
            num_ag2 = 5, 
            num_ag3 = 1, 
            num_ag4 = 3;
        int num_agencia1 = num_ag1 * 8; String ag1 = ""+num_agencia1;
        int num_agencia2 = num_ag2 * 7; String ag2 = ""+num_agencia2;
        int num_agencia3 = num_ag3 * 6; String ag3 = ""+num_agencia3;
        int num_agencia4 = num_ag4 * 5; String ag4 = ""+num_agencia4;  
        int soma_agencia = (num_agencia1 + num_agencia2 + num_agencia3 + num_agencia4);
        
    }
    
    public void numeroOperacao(){
        
        int n_op1 = 0, n_op2 = 0, n_op3 = 1;
        int num_operacao1 = n_op1 * 4; String num_op1 = ""+num_operacao1;
        int num_operacao2 = n_op2 * 3; String num_op2 = ""+num_operacao2;
        int num_operacao3 = n_op3 * 2; String num_op3 = ""+num_operacao3;
        int soma_operacao = (num_operacao1 + num_operacao2 + num_operacao3);        
        
    }
    
    public void numeroConta(){
        String numeroConta = "";
        Random rand = new Random(); 
        int num_conta1 = (rand.nextInt(9)*0); String num1 = ""+num_conta1;
        int num_conta2 = (rand.nextInt(9)*0); String num2 = ""+num_conta2;
        int num_conta3 = (rand.nextInt(9)*0); String num3 = ""+num_conta3;
        int num_conta4 = (rand.nextInt(9)*0); String num4 = ""+num_conta4;
        int num_conta5 = (rand.nextInt(9)*1); String num5 = ""+num_conta5; 
        int num_conta6 = (rand.nextInt(9)*1); String num6 = ""+num_conta6; 
        int num_conta7 = (rand.nextInt(9)*1); String num7 = ""+num_conta7;
        int num_conta8 = (rand.nextInt(9)*1); String num8 = ""+num_conta8; 
        numeroConta = (num1 + "" + num2 + "" + num3 + "" + num4 + "" + num5 + "" + num6 + "" + num7 + "" + num8);
     
    }
    

}
