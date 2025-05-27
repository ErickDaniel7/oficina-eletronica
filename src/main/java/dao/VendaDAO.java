package dao;

import dominio.VendaReformado;
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
 
 * Venda - DAO 
*/

public class VendaDAO extends GenericDAO {
    
    //==================================================================================
    //PESQUISAR COM RESTRICOES
    private List<VendaReformado> pesquisar(String pesq, int tipo) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(VendaReformado.class );
            
            // FROM
            Root tabela = consulta.from(VendaReformado.class);
            
            // RESTRIÇÕES
            Predicate restricoes = null;
            
            switch (tipo) {
                case 1: restricoes = builder.like(tabela.get("cliente").get("nome"), pesq + "%" ); break;                     
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
    
    
    public List<VendaReformado> pesqVendaNomeCliente(String pesq, int tipo) throws HibernateException {
        return pesquisar(pesq,tipo);
    }
    
}
