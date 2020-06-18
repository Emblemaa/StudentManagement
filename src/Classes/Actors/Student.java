package Classes.Actors;

import Classes.Date;
import Interfaces.StudentFunctions;

public class Student extends Account implements StudentFunctions {

    public Student(String username, String password, String lastname, String firstname, Date dob) {
        super(username, password, lastname, firstname, dob, 1);
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
