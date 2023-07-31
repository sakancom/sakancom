package sakancom.Database;

import sakancom.Entity.House;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RequestToAddHouseDB {
    private static List <House> houses=new ArrayList<House>();
    private static final Logger logger = Logger.getLogger(HouseDB.class.getName());

    private RequestToAddHouseDB() {
        throw new IllegalStateException("Utility class");
    }

    public static void addHouse(House h) {
        houses.add(h);
    }

    public static List<House> getHouses() {
        return houses;
    }
    public static void displayHouse(House house) {
            logger.info("id: "+ house.getId());
    }
    public static void displayHouses(List<House> houses) {
        for(House h:houses)
        {
            displayHouse(h);
        }

    }
}
