package sakancom;

public class Tenant {
    private String password ;
    private String email;
    private boolean flagIfLogIn;
    private String phone;
    private String address;
    private String name;
    private int id;
    private int age;
    private String universityMajors;

    public Tenant(String email, String password, boolean flagIfLogIn, String phone, String address, String name, int id, int age, String universityMajors) {
        this.email = email;
        this.password=password;
        this.flagIfLogIn = flagIfLogIn;
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.id = id;
        this.age = age;
        this.universityMajors = universityMajors;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public boolean isFlagIfLogIn() {
        return flagIfLogIn;
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

    public int getAge() {
        return age;
    }

    public String getUniversityMajors() {
        return universityMajors;
    }
}
