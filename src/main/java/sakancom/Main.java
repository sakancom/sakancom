package sakancom;
        import sakancom.Database.*;
        import sakancom.Entity.Admin;
        import sakancom.Entity.Apartment;
        import sakancom.Entity.House;
        import sakancom.Entity.HousingOwners;
        import sakancom.serveses.AddHouseToMyAppAsOwner;
        import sakancom.serveses.LoginToMyAppAsAdmin;

        import java.util.*;
        import java.util.logging.Logger;
        import java.io.File;
        import java.util.logging.*;

        import sakancom.Entity.House;
        import sakancom.serveses.LoginToMyAppAsOwner;
        import sakancom.LoggerUtility;

public class Main {
    private static Logger logger = LoggerUtility.getLogger();
    static Apartment apartment = new Apartment();
    List<House> houses = HouseDB.getHouses();
    static Apartment newApartment = new Apartment();

    public static void menu(){
            logger.info("____________________________________________________\n");
            logger.info("|       Welcome to Sakantcom Services System :)     |\n");
            logger.info("| 1-If you want to login as an admin                |\n");
            logger.info("| 2-If you want to login as an owner                |\n");
            logger.info("| 3-If you want to login as an tenant               |\n");
            //logger.info("| 4-If you are a new owner enter number 4            |\n");
            logger.info("|___________________________________________________|\n");
    }

    public static void main(String[]args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int option = 0;
        String email;
        String password;
        while(true) {
            try {
                menu();
                option = in.nextInt();
            } catch (InputMismatchException e) {
                logger.info("____________________________________________________\n");
             logger.warning("|             Please Enter valid number :)         |\n");
                logger.info("|__________________________________________________|\n");
                in.nextLine();
                continue;
            }
////////////////////////////////////////////////////////////Admin////////////////////////////////////////////
            logger.info("____________________________________________________\n");
         logger.warning("|             WELCOME TO LOGIN PAGE                |\n");
            logger.info("|__________________________________________________|\n");
           // logger.info("WELCOME TO LOGIN PAGE\n");

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
                        logger.info("____________________________________________________\n");
                        logger.info("|       Welcome to Admin page :)                   |\n");
                        logger.info("| 1- Requests                                      |\n");
                        logger.info("| 2- Owners                                        |\n");
                        logger.info("| 3- Tenant                                        |\n");
                        logger.info("| 4- Houses                                        |\n");
                        logger.info("| 5- Log Out                                       |\n");
                        logger.info("|__________________________________________________|\n");
                        int optionadmin = in.nextInt();
                     //////////Request/////////
                           if(optionadmin == 1) {
                               RequestToAddHouseDB.displayHouses(RequestToAddHouseDB.getHouses());
                               while (true) {
                                   logger.info("____________________________________________________\n");
                                   logger.info("|       Welcome to Requests Options :)             |\n");
                                   logger.info("| 1- Cancel Request                                |\n");
                                   logger.info("| 2- Add Requests                                  |\n");
                                   logger.info("| 3- Back                                          |\n");
                                   logger.info("|__________________________________________________|\n");
                                   optionadmin = in.nextInt();
                                   //cancel
                                   if (optionadmin == 1) {
                                       logger.info("______________________________________________________\n");
                                       logger.info("|  Please enter the id of the house to cancel it :)  |\n");
                                       logger.info("|____________________________________________________|\n");
                                       int id = in.nextInt();
                                       RequestToAddHouseDB.cancelRequest(id);
                                       RequestToAddHouseDB.displayHouses(RequestToAddHouseDB.getHouses());
                                       logger.info("______________________________________________________\n");
                                       logger.info("| The cancel Done!                                   |\n");
                                       logger.info("|____________________________________________________|\n");
                                   }
                                   //Add
                                   else if (optionadmin == 2) {
                                       for (House h : RequestToAddHouseDB.getHouses()) {
                                           HouseDB.addHouse(h);
                                       }
                                       RequestToAddHouseDB.clearTheRequestList();
                                       logger.info("______________________________________________________\n");
                                       logger.info("|            The houses added Successfully! :)       |\n");
                                       logger.info("|____________________________________________________|\n");
                                   }
                                   else if (optionadmin == 3) {
                                       break;
                                   }
                                   else {
                                       logger.info("____________________________________________________\n");
                                    logger.warning("|             Please Enter valid number :)         |\n");
                                       logger.info("|__________________________________________________|\n");
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

                            logger.info("---------------Houses Option---------------\n");
                            logger.info("| 1- Delete House                         |\n");
                            logger.info("| 2- Back                                 |\n");
                            logger.info(" ----------------------------------------- \n");
                            option = in.nextInt();
                            if(option == 1) {
                                logger.info("______________________________________________________\n");
                                logger.info("|Please Enter the ID of the House you want to Delete.|\n");
                                logger.info("|____________________________________________________|\n");

                                int id = in.nextInt();
                                HouseDB.deleteHouse(id);
                                logger.info("Delete Done..\n");
                                HouseDB.displayHouses(HouseDB.getHouses());
                            }
                            else if (option==2){
                                    break;
                                }
                            else {
                                logger.info("______________________________________________________\n");
                             logger.warning("|            Please Enter valid number :)             |\n" );
                                logger.info("|_____________________________________________________|\n");

                            }
                        }
                        else if(optionadmin==5){
                            logger.info("Exiting the program. Goodbye!\n");
                            break;
                        }
                        else {
                            logger.info("______________________________________________________\n");
                            logger.warning("|            Please Enter valid number :)             |\n" );
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
                            owner.setName(o.getName());
                            owner.setAddress(o.getAddress());
                            owner.setEmail(o.getEmail());
                            owner.setPassword(o.getPassword());
                            owner.setId(o.getId());
                            owner.setPhone(o.getPhone());
                        }
                    }
                    logger.info("Welcome Owner "+owner.getName() +"\n");
                    while (true) {
                        logger.info("____________________________________________________\n");
                        logger.info("|              Welcome to Owners Options           |\n");
                        logger.info("| 1- Add House                                     |\n");
                        logger.info("| 2- My Houses                                     |\n");
                        logger.info("| 3- My Profile                                    |\n");
                        logger.info("| 4- log out                                       |\n");
                        logger.info("|__________________________________________________|\n");
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

                            logger.info("--hasFurnitureWindow? (yes or no):");
                            String hasFurnitureWindow = in.next();
                            newHouse.setHasFurnitureWindow(hasFurnitureWindow);

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
                                newApartment.setNumOfRoom(in.nextInt());

                                logger.info("--the Number of Bathrooms :");
                                newApartment.setNumOfBathrooms(in.nextInt());

                                logger.info("--the Number of Bedrooms :");
                                newApartment.setNumOfBathrooms(in.nextInt());

                                logger.info("--the Rent :");
                                newApartment.setRent(in.nextInt());

                                logger.info("--the Total Number of Tenants: ");
                                newApartment.setNumOfTenant(in.nextInt());

                                logger.info("--Has a Balcony ?(yes or no): ");
                                String balcony = in.next();

                                if(balcony.equalsIgnoreCase("yse")){
                                    newApartment.setBalcony(true);
                                }else {
                                    newApartment.setBalcony(false);
                                }

                                newApartment.setTenant(null);
                                newApartment.setAvailable(true);
                                logger.info("--Rent Payment Date: ");
                                newApartment.setRentPaymentDate(in.next());
                                apartments.add(newApartment);
                                totalApartments--;
                            }
                             logger.info("______________________________________________________\n");
                             logger.info("| Please wait until the admin accept your house :)   |\n");
                             logger.info("|____________________________________________________|\n");
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
                                 logger.info("--------"+email+"'s "+ "Houses --------\n ");
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
                                     logger.info("| 3- Back                             |\n");
                                     logger.info(" --------------------------------------\n");
                                     int innerOption = in.nextInt();
                                     if (innerOption == 1) {
                                         logger.info("______________________________________________________________________\n");
                                      logger.warning("|Please Enter the Apartment ID of the House you want to delete :)    |\n");
                                         logger.info("|____________________________________________________________________|\n");
                                         int apartmentId = in.nextInt();
                                         boolean isHouseDeleted = false;
                                         Iterator<House> iterator = HouseDB.getHouses().iterator();
                                         while (iterator.hasNext()) {
                                             House house = iterator.next();
                                             if (apartment.getNumber() == apartmentId && house.getOwner().getEmail().equals(email)) {
                                                 iterator.remove();
                                                 isHouseDeleted = true;
                                                 break;
                                             }
                                         }
                                         logger.info("__________________________________________________________\n");
                                         if (isHouseDeleted) {
                                      logger.warning("|   Delete Done                                          |\n");
                                         } else {
                                      logger.warning("|   House with Apartment Number not found                |\n");
                                         }
                                         logger.info("|________________________________________________________|\n");

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
                                         logger.info("__________________________________________________________\n");
                                         logger.warning("|Please Enter the Id of the House you want to update:)|\n");
                                         logger.info("|________________________________________________________|\n");

                                         int houseId = in.nextInt();
                                         House selectedHouse = null;
                                         if (HouseDB.getHouses().isEmpty())
                                         {
                                             logger.warning("No houses found in the database.\n\n");
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
                                                         logger.info("Apartment with ID " + apartmentId + " not found in the house with ID " + houseId + "!");
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
                                                         logger.info("House with ID " + houseid + " not found or doesn't belong to you!");
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
                                                         logger.info("Apartment with ID " + apartmentId + " not found in the house with ID " + houseId + "!");
                                                     }
                                                 } else if (option == 4) {
                                                     break;
                                                 }
                                             }
                                         }
                                     } else if (innerOption == 3) {
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
                            logger.info("____________________________________________________\n");
                         logger.warning("|             Please Enter valid number :)         |\n");
                            logger.info("|__________________________________________________|\n");
                        }
                    }
                }
                else {
                    ownerApp.errorInLogin();
                }
            }
/////////////////////////////////////////Tenant page//////////////////////////////////////////////////////////
            else if (option == 3) {

            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (option == 4) {

            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else {
                logger.info("____________________________________________________\n");
                logger.warning("|             Please Enter valid number :)         |\n");
                logger.info("|__________________________________________________|\n");
                menu();

            }
        } //menu
    }
}
