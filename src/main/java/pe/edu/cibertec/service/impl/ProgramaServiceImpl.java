/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dao.ProgramaDao;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;

import pe.edu.cibertec.model.Programa;

import pe.edu.cibertec.service.ProgramaService;

/**
 *
 * @author francisco
 */
@Service("programaService")
@Qualifier("impl1")
public class ProgramaServiceImpl implements ProgramaService{

    @Autowired
    ProgramaDao programaDao;
    
    public List<Programa> list() {
        return programaDao.list();
    }

    public Programa getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional
    public void insert(Programa programa) {
        programaDao.insert(programa);
       
    }

    public void update(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Transactional
    public void delete(Programa programa) {
        programa = programaDao.getById(programa.getIdprograma());
        programaDao.delete(programa);
    }

    
    
    
}
