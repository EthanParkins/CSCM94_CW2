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
 * FXML Controller class
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
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbOrders.setText("test");
    }    

    @FXML
    private void btnLogOut(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        //creates a node for the scene
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btnExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void btnCompleteClicked(ActionEvent event) {
    }
    
}
