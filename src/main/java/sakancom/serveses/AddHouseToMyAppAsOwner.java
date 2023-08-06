package sakancom.serveses;
import sakancom.entity.House;

import static sakancom.database.RequestToAddHouseDB.addHouse;

public class AddHouseToMyAppAsOwner {

    public static void addHouseToRequestList(House h) {
        addHouse(h);
    }
    private AddHouseToMyAppAsOwner() {
    }
    }
