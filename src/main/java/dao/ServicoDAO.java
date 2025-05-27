package dao;

import dominio.Servico;
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
 
 * Servico - DAO 
*/

public class ServicoDAO extends GenericDAO {
    
    //==================================================================================
    //PESQUISAR COM RESTRICOES
    private List<Servico> pesquisar(String pesq, int tipo, char status) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConnectionHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Servico.class );
            
            Root tabela = consulta.from(Servico.class);
            
            Predicate restricoes = null;
            
            if(tipo >= 0){
                switch (tipo) {
                    case 0: restricoes = builder.like(tabela.get("cliente").get("nome"), pesq + "%" ); 
                        break;
                    case 1: Expression exp = builder.function("month", Integer.class, tabela.get("dataInicio") );
                            restricoes = builder.equal(exp, pesq);
                        break;  
                }
            } else {
                switch (status) {
                    case 'E': restricoes = builder.equal(tabela.get("finalizado"), false);
                        break;
                    case 'C': restricoes = builder.equal(tabela.get("finalizado"), true);
                        break;
                }
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
    
    
    public List<Servico> pesqServicosNomeCliente(String pesq, int tipo, char status) throws HibernateException {
        return pesquisar(pesq,tipo,status);
    }
    
    public List<Servico> pesqServicosMesPedido(String pesq, int tipo, char status) throws HibernateException {
        return pesquisar(pesq,tipo,status);
    }
    
    public List<Servico> pesqServicosEmAndamento(String pesq, int tipo, char status) throws HibernateException {
        return pesquisar(pesq,tipo,status);
    }
    
    public List<Servico> pesqServicosConcluidos(String pesq, int tipo, char status) throws HibernateException {
        return pesquisar(pesq,tipo,status);
    }
}
