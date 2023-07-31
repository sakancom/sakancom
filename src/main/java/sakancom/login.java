package sakancom;


import io.cucumber.java.it.Data;

public class login {
    public String email;
    private String password;
    private String rul;

    public login(String email, String password,String rul) {
        this.email = email;
        this.password = password;
        this.rul = rul;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRul() {
        return rul;
    }
    public void setRul(String rul) {
        this.password = rul;
    }

    @Override
    public String toString() {
        return
                email +" " + password +" "  + rul + "\r\n";
    }
    /* show msg when login*/
    public String msg(){
        String message;
        if (rul.equals("admin")) {
            message = "Admin login success";
        } else if (rul.equals("owner")) {
            message = "owner login success";
        }
        else if (rul.equals("tenant")) {
            message = "tenant login success";
        }

        else {
            message="login fail";
        }
        return message;
    }

}
