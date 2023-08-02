package sakancom;
        import sakancom.Database.*;
        import sakancom.Entity.*;
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
        import sakancom.serveses.LoginToMyAppAsTenant;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void menu(){
        logger.setUseParentHandlers(false);
        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage();
            }
        };
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(formatter);
        logger.addHandler(consoleHandler);

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
                        logger.info("5- My Profile\n");
                        logger.info("6- exit\n");
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


                        } else if (option == 5) {
                            logger.warning("----- "+admin.getEmail()+ " Profile -----");
                            AdminDB.displayAdmin(admin);
                            logger.warning("1-Log out");
                            option = in.nextInt();
                            if(option == 1 ){
                                admin = null;
                                menu();
                            }
                        } else if (option == 6) {
                            break;
                        }
                        else {
                            logger.warning("Please Enter valid number :)");
                        }
                    }
                }
                else {
                    adminApp.errorInLogin();
                }
            }
///////////////////////////////////////////////////////////Owner Page/////////////////////////////////////////////////////////
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
                        logger.info("6- exit\n");
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
                            logger.info("\nthe number of floor : ");
                            newHouse.setNumOfFloor(in.nextInt());
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
                                logger.info("\nThe Floor number : ");
                                newApartment.setFloor(in.nextInt());
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
                            logger.info("---------------Profile Option---------------\n");
                            logger.info("1- Update MyProfile\n");
                            logger.info("2- Log out\n");
                            logger.info("-------------------------------------------\n");
                        }else if(option == 6){
                            break;
                        }
                        else {
                            logger.warning("Please Enter valid number :)");
                        }
                    }
                }
                else {
                    ownerApp.errorInLogin();
                }
            }
//////////////////////////////////////////////////////////Tenant Page//////////////////////////////////////////////////////////
            else if (option == 3) {
                Tenant tenant = new Tenant();
                LoginToMyAppAsTenant tenantApp = new LoginToMyAppAsTenant();
                //  Thread.sleep(1000);
                logger.info("WELCOME TO LOGIN PAGE\n");
                logger.info("Enter your email: ");
                email = in.nextLine();
                logger.info("Enter your password: ");
                password = in.nextLine();

                tenantApp.loggInCheck(email, password);
                if (tenantApp.isLoggedIn()) {
                    for (Tenant t : TenantDB.getTenants()) {
                        if (t.getEmail().equals(email)) {
                            tenant = t;
                        }
                    }
                    logger.info("WELCOME Tenant " + tenant.getName() + "\n");
                    while (true) {
                        logger.info("---------------Tenant Options---------------\n");
                        logger.info("1- Show  Houses\n");
                        logger.info("2- Show Details of my House that I rented\n");
                        logger.info("3- Add Furniture For Sale\n");
                        logger.info("4- Find The People Who live In The Same House I Rented \n");
                        logger.info("5- My Profile\n");
                        logger.info("6- exit\n");
                        logger.info("-------------------------------------------\n");

                        int tenantOption = in.nextInt();
                        if(tenantOption == 1){
                            while (true){
                                logger.info("---------------Available Houses---------------\n");
                                HouseDB.displayHouses(HouseDB.getHouses());
                                logger.info("---------------Options---------------\n");
                                logger.info("1- Show Specific House\n");
                                logger.info("2- Rent House\n");
                                logger.info("3- Back\n");
                                logger.info("--------------------------------------\n");
                                int tenantOption1 = in.nextInt();
                                if(tenantOption1 == 1){
                                    logger.info("Please Enter the Id of the House you want to show\n");
                                    int id = in.nextInt();
                                    for(House h : HouseDB.getHouses()){
                                        if(h.getId() == id){
                                            HouseDB.displayHouse(h);
                                            break;
                                        }
                                    }
                                    logger.info("Please Enter the Id of the Apartment you want to show\n");
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
                                    logger.info("Please Enter the Id of the House you want to Rent\n");
                                    int id = in.nextInt();
                                    logger.info("Please Enter the Id of the Apartment you want to Rent\n");
                                    int number = in.nextInt();
                                    for(House h : HouseDB.getHouses()){
                                        if(h.getId() == id){
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
                                           HouseDB.displayHouse(h);
                                       }
                                   }
                               }
                           }
                        } else if(tenantOption == 3){
                            List<String > furnitures = new ArrayList<>();
                            logger.info("Please Enter the numbers of Furnitures you want to add for sale \n");
                            int numOfFurniture = in.nextInt();
                            while (numOfFurniture > 0){
                                String furniture = in.nextLine();
                                furnitures.add(furniture);
                                numOfFurniture--;
                            }
                            tenant.setFurniture(furnitures);

                        }else if(tenantOption == 4){
                            for(House h : HouseDB.getHouses()){
                                for(Apartment a : h.getApartments()){
                                    for(Tenant t: a.getTenant()){
                                        if(t.getEmail().equals(tenant.getEmail())){

                                            for(Apartment A : h.getApartments()){
                                                for(Tenant T: a.getTenant()){
                                                    TenantDB.displayTenant(T);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }else if(tenantOption == 5){
                            logger.info(" ----- My Profile ----- \n");
                            TenantDB.displayTenant(tenant);
                            logger.info("1- If you want to Log out \n");
                            int logout = in.nextInt();
                            if(logout == 1){

                                tenant = null;
                                break;
                            }

                        } else if (tenantOption == 6) {
                            break;
                        }else{
                            logger.info("Please enter a valid number \n");
                        }
                    }
                }else {
                    tenantApp.errorInLogin();
                }
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
