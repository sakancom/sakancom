package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.serveses.LoginToMyAppAsAdmin;
import sakancom.serveses.LoginToMyAppAsOwner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LogoutOwnerFeatureSteps {

    LoginToMyAppAsOwner myApp ;
    public LogoutOwnerFeatureSteps(){
        myApp = new LoginToMyAppAsOwner();
        myApp.login();
    }
    @Given("that the owner choose to logout")
    public void that_the_owner_choose_to_logout() {
        assertTrue(myApp.isLoggedIn());
    }
    @Then("the owner will be logout")
    public void the_owner_will_be_logout() {
        myApp.logout();
        assertFalse(myApp.isLoggedIn());
    }


    @Then("the the owner can't logout")
    public void the_the_owner_can_t_logout() {
        assertTrue(myApp.isLoggedIn());
    }
}
