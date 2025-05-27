package interfaces;


import dominio.EletronicoReformado;
import dominio.Servico;
import dominio.VendaReformado;
import gerenciadorTarefas.FuncoesUteis;
import gerenciadorTarefas.GerenciadorInterface;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class FrmPrincipal extends javax.swing.JFrame {

    private GerenciadorInterface gerenciadorI;
    private Servico servicoSelecionado;
    private EletronicoReformado eletReformadoSelecionado;
    
    public FrmPrincipal(GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
        servicoSelecionado = null;
        eletReformadoSelecionado = null;
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicosEmAndamento = new javax.swing.JTable();
        btnNovoServico = new javax.swing.JButton();
        btnProcurarEmAndamento = new javax.swing.JButton();
        btnFinalizar1 = new javax.swing.JButton();
        btnVisualizarServico = new javax.swing.JButton();
        pnlVendas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnVender = new javax.swing.JButton();
        btnListarVendas = new javax.swing.JButton();
        lblAreaReformados = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlReformados = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEletronicos = new javax.swing.JTable();
        btnListarEletronicosDisponiveis = new javax.swing.JButton();
        btnCadastrarRef = new javax.swing.JButton();
        btnVisualizarReformado = new javax.swing.JButton();
        btnExcluirReformado = new javax.swing.JButton();
        pnlView = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDataInicio = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblEletronico = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEspec = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtProblemas = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDetalhes = new javax.swing.JTextArea();
        btnFecharView = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnCadCliente = new javax.swing.JMenuItem();
        btnCadServico = new javax.swing.JMenuItem();
        btnCadEletronico = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnProcurarCliente = new javax.swing.JMenuItem();
        btnProcurarServico = new javax.swing.JMenuItem();
        btnProcurarEletronico = new javax.swing.JMenuItem();
        btnProcurarVenda = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de controle");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços em andamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblServicosEmAndamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servico", "Cliente", "Tipo Eletronico", "Data Inicio", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicosEmAndamento);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 420, 470));

        btnNovoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/logo16px.png"))); // NOI18N
        btnNovoServico.setText("Novo");
        btnNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoServicoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNovoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        btnProcurarEmAndamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnProcurarEmAndamento.setText("Listar");
        btnProcurarEmAndamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEmAndamentoActionPerformed(evt);
            }
        });
        jPanel3.add(btnProcurarEmAndamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 80, 30));

        btnFinalizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/accept.png"))); // NOI18N
        btnFinalizar1.setText("Finalizar");
        btnFinalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnFinalizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 100, 30));

        btnVisualizarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnVisualizarServico.setText("Visualizar");
        btnVisualizarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarServicoActionPerformed(evt);
            }
        });
        jPanel3.add(btnVisualizarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 100, 30));

        pnlVendas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendas recentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlVendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Eletronico", "Data", "Telefone", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVendas);

        pnlVendas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 460, 200));

        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/sell.png"))); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        pnlVendas.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        btnListarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnListarVendas.setText("Listar");
        btnListarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendasActionPerformed(evt);
            }
        });
        pnlVendas.add(btnListarVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 80, 30));

        lblAreaReformados.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblAreaReformados.setText("Área de aparelhos eletronicos reformados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Área do cliente e serviços");

        pnlReformados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aparelhos cadastrados disponíveis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlReformados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEletronicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Eletronico", "Detalhes", "Reparos", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblEletronicos);

        pnlReformados.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 460, 160));

        btnListarEletronicosDisponiveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnListarEletronicosDisponiveis.setText("Listar");
        btnListarEletronicosDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEletronicosDisponiveisActionPerformed(evt);
            }
        });
        pnlReformados.add(btnListarEletronicosDisponiveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, 30));

        btnCadastrarRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadastrarRef.setText("Cadastrar");
        btnCadastrarRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarRefActionPerformed(evt);
            }
        });
        pnlReformados.add(btnCadastrarRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        btnVisualizarReformado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnVisualizarReformado.setText("Visualizar");
        pnlReformados.add(btnVisualizarReformado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 30));

        btnExcluirReformado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/remove.png"))); // NOI18N
        btnExcluirReformado.setText("Excluir");
        btnExcluirReformado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirReformadoActionPerformed(evt);
            }
        });
        pnlReformados.add(btnExcluirReformado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 90, 30));

        pnlView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel3.setText("Sexo:");

        jLabel5.setText("Cidade:");

        lblSexo.setText("lblSexo");

        lblCidade.setText("lblCidade");

        jLabel6.setText("E-mail:");

        jLabel7.setText("Telefone:");

        jLabel8.setText("CPF:");

        lblCPF.setText("lblCPF");

        lblEmail.setText("lblEmail");

        lblTelefone.setText("lblTelefone");

        jLabel12.setText("Nome:");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("lblNome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblNome))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSexo))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID.setText("#ID");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel18.setText("Data Início:");

        jLabel10.setText("Status:");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStatus.setText("lblStatus");

        lblDataInicio.setText("lblDataIni");

        jLabel19.setText("Localização:");

        lblLocal.setText("lblLocal");

        jLabel20.setText("Valor:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValor.setText("lblValor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblDataInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLocal)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor)
                    .addComponent(jLabel20))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eletrônico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel14.setText("Eletronico:");

        lblEletronico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEletronico.setText("lblEletronico");

        txtEspec.setColumns(20);
        txtEspec.setLineWrap(true);
        txtEspec.setRows(2);
        txtEspec.setTabSize(3);
        txtEspec.setBorder(javax.swing.BorderFactory.createTitledBorder("Especificações"));
        jScrollPane4.setViewportView(txtEspec);

        txtProblemas.setColumns(20);
        txtProblemas.setLineWrap(true);
        txtProblemas.setRows(3);
        txtProblemas.setTabSize(3);
        txtProblemas.setBorder(javax.swing.BorderFactory.createTitledBorder("Problemas"));
        jScrollPane5.setViewportView(txtProblemas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEletronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblEletronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtDetalhes.setColumns(20);
        txtDetalhes.setLineWrap(true);
        txtDetalhes.setRows(4);
        txtDetalhes.setTabSize(3);
        txtDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes do serviço"));
        jScrollPane6.setViewportView(txtDetalhes);

        btnFecharView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/remove.png"))); // NOI18N
        btnFecharView.setText("Fechar");
        btnFecharView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharView)))
                .addContainerGap())
            .addComponent(jScrollPane6)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(168, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(btnFecharView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlViewLayout = new javax.swing.GroupLayout(pnlView);
        pnlView.setLayout(pnlViewLayout);
        pnlViewLayout.setHorizontalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlViewLayout.setVerticalGroup(
            pnlViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/logo16px.png"))); // NOI18N
        jMenu1.setDisabledSelectedIcon(null);
        jMenu1.setEnabled(false);
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastrar");

        btnCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadCliente.setText("Cliente");
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadCliente);

        btnCadServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadServico.setText("Serviço");
        btnCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadServicoActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadServico);

        btnCadEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadEletronico.setText("Eletronico");
        btnCadEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEletronicoActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadEletronico);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Procurar");

        btnProcurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarCliente.setText("Cliente");
        btnProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarClienteActionPerformed(evt);
            }
        });
        jMenu5.add(btnProcurarCliente);

        btnProcurarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarServico.setText("Serviço");
        btnProcurarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarServicoActionPerformed(evt);
            }
        });
        jMenu5.add(btnProcurarServico);

        btnProcurarEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarEletronico.setText("Eletronico");
        btnProcurarEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEletronicoActionPerformed(evt);
            }
        });
        jMenu5.add(btnProcurarEletronico);

        btnProcurarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarVenda.setText("Venda");
        btnProcurarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarVendaActionPerformed(evt);
            }
        });
        jMenu5.add(btnProcurarVenda);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jMenuItem10.setText("Teclas de atalho");
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("Sair");

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/remove.png"))); // NOI18N
        menuSair.setText("Sair do sistema");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu3.add(menuSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAreaReformados)
                    .addComponent(pnlVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReformados, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAreaReformados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(pnlReformados, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlView.setVisible(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        gerenciadorI.janelaCadCliente();
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadServicoActionPerformed
        gerenciadorI.janelaCadServico();
    }//GEN-LAST:event_btnCadServicoActionPerformed

    private void btnCadEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEletronicoActionPerformed
        gerenciadorI.janelaCadEletronicoRef();
    }//GEN-LAST:event_btnCadEletronicoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        gerenciadorI.janelaVendaEletronicoRef();
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarClienteActionPerformed
        gerenciadorI.janelaProcurarCliente();
    }//GEN-LAST:event_btnProcurarClienteActionPerformed

    private void btnProcurarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarServicoActionPerformed
        gerenciadorI.janelaProcurarServico();
    }//GEN-LAST:event_btnProcurarServicoActionPerformed

    private void btnProcurarEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEletronicoActionPerformed
        gerenciadorI.janelaProcurarEletronico();
    }//GEN-LAST:event_btnProcurarEletronicoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoServicoActionPerformed
        gerenciadorI.janelaCadServico();
    }//GEN-LAST:event_btnNovoServicoActionPerformed

    private void btnListarEletronicosDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEletronicosDisponiveisActionPerformed
        try {
            List<EletronicoReformado> lista = gerenciadorI.getGerDominio().pesquisarEletronico("", 0);
            
            ( (DefaultTableModel) tblEletronicos.getModel() ).setNumRows(0);
            
            for (EletronicoReformado eletronicoRef : lista ) {     
                ( (DefaultTableModel) tblEletronicos.getModel() ).addRow( eletronicoRef.toArray2() );
            }
            
        } catch (ClassNotFoundException | HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao LISTAR Eletronicos", JOptionPane.ERROR_MESSAGE  );
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnListarEletronicosDisponiveisActionPerformed

    private void btnCadastrarRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarRefActionPerformed
        gerenciadorI.janelaCadEletronicoRef();
    }//GEN-LAST:event_btnCadastrarRefActionPerformed

    private void btnProcurarEmAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEmAndamentoActionPerformed
        try {
            List<Servico> lista = gerenciadorI.getGerDominio().pesquisarServicos("", -1, 'E');
            
            ((DefaultTableModel) tblServicosEmAndamento.getModel()).setNumRows(0);
            
            for (Servico servico : lista) {     
                ((DefaultTableModel) tblServicosEmAndamento.getModel()).addRow( servico.toArray());
            }
            
        } catch (ClassNotFoundException | HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao LISTAR Servicos", JOptionPane.ERROR_MESSAGE  );
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnProcurarEmAndamentoActionPerformed

    private void btnListarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendasActionPerformed
        try {
            List<VendaReformado> lista = gerenciadorI.getGerDominio().pesquisarVendas("",0);
            
            ( (DefaultTableModel) tblVendas.getModel() ).setNumRows(0);
            
            for (VendaReformado venda : lista ) {     
                ( (DefaultTableModel) tblVendas.getModel() ).addRow( venda.toArray() );
            }
            
        } catch (ClassNotFoundException | HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao LISTAR Vendas", JOptionPane.ERROR_MESSAGE  );
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnListarVendasActionPerformed

    private void btnFinalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar1ActionPerformed
        int linha = tblServicosEmAndamento.getSelectedRow();
        if ( linha >= 0 ) {
            servicoSelecionado = (Servico) tblServicosEmAndamento.getValueAt(linha, 0);
            String message = "Tem certeza que deseja finalizar o serviço [" + servicoSelecionado.getIdServico() + "] ?";
            String title = "Confirmar finalização";
            
            if (JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                try {
                    gerenciadorI.getGerDominio().finalizarServico(servicoSelecionado);
                } catch(HibernateException ex) {
                    JOptionPane.showMessageDialog(this, ex, "ERRO Servico", JOptionPane.ERROR_MESSAGE  );
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, ex, "ERRO Servico", JOptionPane.ERROR_MESSAGE  );
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Selecione um serviço", "Finalizar serviço", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnFinalizar1ActionPerformed

    private void btnProcurarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarVendaActionPerformed
        gerenciadorI.janelaProcurarVenda();
    }//GEN-LAST:event_btnProcurarVendaActionPerformed

    private void btnExcluirReformadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirReformadoActionPerformed
        int linha = tblEletronicos.getSelectedRow();
        if ( linha >= 0 ) {
            eletReformadoSelecionado = (EletronicoReformado) tblEletronicos.getValueAt(linha, 0);
            String message = "Tem certeza que deseja excluir o reformado [" + eletReformadoSelecionado.toString()+ "] ?";
            String title = "Confirmar exclusão";
            
            if (JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                try {
                    gerenciadorI.getGerDominio().excluirEletReformado(eletReformadoSelecionado);
                } catch(HibernateException ex) {
                    JOptionPane.showMessageDialog(this, ex, "ERRO Eletronico Reformado", JOptionPane.ERROR_MESSAGE  );
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, ex, "ERRO Eletronico Reformado", JOptionPane.ERROR_MESSAGE  );
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Selecione um eletronico", "Excluir Eletronico", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnExcluirReformadoActionPerformed

    private void btnVisualizarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarServicoActionPerformed
        int linha = tblServicosEmAndamento.getSelectedRow();
        if ( linha >= 0 ) {
            servicoSelecionado = (Servico) tblServicosEmAndamento.getValueAt(linha, 0);
            preencherView();
            pnlView.setVisible(true);
            lblAreaReformados.setVisible(false);
            pnlVendas.setVisible(false);
            pnlReformados.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(this,"Selecione um serviço", "Visualizar serviço", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnVisualizarServicoActionPerformed

    private void btnFecharViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharViewActionPerformed
        pnlView.setVisible(false);
        lblAreaReformados.setVisible(true);
        pnlVendas.setVisible(true);
        pnlReformados.setVisible(true);
        servicoSelecionado = null;
    }//GEN-LAST:event_btnFecharViewActionPerformed

    private void preencherView(){
        lblNome.setText(servicoSelecionado.getCliente().getNome());
        lblID.setText("#" + servicoSelecionado.getIdServico());
        lblCPF.setText(servicoSelecionado.getCliente().getCpf());
        lblSexo.setText(String.valueOf(servicoSelecionado.getCliente().getSexo()));
        lblCidade.setText(servicoSelecionado.getCliente().getCidade().getNomeCidade());
        lblEmail.setText(servicoSelecionado.getCliente().getEmail());
        lblTelefone.setText(servicoSelecionado.getCliente().getTelefone());
        
        if(servicoSelecionado.isFinalizado() == false){
            lblStatus.setText("Em andamento");
        }else{
            lblStatus.setText("Concluído");
        }
        
        try {
            lblDataInicio.setText(FuncoesUteis.dateToStr(servicoSelecionado.getDataInicio()));
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            lblDataInicio.setText("erro"); // teste
        }
        
        lblLocal.setText(servicoSelecionado.getLocalServico());
        lblValor.setText(String.valueOf(servicoSelecionado.getValor()));
        lblEletronico.setText(servicoSelecionado.getEletronicoCliente().getTipo().toString());
        txtDetalhes.setText(servicoSelecionado.getDescricao());
        txtEspec.setText(servicoSelecionado.getEletronicoCliente().getDescricao());
        txtProblemas.setText(servicoSelecionado.getEletronicoCliente().getProblemas());
    }
    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadCliente;
    private javax.swing.JMenuItem btnCadEletronico;
    private javax.swing.JMenuItem btnCadServico;
    private javax.swing.JButton btnCadastrarRef;
    private javax.swing.JButton btnExcluirReformado;
    private javax.swing.JButton btnFecharView;
    private javax.swing.JButton btnFinalizar1;
    private javax.swing.JButton btnListarEletronicosDisponiveis;
    private javax.swing.JButton btnListarVendas;
    private javax.swing.JButton btnNovoServico;
    private javax.swing.JMenuItem btnProcurarCliente;
    private javax.swing.JMenuItem btnProcurarEletronico;
    private javax.swing.JButton btnProcurarEmAndamento;
    private javax.swing.JMenuItem btnProcurarServico;
    private javax.swing.JMenuItem btnProcurarVenda;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVisualizarReformado;
    private javax.swing.JButton btnVisualizarServico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAreaReformados;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblEletronico;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblValor;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPanel pnlReformados;
    private javax.swing.JPanel pnlVendas;
    private javax.swing.JPanel pnlView;
    private javax.swing.JTable tblEletronicos;
    private javax.swing.JTable tblServicosEmAndamento;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextArea txtDetalhes;
    private javax.swing.JTextArea txtEspec;
    private javax.swing.JTextArea txtProblemas;
    // End of variables declaration//GEN-END:variables
}
