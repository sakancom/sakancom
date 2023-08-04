package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.Database.HouseDB;
import sakancom.Entity.Apartment;
import sakancom.Entity.House;
import sakancom.Entity.HousingOwners;
import sakancom.Entity.Tenant;
import sakancom.LoggerUtility;
import sakancom.serveses.AppLogger;
import sakancom.serveses.LoginToMyAppAsAdmin;

import java.util.ArrayList;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class ShowHousesAdminFeatureSteps {
    LoginToMyAppAsAdmin myApp ;
    House house;
    private static Logger logger = LoggerUtility.getLogger();

    public ShowHousesAdminFeatureSteps()
    {
        myApp = new LoginToMyAppAsAdmin();
        myApp.login();
        AppLogger.setLevel(logger);
    }
    @Given("Houses list is Empty")
    public void houses_list_is_empty() {
        HouseDB.deleteHouse(1);
        assertTrue(HouseDB.getHouses().isEmpty());    }
    @Given("that the admin is logged in the app")
    public void that_the_admin_is_logged_in_the_app() {

        assertTrue(myApp.isLoggedIn());
    }
    @Given("Houses list have houses")
    public void houses_list_have_houses() {
        house = new House(1, "nablus" , null , new HousingOwners("000","new@gmail", "098866", "nablus", "new", 3),3, null, "url" ,5);
        HouseDB.addHouse(house);
        assertTrue(HouseDB.getHouses().size() > 0);
    }
    @Then("the house will appear to admin page")
    public void the_house_will_appear_to_admin_page() {
     HouseDB.displayHouses(HouseDB.getHouses());
    }



    @Then("message appear to tell the admin that is no houses to show")
    public void message_appear_to_tell_the_admin_that_is_no_houses_to_show() {
       logger.info("No Houses to show");
    }

}
