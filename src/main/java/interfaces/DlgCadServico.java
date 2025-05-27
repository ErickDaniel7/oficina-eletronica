package interfaces;

import dominio.Cliente;
import dominio.TipoEletronico;
import gerenciadorTarefas.FuncoesUteis;
import gerenciadorTarefas.GerenciadorInterface;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCadServico extends javax.swing.JDialog {
    
    private GerenciadorInterface gerenciadorI;
    private Cliente cliSelecionado;
    
    
    public DlgCadServico(java.awt.Frame parent, boolean modal, GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
        this.cliSelecionado = null;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRadioLocal = new javax.swing.ButtonGroup();
        btngrpEntrega = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetalhesServico = new javax.swing.JTextArea();
        btnProcurarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        btnCadTipo = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDetalhesEletronico = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProblemas = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        btnCadServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Serviço");
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        jButton4.setText("Limpar");
        jButton4.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Informações do serviço");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Cliente:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Localização"));

        groupRadioLocal.add(jRadioButton3);
        jRadioButton3.setMnemonic('O');
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Oficina");

        groupRadioLocal.add(jRadioButton4);
        jRadioButton4.setMnemonic('C');
        jRadioButton4.setText("Casa");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 50));

        txtDetalhesServico.setColumns(20);
        txtDetalhesServico.setLineWrap(true);
        txtDetalhesServico.setRows(5);
        txtDetalhesServico.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes do serviço"));
        jScrollPane2.setViewportView(txtDetalhesServico);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 230, 90));

        btnProcurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnProcurarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 30, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço estimado"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 110, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eletronico"));

        jLabel13.setText("Tipo:");

        btnCadTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(22, 22, 22)
                .addComponent(comboTipo, 0, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCadTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadTipo))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 400, 70));

        txtNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel3.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 30));

        txtDetalhesEletronico.setColumns(20);
        txtDetalhesEletronico.setLineWrap(true);
        txtDetalhesEletronico.setRows(5);
        txtDetalhesEletronico.setBorder(javax.swing.BorderFactory.createTitledBorder("Especificações do eletrônico"));
        jScrollPane3.setViewportView(txtDetalhesEletronico);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 155, 230, -1));

        listProblemas.setBorder(javax.swing.BorderFactory.createTitledBorder("Problemas"));
        listProblemas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Não liga", "Tela com defeito", "Áudio com defeito", "Não responde", "Defeito físico" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listProblemas);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 220));

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

        btnCadServico.setBackground(new java.awt.Color(0, 102, 102));
        btnCadServico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadServico.setForeground(new java.awt.Color(255, 255, 255));
        btnCadServico.setText("Cadastrar");
        btnCadServico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCadServico.setBorderPainted(false);
        btnCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadServico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadServico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //limparCampos();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarClienteActionPerformed
        cliSelecionado = gerenciadorI.janelaProcurarCliente();
        
        if ( cliSelecionado != null ) {
            txtNomeCliente.setText(cliSelecionado.getNome() );
        }
    }//GEN-LAST:event_btnProcurarClienteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorI.carregarComboBox(comboTipo, TipoEletronico.class);
    }//GEN-LAST:event_formComponentShown

    private void btnCadTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadTipoActionPerformed
        gerenciadorI.janelaCadTipo();
        gerenciadorI.carregarComboBox(comboTipo, TipoEletronico.class);
    }//GEN-LAST:event_btnCadTipoActionPerformed

    private void btnCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadServicoActionPerformed
        if (cliSelecionado != null) {
            String descricaoEle = txtDetalhesEletronico.getText();
            String descricaoSer = txtDetalhesServico.getText();
            TipoEletronico tipo = (TipoEletronico) comboTipo.getSelectedItem();
            int valor = Integer.parseInt(txtValor.getText());
            Date dataInicio = new Date();
            Date dataFim = null;
            
            String local;
            char localChar = (char) groupRadioLocal.getSelection().getMnemonic();
            if(localChar == 'O') local = "Oficina";
            else local = "Casa";
            
            //PASSAR PARA FUNCOES UTEIS
            List<String> listaproblemas = listProblemas.getSelectedValuesList();
            String problemas = "";
            for (String str : listaproblemas) {
		if (problemas.trim().isEmpty()) problemas = str;
		else problemas = problemas + ", " + str;
            }
            
            try {
                int idServico = gerenciadorI.getGerDominio().inserirServico(cliSelecionado, descricaoEle, descricaoSer, tipo, valor, dataInicio, dataFim, local, problemas);
                JOptionPane.showMessageDialog(this, "Servico " + idServico + " inserido com sucesso.");
                this.dispose();
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Servico", JOptionPane.ERROR_MESSAGE  );
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente.");
        }
    }//GEN-LAST:event_btnCadServicoActionPerformed

    
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadServico;
    private javax.swing.JButton btnCadTipo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProcurarCliente;
    private javax.swing.ButtonGroup btngrpEntrega;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.ButtonGroup groupRadioLocal;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listProblemas;
    private javax.swing.JTextArea txtDetalhesEletronico;
    private javax.swing.JTextArea txtDetalhesServico;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
