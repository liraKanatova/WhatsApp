package whatsApp.classes;

import whatsApp.enums.Status;

public class Profile {
    private String phoneNumber;
    private Status status;
    private String image;
    private  String userName;

    public Profile(String phoneNumber, Status status, String image, String userName) {
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.image = image;
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
