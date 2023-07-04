package sakancom;

public class Admin {
    private String password ;
    private String email;
    boolean flagIfLogIn;

    public Admin(String email,String password) {
        this.email = email;
        this.password=password;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

}
