package sakancom.Database;

import sakancom.Entity.Admin;
import sakancom.Entity.House;
import sakancom.Entity.Tenant;
import sakancom.serveses.AppLogger;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class HouseDB {
    private static List <House> houses=new ArrayList<House>();
    private static final Logger logger = Logger.getLogger(HouseDB.class.getName());

    private HouseDB() {
        throw new IllegalStateException("Utility class");
    }

//    static{
//         AppLogger.setLevel(logger);
//         houses.add(new House(1, "Nablus", 4, 2, 200, 1000, "Nablus",  new ArrayList<>(List.of("Wifi", " Parking", "Garden")),true,null,  new ArrayList<>(),true, "every month"));
//    }
    public static void addHouse( House h) {
        houses.add(h);
    }

    public static List<House> getHouses() {

        return houses;
    }
    public static void deleteHouse(int id) {
        for(House h:houses)
        {
            if(h.getId() == id){
                houses.remove(h);
            }
        }
    }

    public static void displayHouse(House house) {
        if(house==null)
        {
            logger.warning("This house is not exist");
        }
        else
            logger.info("id: "+ house.getId() +"\n");
    }
    public static void displayHouses(List<House> houses) {
        for(House h:houses)
        {
            displayHouse(h);
        }

    }

}
