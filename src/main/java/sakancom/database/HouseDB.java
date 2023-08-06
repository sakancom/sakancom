package sakancom.database;

import sakancom.entity.Apartment;
import sakancom.entity.House;
import sakancom.LoggerUtility;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class HouseDB {
    private static final List <House> houses=new ArrayList<House>();
    private static final Logger logger = LoggerUtility.getLogger();

    private HouseDB() {
        throw new IllegalStateException("Utility class");
    }

    public static void addHouse( House h) {
        houses.add(h);
    }

    public static List<House> getHouses() {

        return houses;
    }
    public static void deleteHouse(int id) {
        houses.removeIf(h -> h.getId() == id);
    }
    public static void displayHouse(House house) {
        if(house==null)
        {
            displaying();
         logger.warning("|This house is not exist                                   |\n");
            logger.info("|__________________________________________________________|\n");
        }
        else
            logger.info("id: " + house.getId() + "\n" + "the Owner:  " +house.getOwner().getName()+ "\n" + "the location: "
                    + house.getLocation() + "\n" + "the services: " + house.getServices() + "\n" + "has Furniture Window: "
                    + house.getHasFurnitureWindow() + "\n" + "the number of Apartments: " + house.getTotalApartments() + "\n"+"Photo: " + house.getPhoto() + "\n" + "the number of Floor: " + house.getNumOfFloor()+ "\n");
        displaying();
        logger.info("|Apartments in this house:\n");
        displaying();
        if (house != null && house.getApartments() != null){
        for (Apartment apartment : house.getApartments()) {
            logger.info("Apartment Number: " + apartment.getNumber() + "\n"
                    + "Area: " + apartment.getArea() + "\n"
                    + "Number of Rooms: " + apartment.getNum_of_room() + "\n"
                    + "Number of Bathrooms: " + apartment.getNum_of_bathrooms() + "\n"
                    //+ "Number of Bedrooms: " + apartment.getNumOfBedrooms() + "\n"
                    + "Rent: " + apartment.getRent() + "\n"
                    + "Total Number of Tenants: " + apartment.getNumOfTenant() + "\n"
                    + "Has a Balcony: " + (apartment.isBalcony() ? "Yes" : "No") + "\n"
                    + "Rent Payment Date: " + apartment.getRentPaymentDate() + "\n"
                    + "Photo: " + apartment.getPhoto() + "\n"
                    + "Floor Number: " + apartment.getFloorNum() + "\n");


            displaying();
        }
        }

    }
    public static void displayHouses(List<House> houses) {
        if(houses != null){
        for(House h:houses)
        {
            displayHouse(h);
        }
    }
    }
    public static void displaying(){
        logger.info("------------------------------------------------------------\n");
    }

}