package dao;

import dominio.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * Cliente - DAO
*/

public class ClienteDAO extends GenericDAO {
    
    //PESQUISAR COM RESTRICOES
    private List<Cliente> pesquisar(String pesq, int tipo) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Cliente.class );
            
            // FROM
            Root tabela = consulta.from(Cliente.class);
            
            // RESTRIÇÕES
            Predicate restricoes = null;
            
            switch (tipo) {
                case 1: restricoes = builder.like(tabela.get("nome"), pesq + "%" ); 
                        break;
                case 2: restricoes = builder.like(tabela.get("cidade").get("nomeCidade"), pesq + "%" ); 
                        break;
                case 3: restricoes = builder.like(tabela.get("cpf"), pesq ); 
                        break;                        
            }
                        
            consulta.where(restricoes);
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
    }
            
    public List<Cliente> pesqClienteNome(String pesq) throws HibernateException {
        return pesquisar(pesq,1);
    }
    
    public List<Cliente> pesqClienteCidade(String pesq) throws HibernateException {
        return pesquisar(pesq,2);
    }
    
    public List<Cliente> pesqClienteCPF(String pesq) throws HibernateException {
        return pesquisar(pesq,3);
    }
}
