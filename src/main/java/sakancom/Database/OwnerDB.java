package sakancom.Database;

import sakancom.Entity.Admin;
import sakancom.Entity.House;
import sakancom.Entity.HousingOwners;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OwnerDB {
    private static final Logger logger = Logger.getLogger(HouseDB.class.getName());

    static List <HousingOwners> owners= new ArrayList<HousingOwners>();
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
        if(owner == null)
        {
            logger.warning("This owner is not exist");
        }
        else
            logger.info("id: "+ owner.getId() + " Name " + owner.getName() + "\n");
    }
    public static void displayOwners(List<HousingOwners> owners) {
        logger.info("------------Owners------------");

        for(HousingOwners o:owners)
        {
            displayOwner(o);
        }

    }
}
