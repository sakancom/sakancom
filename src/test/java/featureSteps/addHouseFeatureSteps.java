package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.Database.HouseDB;
import sakancom.Entity.House;
import sakancom.LoggerUtility;
import sakancom.serveses.AddHouseToMyAppAsOwner;
import sakancom.serveses.AppLogger;
import sakancom.serveses.LoginToMyAppAsAdmin;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;
import static sakancom.Database.RequestToAddHouseDB.*;

public class addHouseFeatureSteps {
    LoginToMyAppAsAdmin myApp ;
    House house;
    private static Logger logger = LoggerUtility.getLogger();

    public addHouseFeatureSteps()

    {
         myApp = new LoginToMyAppAsAdmin();
         myApp.login();
         AppLogger.setLevel(logger);
    }

    @Given("that the administrator is logged in")
    public void thatTheAdministratorIsLoggedIn() {
       assertTrue(myApp.isLoggedIn());
      //  assertTrue(true);
    }
    @Given("request list have houses to rent")
    public void requestListHaveHousesToRent() {

        AddHouseToMyAppAsOwner.addHouseToRequestList(house);
        assertTrue(getHouses().size() > 0);
    }
    @Then("the houses will be saved in the Houses list with in available state")
    public void theHousesWillBeSavedInTheHousesListWithInAvailableState() {
     for(House h : getHouses()){
         HouseDB.addHouse(h);
     }
        clearTheRequestList();

    }
    @Then("the requests list will be empty")
    public void theRequestsListWillBeEmpty() {
      //  clearTheRequestList();
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
