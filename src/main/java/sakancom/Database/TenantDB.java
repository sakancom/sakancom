package sakancom.Database;

import sakancom.Entity.HousingOwners;
import sakancom.Entity.Tenant;
import sakancom.LoggerUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TenantDB {
    private static Logger logger = LoggerUtility.getLogger();
    static List<Tenant> tenants= new ArrayList<Tenant>();
    private TenantDB() {

        throw new IllegalStateException("Utility class");
    }
    static{

        tenants.add(new Tenant("jana@gmail","000", "0655433", "nablus", "jana", 1 , 24 ,"sport" , true,new ArrayList<>(List.of("wardrobe", " sofa"))));
    }
    public static void addTenant(Tenant tenant) {
        tenants.add(tenant);
    }

    public static List<Tenant> getTenants() {
        return tenants;
    }
    public static void displayTenant(Tenant tenant) {
        if(tenant == null)
        {
            logger.warning("This tenant is not exist");
        }
        else{
            String tenantInfo = String.format("|%19s|", tenant.getId()) + String.format("%15s|", tenant.getName()) +
                    String.format("%13s|", tenant.getPhone())+String.format("%s10|", tenant.getAge())+
                    String.format("%25s|", tenant.getUniversityMajors())+String.format("%25s|", tenant.getFurniture());
            logger.info(tenantInfo+"\n");
        }
    }
    public static void displayTenants(List<Tenant> tenants) {
        logger.info("-------------------------------Tenant----------------------------\n");
        logger.info("|     id     |"+"    Name     |"+"    Phone    " +
                " |"+"       Age       |"+"    University Major     |"+"     Has furniture     \n|");
        for(Tenant t:tenants)
        {
            displayTenant(t);
        }

    }
}