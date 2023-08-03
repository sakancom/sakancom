package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class rent {

    @Given("that the tenant is logged in")
    public void that_the_tenant_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @When("the tenant enter the order Id ={int}")
    public void the_tenant_enter_the_order_id(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @When("the house coast = {int}")
    public void the_house_coast(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the total rent in the year ={int}")
    public void the_total_rent_in_the_year(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the owner id = {int}")
    public void the_owner_id(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the invoice will be generated")
    public void the_invoice_will_be_generated() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the order will set to paid")
    public void the_order_will_set_to_paid() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("the admin tenant not exist house Id={int} to invoiced")
    public void theAdminTenantNotExistHouseIdToInvoiced(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("the order Id is not exist on the recorded ordered")
    public void theOrderIdIsNotExistOnTheRecordedOrdered() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


}
