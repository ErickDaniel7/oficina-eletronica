package dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * Cliente - Dominio 
*/

@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    
    @Column(length = 50, nullable = false)
    private String nome;
    
    @Column(length = 13)
    private String telefone;
    
    @Column(updatable = false, length = 14, nullable = false, unique = true)
    private String cpf;  
    
    @Column(length = 1)
    private char sexo;
    
    @Column(length = 100)
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "idCidade")
    private Cidade cidade;
    
    @OneToMany ( mappedBy = "cliente", fetch =  FetchType.LAZY)
    private List<Servico> servicos;
    
    @OneToMany ( mappedBy = "cliente", fetch =  FetchType.LAZY)
    private List<VendaReformado> vendas;
    
    
    
    
    public Cliente(){}
    
    public Cliente(String nome, String telefone, String cpf, char sexo, String email, Cidade cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.cidade = cidade;
    }

    
    
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public Cidade getCidade() {;
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
   
    
    
    public Object[] toArray() throws ParseException {
        return new Object[] { idCliente, this, cpf, cidade.getNomeCidade(), email, telefone};
    }
    
    
    @Override
    public String toString() {
        return nome;
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
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}
