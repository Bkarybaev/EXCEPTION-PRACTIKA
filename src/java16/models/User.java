package java16.models;

import java16.enums.Gender;

public class User {
    private Long id;
    private String userName;
    private String phoneNumber;
    private String gmail;
    private String password;
    private Gender gender;

    public User() {
    }

    public User(Long id, String userName, String phoneNumber, String gmail, String password, Gender gender) {
        this.id = id;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.gmail = gmail;
        this.password = password;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gmail='" + gmail + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }
}
