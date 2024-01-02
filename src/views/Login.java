 
package views;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conta;
import modelo.Fisica;
import modelo.Juridica;
import persistencia.ContaDAO;

public class Login extends javax.swing.JFrame { 
    private String usuario;
    public Login() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlPagina = new javax.swing.JPanel();
        pnlMenus = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnPessoaFisica = new javax.swing.JRadioButton();
        btnPessoaJuridica = new javax.swing.JRadioButton();
        btnEntrar_Na_Conta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPagina.setBackground(new java.awt.Color(41, 111, 167));

        pnlMenus.setBackground(new java.awt.Color(0, 92, 169));

        javax.swing.GroupLayout pnlMenusLayout = new javax.swing.GroupLayout(pnlMenus);
        pnlMenus.setLayout(pnlMenusLayout);
        pnlMenusLayout.setHorizontalGroup(
            pnlMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMenusLayout.setVerticalGroup(
            pnlMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlLogin.setBackground(new java.awt.Color(195, 214, 230));

        jLabel1.setText("JÁ SOU CADASTRADO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("INTERNET BANKING SIATEMA BANCÁRIO ");

        lblUsuario.setText("Usuario");

        jLabel3.setText("Senha");

        buttonGroup1.add(btnPessoaFisica);
        btnPessoaFisica.setText("Pessoa Fisica");

        buttonGroup1.add(btnPessoaJuridica);
        btnPessoaJuridica.setText("Pessoa Juridica");

        btnEntrar_Na_Conta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntrar_Na_Conta.setText("ENTRAR NA CONTA");
        btnEntrar_Na_Conta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrar_Na_ContaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario)
                    .addComponent(txtSenha)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPessoaFisica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPessoaJuridica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnEntrar_Na_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPessoaFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPessoaJuridica)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar_Na_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecione o tipo de conta ates de ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("efetuar seu cadastro");

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRE-SE");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPaginaLayout = new javax.swing.GroupLayout(pnlPagina);
        pnlPagina.setLayout(pnlPaginaLayout);
        pnlPaginaLayout.setHorizontalGroup(
            pnlPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPaginaLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(pnlPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(btnCadastrar))
                .addGap(28, 28, 28)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        pnlPaginaLayout.setVerticalGroup(
            pnlPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaginaLayout.createSequentialGroup()
                .addComponent(pnlMenus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPaginaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrar_Na_ContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar_Na_ContaMouseClicked
        if(btnPessoaFisica.isSelected()){
            altenticarContaFisica();
        }
        else{
            altenticarContaJuridica();
        }
        
    }//GEN-LAST:event_btnEntrar_Na_ContaMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
      cadastrarSe();
              
    }//GEN-LAST:event_btnCadastrarMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar_Na_Conta;
    private javax.swing.JRadioButton btnPessoaFisica;
    private javax.swing.JRadioButton btnPessoaJuridica;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlMenus;
    private javax.swing.JPanel pnlPagina;
    private javax.swing.JPasswordField txtSenha;
    protected static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void altenticarContaFisica(){
        try {         
            String usuario = "";
            String senha = "";            
            usuario = getUsuario();
            senha = txtSenha.getText();
            
            Fisica fisica = new Fisica();            
            fisica.setCpf(usuario);
            modelo.ContaFisica contaFisica = new modelo.ContaFisica();
            contaFisica.setFisica(fisica);
            contaFisica.setSenha(senha);
            
            ContaDAO contadao = new ContaDAO();
            ResultSet conta = contadao.autenticarContaFisica(contaFisica);
            
             if(conta.next()){
                contaFisica conta_fisica = new contaFisica();  
                conta_fisica.setVisible(true);                
                dispose();                
             }
             else{
                JOptionPane.showMessageDialog(null, "Usuario ou Senha Invalido");
             }          
            
        } catch (SQLException erro) {
            System.out.println("Form_Login ! altenticarContaFisica! "+ erro.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(contaFisica.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void altenticarContaJuridica(){
        try {     
            String usuario = "";
            String senha = "";   
            usuario = getUsuario();
            senha = txtSenha.getText();
            
            Juridica juridica = new Juridica();
            juridica.setCnpj(usuario);
            modelo.Conta conta = new modelo.Conta();
            conta.setJuridica(juridica);
            conta.setSenha(senha);  
            
            ContaDAO contadao = new ContaDAO();
            ResultSet contaDAO = contadao.autenticarContaJuridica(conta);
            
             if(contaDAO.next()){
                contaJuridica conta_juridica = new contaJuridica();  
                conta_juridica.setVisible(true);                
                dispose();                
             }
             else{
                JOptionPane.showMessageDialog(null, "Usuario ou Senha Invalido");
             }          
            
        } catch (SQLException erro) {
            System.out.println("Form_Login  altenticarContaJuridica! "+ erro.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(contaJuridica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cadastrarSe(){
        if(btnPessoaFisica.isSelected()){
            cadastroPessoaFisica cadastar = new cadastroPessoaFisica();  
            cadastar.setVisible(true);
            dispose();
        }
        else if (btnPessoaJuridica.isSelected()){
            cadastroPessoaJuridica cadastar = new cadastroPessoaJuridica();
            cadastar.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione o Usuario!\n\nPessoa Fisica\n         ou         \nPessoa Juridica ");
        }
    }

    public String getUsuario() {
        return txtUsuario.getText();
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }




}
