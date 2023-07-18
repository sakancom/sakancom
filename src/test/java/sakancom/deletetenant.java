package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletetenant {
    @Given("that the admin choose to delete tenant")
    public void that_the_admin_choose_to_delete_tenant() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }

    @When("the entered tenant id is exist")
    public void the_entered_tenant_id_is_exist() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("the tenant will deleted")
    public void the_tenant_will_deleted() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("the entered tenant id is not exist int the recorded tenant")
    public void the_entered_tenant_id_is_not_exist_int_the_recorded_tenant() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Then("the message that the tenant not exist will be shown")
    public void the_message_that_the_tenant_not_exist_will_be_shown() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
