package sakancom.database;

import sakancom.entity.Admin;
import sakancom.LoggerUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AdminDB {
    static List <Admin> admins= new ArrayList<Admin>();
    private AdminDB() {
        throw new IllegalStateException("Utility class");
    }
    static{
        admins.add(new Admin("alaa","true Pass"));
        admins.add(new Admin("farah","002"));
        admins.add(new Admin("jana","JaNa"));
        admins.add(new Admin("lemara","lemo"));
    }
    public static void addAdmin(String email,String password) {

        admins.add(new Admin(email, password));
    }

    public static List<Admin> getAdmins() {
        return admins;
    }
}
