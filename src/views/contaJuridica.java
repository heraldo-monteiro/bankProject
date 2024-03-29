package views;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conta;
import persistencia.ContaDAO;
import persistencia.JuridicaDAO;
import teste.Conta.*;
import views.Login;
import static views.Login.txtUsuario;

public class contaJuridica extends javax.swing.JFrame {

    public contaJuridica() throws Exception{
        initComponents(); 
        setExtendedState(MAXIMIZED_BOTH);
        cliente();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_Menu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Conta = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        lblAgencia = new javax.swing.JLabel();
        lblOperacao = new javax.swing.JLabel();
        lblNumeroConta = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblOla = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        btnTranferencia = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(900, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        Panel_Menu.setBackground(new java.awt.Color(0, 92, 169));
        Panel_Menu.setPreferredSize(new java.awt.Dimension(1036, 120));

        Logo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Logo.setText("JHM Banck");

        Conta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Conta.setForeground(new java.awt.Color(153, 153, 153));
        Conta.setText("Conta");

        Saldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Saldo.setForeground(new java.awt.Color(153, 153, 153));
        Saldo.setText("Meu Saldo");

        lblAgencia.setForeground(new java.awt.Color(204, 204, 204));
        lblAgencia.setText("Agencia");

        lblOperacao.setForeground(new java.awt.Color(204, 204, 204));
        lblOperacao.setText("Op");

        lblNumeroConta.setForeground(new java.awt.Color(204, 204, 204));
        lblNumeroConta.setText("Conta");

        lblSaldo.setForeground(new java.awt.Color(204, 204, 204));
        lblSaldo.setText("Saldo Conta");

        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_MenuLayout = new javax.swing.GroupLayout(Panel_Menu);
        Panel_Menu.setLayout(Panel_MenuLayout);
        Panel_MenuLayout.setHorizontalGroup(
            Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Conta)
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addComponent(lblAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(31, 31, 31))
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Panel_MenuLayout.setVerticalGroup(
            Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MenuLayout.createSequentialGroup()
                .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Saldo)
                            .addComponent(Conta)
                            .addComponent(btnSair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgencia)
                            .addComponent(lblOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumeroConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(133, 133, 133))
        );

        jPanel3.setBackground(new java.awt.Color(244, 244, 246));

        lblOla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOla.setText("Ola!");

        btnTranferencia.setText("Tranferência");
        btnTranferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTranferenciaMouseClicked(evt);
            }
        });

        btnDeposito.setText("Depósito");
        btnDeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepositoMouseClicked(evt);
            }
        });
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnSaque.setText("Saque");
        btnSaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaqueMouseClicked(evt);
            }
        });
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblOla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaque)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeposito)
                        .addGap(18, 18, 18)
                        .addComponent(btnTranferencia)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTranferencia)
                            .addComponent(btnDeposito)
                            .addComponent(btnSaque))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 441, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
    }//GEN-LAST:event_btnSairActionPerformed
        
    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
       Login login = new Login();
       login.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void btnSaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaqueMouseClicked
           try {
            saqueBancario saque = new saqueBancario();
            saque.setVisible(true);            
        } catch (Exception erro) {
            System.out.println("Não foi possivel efetuar o Saque! \ntente novamente mais tarde! ");
        }   

    }//GEN-LAST:event_btnSaqueMouseClicked

    private void btnDepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositoMouseClicked
        try {
            depositoBancario deposito = new depositoBancario();
            deposito.setVisible(true);            
        } catch (Exception erro) {
            System.out.println("Não foi possivel efetuar o Saque! \ntente novamente mais tarde! ");
        }
        
    }//GEN-LAST:event_btnDepositoMouseClicked

    private void btnTranferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTranferenciaMouseClicked
        try {
            transferenciaBancaria transferencia = new transferenciaBancaria();
            transferencia.setVisible(true);
        } catch (Exception erro) {
            System.out.println("Não foi possivel efetuar a Tranferencia! \ntente novamente mais tarde! ");
        }
        
        
        
    }//GEN-LAST:event_btnTranferenciaMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new contaJuridica().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(contaJuridica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Conta;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Panel_Menu;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnTranferencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNumeroConta;
    private javax.swing.JLabel lblOla;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblSaldo;
    // End of variables declaration//GEN-END:variables
    
public int carregarAgencia(){   
    int agencia = 0;
        try {    
           ContaDAO agenciaConta = new ContaDAO();
           agencia = agenciaConta.agenciaConta(txtUsuario.getText());          
        } catch (Exception e) {
            System.out.println("Erro! "+ e);
        }
        return (agencia);

    }

public void agenciaConta() throws Exception{
    carregarAgencia();
    lblAgencia.setText(Integer.toString(carregarAgencia()));
}

public int carregarOperacao(){   
    int operacao = 0;
        try {    
           ContaDAO opConta = new ContaDAO();
           operacao = opConta.operacaoConta(txtUsuario.getText());          
        } catch (Exception e) {
            System.out.println("Erro! "+ e);
        }
        return (operacao);
    }

public void operacaoConta() throws Exception{
    carregarOperacao();
    lblOperacao.setText("0"+Integer.toString(carregarOperacao())); 
    
}

public String carregarConta(){   
    String numeroConta = "";
        try {    
           ContaDAO saldoConta = new ContaDAO();
           numeroConta = saldoConta.numeroConta(txtUsuario.getText());          
        } catch (Exception e) {
            System.out.println("Erro! "+ e);
        }
        return (numeroConta);

    }

public void numeroConta() throws Exception{
    carregarConta();
    lblNumeroConta.setText(carregarConta()); 
    
}
 
public Double carregarSaldo(){   
    Double saldo = 0.0;
        try {    
           ContaDAO saldoConta = new ContaDAO();
           saldo = saldoConta.saldoConta(txtUsuario.getText());          
        } catch (Exception e) {
            System.out.println("Erro! "+ e);
        }
        return saldo;

    }

public void saldoConta() throws Exception{
    carregarSaldo();
    lblSaldo.setText("R$"+df.format(carregarSaldo()).toString()); 
}

public String carregarNome(){   
    String nome = "";
        try {    
           JuridicaDAO nomeUsuario = new JuridicaDAO();
           nome = nomeUsuario.nomeUsuario(txtUsuario.getText());          
        } catch (Exception e) {
            System.out.println("Erro! "+ e);
        }
        return nome;
    }

public void nomeUsuario() throws Exception{
    carregarNome();
    lblNomeUsuario.setText(carregarNome()); 
}

public void cliente() throws Exception{
    agenciaConta();
    operacaoConta();
    numeroConta();
    saldoConta();
    nomeUsuario();
    
}

DecimalFormat df = new DecimalFormat("#,##0.00");


}



    


