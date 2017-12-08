package AppMain;


import GUI.MainFrame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//public class Main {
//
//
//    public static void main(String[] args) {
//        // write your code here
//
//        MainFrame frame = new MainFrame();
//        frame.show();
//
//        Tester tester = new Tester();
//        tester.run();
//    }
//
//}


public class Main
{

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("mainFrame.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }


    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.run();

        //creates new mainframe(app window) and displays the GUI for the app
        MainFrame frame = new MainFrame();
        frame.showGUI();

//        launch(args);
    }
}
