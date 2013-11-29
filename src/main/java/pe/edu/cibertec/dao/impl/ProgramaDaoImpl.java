/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dao.ProgramaDao;

import pe.edu.cibertec.model.Programa;

/**
 *
 * @author francisco
 */
@Repository("programaDao")
public class ProgramaDaoImpl implements  ProgramaDao{

    @PersistenceContext
    private EntityManager em;
    
    public List<Programa> list() {
        Query q = em.createQuery("select a from Programa a");
        return q.getResultList();
    }

    public Programa getById(Integer id) {
         
        Query q = em.createQuery("select a from Programa a where a.idprograma = :idprograma");
        q.setParameter("idprograma", id);
        return (Programa)q.getSingleResult();
        
        
        
        
    }
    

    
    public void insert(Programa programa) {
        em.persist(programa);
        
    }

    public void update(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Programa programa) {
         em.remove(programa);
    }
   
    
}
