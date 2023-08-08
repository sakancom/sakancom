package sakancom.entity;

import sakancom.LoggerUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Apartment {
    private static final Logger logger = LoggerUtility.getLogger();
    private int id;
    private int number;
    private int area;
    private int numofroom;
    private int numofbathrooms;
    private double rent;
    private int numOfTenant;
    private boolean isAvailable;
    private boolean balcony;
    private List<Tenant> tenant;
    private String rentPaymentDate;
    private String photo;
    private int floorNum;

    public Apartment() {
     // constructor without parameter
    }

    String word = "Apartment ";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


    public int getNumofroom() {
        return numofroom;
    }

    public void setNumofroom(int numofroom) {
        this.numofroom = numofroom;
    }

    public int getNumofbathrooms() {
        return numofbathrooms;
    }

    public void setNumofbathrooms(int numofbathrooms) {
        this.numofbathrooms = numofbathrooms;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getNumOfTenant() {
        return numOfTenant;
    }

    public void setNumOfTenant(int numOfTenant) {
        this.numOfTenant = numOfTenant;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public List<Tenant> getTenant() {

        return tenant;
    }

    public void setTenant(List<Tenant> tenant) {
        this.tenant = tenant;
    }

    public String getRentPaymentDate() {
        return rentPaymentDate;
    }

    public void setRentPaymentDate(String rentPaymentDate) {
        this.rentPaymentDate = rentPaymentDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public boolean isAvailableToRent() {
        isAvailable = tenant.size() < numOfTenant;
        return false;
    }

    public void displayInfo() {

        String balconyFlag = balcony ? "has a balcony" : "doesn't have a balcony";
        String isAvailableFlag = isAvailable ? "is available to rent" : "is not available to rent";

        logger.info(String.format("%s%d%n%d Room(s)%n%d Bathroom(s)%n%.2f sq. ft.%nRent: $%.2f per month%n%s%n%d " +
                        "Number of tenant(s)%n%s%nRent Payment Date: %s%nPhoto: %s%nFloor Number: %d%n",
                word, number, numofroom, numofbathrooms, area, rent, balconyFlag, numOfTenant, isAvailableFlag, rentPaymentDate, photo, floorNum));

        if (!tenant.isEmpty()) {
            logger.info("---------------------------------The Tenant information--------------------------------%n");
            for (Tenant t : tenant) {
                logger.info("Tenant: " + t.getName() + "%nContact: " + t.getPhone() + "%nAddress: " +
                        t.getAddress() + "%nUniversity Major: " + t.getUniversityMajors() + "%nAge: " + t.getAge() + "%n");
            }
        }
    }

    public void rentApartment(Tenant t) {
        if (numOfTenant > tenant.size()) {
            tenant.add(t);
            isAvailableToRent();
            logger.info(String.format("%s %d%nhas been rented to %s%n", word, number, t.getName()));
        } else {
            logger.info(String.format("%s %d%nis already rented%n", word, number));
        }
    }
}
