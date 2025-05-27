package interfaces;

import dominio.EletronicoReformado;
import dominio.TipoEletronico;
import gerenciadorTarefas.GerenciadorInterface;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCadEletronicoRef extends javax.swing.JDialog {

    private GerenciadorInterface gerenciadorI;
    private EletronicoReformado eletSelecionado;
    
    public DlgCadEletronicoRef(java.awt.Frame parent, boolean modal, GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
        this.eletSelecionado = null;
        habilitarSessao();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpTipo = new javax.swing.ButtonGroup();
        btngrpSelect = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReparos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        pnlNovo = new javax.swing.JPanel();
        comboTipo = new javax.swing.JComboBox<>();
        btnCadTipoEletronico = new javax.swing.JButton();
        btnProcurarEletronico = new javax.swing.JButton();
        txtElet = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadEletronicoRef = new javax.swing.JButton();
        rdbCad = new javax.swing.JRadioButton();
        rdbAlt = new javax.swing.JRadioButton();
        btnAlterarRef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Eletronico Reformado");
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Informações do eletronico reformado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, -1));

        txtReparos.setColumns(20);
        txtReparos.setLineWrap(true);
        txtReparos.setRows(3);
        txtReparos.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes e Reparos"));
        jScrollPane2.setViewportView(txtReparos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 190, 100));

        txtDescricao.setColumns(20);
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(3);
        txtDescricao.setTabSize(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Especificações do eletrônico"));
        jScrollPane3.setViewportView(txtDescricao);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 100));

        pnlNovo.setBorder(javax.swing.BorderFactory.createTitledBorder("Eletronico"));

        btnCadTipoEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadTipoEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadTipoEletronicoActionPerformed(evt);
            }
        });

        btnProcurarEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEletronicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNovoLayout = new javax.swing.GroupLayout(pnlNovo);
        pnlNovo.setLayout(pnlNovoLayout);
        pnlNovoLayout.setHorizontalGroup(
            pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboTipo, 0, 266, Short.MAX_VALUE)
                    .addComponent(txtElet))
                .addGap(34, 34, 34)
                .addGroup(pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadTipoEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurarEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlNovoLayout.setVerticalGroup(
            pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadTipoEletronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProcurarEletronico)
                .addGap(24, 24, 24))
            .addGroup(pnlNovoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtElet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProcurarEletronico.setVisible(false);
        txtElet.setVisible(false);

        jPanel1.add(pnlNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 100));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadEletronicoRef.setBackground(new java.awt.Color(0, 102, 102));
        btnCadEletronicoRef.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadEletronicoRef.setForeground(new java.awt.Color(255, 255, 255));
        btnCadEletronicoRef.setText("Cadastrar");
        btnCadEletronicoRef.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCadEletronicoRef.setBorderPainted(false);
        btnCadEletronicoRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEletronicoRefActionPerformed(evt);
            }
        });

        btngrpSelect.add(rdbCad);
        rdbCad.setSelected(true);
        rdbCad.setText("Cadastrar");
        rdbCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCadActionPerformed(evt);
            }
        });

        btngrpSelect.add(rdbAlt);
        rdbAlt.setText("Alterar");
        rdbAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAltActionPerformed(evt);
            }
        });

        btnAlterarRef.setBackground(new java.awt.Color(102, 102, 102));
        btnAlterarRef.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarRef.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarRef.setMnemonic('A');
        btnAlterarRef.setText("Alterar");
        btnAlterarRef.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterarRef.setBorderPainted(false);
        btnAlterarRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEletronicoRefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadEletronicoRef, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbCad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbAlt)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCad)
                    .addComponent(rdbAlt))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadEletronicoRef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        limparCampos();
        rdbCad.setSelected(true);
        gerenciadorI.carregarComboBox(comboTipo, TipoEletronico.class);
    }//GEN-LAST:event_formComponentShown

    private void btnCadEletronicoRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEletronicoRefActionPerformed
        //VALIDAR CAMPOS ANTES
        TipoEletronico tipo = (TipoEletronico) comboTipo.getSelectedItem();
        String descricao = txtDescricao.getText();
        String reparos = txtReparos.getText();
        int valor = Integer.parseInt(txtValor.getText());
        
        try {
                if(eletSelecionado == null) {
                    int id = gerenciadorI.getGerDominio().inserirEletronicoReformado(descricao, reparos, valor, tipo);
                    JOptionPane.showMessageDialog(this, "Eletronico Reformado " + id + " inserido com sucesso.", "Inserir Eletronico Reformado", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }else{
                    gerenciadorI.getGerDominio().alterarEletronicoReformado(eletSelecionado, descricao, reparos, valor, eletSelecionado.getTipo());
                    int id = eletSelecionado.getIdEletronicoRef();
                    JOptionPane.showMessageDialog(this, "Eletronico Reformado " + id + " alterado com sucesso.", "Alterar Eletronico Reformado", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
                
            } catch(HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
    }//GEN-LAST:event_btnCadEletronicoRefActionPerformed

    private void btnCadTipoEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadTipoEletronicoActionPerformed
        gerenciadorI.janelaCadTipo();
    }//GEN-LAST:event_btnCadTipoEletronicoActionPerformed

    private void btnProcurarEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEletronicoActionPerformed
        eletSelecionado = gerenciadorI.janelaProcurarEletronico();
        if (eletSelecionado != null) {
            txtElet.setText(eletSelecionado.getTipo().toString());
            txtDescricao.setText((eletSelecionado.getDescricao()));
            txtReparos.setText((eletSelecionado.getReparos()));
            txtValor.setText(Integer.toString(eletSelecionado.getValor()));
        }
    }//GEN-LAST:event_btnProcurarEletronicoActionPerformed

    private void rdbCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCadActionPerformed
        habilitarSessao();
        limparCampos();
        eletSelecionado = null;
    }//GEN-LAST:event_rdbCadActionPerformed

    private void rdbAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAltActionPerformed
        habilitarSessao();
        limparCampos();
        eletSelecionado = null;
    }//GEN-LAST:event_rdbAltActionPerformed

    
    private void habilitarSessao(){
        if(rdbCad.isSelected()){
            txtElet.setVisible(false);
            comboTipo.setEnabled(true);
            btnCadTipoEletronico.setEnabled(true);
            btnCadTipoEletronico.setVisible(true);
            btnProcurarEletronico.setVisible(false);
            btnAlterarRef.setVisible(false);
            btnCadEletronicoRef.setVisible(true);
        } else {
            comboTipo.setEnabled(false);
            btnCadTipoEletronico.setEnabled(false);
            btnProcurarEletronico.setVisible(true);
            txtElet.setVisible(true);
            btnAlterarRef.setVisible(true);
            btnCadEletronicoRef.setVisible(false);
        }
    }
    
    
    private void limparCampos(){
        txtDescricao.setText("");
        txtReparos.setText("");
        txtValor.setText("");
        txtElet.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnAlterarCliente1;
    private javax.swing.JButton btnAlterarCliente2;
    private javax.swing.JButton btnAlterarRef;
    private javax.swing.JButton btnCadEletronicoRef;
    private javax.swing.JButton btnCadTipoEletronico;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProcurarEletronico;
    private javax.swing.ButtonGroup btngrpSelect;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.ButtonGroup gpTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlNovo;
    private javax.swing.JRadioButton rdbAlt;
    private javax.swing.JRadioButton rdbCad;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtElet;
    private javax.swing.JTextArea txtReparos;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
