package sakancom.Entity;

public class HousingOwners {
    private String password ;
    private String email;
    //information connect
    private String phone;
    private String address;
    private String name;
    private int id;

    public HousingOwners( ) {

    }

    public HousingOwners(String password, String email, String phone, String address, String name, int id) {
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

