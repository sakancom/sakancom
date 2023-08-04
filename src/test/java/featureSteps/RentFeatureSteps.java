package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.Entity.Apartment;
import sakancom.Entity.House;
import sakancom.Entity.Tenant;
import sakancom.LoggerUtility;
import sakancom.serveses.LoginToMyAppAsTenant;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RentFeatureSteps {
    private static final Logger logger = LoggerUtility.getLogger();

    LoginToMyAppAsTenant myApp;
    int id;
    int number;
    House h;
    Apartment a;
    Tenant t;
    ArrayList<Apartment> apartmentList = new ArrayList<>();
    public RentFeatureSteps(){
        myApp = new LoginToMyAppAsTenant();
        t = new Tenant();
        myApp.login();
        a = new Apartment();
        a.setNumOfTenant(1);
        a.setAvailable(true);
        a.setNumber(1);
        h = new House();
        h.setId(0);
        apartmentList.add(a);
        h.setApartments(apartmentList);
        a.setTenant(new ArrayList<>());
    }
    @Given("that the tenant is logged in")
    public void that_the_tenant_is_logged_in() {
       assertTrue(myApp.isLoggedIn());
    }
    @Given("the tenant want to rent the houses with id {int} and apartment number {int}")
    public void the_tenant_want_to_rent_the_houses_with_id_and_apartment_number(Integer id, Integer number) {
       this.id = id;
       this.number = number;
    }
    @Given("this apartment is available")
    public void this_apartment_is_available() {
        assertTrue(a.getisAvailable());

    }
    @Then("the tenant rent it")
    public void the_tenant_rent_it() {
        a.rentApartment(t);
    }


    @Given("this apartment is not available")
    public void this_apartment_is_not_available() {
        a.setAvailable(false);
        assertFalse(a.getisAvailable());

    }
    @Then("the tenant cannot rent it")
    public void the_tenant_cannot_rent_it() {

    }

}
