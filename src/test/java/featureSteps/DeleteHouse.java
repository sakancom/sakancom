package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.database.HouseDB;
import sakancom.entity.House;
import sakancom.LoggerUtility;
import sakancom.serveses.AppLogger;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class DeleteHouse {
    private static Logger logger = LoggerUtility.getLogger();
    House h ;
    int id;
    public DeleteHouse()
    {
        AppLogger.setLevel(logger);
        h  = new House();
    }


    @Given("the House list have houses")
    public void the_house_list_have_houses() {
        h.setId(0);
        HouseDB.addHouse(h);

    }
    @When("the admin or owner want to delete house with id {int}")
    public void the_admin_or_owner_want_to_delete_house_with_id(Integer id) {
     this.id = id;
    }
    @Then("delete done")
    public void delete_done() {
      HouseDB.deleteHouse(0);
        assertEquals(0, HouseDB.getHouses().size());}



    @Given("that the owner or admin want to delete house with not valid id {int}")
    public void that_the_owner_or_admin_want_to_delete_house_with_not_valid_id(Integer id) {
       this.id = id;
    }
    @When("the admin or owner want to delete it")
    public void the_admin_or_owner_want_to_delete_it() {
        House house = null;
        for(House h : HouseDB.getHouses()){  if(h.getId() == id){house = h;}}
        assertNull(house);
    }
    @Then("message appear to tell the them that is no house with this id")
    public void message_appear_to_tell_the_them_that_is_no_house_with_this_id() {
       logger.info("No house with this id");
    }



}
