package Classes.Tools;

import Classes.Actors.Lecturer;
import Classes.Actors.Staff;
import Classes.Class.Class;
import javafx.collections.ObservableList;

public class DB {
    private static ObservableList<Class> classList = Initialization.classList("/src/DATABASE/Classes.xlsx");
    private static ObservableList<Lecturer> lecturerList = Initialization.lecturerList("/src/DATABASE/Academic.xlsx");
    private static ObservableList<Staff> staffList = Initialization.staffList("/src/DATABASE/Academic.xlsx");

    public static ObservableList<Class> getClassList() {
        return classList;
    }

    public static void setClassList(ObservableList<Class> classList) {
        DB.classList = classList;
    }

    public static ObservableList<Lecturer> getLecturerList() {
        return lecturerList;
    }

    public static void setLecturerList(ObservableList<Lecturer> lecturerList) {
        DB.lecturerList = lecturerList;
    }

    public static ObservableList<Staff> getStaffList() {
        return staffList;
    }

    public static void setStaffList(ObservableList<Staff> staffList) {
        DB.staffList = staffList;
    }
}
