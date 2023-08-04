package featureSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.serveses.LoginToMyAppAsOwner;
import sakancom.serveses.LoginToMyAppAsTenant;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LogoutTenantFeatureSteps {
    LoginToMyAppAsTenant myApp ;
    public LogoutTenantFeatureSteps(){
        myApp = new LoginToMyAppAsTenant();
        myApp.login();
    }
    @Given("that the tenant choose to logout")
    public void that_the_tenant_choose_to_logout() {
        assertTrue(myApp.isLoggedIn());
    }
    @Then("the tenant will be logout")
    public void the_tenant_will_be_logout() {
        myApp.logout();
        assertFalse(myApp.isLoggedIn());
    }


    @Then("the the tenant can't logout")
    public void the_the_tenant_can_t_logout() {
        assertTrue(myApp.isLoggedIn());
    }
}
