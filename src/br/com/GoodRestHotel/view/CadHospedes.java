/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.GoodRestHotel.view;

/**
 *
 * @author ggpin
 */
public class CadHospedes extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadHospedes
     */
    public CadHospedes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBuscarHosp = new javax.swing.JPanel();
        lblBuscaHosp = new javax.swing.JLabel();
        txtBuscaHosp = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimparBusc = new javax.swing.JButton();
        jpTableHosp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHosp = new javax.swing.JTable();
        btnEditarHosp = new javax.swing.JButton();
        btnExcluirHosp = new javax.swing.JButton();
        jpDadoHosp = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblQuarto = new javax.swing.JLabel();
        jSQuarto = new javax.swing.JSpinner();
        lblCelular = new javax.swing.JLabel();
        jFTCelular = new javax.swing.JFormattedTextField();
        lblIdade = new javax.swing.JLabel();
        jFTIdade = new javax.swing.JFormattedTextField();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(873, 542));

        jpBuscarHosp.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Hospedes"));

        lblBuscaHosp.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBuscaHosp.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscaHosp.setText("Buscar Hospedes:");

        btnBuscar.setText("Buscar");

        btnLimparBusc.setText("Limpar Busca");
        btnLimparBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscActionPerformed(evt);
            }
        });

        tableHosp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quarto", "Consumo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableHosp);

        javax.swing.GroupLayout jpTableHospLayout = new javax.swing.GroupLayout(jpTableHosp);
        jpTableHosp.setLayout(jpTableHospLayout);
        jpTableHospLayout.setHorizontalGroup(
            jpTableHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpTableHospLayout.setVerticalGroup(
            jpTableHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );

        btnEditarHosp.setText("Editar");
        btnEditarHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHospActionPerformed(evt);
            }
        });

        btnExcluirHosp.setText("Excluir");
        btnExcluirHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirHospActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBuscarHospLayout = new javax.swing.GroupLayout(jpBuscarHosp);
        jpBuscarHosp.setLayout(jpBuscarHospLayout);
        jpBuscarHospLayout.setHorizontalGroup(
            jpBuscarHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarHospLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblBuscaHosp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBusc)
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(jpBuscarHospLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBuscarHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTableHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarHospLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarHosp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirHosp)
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jpBuscarHospLayout.setVerticalGroup(
            jpBuscarHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarHospLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpBuscarHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaHosp)
                    .addComponent(txtBuscaHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimparBusc))
                .addGap(18, 18, 18)
                .addComponent(jpTableHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBuscarHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarHosp)
                    .addComponent(btnExcluirHosp))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpDadoHosp.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblNome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF:");

        try {
            jFTCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("E-mail:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblQuarto.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblQuarto.setForeground(new java.awt.Color(0, 0, 0));
        lblQuarto.setText("Quarto:");

        lblCelular.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 0, 0));
        lblCelular.setText("Celular:");

        try {
            jFTCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblIdade.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(0, 0, 0));
        lblIdade.setText("Idade:");

        try {
            jFTIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTIdadeActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDadoHospLayout = new javax.swing.GroupLayout(jpDadoHosp);
        jpDadoHosp.setLayout(jpDadoHospLayout);
        jpDadoHospLayout.setHorizontalGroup(
            jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadoHospLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail)
                    .addGroup(jpDadoHospLayout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(jpDadoHospLayout.createSequentialGroup()
                        .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadoHospLayout.createSequentialGroup()
                                .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDadoHospLayout.createSequentialGroup()
                                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCelular)
                                    .addComponent(lblIdade))
                                .addGap(111, 111, 111)
                                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuarto)
                                    .addComponent(lblCPF)
                                    .addComponent(jSQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadoHospLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addGap(17, 17, 17))
        );
        jpDadoHospLayout.setVerticalGroup(
            jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadoHospLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblCPF)
                    .addComponent(lblCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblQuarto)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBuscarHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDadoHosp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBuscarHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDadoHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBuscActionPerformed

    private void btnExcluirHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirHospActionPerformed

    private void btnEditarHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarHospActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jFTIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTIdadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarHosp;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirHosp;
    private javax.swing.JButton btnLimparBusc;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTIdade;
    private javax.swing.JSpinner jSQuarto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBuscarHosp;
    private javax.swing.JPanel jpDadoHosp;
    private javax.swing.JPanel jpTableHosp;
    private javax.swing.JLabel lblBuscaHosp;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuarto;
    private javax.swing.JTable tableHosp;
    private javax.swing.JTextField txtBuscaHosp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}