package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrator {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String user;
    private String password;

    public Administrator() {
    }

    public Administrator(String user, String password) {
        this.user = "admin";
        this.password = "pass1";
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
