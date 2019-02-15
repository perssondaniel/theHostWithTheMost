package com.example.HostWithTheMost;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {


    @Size(min=1)
    private String firstName;
    private String lastName;
    private String fullName;
    private String phoneNumber;
    private String birthDate;
    private String email;
    private String street;
    private String postalCode;
    private String city;
    private String userName;
    private String passWord;


    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, String birthDate, String email, String street, String postalCode, String city, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = (firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void getDetails(){
        System.out.println(this.firstName + " " + this.lastName + " " + this.phoneNumber+ " " + this.birthDate + " " + this.email + " " + this.street + " " + this.postalCode + " " + this.city+ " " + this.userName + " " + this.passWord);
    }
}
