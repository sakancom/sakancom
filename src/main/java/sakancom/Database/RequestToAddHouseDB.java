package sakancom.Database;


import sakancom.Entity.House;
import sakancom.LoggerUtility;
import sakancom.serveses.AppLogger;
import sakancom.Entity.HousingOwners;
import sakancom.Entity.Apartment;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RequestToAddHouseDB {
    private static List<House> houses = new ArrayList<House>();
    private static final Logger logger = LoggerUtility.getLogger();
    static HousingOwners housingOwners = new HousingOwners();

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
        logger.info("id: " + house.getId() + "\n" + "the Owner: " + house.getOwner().getName()+ "\n" + "the location: "
                + house.getLocation() + "\n" + "the services: " + house.getServices() + "\n" + "has Furniture Window: "
                + house.getHasFurnitureWindow() + "\n" + "the number of Apartments: " + house.getTotalApartments() + "\n");

        logger.info("------------------------\n");
        logger.info("Apartments in this house:\n");
        for (Apartment apartment : house.getApartments()) {
        logger.info("------------------------\n");
            logger.info("Apartment Number: " + apartment.getNumber() + "\n"
                    + "Area: " + apartment.getArea() + "\n"
                    + "Number of Rooms: " + apartment.getNumOfRoom() + "\n"
                    + "Number of Bathrooms: " + apartment.getNumOfBathrooms() + "\n"
                    //+ "Number of Bedrooms: " + apartment.getNumOfBedrooms() + "\n"
                    + "Rent: " + apartment.getRent() + "\n"
                    + "Total Number of Tenants: " + apartment.getNumOfTenant() + "\n"
                    + "Has a Balcony: " + (apartment.isBalcony() ? "Yes" : "No") + "\n"
                    + "Rent Payment Date: " + apartment.getRentPaymentDate() + "\n");
            logger.info("------------------------\n");
        }

    }

    public static void displayHouses(List<House> houses) {
        logger.info("------------Houses------------\n");

        for(House h:houses)
        {
            displayHouse(h);
        }

    }
    public static void clearTheRequestList(){
        houses.clear();
    }

    public static void cancelRequest(int id ){
        houses.removeIf(h -> h.getId() == id);
    }
}
