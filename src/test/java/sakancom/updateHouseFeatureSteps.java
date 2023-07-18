package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updateHouseFeatureSteps {
    @Given("there is a House with id {int}")
    public void thereIsAHouseWithId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @When("the owner want to change the rent of the House to {double}")
    public void theownerWantToChangeTheRentOfTheHouseTo(Double double1) {
        // Write code here that turns the phrase above into concrete actions
   //     throw new io.cucumber.java.PendingException();
    }
    @Then("the House's rent should be {double} and the update done")
    public void theHouseSRentShouldBeAndTheUpdateDone(Double double1) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }



    @Given("there is a House with id equal {int}")
    public void thereIsAHouseWithIdEqual(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @When("the owner want to change the availability of the House to false")
    public void theownerWantToChangeTheAvailabilityOfTheHouseToFalse() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @Then("the House's availability should be false and the update done")
    public void theHouseSAvailabilityShouldBeFalseAndTheUpdateDone() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }



    @Given("that the owner is log in")
    public void thatTheownerIsLogIn() {
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @Given("there is House with id {int}")
    public void thereIsHouseWithId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @When("the owner want to change the tenantData of the House as table:")
    public void theownerWantToChangeTheTenantDataOfTheHouseAsTable(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("the tenantData should be null")
    public void theTenantDataShouldBeNull() {
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }



    @Given("that the owner is in system")
    public void thatTheownerIsInSystem() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @Given("the owner want to update house with id {int}")
    public void theownerWantToUpdateHouseWithId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }
    @When("the owner want to update the rent of the House to be {double}")
    public void theownerWantToUpdateTheRentOfTheHouseToBe(Double double1) {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("the update can't complete and the error message will appear")
    public void theUpdateCanTCompleteAndTheErrorMessageWillAppear() {
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }


    @Given("that the owner is log in successfully")
    public void thatTheownerIsLogInSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @Given("the owner want to update house with id equal {int}")
    public void theownerWantToUpdateHouseWithIdEqual(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
    @When("the owner want to update the availability of the House to be false")
    public void theownerWantToUpdateTheAvailabilityOfTheHouseToBeFalse() {
        // Write code here that turns the phrase above into concrete actions
   //     throw new io.cucumber.java.PendingException();
    }
    @Then("the update can't done and the error message will appear")
    public void theUpdateCanTDoneAndTheErrorMessageWillAppear() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }



    @Given("that the owner is logged in the system successfully")
    public void thatTheownerIsLoggedInTheSystemSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @Given("there is a House the owner want to update  with id  {int}")
    public void thereIsAHouseTheownerWantToUpdateWithId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }
    @When("the owner want to change the tenantData of the House to ba as the table shows")
    public void theownerWantToChangeTheTenantDataOfTheHouseToBaAsTheTableShows(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("the update can't complete and the error message will appear to owner")
    public void theUpdateCanTCompleteAndTheErrorMessageWillAppearToowner() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }
}
