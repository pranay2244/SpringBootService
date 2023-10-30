package com.skool.Skool.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user_details")
public class UserModel {

    @Column(name = "user_id")
    @Id
    @GeneratedValue
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "institute_name")
    private String institutionName;
    @Column(name = "address")
    private String address;
    @Column(name = "role")
    private int role;
    @Column(name = "premium_flg")
    private boolean premiumFlag;
    @Column(name = "permission")
    private String permission;
    @Column(name = "registration_date")
    private Date registrationDate;
    @Column(name = "last_login")
    private Date lastLogin;
    @Column(name = "active_status")
    private boolean activeStatus;

    public UserModel() {
    }

    public UserModel(String userName, String firstName, String lastName, String gender, Date dateOfBirth, String email, String mobileNumber, String institutionName, String address, int role, boolean premiumFlag, String permission, Date registrationDate, Date lastLogin, boolean activeStatus) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.institutionName = institutionName;
        this.address = address;
        this.role = role;
        this.premiumFlag = premiumFlag;
        this.permission = permission;
        this.registrationDate = registrationDate;
        this.lastLogin = lastLogin;
        this.activeStatus = activeStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public boolean isPremiumFlag() {
        return premiumFlag;
    }

    public void setPremiumFlag(boolean premiumFlag) {
        this.premiumFlag = premiumFlag;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
