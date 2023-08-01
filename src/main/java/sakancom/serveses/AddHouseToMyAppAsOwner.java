package sakancom.serveses;

import sakancom.Entity.House;
import sakancom.LoggerUtility;

import java.util.logging.Logger;

import static sakancom.Database.RequestToAddHouseDB.addHouse;

public class AddHouseToMyAppAsOwner {
    private static final Logger logger = LoggerUtility.getLogger();


    public static void addHouseToRequestList(House h) {
        addHouse(h);
    }
}