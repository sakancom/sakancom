package sakancom.Database;

import sakancom.Entity.HousingOwners;
import sakancom.Entity.Tenant;
import sakancom.LoggerUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TenantDB {
    public static final Logger logger = LoggerUtility.getLogger();

    static List<Tenant> tenants= new ArrayList<Tenant>();
    private TenantDB() {

        throw new IllegalStateException("Utility class");
    }
    static{

        tenants.add(new Tenant("jana@gmail","000", "0655433", "nablus", "jana", 1 , 24 ,"sport"));
    }
    public static void addTenant(Tenant tenant) {
        tenants.add(tenant);
    }

    public static List<Tenant> getTenants() {
        return tenants;
    }
    public static void displayTenant(Tenant tenant) {
        if (tenant == null) {
            logger.warning("This tenant is not exist");
        } else {
            String tenantInfo = String.format("|%32d|", tenant.getId()) + String.format("%30s|", tenant.getName());
           logger.info(tenantInfo+"\n");
        }
    }

    public static void displayTenants(List<Tenant> tenants) {
        logger.info("-------------------------------Tenant----------------------------\n");
        logger.info("|               id               |"+"              Name            |\n");
        for(Tenant t:tenants)
        {
            displayTenant(t);
        }

    }
}
