package sakancom;
        import sakancom.Database.*;
        import sakancom.Entity.Admin;
        import sakancom.Entity.Apartment;
        import sakancom.Entity.House;
        import sakancom.Entity.HousingOwners;
        import sakancom.serveses.AddHouseToMyAppAsOwner;
        import sakancom.serveses.LoginToMyAppAsAdmin;

        import java.util.ArrayList;
        import java.util.InputMismatchException;
        import java.util.List;
        import java.util.Scanner;
        import java.util.logging.Logger;
        import java.io.File;
        import java.util.logging.*;

        import sakancom.serveses.LoginToMyAppAsOwner;
        import sakancom.LoggerUtility;

public class Main {
    private static Logger logger = LoggerUtility.getLogger();

    public static void menu(){
            logger.info("____________________________________________________\n");
            logger.info("|       Welcome to Sakancom Services System :)     |\n");
            logger.info("| If you want to login as an admin enter number 1  |\n");
            logger.info("| If you want to login as an owner enter number 2  |\n");
            logger.info("| If you want to login as an tenant enter number 3 |\n");
            logger.info("| If you are a new owner enter number 4            |\n");
            logger.info("|__________________________________________________|\n");

    }

    public static void main(String[]args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int option = 0;
        String email;
        String password;
        try {
            menu();
            option = in.nextInt();
        } catch (InputMismatchException e) {
            logger.info("please enter a valid number");
            main(new String[5]);
        }
        while (true) {
////////////////////////////////////////////////////////////Admin////////////////////////////////////////////
            if (option == 1) {
                LoginToMyAppAsAdmin adminApp = new LoginToMyAppAsAdmin();
              //  Thread.sleep(1000);
                logger.info("WELCOME TO LOGIN PAGE\n");
                logger.info("Enter your email: ");
                email = in.nextLine();
                logger.info("Enter your password: ");
                 password = in.nextLine();
                Admin admin = new Admin(email ,password) ;

                adminApp.loggInCheck(email,password);
                if (adminApp.isLoggedIn()){
                    for(Admin a : AdminDB.getAdmins()){
                        if(a.getEmail() == email){
                             admin = a;
                        }
                    }
                    logger.info("WELCOME Admin "+ admin.getEmail()+ "\n");
                    while (true) {
                        logger.info("---------------Admins Options---------------\n");
                        logger.info("1- Requests\n");
                        logger.info("2- Owners\n");
                        logger.info("3- Tenant\n");
                        logger.info("4- Houses\n");
                        logger.info("--------------------------------------------\n");

                        option = in.nextInt();
                     //////////Request/////////
                        if(option == 1){
                           RequestToAddHouseDB.displayHouses( RequestToAddHouseDB.getHouses());
                          while (true) {
                              logger.info("--------------Requests Options--------------\n");
                              logger.info("1- Cancel Request\n");
                              logger.info("2- Add Requests\n");
                              logger.info("--------------------------------------------\n");
                              option = in.nextInt();
                              if (option == 1) { //cancel
                                  logger.info("Please enter the id of the house to cancel it :)\n");
                                  int id = in.nextInt();
                                  RequestToAddHouseDB.cancelRequest(id);
                                  RequestToAddHouseDB.displayHouses( RequestToAddHouseDB.getHouses());
                              }
                              if(option == 2){ //Add

                                  for(House h : RequestToAddHouseDB.getHouses()){
                                      HouseDB.addHouse(h);
                                  }
                                  RequestToAddHouseDB.clearTheRequestList();
                                  logger.info("The houses added Successfully! :)\n");
                              }
                          }
                        }
                      //////////Request/////////
                      ///////////Owners/////////
                        else if(option == 2){
                            OwnerDB.displayOwners(OwnerDB.getOwners());
                        }
                      ///////////Owners/////////
                      ///////////Tenants/////////
                        else if (option == 3) {
                            TenantDB.displayTenants(TenantDB.getTenants());
                        }
                      ///////////Tenants/////////
                        else if (option == 4) {
                            HouseDB.displayHouses(HouseDB.getHouses());
                            logger.info("---------------Houses Option---------------\n");
                            logger.info("1- Delete House\n");
                            logger.info("-------------------------------------------\n");

                            option = in.nextInt();
                            if(option == 1){
                                logger.info("Please Enter the ID of the House you want to Delete..\n");
                                int id = in.nextInt();
                                HouseDB.deleteHouse(id);
                                logger.info("Delete Done..\n");
                                HouseDB.displayHouses(HouseDB.getHouses());

                            }else {
                                logger.warning("Please Enter valid number :)");
                            }



                        }else {
                            logger.warning("Please Enter valid number :)");
                        }
                    }
                }
                else {
                    adminApp.errorInLogin();
                }
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (option == 2) {
                HousingOwners owner = new HousingOwners();
                LoginToMyAppAsOwner ownerApp = new LoginToMyAppAsOwner();
                //  Thread.sleep(1000);
                logger.info("WELCOME TO LOGIN PAGE\n");
                logger.info("Enter your email: ");
                email = in.nextLine();
                logger.info("Enter your password: ");
                password = in.nextLine();

                ownerApp.loggInCheck(email,password);
                if (ownerApp.isLoggedIn()){
                    for(HousingOwners o : OwnerDB.getOwners()){
                        if(o.getEmail() == email){
                            owner = o;
                        }
                    }
                    logger.info("WELCOME Owner "+ owner.getName() +"\n");
                    while (true) {
                        logger.info("---------------Owners Options---------------\n");
                        logger.info("1- Add House\n");
                        logger.info("2- My Houses \n");
                        logger.info("3- Delete House\n");
                        logger.info("4- Update House\n");
                        logger.info("5- My Profile\n");
                        logger.info("----------------------------------\n");

                        option = in.nextInt();
                        if(option == 1){
                            House newHouse = new House();
                            logger.info("Please enter the information about new house you want to add ..\n");
                            logger.info("the Id : ");
                            newHouse.setId(in.nextInt());
                            logger.info("\nthe location : ");
                            newHouse.setLocation(in.nextLine());
                            logger.info("\nthe number of services : ");
                            int numOfServices = in.nextInt();
                            List<String > services = new ArrayList<>();
                            logger.info("\nthe  services : ");
                            while (numOfServices > 0  ){
                            services.add(in.nextLine());
                                numOfServices --;
                            }
                            newHouse.setServices(services);
                            newHouse.setOwner(owner);
                            logger.info("\nhasFurnitureWindow? (yes or no) : ");
                            newHouse.setHasFurnitureWindow(true);  //// need update
                            logger.info("\nthe number of Apartments : ");
                            newHouse.setTotalApartments(in.nextInt());
                            ArrayList<Apartment> apartments = new ArrayList<>();
                            logger.info("\nPlease enter the details of etch Apartment \n : ");
                            int totalApartments = newHouse.getTotalApartments();
                            while (totalApartments > 0) {
                                Apartment newApartment = new Apartment();
                                logger.info("\nthe Id of Apartment : ");
                                newApartment.setNumber(in.nextInt());
                                logger.info("\nthe area of Apartment : ");
                                newApartment.setArea(in.nextInt());
                                logger.info("\nthe Number of Room : ");
                                newApartment.setNumOfRoom(in.nextInt());
                                logger.info("\nthe Number of Bathrooms : ");
                                newApartment.setNumOfBathrooms(in.nextInt());
                                logger.info("\nthe Number of Bathrooms : ");
                                newApartment.setNumOfBathrooms(in.nextInt());
                                logger.info("\nthe Rent : ");
                                newApartment.setRent(in.nextInt());
                                logger.info("\nthe Total Number of Tenants : ");
                                newApartment.setNumOfTenant(in.nextInt());
                                logger.info("\nHas a Balcony ?(yes or no) : ");
                                if(in.nextLine().equalsIgnoreCase("yse")){
                                    newApartment.setBalcony(true);
                                }else {
                                    newApartment.setBalcony(false);
                                }
                                newApartment.setTenant(null);
                                newApartment.setAvailable(true);
                                logger.info("\nRent Payment Date : ");
                                newApartment.setRentPaymentDate(in.nextLine());
                                apartments.add(newApartment);
                            }
                            newHouse.setApartments(apartments);
                            RequestToAddHouseDB.addHouse(newHouse);
                        }else if(option == 2){
                            logger.info("--------"+owner.getName()+"'s "+ "Houses -------- ");
                            for(House h : HouseDB.getHouses()){
                                if(h.getOwner().getEmail() == owner.getEmail()){
                                    HouseDB.displayHouse(h);
                                }
                            }

                        }else if (option == 3) {
                            logger.warning("Please Enter the Id of the House you want to delete :) \n");
                            int id = in.nextInt();
                            HouseDB.deleteHouse(id);

                        }else if (option == 4) {

                        }else if (option == 5) {
                            logger.warning("------- "+owner.getName()+" Profile -------\n");
                            OwnerDB.displayOwner(owner);
                        }else {
                            logger.warning("Please Enter valid number :)");
                        }
                    }
                }
                else {
                    ownerApp.errorInLogin();
                }
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (option == 3) {

            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (option == 4) {

            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else {
                logger.info("Please enter a valid number \n");
                menu();

            }
        }
    }

    public static void userLogin(){

       /* Scanner in=new Scanner(System.in);
        logger.info("***************Welcome Back***************");
        while(true) {
            logger.info("Enter your email ");
            String email = in.nextLine();
            logger.info("Enter your password ");
            String password = in.nextLine();
            if(email.equals("alaa@gmail.com")){
                logger.info("welcome alaa to our system, you are the admin");
            }
            else{
               String newemail[]= email.split("@");

                logger.info("welcome " +newemail[0]);
            }

          /*  Login login=new Login();
            login.setEmail(email);
            login.setPassword(password);
            if(email.equals("admin@gmail.com")){
                login.setRul("admin");
            }
            else login.setRul("owner");
            if(login.isCorrectInfo()){
                login.login();
                break;
            }
            else {
                logger.info("Incorrect user name or password, try again");
            }

        }*/
    }
}
