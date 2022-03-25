import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class for the Driver Display
 *
 * @author Ethan
 */
public class DriverDisplayController implements Initializable {

    @FXML
    private Label lbOrders;
    @FXML
    private TextField tfCompletedOrder;
    @FXML
    private Label lbDriverID;

    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Initialises the controller class.
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbOrders.setText("test");
    }    
    
    /**
     * Method to switch scene to login.
     * @param event
     * @throws IOException 
     */
    @FXML
    private void btnLogOut(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        //creates a node for the scene
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Method to exit the application
     * @param event 
     */
    @FXML
    private void btnExit(ActionEvent event) {
        System.exit(0);
    }

    /**
     * Method to complete specified order 
     * @param event 
     */
    @FXML
    private void btnCompleteClicked(ActionEvent event) {
    }
    
}
