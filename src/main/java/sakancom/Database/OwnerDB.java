package sakancom.Database;

import sakancom.Entity.Admin;
import sakancom.Entity.HousingOwners;

import java.util.ArrayList;
import java.util.List;

public class OwnerDB {
    static List <HousingOwners> owners= new ArrayList<HousingOwners>();
    private OwnerDB() {
        throw new IllegalStateException("Utility class");
    }
    static{
        owners.add(new HousingOwners("000","musa@gmail", "0655433", "nablus", "musa", 1));
        owners.add(new HousingOwners("000","shahd@gmail", "098866", "nablus", "musa", 2));
    }
    public static void addOwner(String password, String email, String phone, String address, String name, int id) {
        owners.add(new HousingOwners( password,  email,  phone,  address,  name,  id));
    }

    public static List<HousingOwners> getOwners() {
        return owners;
    }
}
