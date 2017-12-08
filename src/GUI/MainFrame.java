package GUI;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.net.URL;
public class MainFrame extends Application
{



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("mainFrame.fxml"));
        primaryStage.setTitle("AppApp");
//        primaryStage.setScene(new Scene(root, 300, 275));

        Scene loginScene = new Scene(root, 275, 400);

        primaryStage.setScene(loginScene);

        File file = new File("resources/css/loginStyle.css");
        URL url = file.toURI().toURL();
        loginScene.getStylesheets().add(url.toExternalForm());

        primaryStage.show();
    }

    public void showGUI() {
        launch();
    }




}


