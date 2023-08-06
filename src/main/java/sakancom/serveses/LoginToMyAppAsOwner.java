package sakancom.serveses;

import sakancom.database.OwnerDB;
import sakancom.entity.HousingOwners;
import sakancom.LoggerUtility;


import java.util.logging.Logger;
public class LoginToMyAppAsOwner{

    private static final Logger logger = LoggerUtility.getLogger();
    private boolean isLoggedIn;

    public LoginToMyAppAsOwner() {
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
        logger.info("Something WRONG!,The username or the password is not correct \n" );
    }
    public void loggInCheck(String email, String password) {
        for(HousingOwners owner: OwnerDB.getOwners())
        {
            if (email.equals(owner.getEmail()) && password.equals(owner.getPassword()))
            {
                login();
            }
        }
    }
}






