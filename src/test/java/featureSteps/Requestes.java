package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Requestes {
        @Given("you are in admin page")
        public void youAreInAdminPage() {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java.PendingException();
        }

        @When("he see the info about the request house {string} , {string},  {string} , {string}, {string} , {string},  {string} , {string},{string} , {string},  {string} , {string}")
        public void heSeeTheInfoAboutTheRequestHouse(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java.PendingException();
        }

        @When("select accept house")
        public void selectAcceptHouse() {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java.PendingException();
        }

        @Then("the house will be saved in the  house list requests and the add will be successfuly ....")
        public void theHouseWillBeSavedInTheHouseListRequestsAndTheAddWillBeSuccessfuly() {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java.PendingException();
        }

        @When("select cancel house")
        public void selectCancelHouse() {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java.PendingException();
        }

        @Then("the house will be remove successfuly ....")
        public void theHouseWillBeRemoveSuccessfuly() {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java.PendingException();
        }
}
