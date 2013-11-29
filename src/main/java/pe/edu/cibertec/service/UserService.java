/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service;

import java.util.List;
import pe.edu.cibertec.model.User;

/**
 *
 * @author francisco
 */
public interface UserService {
    public List<User> list();
    public void insert(User user);
    public void delete(User user);
}
