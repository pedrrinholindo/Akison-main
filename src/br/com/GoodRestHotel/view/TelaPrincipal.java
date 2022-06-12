
package br.com.GoodRestHotel.view;

public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLGoodRestHotel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogoff = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        imgLogo = new javax.swing.JLabel();
        telaFundo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastro = new javax.swing.JMenu();
        jMHospedes = new javax.swing.JMenu();
        jMICadastrar = new javax.swing.JMenuItem();
        jMIConsultar = new javax.swing.JMenuItem();
        jMQuartos = new javax.swing.JMenu();
        jMIConsultarQ = new javax.swing.JMenuItem();
        jMICadastrarQ = new javax.swing.JMenuItem();
        jMFuncionario = new javax.swing.JMenu();
        jMICadastrarFunc = new javax.swing.JMenuItem();
        jMIConsultarFunc = new javax.swing.JMenuItem();
        jMProdutos = new javax.swing.JMenu();
        jMICadastrarProd = new javax.swing.JMenuItem();
        jMIConsultarProd = new javax.swing.JMenuItem();
        jMReservas = new javax.swing.JMenu();
        jMIFazerReserva = new javax.swing.JMenuItem();
        jMIConsultarReserva = new javax.swing.JMenuItem();
        jMIFinalizarReserva = new javax.swing.JMenuItem();
        jMConsumo = new javax.swing.JMenu();
        jMIVender = new javax.swing.JMenuItem();
        jMIConsultarConsumo = new javax.swing.JMenuItem();
        jMSeguranca = new javax.swing.JMenu();
        jMSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Sistema Hotel Projeto - Desenvolvido por Akison Bruno - Todos os Direitos Reservados - 2022 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLGoodRestHotel.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLGoodRestHotel.setForeground(new java.awt.Color(0, 0, 0));
        jLGoodRestHotel.setText("Good Rest Hotel");

        btnLogoff.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnLogoff.setForeground(new java.awt.Color(0, 0, 0));
        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GoodRestHotel/img/Login_37128.png"))); // NOI18N
        btnLogoff.setText("Logoff");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GoodRestHotel/img/logoAlison.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLGoodRestHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(imgLogo)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLGoodRestHotel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnLogoff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout telaFundoLayout = new javax.swing.GroupLayout(telaFundo);
        telaFundo.setLayout(telaFundoLayout);
        telaFundoLayout.setHorizontalGroup(
            telaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        telaFundoLayout.setVerticalGroup(
            telaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jMCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GoodRestHotel/img/new-file_40454.png"))); // NOI18N
        jMCadastro.setText("Cadastro    |");
        jMCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMHospedes.setText("Hospedes");

        jMICadastrar.setText("Cadastrar");
        jMICadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMICadastrarMouseClicked(evt);
            }
        });
        jMICadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarActionPerformed(evt);
            }
        });
        jMHospedes.add(jMICadastrar);

        jMIConsultar.setText("Consultar");
        jMIConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultarActionPerformed(evt);
            }
        });
        jMHospedes.add(jMIConsultar);

        jMCadastro.add(jMHospedes);

        jMQuartos.setText("Quartos");

        jMIConsultarQ.setText("Consultar");
        jMQuartos.add(jMIConsultarQ);

        jMICadastrarQ.setText("Cadastrar");
        jMICadastrarQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarQActionPerformed(evt);
            }
        });
        jMQuartos.add(jMICadastrarQ);

        jMCadastro.add(jMQuartos);

        jMFuncionario.setText("Funcionários");

        jMICadastrarFunc.setText("Cadastrar");
        jMICadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarFuncActionPerformed(evt);
            }
        });
        jMFuncionario.add(jMICadastrarFunc);

        jMIConsultarFunc.setText("Consultar");
        jMIConsultarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultarFuncActionPerformed(evt);
            }
        });
        jMFuncionario.add(jMIConsultarFunc);

        jMCadastro.add(jMFuncionario);

        jMProdutos.setText("Produtos");

        jMICadastrarProd.setText("Cadastrar");
        jMICadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarProdActionPerformed(evt);
            }
        });
        jMProdutos.add(jMICadastrarProd);

        jMIConsultarProd.setText("Consultar");
        jMProdutos.add(jMIConsultarProd);

        jMCadastro.add(jMProdutos);

        jMenuBar1.add(jMCadastro);

        jMReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GoodRestHotel/img/Google_Calendar_icon-icons.com_75710.png"))); // NOI18N
        jMReservas.setText("Reservas    |");
        jMReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIFazerReserva.setText("Fazer Reserva");
        jMReservas.add(jMIFazerReserva);

        jMIConsultarReserva.setText("Consultar Reserva");
        jMIConsultarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultarReservaActionPerformed(evt);
            }
        });
        jMReservas.add(jMIConsultarReserva);

        jMIFinalizarReserva.setText("Finalizar Reserva");
        jMReservas.add(jMIFinalizarReserva);

        jMenuBar1.add(jMReservas);

        jMConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GoodRestHotel/img/sale_offert_sales_tag_discount_icon_127452.png"))); // NOI18N
        jMConsumo.setText("Consumo   |");
        jMConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIVender.setText("Vender");
        jMConsumo.add(jMIVender);

        jMIConsultarConsumo.setText("Consultar");
        jMIConsultarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultarConsumoActionPerformed(evt);
            }
        });
        jMConsumo.add(jMIConsultarConsumo);

        jMenuBar1.add(jMConsumo);

        jMSeguranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GoodRestHotel/img/security-protection-protect-key-password-login_108554.png"))); // NOI18N
        jMSeguranca.setText("Segurança    |");
        jMSeguranca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(jMSeguranca);

        jMSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GoodRestHotel/img/Logout_37127.png"))); // NOI18N
        jMSair.setText("Sair");
        jMSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(jMSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaFundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telaFundo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIConsultarActionPerformed

    private void jMICadastrarQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICadastrarQActionPerformed

    private void jMIConsultarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultarFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIConsultarFuncActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void jMICadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarFuncActionPerformed
        TelaCadFuncionario tela = new TelaCadFuncionario();
        telaFundo.add(tela);
        tela.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICadastrarFuncActionPerformed

    private void jMICadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarProdActionPerformed
        TelaCadProduto tela = new TelaCadProduto();
        telaFundo.add(tela);
        tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICadastrarProdActionPerformed

    private void jMIConsultarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultarConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIConsultarConsumoActionPerformed

    private void jMIConsultarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIConsultarReservaActionPerformed

    private void jMICadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMICadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICadastrarMouseClicked

    private void jMICadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarActionPerformed
        CadHospedes tela = new CadHospedes();
        telaFundo.add(tela);
        tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogoff;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLGoodRestHotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenu jMConsumo;
    private javax.swing.JMenu jMFuncionario;
    private javax.swing.JMenu jMHospedes;
    private javax.swing.JMenuItem jMICadastrar;
    private javax.swing.JMenuItem jMICadastrarFunc;
    private javax.swing.JMenuItem jMICadastrarProd;
    private javax.swing.JMenuItem jMICadastrarQ;
    private javax.swing.JMenuItem jMIConsultar;
    private javax.swing.JMenuItem jMIConsultarConsumo;
    private javax.swing.JMenuItem jMIConsultarFunc;
    private javax.swing.JMenuItem jMIConsultarProd;
    private javax.swing.JMenuItem jMIConsultarQ;
    private javax.swing.JMenuItem jMIConsultarReserva;
    private javax.swing.JMenuItem jMIFazerReserva;
    private javax.swing.JMenuItem jMIFinalizarReserva;
    private javax.swing.JMenuItem jMIVender;
    private javax.swing.JMenu jMProdutos;
    private javax.swing.JMenu jMQuartos;
    private javax.swing.JMenu jMReservas;
    private javax.swing.JMenu jMSair;
    private javax.swing.JMenu jMSeguranca;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JDesktopPane telaFundo;
    // End of variables declaration//GEN-END:variables
}
