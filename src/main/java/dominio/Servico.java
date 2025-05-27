package dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import javax.persistence.*;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * Servico - Dominio 
*/

@Entity
public class Servico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServico;
    
    @Column(length = 50)
    private String localServico;
    
    @Column(length = 200)
    private String descricao;
    
    @Column(length = 200) 
    private String reparos;
    
    @Column(nullable = false)
    private boolean finalizado;
    
    @Column(length = 20)
    private int valor;
     
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date dataFim;
    
    @ManyToOne ( fetch = FetchType.EAGER)
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    @ManyToOne ( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn (name = "idEletronicoCli")
    private EletronicoCliente eletronicoCliente;

    
    public Servico(){}
    
    public Servico(String localServico, String descricao, String reparos, boolean finalizado, int valor, Date dataInicio, Date dataFim, Cliente cliente, EletronicoCliente eletronicoCliente) {
        this.localServico = localServico;
        this.descricao = descricao;
        this.reparos = reparos;
        this.finalizado = finalizado;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.eletronicoCliente = eletronicoCliente;
    }
    
    
    

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getLocalServico() {
        return localServico;
    }

    public void setLocalServico(String localServico) {
        this.localServico = localServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReparos() {
        return reparos;
    }

    public void setReparos(String reparos) {
        this.reparos = reparos;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EletronicoCliente getEletronicoCliente() {
        return eletronicoCliente;
    }

    public void setEletronicoCliente(EletronicoCliente eletronicoCliente) {
        this.eletronicoCliente = eletronicoCliente;
    }
    
    
    
    
    public Object[] toArray() throws ParseException {
        return new Object[] { this, cliente.getNome(), eletronicoCliente.getTipo().toString(), dataInicio, cliente.getTelefone()};
    }

    @Override
    public String toString() {
        return "[" + idServico + ']';
    }

    
    
    
}
