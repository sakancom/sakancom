package sakancom.Entity;

import sakancom.serveses.LoginToMyAppAsOwner;

import java.util.ArrayList;
import java.util.List;

// comment for test


public class House extends LoginToMyAppAsOwner {
   private int id;
   private String location;
   private List<String> services;
   private HousingOwners owner;
   private String hasFurnitureWindow;
   private int totalApartments;
   private ArrayList<Apartment> apartments;

   public House() {

   }

   public House(int id, String location, List<String> services, HousingOwners owner, String hasFurnitureWindow, int totalApartments, ArrayList<Apartment> apartments) {

      this.id = id;
      this.location = location;
      this.services = services;
      this.owner = owner;
      this.hasFurnitureWindow = hasFurnitureWindow;
      this.totalApartments = totalApartments;
      this.apartments = apartments;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public List<String> getServices() {
      return services;
   }

   public void setServices(List<String> services) {
      this.services = services;
   }

   public HousingOwners getOwner() {
      return owner;
   }

   public void setOwner(HousingOwners owner) {
      this.owner = owner;
   }

   public String getHasFurnitureWindow() {
      return hasFurnitureWindow;
   }

   public void setHasFurnitureWindow(String hasFurnitureWindow) {
      this.hasFurnitureWindow = hasFurnitureWindow;
   }

   public int getTotalApartments() {
      return totalApartments;
   }

   public void setTotalApartments(int totalApartments) {
      this.totalApartments = totalApartments;
   }

   public ArrayList<Apartment> getApartments() {
      return apartments;
   }

   public void setApartments(ArrayList<Apartment> apartments) {
      this.apartments = apartments;
   }

   public List<Apartment> getApartment() {
      return apartments;
   }
}