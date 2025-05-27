package gerenciadorTarefas;

import com.formdev.flatlaf.FlatDarkLaf;
import dominio.*;
import interfaces.*;
import java.awt.Frame;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.hibernate.HibernateException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * GerenciadorInterface - GerenciadorTarefas 
*/

public class GerenciadorInterface {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorInterface.class.getName());

    private DlgLogin janLogin = null;
    private FrmPrincipal janPrincipal = null;
    private DlgCadCliente janCadCliente = null;
    private DlgCadCidade janCadCidade = null;
    private DlgCadServico janCadServico = null;
    private DlgCadEletronicoRef janCadEletronicoRef = null;
    private DlgCadMarca janCadMarca = null;
    private DlgCadTipoEletronico janCadTipo = null;
    private DlgCadVenda janVendaEletronicoRef = null;
    private DlgPesqCliente janProcurarCliente = null;
    private DlgPesqServico janProcurarServico = null;
    private DlgPesqEletronico janProcurarEletronico = null;
    private DlgPesqVenda janProcurarVenda = null;

    private GerenciadorDominio gerDominio;

    public GerenciadorInterface() {
        try {
            gerDominio = new GerenciadorDominio();
        } catch (ClassNotFoundException | HibernateException ex) {
            LOGGER.log(Level.SEVERE, "Erro de conexão com o banco: ", ex);
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco. " + ex.getMessage());
            System.exit(-1);
        }
    }

    public GerenciadorDominio getGerDominio() {
        return gerDominio;
    }

    //==================================================================================
    //ABRIR JANELAS
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            // Instanciando diretamente as janelas
            if (classe == DlgLogin.class) {
                dlg = new DlgLogin(parent, true, this);
            } else if (classe == DlgCadCliente.class) {
                dlg = new DlgCadCliente(parent, true, this);
            } else if (classe == DlgCadServico.class) {
                dlg = new DlgCadServico(parent, true, this);
            } else if (classe == DlgCadEletronicoRef.class) {
                dlg = new DlgCadEletronicoRef(parent, true, this);
            } else if (classe == DlgCadMarca.class) {
                dlg = new DlgCadMarca(parent, true, this);
            } else if (classe == DlgCadTipoEletronico.class) {
                dlg = new DlgCadTipoEletronico(parent, true, this);
            } else if (classe == DlgCadVenda.class) {
                dlg = new DlgCadVenda(parent, true, this);
            } else if (classe == DlgPesqCliente.class) {
                dlg = new DlgPesqCliente(parent, true, this);
            } else if (classe == DlgPesqServico.class) {
                dlg = new DlgPesqServico(parent, true, this);
            } else if (classe == DlgPesqEletronico.class) {
                dlg = new DlgPesqEletronico(parent, true, this);
            } else if (classe == DlgPesqVenda.class) {
                dlg = new DlgPesqVenda(parent, true, this);
            } else if (classe == DlgCadCidade.class) {
                dlg = new DlgCadCidade(parent, true, this);
            }
        }
        dlg.setLocationRelativeTo(null);
        dlg.setVisible(true);
        return dlg;
    }

    public void janelaLogin() {
        janLogin = (DlgLogin) abrirJanela(null, janLogin, DlgLogin.class);
    }

    public void janelaPrincipal() {
        janPrincipal = new FrmPrincipal(this);
        janPrincipal.setVisible(true);
    }

    public void janelaCadCliente() {
        janCadCliente = (DlgCadCliente) abrirJanela(janPrincipal, janCadCliente, DlgCadCliente.class);
    }

    public void janelaCadServico() {
        janCadServico = (DlgCadServico) abrirJanela(janPrincipal, janCadServico, DlgCadServico.class);
    }

    public void janelaCadEletronicoRef() {
        janCadEletronicoRef = (DlgCadEletronicoRef) abrirJanela(janPrincipal, janCadEletronicoRef, DlgCadEletronicoRef.class);
    }

    public void janelaCadTipo() {
        janCadTipo = (DlgCadTipoEletronico) abrirJanela(janPrincipal, janCadTipo, DlgCadTipoEletronico.class);
    }

    public void janelaVendaEletronicoRef() {
        janVendaEletronicoRef = (DlgCadVenda) abrirJanela(janPrincipal, janVendaEletronicoRef, DlgCadVenda.class);
    }

    public Cliente janelaProcurarCliente() {
        janProcurarCliente = (DlgPesqCliente) abrirJanela(janPrincipal, janProcurarCliente, DlgPesqCliente.class);
        return janProcurarCliente.getCliente();
    }

    public void janelaCadMarca() {
        janCadMarca = (DlgCadMarca) abrirJanela(janPrincipal, janCadMarca, DlgCadMarca.class);
    }

    public void janelaProcurarServico() {
        janProcurarServico = (DlgPesqServico) abrirJanela(janPrincipal, janProcurarServico, DlgPesqServico.class);
    }

    public EletronicoReformado janelaProcurarEletronico() {
        janProcurarEletronico = (DlgPesqEletronico) abrirJanela(janPrincipal, janProcurarEletronico, DlgPesqEletronico.class);
        return janProcurarEletronico.getEletronico();
    }

    public void janelaProcurarVenda() {
        janProcurarVenda = (DlgPesqVenda) abrirJanela(janPrincipal, janProcurarVenda, DlgPesqVenda.class);
    }

    public void janelaCadCidade() {
        janCadCidade = (DlgCadCidade) abrirJanela(janPrincipal, janCadCidade, DlgCadCidade.class);
    }

    //==================================================================================
    //CARREGAR COMBO BOX GENERICO
    public void carregarComboBox(JComboBox combo, Class classe) throws HibernateException {
        try {
            List<Class> lista = gerDominio.listar(classe);
            List<Class> listaOrdenada = FuncoesUteis.ordenarListaCombo(classe, lista);
            combo.setModel(new DefaultComboBoxModel(listaOrdenada.toArray()));
        } catch (HibernateException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar " + classe.getName(), ex);
            JOptionPane.showMessageDialog(janPrincipal, "Erro ao carregar " + classe.getName() + " " + ex.getMessage());
        }
    }

    //==================================================================================
    //CARREGAR COMBO BOX ORDER BY NOME ASC
    public void carregarComboBoxByNomeTipoElet(JComboBox combo, Class classe) throws HibernateException {
        try {
            List<Class> lista = gerDominio.listarNomeTipoElet(classe);
            combo.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (HibernateException ex) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar " + classe.getName(), ex);
            JOptionPane.showMessageDialog(janPrincipal, "Erro ao carregar " + classe.getName() + " " + ex.getMessage());
        }
    }

    public static void main(String args[]) {
        /* Set the FlatLighLaf and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        //Setando um tema de um repositório externo
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            LOGGER.log(Level.SEVERE, "Falha ao iniciar tema FlatDarkLaf", ex);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Falha ao definir tema", ex);
        }
        //</editor-fold>

        GerenciadorInterface gerIG = new GerenciadorInterface();
        gerIG.janelaLogin();
    }
}
