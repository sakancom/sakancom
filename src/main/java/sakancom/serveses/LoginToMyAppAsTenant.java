package sakancom.serveses;

import sakancom.database.TenantDB;
import sakancom.entity.Tenant;
import sakancom.LoggerUtility;

import java.util.logging.Logger;

public class LoginToMyAppAsTenant {
    private static final Logger logger = LoggerUtility.getLogger();
    private boolean isLoggedIn;

    public LoginToMyAppAsTenant() {
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

        logger.info("Something WRONG!,The username or the password is not correct\n");
    }
    public void loggInCheck(String email, String password) {
        for(Tenant tenant: TenantDB.getTenants())
        {
            if (email.equals(tenant.getEmail()) && password.equals(tenant.getPassword()))
            {
                login();
            }
        }
    }
}
