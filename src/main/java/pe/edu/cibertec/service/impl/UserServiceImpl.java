/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.RoleDao;
import pe.edu.cibertec.dao.UserDao;
import pe.edu.cibertec.model.Role;
import pe.edu.cibertec.model.User;
import pe.edu.cibertec.service.UserService;

/**
 *
 * @author francisco
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private RoleDao roleDao;
    
    public List<User> list() {
        return userDao.list();
        
    }

    @Transactional
    public void insert(User user) {
        Role role = roleDao.getById(user.getIdRole());
        List<Role> roles = new ArrayList<Role>();
        roles.add(role);
        user.setRoles(roles);
        userDao.insert(user);
    }

    @Transactional
    public void delete(User user) {
        User userForRemoving = userDao.getById(user.getIdUser());
        userDao.delete(userForRemoving);
    }

}
