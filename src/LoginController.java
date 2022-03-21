import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class for the login scene
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
    
    private static Scanner in;

    
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
        String password = tfPassword.getText();
        String filepath = "login.txt"; 
        verifyFile(userID,password,filepath);
    }
    
    /**
     * Method to verify user input compared to a file
     * @param username the
     * @param password
     * @param filepath 
     */
    public void verifyFile(String username, String password, String filepath){
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";
        try{
            in = new Scanner(new File(filepath));
            //stops at any of these symbols, username and password split by ,
            in.useDelimiter("[,\n]");
            //reads each record, stops when required name is found
            while(in.hasNext() && !found){
                tempUsername = in.next();
                tempPassword = in.next();
                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                    found = true;
                    lbInfo.setText("logging in...");
                }
            }
            in.close();
            if(!found){
                lbInfo.setText("Incorrect Username/Password");
            }
            
        }
        catch(Exception e){
            lbInfo.setText("Incorrect Username/Password");
        }
    }
}
