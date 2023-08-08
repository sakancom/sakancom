package sakancom.entity;

import sakancom.serveses.LoginToMyAppAsOwner;

import java.util.List;



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


   public void setApartments(List<Apartment> apartments) {
      this.apartments = apartments;
   }

}