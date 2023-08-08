package featureSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.database.RequestToAddHouseDB;
import sakancom.entity.Apartment;
import sakancom.entity.House;
import sakancom.entity.HousingOwners;
import sakancom.serveses.LoginToMyAppAsOwner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class RequestFeatureSteps {
    LoginToMyAppAsOwner myApp ;
    House house;
    public RequestFeatureSteps(){
        myApp = new LoginToMyAppAsOwner();
        myApp.login();
    }
    @Given("that the owner is loged in")
    public void that_the_owner_is_loged_in() {
       assertTrue(myApp.isLoggedIn());
    }
    @Given("there is a house with id {int},location {string}, services null , owner null , totalApartments {int} ,apartments null , photo {string} and numOfFloor {int}")
    public void there_is_a_house_with_id_location_services_null_owner_null_total_apartments_apartments_null_photo_and_num_of_floor(int id, String location, List<String> services, HousingOwners owner, int totalApartments, ArrayList<Apartment> apartments, String photo , int numOfFloor) {
        house = new House();
        house.setId(id);
        house.setLocation(location);
        house.setServices(services);
        house.setOwner(owner);
        house.setTotalApartments(totalApartments);
        house.setApartments(apartments);
        house.setPhoto(photo);
        house.setNumOfFloor(numOfFloor);    }
    @Then("the House will be saved in the request list")
    public void the_house_will_be_saved_in_the_request_list() {
        RequestToAddHouseDB.addHouse(house);
    }



    @And("there is a house with id {int}, location {string}, services {string}, owner {string}, totalApartments {int}, apartments {string}, photo {string} and numOfFloor {int}")
    public void thereIsAHouseWithIdLocationServicesOwnerTotalApartmentsApartmentsPhotoAndNumOfFloor(int id, String location, String services, String owner, int totalApartments, String apartments, String photo , int numOfFloor) {
        house = new House();
        house.setId(id);
        house.setLocation(location);
        house.setServices(null);
        house.setOwner(null);
        house.setTotalApartments(totalApartments);
        house.setApartments(null);
        house.setPhoto(photo);
        house.setNumOfFloor(numOfFloor);
    }
}
