
package accelerate;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BasicFXMLController {
	 profile profileScene = new profile();
     Accelerate accelerate = new Accelerate();
    @FXML
    private MenuBar menu;

    @FXML
    private MenuBar profile;

    @FXML
    private MenuBar settings;

    @FXML
    void handleMenu(MouseEvent event) {
    	System.exit(0);
    }

	@FXML
    void handleProfile(MouseEvent event) throws IOException {
       
        Stage stage;
        Parent root;
       
        if(event.getSource()=="Accelerate.fxml"){
            stage = (Stage) accelerate.root.getScene().getWindow();  //grabs the current stage (by looking at the window that the button belongs to
            root = FXMLLoader.load(getClass().getResource("ProductPage.fxml")); //loads the other scene fxml
        }else {
           stage = (Stage) profileScene.root.getScene().getWindow();
           root = FXMLLoader.load(getClass().getResource("Accelerate.fxml"));
        
        Scene scene = new Scene(root); //instantiates new scene
        stage.setScene(scene);         //sets the scene to the stage
        stage.show();                  //displays it
    }        
}

    @FXML
    void handleSettings(MouseEvent event) {
    	System.exit(0);
    }
   
    
}