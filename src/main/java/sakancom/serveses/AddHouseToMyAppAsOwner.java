package sakancom.serveses;

import sakancom.Entity.House;

import java.util.logging.Logger;

import static sakancom.Database.RequestToAddHouseDB.addHouse;

public class AddHouseToMyAppAsOwner {
    private static final Logger logger = Logger.getLogger(LoginToMyAppAsAdmin.class.getName());


    public static void addHouseToRequestList(House h){
        addHouse(h);
    }

}
