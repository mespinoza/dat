/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.user.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.model.Role;
import pe.edu.cibertec.service.RoleService;

/**
 *
 * @author JAVA-ADV-VS
 */
public class RoleAction {
    
    @Autowired
    private RoleService service;
    private List<Role> roles;
    private Integer id;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    
    public String listarRoles() {
        roles = service.listRoles();
        return "success";
    }
    
    public String insertarRol() {
        System.out.println("grabando rol");
        return "success";
    }
    
    public String eliminarRol() {
        return "success";
    }
    
    public String nuevoRol() {
        return "success";
    }
}
