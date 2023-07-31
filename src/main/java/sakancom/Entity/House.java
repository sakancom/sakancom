package sakancom.Entity;

import java.util.ArrayList;
import java.util.List;

// comment for test


public class House {
   private int id;
   private String address;
   private int numRooms;
   private int numBathrooms;
   private double area;
   private double rent;
   private String location;
   private List<String> services;
   private boolean isAvailable;
   private HousingOwners owner;
   private List<Tenant> tenantData;
   private boolean hasFurnitureWindow;
   private String rentPaymentDate;

   public House(int id, String address, int numRooms, int numBathrooms, double area, double rent, String location, List<String> services, boolean isAvailable, HousingOwners owner,  List<Tenant> tenantData, boolean hasFurnitureWindow, String rentPaymentDate) {
      this.id = id;
      this.address = address;
      this.numRooms = numRooms;
      this.numBathrooms = numBathrooms;
      this.area = area;
      this.rent = rent;
      this.location = location;
      this.services = new ArrayList<>(services);
      this.isAvailable = isAvailable;
      this.owner = owner;
      this.tenantData = tenantData;
      this.hasFurnitureWindow = hasFurnitureWindow;
      this.rentPaymentDate = rentPaymentDate;
   }

   public int getId() {
      return id;
   }

   public String getAddress() {
      return address;
   }

   public int getNumRooms() {
      return numRooms;
   }

   public int getNumBathrooms() {
      return numBathrooms;
   }

   public double getArea() {
      return area;
   }

   public double getRent() {
      return rent;
   }

   public String getLocation() {
      return location;
   }

   public List<String> getServices() {
      return services;
   }

   public boolean isAvailable() {
      return isAvailable;
   }

   public HousingOwners getOwner() {
      return owner;
   }



   public List<Tenant> getTenantData() {
      return tenantData;
   }

   public boolean isHasFurnitureWindow() {
      return hasFurnitureWindow;
   }

   public String getRentPaymentDate() {
      return rentPaymentDate;
   }
}
