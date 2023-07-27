package sakancom.Entity;

public class HousingOwners {
    private String password ;
    private String email;
    //information connect
    private String phone;
    private String address;
    private String name;
    private int id;

    public HousingOwners(String password, String email, boolean flagIfLogIn, String phone, String address, String name, int id) {
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    
    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

