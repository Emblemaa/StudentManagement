package Classes;

public class Account {
    private String username;
    private String password;
    private String lastname;
    private String firstname;
    private boolean gender;
    private Date dob;
    short role;

    public Account(String username, String password, String lastname, String firstname, boolean gender, Date dob, short role) {
        this.username = username;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public short getRole() {
        return role;
    }

    public void setRole(short role) {
        this.role = role;
    }
}
