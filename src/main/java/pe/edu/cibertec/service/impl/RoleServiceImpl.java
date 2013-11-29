/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dao.RoleDao;
import pe.edu.cibertec.model.Role;
import pe.edu.cibertec.service.RoleService;

/**
 *
 * @author JAVA-ADV-VS
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleDao dao;
    
    public List<Role> listRoles() {
        return dao.list();
    }

    public void insert(Role role) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Role role) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
