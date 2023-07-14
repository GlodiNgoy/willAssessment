/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import entities.Faculty;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author glodi
 */
@Local
public interface FacultyFacadeLocal {

    void create(Faculty faculty);

    void edit(Faculty faculty);

    void remove(Faculty faculty);

    Faculty find(Object id);

    List<Faculty> findAll();

    List<Faculty> findRange(int[] range);

    int count();
    
}
