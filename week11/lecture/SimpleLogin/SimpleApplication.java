package lecture.SimpleLogin;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimpleApplication extends Application {
    @Override
    public void start(Stage primStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("simple.fxml"));
        primStage.setScene(new Scene(root));
        primStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}