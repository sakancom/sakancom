package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.Database.HouseDB;
import sakancom.Entity.House;
import sakancom.serveses.AppLogger;
import sakancom.serveses.LoginToMyAppAsAdmin;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;
import static sakancom.Database.RequestToAddHouseDB.getHouses;

public class addHouseFeatureSteps {
    LoginToMyAppAsAdmin myApp = new LoginToMyAppAsAdmin();
    House house;
    private static final Logger logger = Logger.getLogger(LoginToMyAppAsAdmin.class.getName());

    public addHouseFeatureSteps()
    {

        AppLogger.setLevel(logger);
    }

    @Given("that the administrator is logged in")
    public void thatTheAdministratorIsLoggedIn() {
       assertTrue(myApp.isLoggedIn());
      //  assertTrue(true);
    }
    @Given("request list have houses to rent")
    public void requestListHaveHousesToRent() {
        assertTrue(getHouses().size() > 0);
    }
    @Then("the houses will be saved in the Houses list with in available state")
    public void theHousesWillBeSavedInTheHousesListWithInAvailableState() {
     for(House h : getHouses()){
         HouseDB.addHouse(h);
     }
    }
    @Then("the requests list will be empty")
    public void theRequestsListWillBeEmpty() {

        assertTrue(getHouses().size() == 0);
    }
    @Given("request list dosn't have houses to rent")
    public void requestListDosnTHaveHousesToRent() {
        assertTrue(getHouses().size() == 0);

    }
    @Then("the message appear to tell the admin that request list empty")
    public void theMessageAppearToTellTheAdminThatRequestListEmpty() {
        logger.info("The request list EMPTY, you dont have houses to add");
    }
}
