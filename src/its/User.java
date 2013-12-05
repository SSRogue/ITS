/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package its;

/**
 *
 * @author chen203g
 */
public class User {
    
    private String userName;
    private String userPassword;
    private char carType;

    public User(String userName, String userPassword, char carType) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.carType = carType;
    }

    public User() {
        userName = "Unknow";
        userPassword = "Unknow";
        carType = ' ';
    }

    public User(String userPassword) {
        this.userPassword = userPassword;
    }

    public User(char carType) {
        this.carType = carType;
    }

    public void setCarType(char carType) {
        this.carType = carType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public char getCarType() {
        return carType;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
  
}
