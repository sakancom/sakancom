package featureSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sakancom.Database.TenantDB;
import sakancom.Entity.HousingOwners;
import sakancom.Entity.Tenant;
import sakancom.LoggerUtility;
import sakancom.serveses.AppLogger;
import sakancom.serveses.LoginToMyAppAsAdmin;
import sakancom.serveses.LoginToMyAppAsOwner;
import sakancom.serveses.LoginToMyAppAsTenant;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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
        tenant = new Tenant(email,password, phone, address, name, id , age ,universityMajors , true,new ArrayList<>(List.of("wardrobe", " sofa")));

    }
}