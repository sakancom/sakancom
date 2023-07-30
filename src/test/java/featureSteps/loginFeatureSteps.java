package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.serveses.LoginToMyAppAsAdmin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

public class loginFeatureSteps {
        LoginToMyAppAsAdmin myApp;
        String password,email;
        public loginFeatureSteps()
        {
                myApp = new LoginToMyAppAsAdmin();
        }



        @Given("you are in login page")
        public void youAreInLoginPage() {
                assertFalse(myApp.isLoggedIn());
        }


        @When("I type in email {string} And I type in password {string}")
        public void iTypeInEmailAndITypeInPassword(String email, String password) {
         this.email = email;
         this.password = password;
        }
        @Then("I should see E-mail or password is incorrect")
        public void iShouldSeeEMailOrPasswordIsIncorrect() {
          myApp.errorInLogin();
        }



        @Then("I should see Access your account")
        public void iShouldSeeAccessYourAccount() {
          myApp.loggInCheck(email,password);
          assertTrue(myApp.isLoggedIn());
        }


        @Then("Empty password or username")
        public void emptyPasswordOrUsername() {
         assertTrue(myApp.emptyPassOrEmail(email,password));

        }

}