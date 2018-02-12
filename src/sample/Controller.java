package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sun.security.util.Password;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private loginModel loginmodel = new loginModel();
    @FXML
    private Label dbStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button btnLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (this.loginmodel.isDatabaseConnection()) {
            this.dbStatus.setText("Connected to DB");
        } else {
            this.dbStatus.setText("Not Connected to DB");
        }


    }//initialize

    @FXML
    public void Login(ActionEvent){
        try {
            if (this.loginmodel.isLogin(this.username.getText(),this.password.getText())){
                Stage.stsge = this.btnLogin.getScene().get();
                stsge.close();

                adminLogin();
            }else {
                JOptionPane.showMessageDialog(Component:null,"Your username or "+"password");
        }
        }catch ((Exception localException)){
            localExceptio.printStackTrace();
        }
    }//Login

    private void adminLogin() {
        try{
            Stage adminStage
            FXMLLoader adminLogin = new FXMLLoader();
            Pane aminRoot = (Pane)adminLogin.load(getClass().getResource(""+"/Admin/AdminDascBoaed.fxml").openStream());

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }


}