package dao;

import dominio.TipoEletronico;
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
 
 * TipoEletronico - DAO 
*/

public class TipoEletronicoDAO extends GenericDAO {
    public List<String> listarNomeTipo() throws HibernateException {
        List<String> lista = null;
        Session sessao = null;
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery<String> query = builder.createQuery( String.class );
           
            Root<TipoEletronico> tabela = query.from(TipoEletronico.class);
            
            query.select(tabela.get("nomeTipoEletronico"));
            query.distinct(true);
            query.orderBy(builder.asc(tabela.get("nomeTipoEletronico")));
            
            lista = sessao.createQuery(query).getResultList();            

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
}
