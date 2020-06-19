package Classes.Actors;


import Interfaces.LecturerFunctions;

import java.util.Date;

public class Lecturer extends Account implements LecturerFunctions {
    String degree;
    public Lecturer(String username, String password, String lastname, String firstname, boolean gender, Date dob, String degree) {
        super(username, password, lastname, firstname, gender, dob, 2);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
