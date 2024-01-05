package views;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import modelo.Conta;
import modelo.Fisica;
import persistencia.ContaDAO;
import persistencia.FisicaDAO;
import teste.Conta.*;
import views.Login;
import static views.Login.txtUsuario;

public class contaFisica extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("#,##0.00"); 
    
    public contaFisica() throws Exception{  
        initComponents();   
        setExtendedState(MAXIMIZED_BOTH);     
        cliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Page = new javax.swing.JPanel();
        panel_Menu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Conta = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        lblAgencia = new javax.swing.JLabel();
        lblOperacao = new javax.swing.JLabel();
        lblNumeroConta = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblSaldo = new javax.swing.JLabel();
        panel_subMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        btnTransferencia = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnSaque = new javax.swing.JButton();
        panel_Deposito = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(900, 800));

        panel_Page.setBackground(new java.awt.Color(255, 255, 255));
        panel_Page.setPreferredSize(new java.awt.Dimension(1000, 600));

        panel_Menu.setBackground(new java.awt.Color(0, 92, 169));
        panel_Menu.setPreferredSize(new java.awt.Dimension(1036, 120));

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

        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        lblSaldo.setForeground(new java.awt.Color(204, 204, 204));
        lblSaldo.setText("Saldo Conta");

        javax.swing.GroupLayout panel_MenuLayout = new javax.swing.GroupLayout(panel_Menu);
        panel_Menu.setLayout(panel_MenuLayout);
        panel_MenuLayout.setHorizontalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Conta)
                    .addGroup(panel_MenuLayout.createSequentialGroup()
                        .addComponent(lblAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_MenuLayout.createSequentialGroup()
                        .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(31, 31, 31))
                    .addGroup(panel_MenuLayout.createSequentialGroup()
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_MenuLayout.setVerticalGroup(
            panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MenuLayout.createSequentialGroup()
                .addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_MenuLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Saldo)
                            .addComponent(Conta)
                            .addComponent(btnSair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgencia)
                            .addComponent(lblOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumeroConta)
                            .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_MenuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        panel_subMenu.setBackground(new java.awt.Color(244, 244, 246));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ola!");

        lblNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnTransferencia.setText("Transferência");
        btnTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransferenciaMouseClicked(evt);
            }
        });

        btnDeposito.setText("Depósito");
        btnDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepositoMouseClicked(evt);
            }
        });

        btnSaque.setText("Saque");
        btnSaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaqueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_subMenuLayout = new javax.swing.GroupLayout(panel_subMenu);
        panel_subMenu.setLayout(panel_subMenuLayout);
        panel_subMenuLayout.setHorizontalGroup(
            panel_subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_subMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel_subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_subMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_subMenuLayout.createSequentialGroup()
                        .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaque)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeposito)
                        .addGap(18, 18, 18)
                        .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_subMenuLayout.setVerticalGroup(
            panel_subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_subMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTransferencia)
                        .addComponent(btnDeposito)
                        .addComponent(btnSaque)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Deposito.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panel_DepositoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panel_Deposito.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panel_DepositoComponentShown(evt);
            }
        });

        javax.swing.GroupLayout panel_DepositoLayout = new javax.swing.GroupLayout(panel_Deposito);
        panel_Deposito.setLayout(panel_DepositoLayout);
        panel_DepositoLayout.setHorizontalGroup(
            panel_DepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_DepositoLayout.setVerticalGroup(
            panel_DepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_PageLayout = new javax.swing.GroupLayout(panel_Page);
        panel_Page.setLayout(panel_PageLayout);
        panel_PageLayout.setHorizontalGroup(
            panel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(panel_subMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_PageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Deposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_PageLayout.setVerticalGroup(
            panel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PageLayout.createSequentialGroup()
                .addComponent(panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 348, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Page, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Page, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
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

    private void btnTransferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferenciaMouseClicked
        try {
            transferenciaBancaria transferencia = new transferenciaBancaria();
            transferencia.setVisible(true);
        } catch (Exception erro) {
            System.out.println("Não foi possivel efetuar a Tranferencia! \ntente novamente mais tarde! ");
        }                   
                
    }//GEN-LAST:event_btnTransferenciaMouseClicked

    private void panel_DepositoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panel_DepositoComponentShown
        
        
    }//GEN-LAST:event_panel_DepositoComponentShown

    private void panel_DepositoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panel_DepositoAncestorAdded
        boolean click = false;
        
        
        
        
    }//GEN-LAST:event_panel_DepositoAncestorAdded

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new contaFisica().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(contaFisica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Conta;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNumeroConta;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel panel_Deposito;
    private javax.swing.JPanel panel_Menu;
    private javax.swing.JPanel panel_Page;
    private javax.swing.JPanel panel_subMenu;
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
           FisicaDAO nomeUsuario = new FisicaDAO();
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


}
    


