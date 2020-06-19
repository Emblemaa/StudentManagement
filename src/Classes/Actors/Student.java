package Classes.Actors;

import Interfaces.StudentFunctions;

import java.util.Date;

public class Student extends Account implements StudentFunctions {

    public Student(String username, String password, String lastname, String firstname, boolean gender, Date dob) {
        super(username, password, lastname, firstname, gender, dob, 1);
    }


    @Override
    public void checkIn() {

    }

    @Override
    public void viewCheckInResult() {

    }

    @Override
    public void viewSchedule() {

    }

    @Override
    public void viewScoreboard() {

    }
}
