package sakancom;
        import java.util.InputMismatchException;
        import java.util.Scanner;
        import java.util.logging.Logger;
        import java.io.File;
        import java.util.logging.*;

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
            logger.info("|        Welcome to Sakancom Services System       |\n");
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
            if (option == 1) {
                Thread.sleep(1000);
                logger.info("WELCOME TO LOGIN PAGE\n");
                logger.info("Enter your email: ");
                 email = in.nextLine();
                logger.info("Enter your password: ");
                 password = in.nextLine();

                if (email.equals("alaa@gmail.com") && password.equals("123456")){
                    logger.info("You are in the admin page! \n");
                }
                else {
                    logger.info("You have a wrong email or password \n");
                }
            }
                else if (option == 2) {
            } else if (option == 3) {

            } else if (option == 4) {

            } else {
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
