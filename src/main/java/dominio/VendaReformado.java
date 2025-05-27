package dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import javax.persistence.*;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * VendaReformado - Dominio 
*/

@Entity
public class VendaReformado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenda;
    
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    
    @Column(length = 200)
    private String descricao;
    
    @Column(length = 20)
    private int valorFinal;
    
    @ManyToOne ( fetch = FetchType.EAGER)
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    @OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn (name = "idEletronicoRef")
    private EletronicoReformado eletronicoReformado;

    
    
    public VendaReformado(){}
    
    public VendaReformado(Date dataVenda, String descricao, int valorFinal, Cliente cliente, EletronicoReformado eletronicoReformado) {
        this.dataVenda = dataVenda;
        this.descricao = descricao;
        this.valorFinal = valorFinal;
        this.cliente = cliente;
        this.eletronicoReformado = eletronicoReformado;
        this.eletronicoReformado.setVendido(true);
    }
    
    
    

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(int valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EletronicoReformado getEletronicoReformado() {
        return eletronicoReformado;
    }

    public void setEletronicoReformado(EletronicoReformado eletronicoReformado) {
        this.eletronicoReformado = eletronicoReformado;
    }
   
    
    
    
    public Object[] toArray() throws ParseException {
        return new Object[] {cliente.getNome(), eletronicoReformado.toString(), dataVenda, cliente.getTelefone(), valorFinal};
    }
    
}
