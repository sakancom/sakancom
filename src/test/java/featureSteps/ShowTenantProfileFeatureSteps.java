package featureSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.database.TenantDB;
import sakancom.entity.Tenant;
import sakancom.serveses.LoginToMyAppAsTenant;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ShowTenantProfileFeatureSteps {
    LoginToMyAppAsTenant myApp;
    Tenant tenant;

    public ShowTenantProfileFeatureSteps() {
        myApp = new LoginToMyAppAsTenant();
        myApp.login();
    }

    @Given("that the tenant is log in")
    public void that_the_tenant_is_log_in() {
        assertTrue(myApp.isLoggedIn());

    }

    @Then("the tenant profile appear with his information")
    public void the_tenant_profile_appear_with_his_information() {
        TenantDB.displayTenant(tenant);
    }



    @And("the tenant has information email {string},password {string}, phone {string},address {string},name {string}, id {int} , age {int} ,universityMajors {string} , hasFurnitureWindow {string},furniture {string});")
    public void theTenantHasInformationEmailPasswordPhoneAddressNameIdAgeUniversityMajorsHasFurnitureWindowFurniture(String email, String password, String phone, String address, String name, int id, int age, String universityMajors , String hasFurnitureWindow,String furniture) {
        tenant = new Tenant(email,password, phone, address, name, id , age ,universityMajors , true,new ArrayList<>());

    }
}