package sakancom.Entity;

import java.util.ArrayList;

public class Apartment {
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

    public Apartment() {
    }

    public Apartment(int id,int number, int area, int numOfRoom, int numOfBathrooms, double rent, int numOfTenant, boolean balcony, ArrayList<Tenant> tenant , boolean isAvailable, String rentPaymentDate) {
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

    public boolean isAvailable() {
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
        }else isAvailable=false;
    }
    public void displayInfo() {
        String  balconyFlag, isAvailableFlag ;
        if (Balcony){
            balconyFlag = " has a balcony ";
        }else balconyFlag = " doesn't has a balcony ";

        if(isAvailable){
            isAvailableFlag = " is available to rent.. ";
        }else isAvailableFlag = " is not available to rent.. ";
        System.out.println("Apartment " + number + " - " + NumOfRoom + " Room, " + NumOfBathrooms + " bathrooms, "
                + area + " sq. ft., Rent: $" + rent + " per month" +" - "+ balconyFlag + numOfTenant +" - "+ isAvailableFlag +" - " +" Rent Payment Date: " + rentPaymentDate  );

        if (tenant.size() != 0) {
            for (Tenant t : tenant) {
                System.out.println("Tenant: " + t.getName() + " - " + ", Contact: " + t.getPhone() + ", Address: " + t.getAddress() +", University Major: " + t.getUniversityMajors()+", Age: " + t.getAge());
            }
            }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void rentApartment(Tenant t) {
        if (numOfTenant > tenant.size() ) {
            tenant.add(t);
            isAvailable();
            System.out.println("Apartment " + number + " has been rented to " + t.getName());
        } else {
            System.out.println("Apartment " + number + " is already rented.");
        }
    }


}
