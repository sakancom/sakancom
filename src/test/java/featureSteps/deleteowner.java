package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteowner {

    @Given("that the admin choose to delete owner")
    public void that_the_admin_choose_to_delete_owner() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("the entered owner id is exist")
    public void the_entered_owner_id_is_exist() {
        // Write code here that turns the phrase above into concrete actions
        //  throw new io.cucumber.java.PendingException();
    }
    @Then("the owner will deleted")
    public void the_owner_will_deleted() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


    @When("the entered owner id is not exist int the recorded owner")
    public void theEnteredOwnerIdIsNotExistIntTheRecordedOwner() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the message that the owner not exist will be shown")
    public void theMessageThatTheOwnerNotExistWillBeShown() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }



}
