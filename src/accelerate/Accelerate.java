package accelerate;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Accelerate extends Application {

	Parent root;
    Scene staged;
    @Override
    public void start(Stage primaryStage) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Accelerate.fxml"));
        staged = new Scene(root);
        primaryStage.setTitle("Freelance");
        primaryStage.setResizable(false);
        primaryStage.setScene(staged);
        primaryStage.show();
        }
   
public static void main(String[] args) {
    launch(args);
	}
}
