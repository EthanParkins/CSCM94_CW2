import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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
    private PasswordField tfPassword;
    @FXML
    private Label lbInfo;

    
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

    @FXML
    private void btnLoginClicked(javafx.event.ActionEvent event) {
        //pulls infomation from text fields
        String userID = tfUserID.getText();
        String lastName = tfPassword.getText();
        
        //test code, will be 'incorrect password' text, when checking ID vs password
        lbInfo.setText("Welcome " + userID);
    }
}
