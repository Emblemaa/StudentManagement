package Classes.Tools;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Tools {
    public static void changeScene(Parent root, ActionEvent event)
    {
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public static URI IDtoURI(URL path) throws URISyntaxException
    {
        return path.toURI();
    }

    public static void alert(String content, Alert.AlertType alertType)
    {
        Alert alert = new Alert(alertType);
        alert.setContentText(content);
        alert.setHeaderText(null);
        alert.showAndWait();
    }
}
