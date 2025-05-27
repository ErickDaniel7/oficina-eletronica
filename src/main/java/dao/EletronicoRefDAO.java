package dao;


import dominio.EletronicoReformado;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Projeto Desktop
 * Hibernate e Java Swing
 
 * Autor: Erick Daniel Teixeira Vier
 
 * EletronicoRef - DAO 
*/

public class EletronicoRefDAO extends GenericDAO {
    
    //PESQUISAR COM RESTRICOES
    private List<EletronicoReformado> pesquisar(String pesq, int tipo) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( EletronicoReformado.class );
            
            // FROM
            Root tabela = consulta.from(EletronicoReformado.class);
            
            // RESTRIÇÕES
            Predicate restricoes = null;
            
            switch (tipo) {
                case 0: restricoes = builder.equal(tabela.get("vendido"), false); 
                        break;
                case 1: restricoes = builder.equal(tabela.get("vendido"), true); 
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
    
    
    public List<EletronicoReformado> pesqEletronicoDisponivel(String pesq, int tipo) throws HibernateException {
        return pesquisar(pesq,0);
    }
    
    public List<EletronicoReformado> pesqEletronicoVendido(String pesq, int tipo) throws HibernateException {
        return pesquisar(pesq,1);
    }
    
}