package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class requesthouses {
    @Given("you are in admin page")
    public void you_are_in_admin_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("he see the info about the request house {string} , {string},  {string} , {string}, {string} , {string},  {string} , {string},{string} , {string},  {string} , {string}")
    public void he_see_the_info_about_the_request_house(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("select accept house")
    public void select_accept_house() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("the house will be saved in the  house list requests and the add will be successfuly ....")
    public void the_house_will_be_saved_in_the_house_list_requests_and_the_add_will_be_successfuly() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("select cancel house")
    public void select_cancel_house() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("the house will be remove successfuly ....")
    public void the_house_will_be_remove_successfuly() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }


}
