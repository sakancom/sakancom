package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.serveses.LoginToMyAppAsAdmin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LogoutAdminFeatureSteps {
    LoginToMyAppAsAdmin myApp ;
    public LogoutAdminFeatureSteps(){
        myApp = new LoginToMyAppAsAdmin();
        myApp.login();
    }
    @Given("that the admin choose to logout")
    public void that_the_admin_choose_to_logout() {
        assertTrue(myApp.isLoggedIn());
    }
    @Then("the admin will be logout")
    public void the_admin_will_be_logout() {
       myApp.logout();
       assertFalse(myApp.isLoggedIn());
    }


    @Then("the the admin can't logout")
    public void the_the_admin_can_t_logout() {
        assertTrue(myApp.isLoggedIn());
    }
}
