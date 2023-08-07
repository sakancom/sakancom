package sakancom;

import sakancom.database.*;
import sakancom.entity.*;
import sakancom.serveses.LoginToMyAppAsAdmin;
import sakancom.serveses.LoginToMyAppAsOwner;
import sakancom.serveses.LoginToMyAppAsTenant;

import java.util.*;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = LoggerUtility.getLogger();
    static Apartment apartment = new Apartment();
    List<House> houses = HouseDB.getHouses();
    static Apartment newApartment = new Apartment();

    public static void menu(){
            displayupline();
            logger.info("|       Welcome to Sakantcom Services System :)     |\n");
            logger.info("| 1-If you want to login as an admin                |\n");
            logger.info("| 2-If you want to login as an owner                |\n");
            logger.info("| 3-If you want to login as an tenant               |\n");
            logger.info("|___________________________________________________|\n");
    }

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int option = 0;
        String email;
        String password;
        while(true) {
            try {
                menu();
                option = in.nextInt();
            } catch (InputMismatchException e) {
              displayupline();
             displayEnterValidNumber();
                displaydownline();
                in.nextLine();
                continue;
            }
////////////////////////////////////////////////////////////Admin////////////////////////////////////////////
            displayupline();
         logger.warning("|             WELCOME TO LOGIN PAGE                |\n");
         displaydownline();

            logger.info("Enter your email:");
            email = in.next();
            logger.info("Enter your password:");
            password = in.next();

            //Admin page:

            if (option == 1) {
                LoginToMyAppAsAdmin adminApp = new LoginToMyAppAsAdmin();
                Admin admin = new Admin(email ,password) ;
                adminApp.loggInCheck(email,password);
                if (adminApp.isLoggedIn()){
                    for(Admin a : AdminDB.getAdmins()){
                        if(a.getEmail().equals(email)){
                             admin = a;
                        }
                    }
                    logger.info("WELCOME Admin "+ admin.getEmail()+ "\n");
                    while (true) {
                        displayupline();
                        logger.info("|       Welcome to Admin page :)                   |\n");
                        logger.info("| 1- Requests                                      |\n");
                        logger.info("| 2- Owners                                        |\n");
                        logger.info("| 3- Tenant                                        |\n");
                        logger.info("| 4- Houses                                        |\n");
                        logger.info("| 5- Log Out                                       |\n");
                        displaydownline();
                        int optionadmin = in.nextInt();
                     //////////Request/////////
                           if(optionadmin == 1) {
                               RequestToAddHouseDB.displayHouses(RequestToAddHouseDB.getHouses());
                               while (true) {
                                   displayupline();
                                   logger.info("|       Welcome to Requests Options :)             |\n");
                                   logger.info("| 1- Cancel Request                                |\n");
                                   logger.info("| 2- Add Requests                                  |\n");
                                   logger.info("| 3- Back                                          |\n");
                                   displaydownline();
                                   optionadmin = in.nextInt();
                                   //cancel
                                   if (optionadmin == 1) {
                                       displayline();
                                       logger.info("|  Please enter the id of the house to cancel it :)  |\n");
                                       displayed();
                                       int id = in.nextInt();
                                       RequestToAddHouseDB.cancelRequest(id);
                                       RequestToAddHouseDB.displayHouses(RequestToAddHouseDB.getHouses());
                                       displayline();
                                       logger.info("| The cancel Done!                                   |\n");
                                       displayed();
                                   }
                                   //Add
                                   else if (optionadmin == 2) {
                                       for (House h : RequestToAddHouseDB.getHouses()) {
                                           HouseDB.addHouse(h);
                                       }
                                       RequestToAddHouseDB.clearTheRequestList();
                                       displayline();
                                       logger.info("|            The houses added Successfully! :)       |\n");
                                       displayed();
                                   }
                                   else if (optionadmin == 3) {
                                       break;
                                   }
                                   else {
                                       displayline();
                                       displayEnterValidNumber();
                                       displayed();
                                   }
                               }
                           }
                      //////////Request/////////
                      ///////////Owners/////////
                        else if(optionadmin == 2){
                            OwnerDB.displayOwners(OwnerDB.getOwners());
                        }
                      ///////////Owners/////////
                      ///////////Tenants/////////
                        else if (optionadmin == 3) {
                            TenantDB.displayTenants(TenantDB.getTenants());
                        }
                      ///////////Tenants/////////
                        else if (optionadmin == 4) {
                            HouseDB.displayHouses(HouseDB.getHouses());
                            while(true) {
                                logger.info("---------------Houses Option---------------\n");
                                logger.info("| 1- Delete House                         |\n");
                                logger.info("| 2- Back                                 |\n");
                                logger.info(" ----------------------------------------- \n");
                                option = in.nextInt();
                                if (option == 1) {
                                    displayline();
                                    logger.info("|Please Enter the ID of the House you want to Delete.|\n");
                                    displayed();

                                    int id = in.nextInt();
                                    HouseDB.deleteHouse(id);
                                    logger.info("Delete Done..\n");
                                    HouseDB.displayHouses(HouseDB.getHouses());
                                } else if (option == 2) {
                                    break;
                                } else {
                                    logger.info("______________________________________________________\n");
                                    displayEnterValidNumber();
                                    logger.info("|_____________________________________________________|\n");

                                }
                            }
                        }
                        else if(optionadmin==5){
                            logger.info("Exiting the program. Goodbye!\n");
                            break;
                        }
                        else {
                            logger.info("______________________________________________________\n");
                               displayEnterValidNumber();
                            logger.info("|_____________________________________________________|\n");
                        }
                    }
                }
                else {
                    adminApp.errorInLogin();
                }
            }
/////////////////////////////////////////Owner page///////////////////////////////////////////////////////////
            else if (option == 2) {
                HousingOwners owner = new HousingOwners();
                LoginToMyAppAsOwner ownerApp = new LoginToMyAppAsOwner();
                ownerApp.loggInCheck(email,password);
                if (ownerApp.isLoggedIn()){
                    for(HousingOwners o : OwnerDB.getOwners()){
                        if(o.getEmail().equals(email)){
                          owner = o;
                        }
                    }
                    logger.info("Welcome Owner "+ owner.getName() +"\n");
                    while (true) {
                        displayupline();
                        logger.info("|              Welcome to Owners Options           |\n");
                        logger.info("| 1- Add House                                     |\n");
                        logger.info("| 2- My Houses                                     |\n");
                        logger.info("| 3- My Profile                                    |\n");
                        logger.info("| 4- log out                                       |\n");
                        displaydownline();
                        int optionowner = in.nextInt();
                         if(optionowner == 1){
                            House newHouse = new House();
                            newHouse.setOwner(owner);

                            logger.info("Please enter the information about new house you want to add \n");
                            logger.info("--the Id :");
                            newHouse.setId(in.nextInt());

                            logger.info("--the location :");
                            String location = in.next();
                            newHouse.setLocation(location);

                            logger.info("--the number of services :");
                            int numOfServices = in.nextInt();

                            List<String > services = new ArrayList<>();
                            logger.info("--the  services :");
                            while (numOfServices > 0  ){
                            services.add(in.next());
                                numOfServices --;
                            }
                            newHouse.setServices(services);

                            logger.info("--Add Photo:");
                            String photo = in.next();
                            newHouse.setPhoto(photo);

                             logger.info("--The Number of Floors:");
                             int numFloor = in.nextInt();
                             newHouse.setNumOfFloor(numFloor);

                            logger.info("--the number of Apartments: ");
                            newHouse.setTotalApartments(in.nextInt());

                            ArrayList<Apartment> apartments = new ArrayList<>();
                            logger.info("\n---------Please enter the details of etch Apartment:------------\n");
                            logger.info("_____________________details of etch Apartment___________________\n");
                            int totalApartments = newHouse.getTotalApartments();
                            while(totalApartments > 0){
                                Apartment newApartment = new Apartment();
                                logger.info("--the Id of Apartment :");
                                newApartment.setNumber(in.nextInt());

                                logger.info("--the area of Apartment :");
                                newApartment.setArea(in.nextInt());

                                logger.info("--the Number of Room :");
                                newApartment.setNumofroom(in.nextInt());

                                logger.info("--the Number of Bathrooms :");
                                newApartment.setNumofbathrooms(in.nextInt());

                                logger.info("--the Rent :");
                                newApartment.setRent(in.nextInt());

                                logger.info("--the Total Number of Tenants: ");
                                newApartment.setNumOfTenant(in.nextInt());

                                logger.info("--Has a Balcony ?(yes or no): ");
                                String balcony = in.next();


                                newApartment.setBalcony(balcony.equalsIgnoreCase("yse"));
                                logger.info("--The Floor's Number ");
                                newApartment.setFloorNum(in.nextInt());

                                newApartment.setTenant(new ArrayList<>());
                                newApartment.setAvailable(true);
                                logger.info("--Rent Payment Date: ");
                                newApartment.setRentPaymentDate(in.next());
                                apartments.add(newApartment);
                                totalApartments--;
                            }
                             displayline();
                             logger.info("| Please wait until the admin accept your house :)   |\n");
                             displayed();
                            newHouse.setApartments(apartments);
                            RequestToAddHouseDB.addHouse(newHouse);
                        }
                         else if(optionowner == 2) {
                             List<House> ownerHouses = new ArrayList<>();
                             for (House house : HouseDB.getHouses()) {
                                 if (house.getOwner().getEmail().equals(email)) {
                                     ownerHouses.add(house);
                                 }
                             }
                             if (ownerHouses.isEmpty()) {
                                 logger.info("You have no houses!\n");
                             } else {
                                 logger.info(String.format("--------%s's Houses --------%n", owner.getName()));
                                 for(House h : HouseDB.getHouses()) {
                                     if (h.getOwner().getEmail().equals(owner.getEmail())) {
                                         HouseDB.displayHouse(h);
                                     }
                                 }
                                 while (true) {
                                     logger.info("\n");
                                     logger.info("------------House Options--------------\n");
                                     logger.info("| 1- Delete House                     |\n");
                                     logger.info("| 2- Update House                     |\n");
                                     logger.info("| 3- Show Details of specific House   |\n");
                                     logger.info("| 4- Back                             |\n");
                                     logger.info(" --------------------------------------\n");
                                     int innerOption = in.nextInt();
                                     if (innerOption == 1) {
                                         logger.info("______________________________________________________________________\n");
                                      logger.warning("|Please Enter the House ID of the House you want to delete :)        |\n");
                                         displaydowntallline();
                                         int housemaid = in.nextInt();
                                         boolean isHouseDeleted = false;
                                         Iterator<House> iterator = HouseDB.getHouses().iterator();
                                         while (iterator.hasNext()) {
                                             House house = iterator.next();
                                             if (house.getId() == housemaid && house.getOwner().getEmail().equals(email)) {
                                                 iterator.remove();
                                                 isHouseDeleted = true;
                                                 break;
                                             }
                                         }
                                        display();
                                         if (isHouseDeleted) {
                                      logger.warning("|   Delete Done                                          |\n");
                                         } else {
                                      logger.warning("|   House not found                                      |\n");
                                         }
                                         displaying();

// Retrieve the updated list of houses owned by the specific owner
                                         List<House> ownerHouses2 = new ArrayList<>();
                                         for (House house : HouseDB.getHouses()) {
                                             if (house.getOwner().getEmail().equals(email)) {
                                                 ownerHouses2.add(house);
                                             }
                                         }

                                         if (ownerHouses2.isEmpty()) {
                                             logger.info("You have no houses !\n");
                                         }
                                     }
                                         else if (innerOption == 2) {
                                         display();
                                      logger.warning("|Please Enter the Id of the House you want to update:)   |\n");
                                         displaying();

                                         int houseId = in.nextInt();
                                         House selectedHouse = null;
                                         if (HouseDB.getHouses().isEmpty())
                                         {
                                             logger.warning("No houses found in the database.\n");
                                         } else {
                                             for (House house : HouseDB.getHouses()) {
                                                 if (house.getId() == houseId && house.getOwner().getEmail().equals(email)) {
                                                     selectedHouse = house;
                                                     break;
                                                 }
                                             }
                                             if (selectedHouse != null) {
                                                 logger.info("---------------Update Product----------------\n");
                                                 logger.info("|1- Change rent                             |\n");
                                                 logger.info("|2- Change services                         |\n");
                                                 logger.info("|3- Change tenant number                    |\n");
                                                 logger.info("|4- Cancel                                  |\n");
                                                 logger.info(" --------------------------------------------\n");

                                                 option = in.nextInt();
                                                 if (option == 1) {
                                                     logger.info("Please enter the Apartment ID you want to update: ");
                                                     int apartmentId = in.nextInt();
                                                     Apartment selectedApartment = null;

                                                     for (Apartment apartment : selectedHouse.getApartment()) {
                                                         if (apartment.getNumber() == apartmentId) {
                                                             selectedApartment = apartment;
                                                             break;
                                                         }
                                                     }

                                                     if (selectedApartment != null) {
                                                         logger.info("Please enter the new rent: ");
                                                         int newRent = in.nextInt();
                                                         selectedApartment.setRent(newRent);
                                                         HouseDB.displayHouse(selectedHouse);
                                                     } else {
                                                         logger.info(String.format("Apartment with ID %d not found in the house with ID %d!", apartmentId, houseId));

                                                     }

                                                 } else if (option == 2) {
                                                     logger.info("Please enter the House ID you want to update the services for: ");
                                                     int houseid = in.nextInt();
                                                     House selectedHouseforupdate = null;

                                                     for (House house : ownerHouses) {
                                                         if (house.getId() == houseid) {
                                                             selectedHouseforupdate = house;
                                                             break;
                                                         }
                                                     }

                                                     if (selectedHouseforupdate != null) {
                                                         logger.info("Please enter the new number of services: ");
                                                         int numOfServices = in.nextInt();
                                                         List<String> services = new ArrayList<>();

                                                         logger.info("Enter the services:");
                                                         for (int i = 0; i < numOfServices; i++) {
                                                             services.add(in.next());
                                                         }

                                                         selectedHouseforupdate.setServices(services);
                                                         HouseDB.displayHouse(selectedHouse);
                                                     } else {
                                                         logger.info(String.format("House with ID %s not found or doesn't belong to you!", houseid));
                                                     }
                                                 } else if (option == 3) {
                                                     logger.info("Please enter the Apartment ID you want to update: ");
                                                     int apartmentId = in.nextInt();
                                                     Apartment selectedApartment = null;

                                                     for (Apartment apartment : selectedHouse.getApartment()) {
                                                         if (apartment.getNumber() == apartmentId) {
                                                             selectedApartment = apartment;
                                                             break;
                                                         }
                                                     }

                                                     if (selectedApartment != null) {
                                                         logger.info("Please enter the new number of tenants: ");
                                                         int numOfTenants = in.nextInt();
                                                         selectedApartment.setNumOfTenant(numOfTenants);
                                                         HouseDB.displayHouse(selectedHouse);
                                                     } else {
                                                         logger.info(String.format("Apartment with ID %d not found in the house with ID %d!", apartmentId, houseId));
                                                     }
                                                 } else if (option == 4) {
                                                     break;
                                                 }
                                             }
                                         }
                                     }
                                         else if(innerOption == 3) {
                                         display();
                                         logger.warning("|Please Enter the Id of the House you want to show       |\n");
                                        displaying();
                                         int id = in.nextInt();
                                         for(House h : HouseDB.getHouses()) {
                                             if(h.getId() == id){
                                                 HouseDB.displayHouse(h);
                                             }
                                         }
                                         logger.info("_______________________________________________________________\n");
                                      logger.warning("|Please Enter the Floor's Number to show the Apartments on it |\n");
                                         logger.info("|_____________________________________________________________|\n");
                                         int floorNum = in.nextInt();
                                         for(House h : HouseDB.getHouses()){
                                             if(h.getId() == id){
                                                 for(Apartment a : h.getApartments()){
                                                     if(a.getFloorNum() == floorNum){
                                                         a.displayInfo();
                                                     }
                                                 }
                                             }
                                         }

                                     } else if(innerOption == 4){
                                             break;
                                     }
                                 }
                             }
                         }
                         else if (optionowner == 3) {
                            logger.warning("------- "+email+" Profile -------\n");
                             logger.info("|          id        |"+"         Name       |"+"  " +
                                     "       Phone      |"+"       address      " +
                                     "|"+"        email       |\n");
                            OwnerDB.displayOwner(owner);
                        }
                         else if (optionowner==4) {
                            break;

                        }
                        else {
                            displayupline();
                             displayEnterValidNumber();
                            displaydownline();
                        }
                    }
                }
                else {
                    ownerApp.errorInLogin();
                }
            }
/////////////////////////////////////////Tenant page//////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////Tenant Page//////////////////////////////////////////////////////////
            else if (option == 3) {
                int houserentid =-1;
                Tenant tenant = new Tenant();
                LoginToMyAppAsTenant tenantApp = new LoginToMyAppAsTenant();
                tenantApp.loggInCheck(email, password);
                if (tenantApp.isLoggedIn()) {
                    for (Tenant t : TenantDB.getTenants()) {
                        if (t.getEmail().equals(email)) {
                            tenant = t;
                        }
                    }
                    logger.info("WELCOME Tenant " + tenant.getName() + "\n");
                    while (true) {
                        logger.info("---------------Tenant Options-----------------------------\n");
                        logger.info("| 1- Show  Houses                                        |\n");
                        logger.info("| 2- Show Details of my House that I rented              |\n");
                        logger.info("| 3- Add Furniture For Sale                              |\n");
                        logger.info("| 4- Find The People Who live In The Same House I Rented |\n");
                        logger.info("| 5- My Profile                                          |\n");
                        logger.info("| 6- Log out                                             |\n");
                        logger.info("---------------------------------------------------------\n");

                        int tenantOption = in.nextInt();
                        if(tenantOption == 1){

                                logger.info("---------------Available Houses---------------\n");
                                HouseDB.displayHouses(HouseDB.getHouses());
                                 while (true){
                                logger.info("---------------Options---------------\n");
                                logger.info("| 1- Show Specific Apartment        |\n");
                                logger.info("| 2- Rent House                     |\n");
                                logger.info("| 3- Back                           |\n");
                                logger.info("-------------------------------------\n");

                                int tenantOption1 = in.nextInt();
                                if(tenantOption1 == 1){
                                    display();
                                 logger.warning("|Please Enter the Id of the House you want to show       |\n");
                                   displaying();
                                    int id = in.nextInt();

                                    display();
                                 logger.warning("|Please Enter the Id of the Apartment you want to show   |\n");
                                    displaying();
                                    int number = in.nextInt();
                                    for(House h : HouseDB.getHouses()){
                                        if(h.getId() == id){
                                            for(Apartment a : h.getApartments()){
                                                if(a.getNumber() == number){
                                                    a.displayInfo();
                                                }
                                            }
                                        }
                                    }
                                }
                                else if(tenantOption1 == 2){
                                    display();
                                 logger.warning("|Please Enter the Id of the House you want to Rent       |\n");
                                    displaying();
                                     houserentid = in.nextInt();
                                    display();
                                 logger.warning("|Please Enter the Id of the Apartment you want to Rent   |\n");
                                    displaying();

                                    int number = in.nextInt();
                                    for(House h : HouseDB.getHouses()){
                                        if(h.getId() == houserentid){
                                            for(Apartment a : h.getApartments()){
                                                if(a.getNumber() == number){
                                                    a.rentApartment(tenant);
                                                }
                                            }
                                        }
                                    }
                                }
                                else if(tenantOption1 == 3){
                                    break;
                                }

                            }
                        }else if(tenantOption == 2){
                            logger.info(" ----- My Apartment -----\n");
                            for(House h : HouseDB.getHouses()){
                                for(Apartment a: h.getApartments()){
                                    for(Tenant t : a.getTenant()){
                                        if(t.getEmail().equals(tenant.getEmail())){
                                          a.displayInfo();
                                        }
                                    }
                                }
                            }
                        } else if(tenantOption == 3){
                            List<String > furnitures = new ArrayList<>();
                            displayuptallline();
                         logger.warning("|Please Enter the numbers of Furniture you want to add for sale   |\n");
                            logger.info("|__________________________________________________________________|\n");
                            int numOfFurniture = in.nextInt();
                            while (numOfFurniture > 0){
                                String furniture = in.next();
                                furnitures.add(furniture);
                                numOfFurniture--;
                            }
                            tenant.setFurniture(furnitures);
                            displayuptallline();
                         logger.warning("|Thank you to sale your furniture's....                            |\n");
                            logger.info("|__________________________________________________________________|\n");


                        }else if(tenantOption == 4){
                            if(houserentid ==-1){
                                displayuptallline();
                             logger.warning("|You haven't rented a house yet....                                |\n");
                                logger.info("|__________________________________________________________________|\n");


                            }else {
                                for (House h : HouseDB.getHouses()) {
                                    if (h.getId() == houserentid) {
                                        for (Apartment a : h.getApartments()) {
                                            for(Tenant t : a.getTenant()){
                                                if(!(t.getEmail().equals(email)) ){
                                                    TenantDB.displayTenant(t);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }else if(tenantOption == 5){
                            logger.info(" ----- My Profile ----- \n");
                            logger.info("-------------------------------Tenant----------------------------\n");
                            logger.info("|     id          |"+"    Name     |"+"    Phone    " +
                                    " |"+"       Age       |"+"    University Major     |"+"     Has furniture     |\n");
                              TenantDB.displayTenant(tenant);
                            display();
                         logger.warning("|1- Back                                                 |\n");
                         logger.warning("|2- If you want to Log out                               |\n");
                            displaying();
                            int logout = in.nextInt();
                            if(logout == 2){
                                tenant = null;
                                break;
                            }
                        } else if (tenantOption == 6) {
                            break;
                        }else{
                            display();
                            logger.warning("|Please enter a valid number!!                        |\n");
                            displaying();
                        }
                    }
                }else {
                    tenantApp.errorInLogin();
                }
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else {
               displayupline();
                displayEnterValidNumber();
                logger.info("|__________________________________________________|\n");
                displaydownline();


                menu();

            }
        } //menu
    }
    public static void displaying(){
        logger.info("|________________________________________________________|\n");
    }
    public static void display(){
        logger.info("__________________________________________________________\n");
    }
    public static void displayed(){
        logger.info("|____________________________________________________|\n");
    }
    public static void displayline(){
        logger.info(" ____________________________________________________ \n");
    }
    public static void displayupline(){logger.info("____________________________________________________\n");}
   public static void displaydownline(){logger.info("|__________________________________________________|\n");}
    public static void displayuptallline(){logger.info("____________________________________________________________________\n");}
    public static void displaydowntallline(){logger.info("|____________________________________________________________________|\n");}
    public static void displayEnterValidNumber(){ logger.warning("|             Please Enter valid number :)         |\n");}


}
