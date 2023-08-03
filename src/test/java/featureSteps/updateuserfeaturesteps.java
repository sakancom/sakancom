package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.Database.HouseDB;

public class updateuserfeaturesteps {

    @Given("that I choose to update user info")
    public void thatIChooseToUpdateUserInfo() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("I select to update my phone and I enter my new phone = {string}")
    public void iSelectToUpdateMyPhoneAndIEnterMyNewPhone(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("my phone number will updated successfully")
    public void myPhoneNumberWillUpdatedSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("I select to update my address and I enter my new address = {string}")
    public void iSelectToUpdateMyAddressAndIEnterMyNewAddress(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("my address will updated successfully")
    public void myAddressWillUpdatedSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }



}
