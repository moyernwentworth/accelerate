package accelerate;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class ProductPage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ProductPage.fxml"));
        primaryStage.setTitle("Freelance");
        primaryStage.setScene(new Scene(root, 335, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
        }
    
	

public static void main(String[] args) {
    launch(args);
}
}