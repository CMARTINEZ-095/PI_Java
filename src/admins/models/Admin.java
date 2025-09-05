package admins.models;

public class Admin {
    private String adminName;
    private String email;
    private String password;
    private double phoneNumber;
    private boolean status;

    public Admin(){}
    public Admin(String adminName, double phoneNumber, boolean status){
        this.adminName = adminName;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }
    
    public Admin(String adminName, String email, String password, double phoneNumber, boolean status){
        this.adminName = adminName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    // Setters
    public void setAdminName(String adminName){
        this.adminName = adminName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setPhoneNumber(double phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    // Getters
    public String getAdminName(){
        return this.adminName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public double getPhoneNumber(){
        return this.phoneNumber;
    }

    public boolean getStatus(){
        return this.status;
    }
}
