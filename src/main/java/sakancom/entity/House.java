package sakancom.entity;

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
   private List<Apartment> apartments;
   private String photo;
   private int numOfFloor;
   public House() {

   }

   public House(int id, String location, List<String> services, HousingOwners owner, int totalApartments,
                List<Apartment> apartments, String photo, int numOfFloor) {

      this.id = id;
      this.location = location;
      this.services = services;
      this.owner = owner;

      this.totalApartments = totalApartments;
      this.apartments = apartments;
      this.photo = photo;
      this.numOfFloor = numOfFloor;
   }

   public int getNumOfFloor() {
      return numOfFloor;
   }

   public void setNumOfFloor(int numOfFloor) {
      this.numOfFloor = numOfFloor;
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

   public List<Apartment> getApartments() {
      return apartments;
   }

   public void setApartments(ArrayList<Apartment> apartments) {
      this.apartments = apartments;
   }

   public List<Apartment> getApartment() {
      return apartments;
   }
}