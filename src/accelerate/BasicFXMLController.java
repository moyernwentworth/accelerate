
package accelerate;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BasicFXMLController {
	
     Stage stage;
     Parent root;
    
    @FXML
    private MenuBar menu;

    @FXML
    private MenuBar profile;

    @FXML
    private MenuBar settings;
    
    @FXML 
    private MenuBar settingsBack;
    
    @FXML
    private MenuBar profileBack;

    @FXML
    void handleMenu(MouseEvent event) {
    }

    
	@FXML
    void handleProfile(MouseEvent event) throws Exception{

		if(event.getSource()==profileBack){
            stage = (Stage) profileBack.getScene().getWindow();  //grabs the current stage (by looking at the window that the button belongs to
            root = FXMLLoader.load(getClass().getResource("Accelerate.fxml")); //loads the other scene fxml
        }
        else if(event.getSource()==profile){ //this one wont work yet just because the name profile is used as filler no items on profile gui
           stage = (Stage) profile.getScene().getWindow();  //grabs the current stage (by looking at the window that the button belongs to
           root = FXMLLoader.load(getClass().getResource("profile.fxml"));
        }

       Scene scene = new Scene(root); //instantiates new scene
       stage.setScene(scene);         //sets the scene to the stage
       stage.show();                  //displays it
      
}

    @FXML
    void handleSettings(MouseEvent event) throws Exception {

		if(event.getSource()==settingsBack){
            stage = (Stage) settingsBack.getScene().getWindow();  //grabs the current stage (by looking at the window that the button belongs to
            root = FXMLLoader.load(getClass().getResource("Accelerate.fxml")); //loads the other scene fxml
       
        }
        else if(event.getSource()==settings){ //this one wont work yet just because the name profile is used as filler no items on profile gui
            stage = (Stage) settings.getScene().getWindow();  //grabs the current stage (by looking at the window that the button belongs to
            root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
         }
       Scene scene = new Scene(root); //instantiates new scene
       stage.setScene(scene);         //sets the scene to the stage
       stage.show();                  //displays it
      
}
    }

