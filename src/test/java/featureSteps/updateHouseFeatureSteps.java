package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.database.HouseDB;
import sakancom.entity.Apartment;
import sakancom.LoggerUtility;
import sakancom.serveses.AppLogger;
import sakancom.serveses.LoginToMyAppAsOwner;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class updateHouseFeatureSteps {
    private static final Logger logger = LoggerUtility.getLogger();
    LoginToMyAppAsOwner loginToMyAppAsOwner;
    Apartment apartment = new Apartment();
    String password, email;

    public updateHouseFeatureSteps() {
        loginToMyAppAsOwner = new LoginToMyAppAsOwner();
        loginToMyAppAsOwner.login();
        AppLogger.setLevel(logger);
    }

    @Given("that the owner is logged in")
    public void thatTheOwnerIsLoggedIn() {

        assertTrue(loginToMyAppAsOwner.isLoggedIn());

    }

    @Given("there is a House with id {int}")
    public void thereIsAHouseWithId(Integer id) {

        loginToMyAppAsOwner = HouseDB.getHouses().get(id);
    }

    @When("the owner want to change the rent of the House to {double}")
    public void theownerWantToChangeTheRentOfTheHouseTo(Double rent) {
        apartment.setRent(rent);


    }

    @Then("the House's rent should be {double} and the update done")
    public void theHouseSRentShouldBeAndTheUpdateDone(Double rent) {

        apartment.setRent(rent);

    }


    @Given("that the owner is logged in the system")
    public void thatTheOwnerIsLoggedInTheSystem() {

        assertTrue(loginToMyAppAsOwner.isLoggedIn());
    }


    @Given("there is a House with id equal {int}")
    public void thereIsAHouseWithIdEqual(Integer id) {

        loginToMyAppAsOwner = HouseDB.getHouses().get(id);

    }

    @When("the owner want to change the availability of the House to false")
    public void theownerWantToChangeTheAvailabilityOfTheHouseToFalse() {

        apartment.setAvailable(false);
    }

    @Then("the House's availability should be false and the update done")
    public void theHouseSAvailabilityShouldBeFalseAndTheUpdateDone() {
        // Write code here that turns the phrase above into concrete actions
        //    throw new io.cucumber.java.PendingException();
        apartment.setAvailable(false);
    }

    @When("the owner want to change the number of the tenant to {int}")
    public void the_owner_want_to_change_the_number_of_the_tenant_to(Integer number) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        apartment.setNumOfTenant(number);
    }

    @Then("the update done")
    public void the_update_done() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
}
}