package sakancom.entity;
import java.util.List;

public class Tenant {
    private String password ;
    private String email;
    private String phone;
    private String address;
    private String name;
    private int id;
    private int age;
    private String universityMajors;
    boolean hasFurnitureWindow;
    private List<String> furniture;



    public Tenant() {
    }

    public List<String> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<String> furniture) {
        if(furniture.isEmpty()){
            this.furniture = furniture;
        }else{
        setHasFurnitureWindow(true);
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversityMajors() {
        return universityMajors;
    }

    public void setUniversityMajors(String universityMajors) {
        this.universityMajors = universityMajors;
    }

    public boolean isHasFurnitureWindow() {
        return hasFurnitureWindow;
    }

    public void setHasFurnitureWindow(boolean hasFurnitureWindow) {
        this.hasFurnitureWindow = hasFurnitureWindow;
    }



}