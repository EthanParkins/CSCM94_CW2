import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ethan
 */
public class LoginController implements Initializable {

    @FXML
    private TextField tfUserID;
    @FXML
    private PasswordField tfPasswordID;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnExitClicked(javafx.event.ActionEvent event) {
        System.exit(0);
    }
}
