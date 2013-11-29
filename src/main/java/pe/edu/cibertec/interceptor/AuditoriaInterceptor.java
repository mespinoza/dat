/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.interceptor;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.model.Auditoria;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.model.Programa;
import pe.edu.cibertec.service.AuditoriaService;
import pe.edu.cibertec.service.AutorService;

/**
 *
 * @author francisco
 */
@Aspect
@Component("auditoriaInterceptor")
public class AuditoriaInterceptor {
    
    @Autowired
    AuditoriaService service;
    
    public void beforeDeleteAutorInterceptor(JoinPoint joinPoint) {
        Autor autor = (Autor)joinPoint.getArgs()[0];
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Eliminado: " + autor.toString());
        service.insert(auditoria);
    }
    
    @After("execution(* pe.edu.cibertec.dao.impl.AutorDaoImpl.delete(pe.edu.cibertec.model.Autor)) && args(autor)")
    public void afterDeleteAutorInterceptor(Autor autor) {
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Eliminado: " + autor.toString());
        service.insert(auditoria);
    }
    @After("execution(* pe.edu.cibertec.dao.impl.ProgramaDaoImpl.delete(pe.edu.cibertec.model.Programa)) && args(programa)")
    public void afterDeleteProgramaInterceptor(Programa programa) {
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Eliminado: " + programa.toString());
        service.insert(auditoria);
    }
    
}
