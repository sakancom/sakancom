package sakancom.Entity;

public class Admin {
    private String password ;
    private String email;

    public Admin(String email, String password) {
        this.email = email;
        this.password=password;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public void adminPage() {
    }
}
