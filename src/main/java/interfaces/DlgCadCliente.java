package interfaces;

import dominio.Cidade;
import dominio.Cliente;
import gerenciadorTarefas.FuncoesUteis;
import gerenciadorTarefas.GerenciadorInterface;
import java.awt.Color;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCadCliente extends javax.swing.JDialog {

    private GerenciadorInterface gerenciadorI;
    private Cliente cliSelecionado;    
    
    public DlgCadCliente(java.awt.Frame parent, boolean modal, GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
        this.cliSelecionado = null;
        habilitarBotoes();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdbFem = new javax.swing.JRadioButton();
        rdbMasc = new javax.swing.JRadioButton();
        lblTelefone = new javax.swing.JLabel();
        comboCidade = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        btnAddCidade = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Digite as informações do cliente:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setForeground(java.awt.Color.white);
        lblNome.setText("Nome:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N

        btngrpSexo.add(rdbFem);
        rdbFem.setMnemonic('F');
        rdbFem.setText("Feminino");

        btngrpSexo.add(rdbMasc);
        rdbMasc.setMnemonic('M');
        rdbMasc.setSelected(true);
        rdbMasc.setText("Masculino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbFem)
                    .addComponent(rdbMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbMasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbFem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 100, 80));

        lblTelefone.setForeground(java.awt.Color.white);
        lblTelefone.setText("Telefone:");
        jPanel1.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel1.add(comboCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 190, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, -1));

        lblCidade.setForeground(java.awt.Color.white);
        lblCidade.setText("Cidade:");
        jPanel1.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 190, -1));

        lblCPF.setForeground(java.awt.Color.white);
        lblCPF.setText("CPF:");
        jPanel1.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, 260, 30));

        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));

        lblEmail.setForeground(java.awt.Color.white);
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnAddCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnAddCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 190, -1));

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

        btnCadastrarCliente.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setMnemonic('C');
        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCadastrarCliente.setBorderPainted(false);
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setBackground(new java.awt.Color(102, 102, 102));
        btnAlterarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarCliente.setMnemonic('A');
        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterarCliente.setBorderPainted(false);
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cliSelecionado = null;
        limparCampos();
        habilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorI.carregarComboBox(comboCidade, Cidade.class);
        limparCampos();
    }//GEN-LAST:event_formComponentShown

    private void btnAddCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCidadeActionPerformed
        gerenciadorI.janelaCadCidade();
        gerenciadorI.carregarComboBox(comboCidade, Cidade.class);
    }//GEN-LAST:event_btnAddCidadeActionPerformed

    //==================================================================================
    //INSERIR CLIENTE
    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        String nome = txtNome.getText();
        String telefone = txtTelefone.getText();
        String cpf = txtCpf.getText();
        Cidade cidade = (Cidade) comboCidade.getSelectedItem();
        char sexo = (char) btngrpSexo.getSelection().getMnemonic();
        String email = txtEmail.getText();
        
        if(validarCampos()) {
            try {
                if(cliSelecionado == null) {
                    int id = gerenciadorI.getGerDominio().inserirCliente(nome, telefone, cpf, cidade, sexo, email);
                    JOptionPane.showMessageDialog(this, "Cliente " + id + " (" + nome + ") inserido com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE );
                    this.dispose();
                }else{
                    gerenciadorI.getGerDominio().alterarCliente(cliSelecionado, nome, telefone, cpf, cidade, sexo, email);
                    int id = cliSelecionado.getIdCliente();
                    JOptionPane.showMessageDialog(this, "Cliente " + id + " (" + nome + ") inserido com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  ); 
                }
                
            } catch(HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
        }
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        cliSelecionado = gerenciadorI.janelaProcurarCliente();
        
        try {
            preencherCampos(cliSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    //==================================================================================
    //VALIDACAO DOS CAMPOS
    private boolean validarCampos() {
        String msgErro = "";
        lblNome.setForeground(Color.white);
        lblTelefone.setForeground(Color.white);
        lblCPF.setForeground(Color.white);
        lblEmail.setForeground(Color.white);
        lblCidade.setForeground(Color.white);
        
        if (txtNome.getText().isEmpty()) {
            msgErro = msgErro + "Digite um nome.\n";
            lblNome.setForeground(Color.red);            
        }
        
        if (txtTelefone.getText().isEmpty()) {
            msgErro = msgErro + "Digite um telefone.\n";
            lblTelefone.setForeground(Color.red);            
        }
        
        if (txtEmail.getText().isEmpty()) {
            msgErro = msgErro + "Digite um e-mail.\n";
            lblEmail.setForeground(Color.red);            
        }
        
        if (FuncoesUteis.isCPF( txtCpf.getText() ) == false) {
            msgErro = msgErro + "CPF inválido!\n";
            lblCPF.setForeground(Color.red);
        }
        
        if(msgErro.isEmpty()) {
            return true;
        }else{            
            JOptionPane.showMessageDialog(this, msgErro, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
    }

    //==================================================================================
    //LIMPA OS CAMPOS DO FORM
    private void limparCampos(){
        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        cliSelecionado = null;
    }
    
    //==================================================================================
    //PREENCHER COM OS DADOS DO CLIENTE SELECIONADO
    private void preencherCampos(Cliente cli) throws ParseException {
        if ( cli != null ) {
            txtNome.setText(cli.getNome());
            txtTelefone.setText(cli.getTelefone());
            txtCpf.setText(cli.getCpf());
            txtEmail.setText(cli.getEmail());
            comboCidade.setSelectedItem(cli.getCidade());
            if ( cli.getSexo() == 'M' ) {
                rdbMasc.setSelected(true);
            } else {
                rdbFem.setSelected(true);
            }      
            habilitarBotoes();
        }
    }
    
    //==================================================================================
    //HABILITAR BOTAO PARA ALTERAR DADOS DO CLIENTE
    private void habilitarBotoes(){
        if ( cliSelecionado == null ) {
            btnCadastrarCliente.setVisible(true);
            btnAlterarCliente.setVisible(false);
        } else {
            btnCadastrarCliente.setVisible(false);
            btnAlterarCliente.setVisible(true);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCidade;
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.ButtonGroup btngrpSexo;
    private javax.swing.JComboBox<String> comboCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JRadioButton rdbFem;
    private javax.swing.JRadioButton rdbMasc;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
