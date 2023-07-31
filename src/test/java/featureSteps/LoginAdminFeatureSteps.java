package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.serveses.LoginToMyAppAsAdmin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginAdminFeatureSteps {
    LoginToMyAppAsAdmin myApp;
    String password,email;
    public LoginAdminFeatureSteps()
    {

        myApp = new LoginToMyAppAsAdmin();
    }


    @Given("that the admin is not logged in the app")
    public void thatTheAdminIsNotLoggedInTheApp() {

        assertFalse(myApp.isLoggedIn());
    }
    @Given("the username is {string}")
    public void theUsernameIs(String email) {

        this.email = email;
    }
    @Given("the password is {string}")
    public void thePasswordIs(String password) {

        this.password = password;
    }
    @Then("the admin is logged in the app successfully")
    public void theAdminIsLoggedInTheAppSuccessfully() {
        myApp.loggInCheck(email,password);
       // System.out.println(email);
       // System.out.println(password);

       // System.out.println(myApp.isLoggedIn());
        assertTrue(myApp.isLoggedIn());

    }
    @Then("the admin will not login")
    public void theAdminWillNotLogin() {
        myApp.loggInCheck(email,password);
        assertFalse(myApp.isLoggedIn());

    }
    @Then("the message appear to tell the admin what's wrong")
    public void theMessageAppearToTellTheAdminWhatSWrong() {

        myApp.errorInLogin();
    }

}
