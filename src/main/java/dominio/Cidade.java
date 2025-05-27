package dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * Cidade - Dominio 
*/

@Entity
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCidade;
    
    @Column(length = 50)
    private String nomeCidade;
    
    
    
    public Cidade(){}
    
    public Cidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    
    
    

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    
    

    
    @Override
    public String toString() {
        return this.nomeCidade;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.idCidade;
        hash = 47 * hash + Objects.hashCode(this.nomeCidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (this.idCidade != other.idCidade) {
            return false;
        }

        return true;
    }
}
