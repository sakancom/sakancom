package sakancom.Entity;

import java.util.ArrayList;
import java.util.List;

// comment for test


public class House {
   private int id;
   private String location;
   private List<String> services;
   private HousingOwners owner;
   private int totalApartments;
   private ArrayList <Apartment> apartments;
   private int numOfFloor;
   private String photo;

   public House() {

   }

   public House(int id, String location, List<String> services, HousingOwners owner, int totalApartments, ArrayList<Apartment> apartments , int numOfFloor , String photo) {

      this.id = id;
      this.location = location;
      this.services = services;
      this.owner = owner;
      this.totalApartments = totalApartments;
      this.apartments = apartments;
      this.numOfFloor = numOfFloor;
      this.photo = photo;
   }

   public String getPhoto() {
      return photo;
   }

   public void setPhoto(String photo) {
      this.photo = photo;
   }

   public int getNumOfFloor() {
      return numOfFloor;
   }

   public void setNumOfFloor(int numOfFloor) {
      this.numOfFloor = numOfFloor;
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
}
