import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

/**
 * GUI Initialiser  
 * @author Ethan
 * version 1.4
 */

public class Login extends Application{
    
    private double xOffset = 0;
    private double yOffset = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        
        
        //removes top bar of application and functions to move
        stage.initStyle(StageStyle.DECORATED.UNDECORATED);
 
        
        //When clicking box drags it from that position, rather than top left
        root.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle (MouseEvent event){
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
            
        });
        
        //Moves the box with mouse
        root.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle (MouseEvent event){
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
            
        });
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args){
        launch(args);
    }
}


