package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class loginfeaturesteps {

   MyApp obj;
    @Given("the Admin is not logged in to the system")
    public void the_admin_is_not_logged_in_to_the_system() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
       obj.flag = false;
    }

    @Given("the password is equal to {string}")
    public void the_password_is_equal_to(String string) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Then("the Admin should log in succeed")
    public void the_admin_should_log_in_succeed() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Then("the the Admin log to the system")
    public void the_the_admin_log_to_the_system() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
}
