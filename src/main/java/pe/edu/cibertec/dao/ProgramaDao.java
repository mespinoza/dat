/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao;

import java.util.List;
import pe.edu.cibertec.model.Programa;


/**
 *
 * @author francisco
 */
public interface ProgramaDao {
    public List<Programa> list();
    public Programa getById(Integer id);
    public void insert(Programa programa);
    public void update(Programa  programa);
    public void delete(Programa  programa);
    
    
    
}
