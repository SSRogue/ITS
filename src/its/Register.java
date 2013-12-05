/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package its;

/**
 *
 * @author Rogue
 */
public class Register {

    public Register() {
    }

    public Register(User []user, int index, String userName, String password, char carType) {
        user[index] = new User(userName, password, 'S');
    }
}
