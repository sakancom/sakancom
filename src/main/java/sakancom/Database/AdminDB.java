package sakancom.Database;

import sakancom.Entity.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminDB {
    static List <Admin> admins= new ArrayList<Admin>();
    private AdminDB() {
        throw new IllegalStateException("Utility class");
    }
    static{
        admins.add(new Admin("farah","123456"));
        admins.add(new Admin("alaa","true Pass"));
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
