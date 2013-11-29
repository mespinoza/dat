/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.user.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import pe.edu.cibertec.model.Programa;

import pe.edu.cibertec.service.ProgramaService;

/**
 *
 * @author Francisco
 */
public class ProgramaAction {
    
    private List<Programa> programas;
    
    private Programa programa;
    
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProgramaService getProgramaService() {
        return programaService;
    }

    public void setProgramaService(ProgramaService programaService) {
        this.programaService = programaService;
    }

    
    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    
    

    public List<Programa> getProgramas() {
        return programas;
    }
    
    
    

   
    
    @Autowired
    @Qualifier("impl1")
    private ProgramaService programaService;
    
    public String listarProgramas() throws Exception {

            programas = programaService.list();
            return "success";

    }
    
    public String nuevoPrograma() throws Exception {
        programa = new Programa();
        return "success";
    }
    
    public String guardarPrograma() throws Exception {
        programaService.insert(programa);
        return "success";
    }
    
    public String eliminarPrograma() throws Exception {
        Programa programa = new Programa();
        programa.setIdprograma(id);
        programaService.delete(programa);
        return "success";
    }
}
