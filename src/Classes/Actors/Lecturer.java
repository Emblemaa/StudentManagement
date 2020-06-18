package Classes.Actors;

import Classes.Date;
import Interfaces.LecturerFunctions;

public class Lecturer extends Account implements LecturerFunctions {
    public Lecturer(String username, String password, String lastname, String firstname, Date dob, short role) {
        super(username, password, lastname, firstname, dob, 2);
    }
}
