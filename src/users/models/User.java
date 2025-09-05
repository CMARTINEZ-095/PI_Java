package users.models;

public class User {
    private String userName;
    private String email;
    private String password;
    private double phoneNumber;
    private boolean status;

    public User(){}
    public User(String userName, double phoneNumber, boolean status){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }
    
    public User(String userName, String email, String password, double phoneNumber, boolean status){
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    // Setters
    public void setUserName(String userName){
        this.userName = userName;
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
    public String getUserName(){
        return this.userName;
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
