package sakancom;
        import java.util.InputMismatchException;
        import java.util.Scanner;
        import java.util.logging.Logger;
        import java.io.File;
        import java.util.logging.*;

public class Main {
    // importing the File class

    static Logger logger = Logger.getLogger(Main.class.getName());
    // Remove the default handler to disable the default logging behavior

    public static void menu(){
        logger.setUseParentHandlers(false);

        // Create a custom formatter without the date
        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage();
            }
        };

        // Create a new console handler and set the custom formatter
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(formatter);

        // Add the console handler to the logger
        logger.addHandler(consoleHandler);

        // Log a message using the logger
        logger.info("____________________________________________________\n");
        logger.info("| Welcome to Sakancom Services System              |\n");
        logger.info("| If you want to login as an admin enter number 1  |\n");
        logger.info("| If you want to login as an owner enter number 2  |\n");
        logger.info("| If you want to login as an tenant enter number 3 |\n");
        logger.info("| If you are a new owner enter number 4            |\n");
        logger.info("|__________________________________________________|\n");

    }

    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);
        int option = 0;
        try {
            menu();
            option = in.nextInt();
        } catch (InputMismatchException e) {
            logger.info("please enter a valid number");
            main(new String[5]);
        }
        if (option == 1) {

        } else if(option==2) {
         /*   RecordCustomer recordCustomer = new RecordCustomer();
            recordCustomer.newCustomer();*/
        }else if(option==3){

        }else if(option==4){

        }else{
            logger.info("Please enter a valid number");
        }

    }

    public static void userLogin(){

        Scanner in=new Scanner(System.in);
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
            }*/

        }
    }
}
