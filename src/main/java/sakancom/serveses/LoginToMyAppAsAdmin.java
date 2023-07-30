package sakancom.serveses;

import sakancom.Database.AdminDB;
import sakancom.Entity.Admin;

import java.util.logging.Logger;

public class LoginToMyAppAsAdmin {

    private static final Logger logger = Logger.getLogger(LoginToMyAppAsAdmin.class.getName());
    private boolean isLoggedIn;

    public LoginToMyAppAsAdmin() {
        this.isLoggedIn = false;
        AppLogger.setLevel(logger);
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public void logout() {
        isLoggedIn=false;
    }
    public void login() {
        isLoggedIn=true;
    }
    public void errorInLogin() {
        logger.info("Something WRONG!,The username or the password is not correct");
    }
    public void loggInCheck(String email, String password) {
        for(Admin admin: AdminDB.getAdmins())
        {
            if (email.equals(admin.getEmail()) && password.equals(admin.getPassword()))
            {
                login();
            }
        }
    }
    public boolean emptyPassOrEmail (String email, String password){
        if(email.equals(" ") || password.equals(" ")){
            return true;
        }
        else return false;
    }
}






