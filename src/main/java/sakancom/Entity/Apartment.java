package sakancom.Entity;

import sakancom.LoggerUtility;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Apartment {
    private static Logger logger = LoggerUtility.getLogger();
    private int id;
    private int number;
    private int area;
    private int NumOfRoom;
    private int NumOfBathrooms;
    private double rent;
    private int numOfTenant;
    private boolean isAvailable;
    private boolean Balcony;
    private ArrayList <Tenant> tenant;
    private String rentPaymentDate;
    private String photo;
    private int floorNum ;

    public Apartment() {
    }

    public Apartment(int id,int number, int area, int numOfRoom, int numOfBathrooms, double rent, int numOfTenant, boolean balcony, ArrayList<Tenant> tenant , boolean isAvailable, String rentPaymentDate , String photo , int floorNum) {
        this.id = number;
        this.number = number;
        this.area = area;
        NumOfRoom = numOfRoom;
        NumOfBathrooms = numOfBathrooms;
        this.rent = rent;
        this.numOfTenant = numOfTenant;
        this.Balcony = balcony;
        this.tenant = tenant;
        this.isAvailable = isAvailable;
        this.rentPaymentDate =  rentPaymentDate;
        this.photo = photo;
        this.floorNum = floorNum;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId() {
        return id;
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

    public int getNumOfRoom() {
        return NumOfRoom;
    }

    public void setNumOfRoom(int numOfRoom) {
        NumOfRoom = numOfRoom;
    }

    public int getNumOfBathrooms() {
        return NumOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        NumOfBathrooms = numOfBathrooms;
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

    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isBalcony() {
        return Balcony;
    }

    public void setBalcony(boolean balcony) {
        Balcony = balcony;
    }

    public ArrayList<Tenant> getTenant() {
        return tenant;
    }

    public void setTenant(ArrayList<Tenant> tenant) {
        this.tenant = tenant;
    }

    public String getRentPaymentDate() {
        return rentPaymentDate;
    }

    public void setRentPaymentDate(String rentPaymentDate) {
        this.rentPaymentDate = rentPaymentDate;
    }

    public void isAvailableToRent() {
        if (tenant.size()< numOfTenant) {
            isAvailable = true;
        }else isAvailable = false;
    }
    public void displayInfo() {

        String  balconyFlag, isAvailableFlag ;
        if (Balcony){
            balconyFlag = "has a balcony ";
        }
        else balconyFlag = "doesn't has a balcony ";

        if(isAvailable){
            isAvailableFlag = "is available to rent.. ";
        }else isAvailableFlag = "is not available to rent.. ";
       logger.info("Apartment " + number + "\n" + NumOfRoom + " Room \n" + NumOfBathrooms + " Bathrooms \n"
                + area + " sq. ft.\nRent: $" + rent + " per month \n" + balconyFlag+"\n" + numOfTenant+" Number of tenant \n" +
               isAvailableFlag +"\nRent Payment Date: " + rentPaymentDate + "\n" +"Photo: "+photo+"\n"+"Floor Number: "+floorNum+"\n");


        if (tenant.size() != 0) {

            logger.info("---------------------------------The Tenant information--------------------------------\n");
            for (Tenant t : tenant) {

               logger.info("Tenant: " + t.getName() + "\nContact: " + t.getPhone() + "\nAddress: " +
                        t.getAddress() +"\nUniversity Major: " + t.getUniversityMajors()+"\nAge: " + t.getAge()+ "\n");
            }
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void rentApartment(Tenant t) {
        if (numOfTenant > tenant.size()) {
            tenant.add(t);
            isAvailableToRent();
           logger.info("Apartment " + number + "\nhas been rented to " + t.getName() + "\n");
        } else {
            logger.info("Apartment " + number + "\nis already rented\n");
        }
    }
}
