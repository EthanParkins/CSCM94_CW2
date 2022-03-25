import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
            
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /**
     * Method to exit the application
     * @param event 
     */
    @FXML
    private void btnExitClicked(javafx.event.ActionEvent event) {
        System.exit(0);
    }
    
    /**
     * Method to take in the inputs of the login and password fields 
     * @param event
     * @throws IOException 
     */
    @FXML
    private void btnLoginClicked(javafx.event.ActionEvent event) throws IOException {
        String userID = tfUserID.getText();
        String password = tfPassword.getText();
        String filepath = "login.txt"; 
        verifyFile(userID,password,filepath, event);
    }
    
    /**
     * Method to switch to the register scene
     * @param event
     * @throws IOException 
     */
    @FXML
    public void switchToCustomerRegister(javafx.event.ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("CustomerRegister.fxml"));
        //creates a node for the scene

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
    }
        
    /**
     * Method to verify user input compared to a file
     * @param username the
     * @param password
     * @param filepath 
     */
    public void verifyFile(String username, String password, String filepath, javafx.event.ActionEvent event){
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
                    char firstLetter = username.charAt(0);
                    //switch statement to load up the specifc menu for each user
                    switch(firstLetter){
                        case 'C':
                            System.out.println("loading customer...");
                            break;
                        case 'M':
                            System.out.println("loading Manager...");
                            break;
                        case 'W':
                            System.out.println("loading Waiter...");
                            break;
                        case 'F':
                            System.out.println("loading Chef...");
                            break;
                        case 'D':
                            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                            root = FXMLLoader.load(getClass().getResource("DriverDisplay.fxml"));
                            scene = new Scene(root);
                            stage.setScene(scene);
                            stage.show(); 

                            break;

                        default:
                            break;
                    }

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
