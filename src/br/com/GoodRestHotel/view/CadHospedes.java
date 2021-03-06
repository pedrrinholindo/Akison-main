/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.GoodRestHotel.view;

import br.com.GoodRestHotel.dao.HospedeDAO;
import br.com.GoodRestHotel.model.Hospede;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.table.DefaultTableModel;

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
    public void buscar(){
        HospedeDAO dao = new HospedeDAO();
        List<Hospede> hospedes = dao.listarHospede(parseInt(txtBuscaHosp.getText()));
        DefaultTableModel dados = (DefaultTableModel) tableHosp.getModel();
        dados.setNumRows(0);
        
        for (Hospede hospede : hospedes) {
            dados.addRow(new Object[]{
                hospede.getId(),
                hospede.getNome(),
                hospede.getQuarto(),
                hospede.getCpf()
            });
        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jpDadoHosp = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblQuarto = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        jFTCelular = new javax.swing.JFormattedTextField();
        lblIdade = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtIdade = new javax.swing.JTextField();
        jSQuarto = new javax.swing.JSpinner();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnEditarHosp = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(873, 542));

        jpBuscarHosp.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Hospedes"));

        lblBuscaHosp.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBuscaHosp.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscaHosp.setText("Buscar Hospedes:");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnLimparBusc.setText("Limpar Busca");
        btnLimparBusc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparBuscMouseClicked(evt);
            }
        });
        btnLimparBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBuscActionPerformed(evt);
            }
        });

        tableHosp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quarto", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHosp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHospMouseClicked(evt);
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

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Na busca digite o n??mero do quarto*");

        javax.swing.GroupLayout jpBuscarHospLayout = new javax.swing.GroupLayout(jpBuscarHosp);
        jpBuscarHosp.setLayout(jpBuscarHospLayout);
        jpBuscarHospLayout.setHorizontalGroup(
            jpBuscarHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarHospLayout.createSequentialGroup()
                .addGroup(jpBuscarHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBuscarHospLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpTableHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpBuscarHospLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblBuscaHosp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparBusc)
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpBuscarHospLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
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
            jFTCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
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

        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("ID:");

        btnEditarHosp.setText("Editar");
        btnEditarHosp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarHospMouseClicked(evt);
            }
        });
        btnEditarHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHospActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDadoHospLayout = new javax.swing.GroupLayout(jpDadoHosp);
        jpDadoHosp.setLayout(jpDadoHospLayout);
        jpDadoHospLayout.setHorizontalGroup(
            jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadoHospLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpDadoHospLayout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmail)
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
                                    .addComponent(lblCPF))))))
                .addGap(36, 36, 36)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadoHospLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarHosp)
                .addGap(17, 17, 17))
        );
        jpDadoHospLayout.setVerticalGroup(
            jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadoHospLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblCPF)
                    .addComponent(lblCelular)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblQuarto)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jpDadoHospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditarHosp))
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

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        // TODO add your handling code here:
        
        
        Hospede hosp = new Hospede();
        hosp.setNome(txtNome.getText());
        hosp.setIdade(parseInt(txtIdade.getText()));
        hosp.setEmail(txtEmail.getText());
        hosp.setNumero(jFTCelular.getText());
        hosp.setCpf(jFTCPF.getText());
        hosp.setQuarto((int) jSQuarto.getValue());
        
        HospedeDAO dao = new HospedeDAO(hosp);
        dao.hospedar(hosp);
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:
        Hospede hosp = new Hospede();
        
        hosp.setId(parseInt(txtID.getText()));
        HospedeDAO dao = new HospedeDAO();
        dao.excluirHospede(hosp.getId());
        
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnEditarHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarHospActionPerformed

    private void btnEditarHospMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarHospMouseClicked
        // TODO add your handling code here:
        Hospede hosp = new Hospede();
        
        
        hosp.setNome(txtNome.getText());
        hosp.setIdade(parseInt(txtIdade.getText()));
        hosp.setEmail(txtEmail.getText());
        hosp.setNumero(jFTCelular.getText());
        hosp.setCpf(jFTCPF.getText());
        hosp.setQuarto((int) jSQuarto.getValue());
        hosp.setId(parseInt(txtID.getText()));
        
        HospedeDAO dao = new HospedeDAO(hosp);
        dao.editarHospede(hosp);
        
    }//GEN-LAST:event_btnEditarHospMouseClicked

    private void tableHospMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHospMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tableHospMouseClicked

    private void btnLimparBuscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparBuscMouseClicked
        // TODO add your handling code here:
        txtBuscaHosp.setText("");
    }//GEN-LAST:event_btnLimparBuscMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        buscar();
        
        
        
    }//GEN-LAST:event_btnBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarHosp;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparBusc;
    private javax.swing.JButton btnNovo;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSQuarto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBuscarHosp;
    private javax.swing.JPanel jpDadoHosp;
    private javax.swing.JPanel jpTableHosp;
    private javax.swing.JLabel lblBuscaHosp;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuarto;
    private javax.swing.JTable tableHosp;
    private javax.swing.JTextField txtBuscaHosp;
    private javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
