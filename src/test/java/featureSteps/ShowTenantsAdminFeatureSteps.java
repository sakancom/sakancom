package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.database.TenantDB;
import sakancom.entity.House;
import sakancom.LoggerUtility;
import sakancom.serveses.AppLogger;
import sakancom.serveses.LoginToMyAppAsAdmin;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class ShowTenantsAdminFeatureSteps {
    LoginToMyAppAsAdmin myApp ;
    House house;
    private static Logger logger = LoggerUtility.getLogger();

    public ShowTenantsAdminFeatureSteps()
    {
        myApp = new LoginToMyAppAsAdmin();
        myApp.login();
        AppLogger.setLevel(logger);
    }

    @Given("that the admin is log in the app")
    public void that_the_admin_is_log_in_the_app() {
        assertTrue(myApp.isLoggedIn());

    }
    @Given("tenant list have tenants")
    public void tenant_list_have_tenants() {
        assertTrue(TenantDB.getTenants().size() > 0);

    }
    @Then("the information of the tenants will appear to admin page")
    public void the_information_of_the_tenants_will_appear_to_admin_page() {
        TenantDB.displayTenants(TenantDB.getTenants());
    }

}
