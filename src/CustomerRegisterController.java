/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ethan
 */
public class CustomerRegisterController implements Initializable {

    @FXML
    private PasswordField tfRegisterPassword;
    @FXML
    private Label lbCustomerID;

    private Stage stage;
    private Scene scene;
    private Parent root;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set this to the next customer ID required. Need to search the text
        //file to find this.
        lbCustomerID.setText("test");
    }    

    @FXML
    private void generateID(KeyEvent event) {
    }

    @FXML
    private void btnRegisterClicked(ActionEvent event) {
    }

    @FXML
    private void btnExitClicked(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void switchToLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        //creates a node for the scene
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
