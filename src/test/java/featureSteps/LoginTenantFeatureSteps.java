package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.serveses.LoginToMyAppAsTenant;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginTenantFeatureSteps {
    LoginToMyAppAsTenant myApp;
    String password,email;

    public LoginTenantFeatureSteps() {
        myApp = new LoginToMyAppAsTenant();
    }

    @Given("that the tenant is not logged in the app")
    public void thatTheTenantIsNotLoggedInTheApp() {
        assertFalse(myApp.isLoggedIn());
    }
    @Given("the username tenant is {string}")
    public void theUsernameTenantIs(String email) {
        this.email = email;
    }
    @Given("the password tenant is {string}")
    public void thePasswordTenantIs(String password) {
        this.password = password;
    }
    @Then("the tenant is logged in the app successfully")
    public void theTenantIsLoggedInTheAppSuccessfully() {
        myApp.loggInCheck(email,password);
        assertTrue(myApp.isLoggedIn());
    }
    @Then("the tenant will not login")
    public void theTenantWillNotLogin() {
        myApp.loggInCheck(email,password);
        assertFalse(myApp.isLoggedIn());
    }
    @Then("the message appear to tell the tenant what's wrong")
    public void theMessageAppearToTellTheTenantWhatSWrong() {
        myApp.errorInLogin();
    }


}
