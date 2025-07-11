
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) {
        Label label = new Label("JavaFX is working!");
        Scene scene = new Scene(label, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test Window");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
