package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    public void onActionSettingButton(ActionEvent actionEvent) throws IOException {

        Parent settings = FXMLLoader.load(getClass().getResource("fxml/settings.fxml"));
        Scene settings_page = new Scene(settings);
        Stage settings_stage = new Stage();
        settings_stage.setScene(settings_page);
        settings_stage.show();

    }

    public void onActionCheckButton(ActionEvent actionEvent) throws IOException {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("We are workin on it! It will be ready very soon!");
        alert.showAndWait();

    }
    public void onActionInfoButton(ActionEvent actionEvent) throws IOException {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText("This app is created for learning purposes! Author: Skotiskot; Copyrights 2018");
        alert.showAndWait();

    }

}
