package Classes.Actors;

import Classes.Date;
import Interfaces.StaffFunctions;

public class Staffs extends Account implements StaffFunctions {
    public Staffs(String username, String password, String lastname, String firstname, Date dob, short role) {
        super(username, password, lastname, firstname, dob, 3);
    }
}
