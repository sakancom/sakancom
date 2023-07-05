package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

public class loginfeaturesteps {

    @Given("you are in login page")
    public void you_are_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //   throw new io.cucumber.java.PendingException();
    }
    @When("I type in email {string} And I type in password {string}")
    public void i_type_in_email_and_i_type_in_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //  throw new io.cucumber.java.PendingException();
    }
    @Then("I should see E-mail or password is incorrect")
    public void iShouldSeeEMailOrPasswordIsIncorrect() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should see Access your account")
    public void i_should_see_access_your_account() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("Empty password or username")
    public void emptyPasswordOrUsername() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }




}