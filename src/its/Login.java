/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package its;

/**
 *
 * @author chen203g
 */
public class Login  {

    public Login() {
    }
    
    public boolean login(User user[], int member, String name, String password){
        for (int i = 0; i < member; i++){
            if (user[i].getUserName().equals(name) && user[i].getUserPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
}
