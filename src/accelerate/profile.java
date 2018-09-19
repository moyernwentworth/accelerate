package accelerate;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class profile extends Application {
	public Parent root;
	public Scene staged;
	
    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("ProductPage.fxml"));
        staged=new Scene(root);
        primaryStage.setTitle("Freelance");
        primaryStage.setScene(staged);
        primaryStage.show();
        primaryStage.setResizable(false);
        }
    
	

public static void main(String[] args) {
    launch(args);
}
}