package Menu.LoginMenu;

import Classes.Actors.Student;
import Classes.Class.Class;
import Classes.Date;
import Classes.Initialization;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    TableView<Student> studentTable;

    @FXML
    TableColumn<Student, String> ID;

    @FXML
    TableColumn<Student, String> lastname;

    @FXML
    TableColumn<Student, String> firstname;

    @FXML
    TableColumn<Student, String> dob;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        ID.setCellValueFactory(new PropertyValueFactory<>("Username"));
        lastname.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        firstname.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        dob.setCellValueFactory(new PropertyValueFactory<>("dob"));

        try
        {
            ObservableList<Class> classes = Initialization.classList(getClass().getResource("Classes.xlsx"));
            ObservableList<Student> students = classes.get(0).getStudentList();
            studentTable.setItems(students);
        }
        catch (Exception e)
        {
            System.out.println("ahihi");
        }

    }
}
