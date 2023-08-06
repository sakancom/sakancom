package featureSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.Database.OwnerDB;
import sakancom.Entity.HousingOwners;
import sakancom.LoggerUtility;
import sakancom.serveses.LoginToMyAppAsOwner;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class ShowOwnerProfile {
    LoginToMyAppAsOwner myApp;
    HousingOwners owner;
    private static Logger logger = LoggerUtility.getLogger();
    public ShowOwnerProfile() {
        myApp = new LoginToMyAppAsOwner();
        myApp.login();
    }

    @Given("that the owner is log in")
    public void that_the_owner_is_log_in() {
        assertTrue(myApp.isLoggedIn());
        logger.info("\n");
    }



    @Then("the owner profile appear with his information")
    public void the_owner_profile_appear_with_his_information() {
        OwnerDB.displayOwner(owner);
    }

    @And("the owner has information password {string} ,email {string} , phone {string},address {string}, name {string}, id {int};")
    public void theOwnerHasInformationPasswordEmailPhoneAddressNameId(String password, String email, String phone, String address,String name, Integer id) {
        owner = new HousingOwners(password,email, phone, address, name, id);

    }
}