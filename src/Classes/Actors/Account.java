package Classes.Actors;

import Classes.Date;
import Interfaces.GeneralFunctions;

public class Account implements GeneralFunctions {
    private String username;
    private String password;
    private String lastname;
    private String firstname;
    private Date dob;
    private int role;

    public Account(String username, String password, String lastname, String firstname, Date dob, int role) {
        this.username = username;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.dob = dob;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public void login() {

    }

    @Override
    public void viewProfile() {

    }

    @Override
    public void changePassword() {

    }

    @Override
    public void logout() {

    }
}
