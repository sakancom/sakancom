package sakancom.Database;

import sakancom.Entity.House;
import sakancom.serveses.AppLogger;

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
//    static{
//        AppLogger.setLevel(logger);
//        houses.add(new House(2, "Nablus", 4, 2, 200, 1000, "Nablus",  new ArrayList<>(List.of("Wifi", " Parking", "Garden")),true,null,  new ArrayList<>(),true, "every month"));
//
//        houses.add(new House(1, "Nablus", 4, 2, 200, 1000, "Nablus",  new ArrayList<>(List.of("Wifi", " Parking", "Garden")),true,null,  new ArrayList<>(),true, "every month"));
//    }
    public static List<House> getHouses()
    {
        return houses;
    }
    public static void displayHouse(House house) {
            logger.info("id: "+ house.getId() +"\n");
    }
    public static void displayHouses(List<House> houses) {
        logger.info("------------Houses------------");

        for(House h:houses)
        {
            displayHouse(h);
        }

    }
    public static void clearTheRequestList(){
        houses.clear();
    }
    public static void cancelRequest(int id ){
        for(House h:houses)
        {
           if(h.getId() == id){
               houses.remove(h);
           }
        }
    }
}
