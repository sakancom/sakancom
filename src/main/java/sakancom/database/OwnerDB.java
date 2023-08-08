package sakancom.database;

import sakancom.entity.HousingOwners;
import sakancom.LoggerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OwnerDB {
    private static Logger logger = LoggerUtility.getLogger();

    static List <HousingOwners> owners= new ArrayList<>();
    static HousingOwners housingOwners = new HousingOwners();
    private OwnerDB() {
        throw new IllegalStateException("Utility class");
    }
    static{

        owners.add(new HousingOwners("000","musa@gmail", "0655433", "nablus", "musa", 1));
        owners.add(new HousingOwners("000","shahd@gmail", "098866", "nablus", "shahd", 2));
    }
    public static void addOwner(HousingOwners owner) {
        owners.add(owner);
    }

    public static List<HousingOwners> getOwners() {
        return owners;
    }

    public static void displayOwner(HousingOwners owner) {
        if (owner == null) {
            logger.warning("This owner is not exist\n");
        } else {
            String spaces = "|%12s";
            String ownerInfo = String.format("|%12s", owner.getId()) +
                    String.format(spaces, owner.getName()) +
                    String.format(spaces, owner.getPhone()) +
                    String.format("|%14s", owner.getAddress()) +
                    String.format(spaces, owner.getEmail()) + "|\n";

            logger.info(ownerInfo);

        }
    }

    public static void displayOwners(List<HousingOwners> owners) {
        logger.info("----------------------------------Owners----------------------------\n");
        logger.info("|     id     |    Name    |    Phone   |    Address   |    Email   |\n");

        for(HousingOwners o:owners)
        {
            displayOwner(o);
        }

    }
}
