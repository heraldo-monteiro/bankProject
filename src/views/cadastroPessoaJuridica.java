package views;

import java.util.Random;
import javax.swing.JOptionPane;
import modelo.ContaJuridica;
import modelo.EnderecoPessoaJuridica;
import modelo.Juridica;
import persistencia.ContaDAO;
import persistencia.ContaJuridicaDAO;
import persistencia.EnderecoDAO;
import persistencia.JuridicaDAO;


public class cadastroPessoaJuridica extends javax.swing.JFrame {    

    public cadastroPessoaJuridica() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Page = new javax.swing.JPanel();
        Panel_Titulo = new javax.swing.JPanel();
        Panel_de_Cadastro = new javax.swing.JPanel();
        abertura_de_Conta = new javax.swing.JLabel();
        Agencia = new javax.swing.JLabel();
        Operacao = new javax.swing.JLabel();
        Conta = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        txtOperacao = new javax.swing.JTextField();
        txtNumeroConta = new javax.swing.JTextField();
        Linha_1 = new javax.swing.JPanel();
        cadastro_de_Cliente = new javax.swing.JLabel();
        Cnpj = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Data_Aquisição = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        lb_Razao_Socoal = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        txtPaisOrigem = new javax.swing.JTextField();
        comboBoxDia = new javax.swing.JComboBox<>();
        comboBoxMes = new javax.swing.JComboBox<>();
        comboBoxAno = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        Linha_2 = new javax.swing.JPanel();
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
        Linha_3 = new javax.swing.JPanel();
        Criar_Senha = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        Confirmar_senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConf_senha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setModalExclusionType(null);
        setPreferredSize(new java.awt.Dimension(900, 800));

        Panel_Page.setBackground(new java.awt.Color(41, 111, 167));
        Panel_Page.setPreferredSize(new java.awt.Dimension(900, 800));

        Panel_Titulo.setBackground(new java.awt.Color(0, 92, 169));

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Panel_de_Cadastro.setBackground(new java.awt.Color(195, 214, 230));
        Panel_de_Cadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_de_Cadastro.setMinimumSize(new java.awt.Dimension(800, 500));

        abertura_de_Conta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        abertura_de_Conta.setText("Abertura de Conta Pessoa Juridica ");

        Agencia.setText("Agência");

        Operacao.setText("Op");

        Conta.setText("Conta");

        txtAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Linha_1Layout = new javax.swing.GroupLayout(Linha_1);
        Linha_1.setLayout(Linha_1Layout);
        Linha_1Layout.setHorizontalGroup(
            Linha_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Linha_1Layout.setVerticalGroup(
            Linha_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        cadastro_de_Cliente.setBackground(new java.awt.Color(153, 255, 0));
        cadastro_de_Cliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cadastro_de_Cliente.setText("Cadastro de Cliente");

        Cnpj.setText("CNPJ");

        Nome.setText("Nome");

        Data_Aquisição.setText("Data de Aquisição");

        pais.setText("País de Origem");

        lb_Razao_Socoal.setText("Razão Social");

        txtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnpjActionPerformed(evt);
            }
        });

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

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoSocialActionPerformed(evt);
            }
        });

        Linha_2.setMinimumSize(new java.awt.Dimension(100, 1));
        Linha_2.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout Linha_2Layout = new javax.swing.GroupLayout(Linha_2);
        Linha_2.setLayout(Linha_2Layout);
        Linha_2Layout.setHorizontalGroup(
            Linha_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Linha_2Layout.setVerticalGroup(
            Linha_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

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

        Linha_3.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout Linha_3Layout = new javax.swing.GroupLayout(Linha_3);
        Linha_3.setLayout(Linha_3Layout);
        Linha_3Layout.setHorizontalGroup(
            Linha_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Linha_3Layout.setVerticalGroup(
            Linha_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        Criar_Senha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Criar_Senha.setText("Criar Senha");

        Senha.setText("Senha");

        Confirmar_senha.setText("Confirmar senha");

        txtConf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConf_senhaActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_de_CadastroLayout = new javax.swing.GroupLayout(Panel_de_Cadastro);
        Panel_de_Cadastro.setLayout(Panel_de_CadastroLayout);
        Panel_de_CadastroLayout.setHorizontalGroup(
            Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Linha_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addComponent(Linha_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Linha_3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dados_de_Enereco)
                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
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
                            .addComponent(abertura_de_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Confirmar_senha)
                                            .addComponent(txtConf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_de_CadastroLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))))
                .addContainerGap())
            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Razao_Socoal)
                    .addComponent(Nome)
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cnpj)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(pais)
                                .addGap(78, 78, 78)
                                .addComponent(Data_Aquisição))
                            .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtRazaoSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Linha_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastro_de_Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data_Aquisição))
                .addGap(7, 7, 7)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Razao_Socoal)
                    .addGroup(Panel_de_CadastroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Linha_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dados_de_Enereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Linha_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(Panel_de_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_PageLayout = new javax.swing.GroupLayout(Panel_Page);
        Panel_Page.setLayout(Panel_PageLayout);
        Panel_PageLayout.setHorizontalGroup(
            Panel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PageLayout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(Panel_de_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        Panel_PageLayout.setVerticalGroup(
            Panel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PageLayout.createSequentialGroup()
                .addComponent(Panel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_de_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Page, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Page, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
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
            Login ligin = new Login();  
            ligin.setVisible(true);                
            dispose();  
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
       
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtConf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConf_senhaActionPerformed
       
    }//GEN-LAST:event_txtConf_senhaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
    
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnpjActionPerformed
      
    }//GEN-LAST:event_txtCnpjActionPerformed

    private void txtRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoSocialActionPerformed

    }//GEN-LAST:event_txtRazaoSocialActionPerformed

    private void txtAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgenciaActionPerformed

    }//GEN-LAST:event_txtAgenciaActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
  
        
    }//GEN-LAST:event_btnCancelarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroPessoaJuridica().setVisible(true);
            }
        });
    }   
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agencia;
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel Cep;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Cnpj;
    private javax.swing.JLabel Confirmar_senha;
    private javax.swing.JLabel Conta;
    private javax.swing.JLabel Criar_Senha;
    private javax.swing.JLabel Dados_de_Enereco;
    private javax.swing.JLabel Data_Aquisição;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Estado;
    private javax.swing.JPanel Linha_1;
    private javax.swing.JPanel Linha_2;
    private javax.swing.JPanel Linha_3;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Operacao;
    private javax.swing.JPanel Panel_Page;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JPanel Panel_de_Cadastro;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel abertura_de_Conta;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel cadastro_de_Cliente;
    private javax.swing.JComboBox<String> comboBoxAno;
    private javax.swing.JComboBox<String> comboBoxDia;
    private javax.swing.JComboBox<String> comboBoxMes;
    private javax.swing.JLabel lb_Razao_Socoal;
    private javax.swing.JLabel pais;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JPasswordField txtConf_senha;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroConta;
    private javax.swing.JTextField txtOperacao;
    private javax.swing.JTextField txtPaisOrigem;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables


    public void abriConta(){
        try {  
        //----- DADOS DO CLIENTE -----------------------------------------------
            String cnpj = "";
            String nome = "";
            String razaoSocial= "";
            String paisOrigem = "";
            String dia = "";
            String mes  = "";
            String ano  = "";   
            int idade = 0;

            cnpj = txtCnpj.getText();
            nome = txtNome.getText();
            razaoSocial = txtRazaoSocial.getText();
            paisOrigem = txtPaisOrigem.getText();   
            dia = comboBoxDia.getSelectedItem().toString();
            mes = comboBoxMes.getSelectedItem().toString();
            ano = comboBoxAno.getSelectedItem().toString();   
            idade = 2023 - Integer.parseInt(ano); 
            
            Juridica juridica = new Juridica();
                juridica.setCnpj(cnpj);
                juridica.setNome(nome);
                juridica.setRazaoSocial(razaoSocial);
                juridica.setDataAquisicao(dia + "/" + mes + "/" + ano);
                juridica.setIdade(idade);
                juridica.setPaisOrigem(paisOrigem);            
                
        //----- DADOS DE ENDEREÇO ----------------------------------------------
            int code = 0; 
            String cep = "";
            String endereco = "";
            String numero = "";
            String bairro = "";
            String cidade = "";
            String estado = "";      
            
            cnpj = txtCnpj.getText();
            cep = txtCep.getText();
            endereco = txtEndereco.getText();
            numero = txtNumero.getText();
            bairro = txtBairro.getText();
            cidade = txtCidade.getText();
            estado = txtEstado.getText();            
        Random codEndereco = new Random();      
        code = +codEndereco.nextInt(999999999);   
        
        EnderecoPessoaJuridica enderecoJuridica = new EnderecoPessoaJuridica();  
            enderecoJuridica.setCode(code);
            enderecoJuridica.setCep(cep);
            enderecoJuridica.setEndereco(endereco);
            enderecoJuridica.setNumero(Integer.parseInt(numero));
            enderecoJuridica.setBairro(bairro);
            enderecoJuridica.setCidade(cidade);
            enderecoJuridica.setEstado(estado);
            juridica.setCnpj(cnpj);
            enderecoJuridica.setJuridica(juridica);  
        
        
        //----- DADOS DA CONTA BANCARIA ----------------------------------------
            String agencia = "";            
            String numeroConta = "";
            String operacao = "";
            String senha = "";
            Double deposito = 0.0;
            
            agencia = txtAgencia.getText();
            operacao = txtOperacao.getText();
            numeroConta = txtNumeroConta.getText();
            senha = txtSenha.getText(); 
            
            ContaJuridica contaJuridica = new ContaJuridica();
                contaJuridica.setCodAgencia(Integer.parseInt(agencia));
                contaJuridica.setOperacao(Integer.parseInt(operacao));
                contaJuridica.setNumeroConta(numeroConta);
                contaJuridica.setSaldo(deposito);
                contaJuridica.setJuridica(juridica);
                contaJuridica.setSenha(senha);     
                
            JuridicaDAO.cadastarPessoaJuridica(juridica);  
            EnderecoDAO.cadastrarEnderecoPessoaJuridica(enderecoJuridica);  
            ContaJuridicaDAO.abrirContaJuridica(contaJuridica);    
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Preencha todos os dados!!");
        }
        
    }
    


}
