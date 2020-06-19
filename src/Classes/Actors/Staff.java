package Classes.Actors;


import Interfaces.StaffFunctions;

import java.util.Date;

public class Staff extends Account implements StaffFunctions {
    public Staff(String username, String password, String lastname, String firstname, boolean gender ,Date dob) {
        super(username, password, lastname, firstname, gender, dob, 3);
    }
}
