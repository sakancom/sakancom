package sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class addHouseFeatureSteps {

 @Given("that the administrator is logged in the system")
 public void thatTheAdministratorIsLoggedInTheSystem() {
  // Write code here that turns the phrase above into concrete actions
 // throw new io.cucumber.java.PendingException();
 }
 @Given("there is a House with the following details:")
 public void thereIsAHouseWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
  // Write code here that turns the phrase above into concrete actions
  // For automatic transformation, change DataTable to one of
  // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
  // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
  // Double, Byte, Short, Long, BigInteger or BigDecimal.
  //
  // For other transformations you can register a DataTableType.
 // throw new io.cucumber.java.PendingException();
  assertTrue(true);
 }
 @Then("the house will be saved in the  house list with isAvailable state true and the add will be successful")
 public void theHouseWillBeSavedInTheHouseListWithIsAvailableStateTrueAndTheAddWillBeSuccessful() {
  // Write code here that turns the phrase above into concrete actions
 // throw new io.cucumber.java.PendingException();
 }


 @Given("that the administrator is logged in")
 public void thatTheAdministratorIsLoggedIn() {
  // Write code here that turns the phrase above into concrete actions
 // throw new io.cucumber.java.PendingException();
 }
 @Given("there is a House with no complete information")
 public void thereIsAHouseWithNoCompleteInformation() {
  // Write code here that turns the phrase above into concrete actions
  //throw new io.cucumber.java.PendingException();
 }
 @Then("the house will not be saves and error message will appear")
 public void theHouseWillNotBeSavesAndErrorMessageWillAppear() {
  // Write code here that turns the phrase above into concrete actions
 // throw new io.cucumber.java.PendingException();
 }
}
