/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;
import pe.edu.cibertec.model.Autor;

/**
 *
 * @author francisco
 */
public interface AutorService {
    public List<Autor> list();
    public Autor getById(Integer id);
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void insert(Autor autor) throws BusinessException1, BusinessException2;
    public void update(Autor autor);
    public void delete(Autor autor);
    public String generateAutorSignature(Autor autor);
}
