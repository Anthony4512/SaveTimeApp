package GUI;

import AppMain.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginScreenController implements Initializable
{


    @FXML
    private Label statusLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private ImageView userImage;


    public void login(ActionEvent event) {
        if(usernameTextField.getText().equalsIgnoreCase("AppApp") && passwordTextField.getText().equals("pass")) {
            statusLabel.setText("Login Success");
            statusLabel.setFont(Font.font( "Courier New", FontWeight.BOLD, 18));
            statusLabel.setTextFill(Color.GREEN);

        }
        else {
            statusLabel.setFont(Font.font( "Courier New", FontWeight.BOLD, 18));
            statusLabel.setTextFill(Color.RED);
            statusLabel.setText("Login Failed");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
//        userImage.setImage(new Image("user.png"));
        userImage.setImage(new Image(location.toExternalForm()));  //TODO check where to inflate the image from --> this is not working

    }
}
