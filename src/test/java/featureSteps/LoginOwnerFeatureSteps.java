package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.serveses.LoginToMyAppAsAdmin;
import sakancom.serveses.LoginToMyAppAsOwner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginOwnerFeatureSteps {
    LoginToMyAppAsOwner myApp;
    String password,email;
    public LoginOwnerFeatureSteps()
    {

        myApp = new LoginToMyAppAsOwner();
    }
    @Given("that the owner is not logged in the app")
    public void thatTheOwnerIsNotLoggedInTheApp() {
        assertFalse(myApp.isLoggedIn());

    }
    @Given("the username owner is {string}")
    public void theUsernameOwnerIs(String email) {
        this.email = email;

    }
    @Given("the password owner is {string}")
    public void thePasswordOwnerIs(String password) {
      this.password = password;
    }
    @Then("the owner is logged in the app successfully")
    public void theOwnerIsLoggedInTheAppSuccessfully() {
        myApp.loggInCheck(email,password);
        assertTrue(myApp.isLoggedIn());

    }
    @Then("the owner will not login")
    public void theOwnerWillNotLogin() {
        myApp.loggInCheck(email,password);
        assertFalse(myApp.isLoggedIn());

    }
    @Then("the message appear to tell the owner what's wrong")
    public void theMessageAppearToTellTheOwnerWhatSWrong() {
      myApp.errorInLogin();
    }


}
