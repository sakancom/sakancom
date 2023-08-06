package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.database.OwnerDB;
import sakancom.LoggerUtility;
import sakancom.serveses.AppLogger;
import sakancom.serveses.LoginToMyAppAsAdmin;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class ShowOwnersAdmainFeatureSteps {
    LoginToMyAppAsAdmin myApp ;
    private static Logger logger = LoggerUtility.getLogger();

    public ShowOwnersAdmainFeatureSteps()
    {
        myApp = new LoginToMyAppAsAdmin();
        myApp.login();
        AppLogger.setLevel(logger);
    }

    @Given("that the admin is logged in the system")
    public void that_the_admin_is_logged_in_the_system() {
        assertTrue(myApp.isLoggedIn());

    }
    @Given("owner list have owners")
    public void owner_list_have_owners() {

        assertTrue(OwnerDB.getOwners().size() > 0);
        logger.info("\n");
    }
    @Then("the information of the owners will appear to admin page")
    public void the_information_of_the_owners_will_appear_to_admin_page() {
       OwnerDB.displayOwners(OwnerDB.getOwners());
    }
}
