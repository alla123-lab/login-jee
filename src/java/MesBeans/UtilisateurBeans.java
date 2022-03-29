package MesBeans;

import java.io.Serializable;

public class UtilisateurBeans implements Serializable{
    
    String userName;
    String password;

    public UtilisateurBeans() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
      
}
