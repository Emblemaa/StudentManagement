package Menu.LoginMenu;

import Classes.Actors.Lecturer;
import Classes.Actors.Staff;
import Classes.Actors.Student;
import Classes.Class.Class;
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
    TableView<Lecturer> studentTable;

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
        dob.setCellValueFactory(new PropertyValueFactory<>("strDob"));

        try
        {
            ObservableList<Lecturer> classes = Initialization.lecturerList("src/DATABASE/Academic.xlsx");
            studentTable.setItems(classes);
        }
        catch (Exception e)
        {
            e.printStackTrace();;
        }

    }
}
