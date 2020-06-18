package Classes.Class;

import Classes.Actors.Student;
import javafx.collections.ObservableList;

import java.util.ArrayList;


public class Class {
    String classID;
    ObservableList<Student> studentList;

    public Class(String classID, ObservableList<Student> studentList) {
        this.classID = classID;
        this.studentList = studentList;
    }

    public String getClassID() {
        return classID;
    }

    public ObservableList<Student> getStudentList() {
        return studentList;
    }
}
