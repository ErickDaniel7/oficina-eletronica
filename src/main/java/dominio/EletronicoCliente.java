package dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import javax.persistence.*;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * EletronicoCliente - Dominio 
*/

@Entity
public class EletronicoCliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEletronicoCli;
    
    @Column(length = 200)
    private String descricao;
    
    @Column(length = 200)
    private String problemas;
    
    @ManyToOne
    @JoinColumn(name = "idTipoEletronico")
    private TipoEletronico tipo;

    @OneToMany ( mappedBy = "eletronicoCliente", fetch =  FetchType.LAZY)
    private List<Servico> servicos;
    
    
    public EletronicoCliente(){}
    
    public EletronicoCliente(String descricao, String problemas, TipoEletronico tipo) {
        this.descricao = descricao;
        this.problemas = problemas;
        this.tipo = tipo;
    }

    
    
    
    public int getIdEletronicoCli() {
        return idEletronicoCli;
    }

    public void setIdEletronicoCli(int idEletronicoCli) {
        this.idEletronicoCli = idEletronicoCli;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProblemas() {
        return problemas;
    }

    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }

    public TipoEletronico getTipo() {
        return tipo;
    }

    public void setTipo(TipoEletronico tipo) {
        this.tipo = tipo;
    }
    
}
