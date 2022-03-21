import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    private void btnLoginClicked(javafx.event.ActionEvent event) throws IOException {
        String userID = tfUserID.getText();
        String lastName = tfPassword.getText();
        String filepath = "login.txt"; 
        /* creates file and adds to it, but only one thing and doesn't read
        StringBuilder login = new StringBuilder();
        login.append(tfUserID.getText().toString() + "\n");
        login.append(tfPassword.getText().toString() + "\n");
        
        File loginFile = new File("C:\\Users\\Ethan\\OneDrive\\Comp Sci\\CSCM94\\CW2\\CSCM94_CW2\\login.txt");
        FileWriter writer = new FileWriter(loginFile);
        writer.write(login.toString());
        writer.close();
        */
        
        /*
        //pulls infomation from text fields
        String userID = tfUserID.getText();
        String lastName = tfPassword.getText();
        //test code, will be 'incorrect password' text, when checking ID vs password
        lbInfo.setText("Welcome " + userID);  
        */
    }
    
    public static void verifyLogin(String username, String password, String filepath){
        boolean found = false;
    }
}
