/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;

import pe.edu.cibertec.model.Programa;

/**
 *
 * @author francisco
 */
@Service("programaService")
public interface ProgramaService {
    public List<Programa> list();
   
    public Programa getById( Integer id);
    
    public void insert(Programa programa);
    public void update(Programa programa);
    public void delete(Programa programa);
}
