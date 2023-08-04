package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.Database.HouseDB;
import sakancom.serveses.LoginToMyAppAsTenant;

import static org.junit.Assert.assertTrue;

public class TenantShowHouses {
    LoginToMyAppAsTenant myApp;
    public TenantShowHouses(){
                myApp = new LoginToMyAppAsTenant();
                myApp.login();
    }
    @Given("that the tenant logged in")
    public void that_the_tenant_logged_in() {
        assertTrue(myApp.isLoggedIn());
    }
    @Given("the tenant want to show all houses")
    public void the_tenant_want_to_show_all_houses() {

    }
    @Then("the houses appear to him")
    public void the_houses_appear_to_him() {
        HouseDB.displayHouses(HouseDB.getHouses());
    }

}
