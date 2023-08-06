package sakancom.serveses;

import sakancom.entity.House;
import sakancom.LoggerUtility;

import java.util.logging.Logger;

import static sakancom.database.RequestToAddHouseDB.addHouse;

public class AddHouseToMyAppAsOwner {
    private static final Logger logger = LoggerUtility.getLogger();


    public static void addHouseToRequestList(House h) {
        addHouse(h);
    }
    private AddHouseToMyAppAsOwner() {
    }
    }
