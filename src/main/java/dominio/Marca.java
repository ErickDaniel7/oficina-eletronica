package dominio;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * Marca - Dominio 
*/

@Entity
public class Marca implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;
    
    @Column(length = 50)
    private String nomeMarca;
    
    
    

    public Marca() {}
    
    public Marca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    
    
    
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return this.nomeMarca;
    }
}
