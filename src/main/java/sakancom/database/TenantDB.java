package sakancom.database;
import sakancom.entity.Tenant;
import sakancom.LoggerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TenantDB {
    private static final Logger logger = LoggerUtility.getLogger();
    static List<Tenant> tenants= new ArrayList<Tenant>();
    private TenantDB() {

        throw new IllegalStateException("Utility class");
    }
    static{

        tenants.add(new Tenant("jana@gmail","000", "0655433", "nablus", "jana", 1 , 24 ,"sport" , true,new ArrayList<>()));
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
            String spaces = "|%12s";
            String tenantInfo = String.format("|%12s", tenant.getId()) +
                    String.format(spaces, tenant.getName()) +
                    String.format(spaces, tenant.getPhone()) +
                    String.format("|%10s", tenant.getAge()) +
                    String.format("|%17s", tenant.getUniversityMajors()) +
                    String.format("|%30s", tenant.getFurniture()) + "|\n";

            logger.info(tenantInfo);
        }
    }
    public static void displayTenants(List<Tenant> tenants) {
        logger.info("-------------------------------------------------Tenant---------------------------------------------\n");
        logger.info("|     id     |    Name    |    Phone   |     Age  | University Major|         Has Furniture        |\n");
        for(Tenant t:tenants)
        {
            displayTenant(t);
        }

    }
}