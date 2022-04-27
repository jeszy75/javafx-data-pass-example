package datapass4;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DataPassingApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
        stage.setTitle("JavaFX Data Passing");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
