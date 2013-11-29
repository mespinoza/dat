/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.model.Role;

/**
 *
 * @author JAVA-ADV-VS
 */
public interface RoleService {
    List<Role> listRoles();
    void insert(Role role);
    void delete(Role role); 
}
