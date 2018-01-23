package GUI;
//Package Declaration and Imports for JavaFX Libraries
import javafx.application.Application;
import javafx.stage.Stage;
//Custom Made tools class import
import static GUI.Tools.musicPlease;

/**
 * Created by Harsh on 2018-01-21.
 */
public class Main extends Application{
    //Application Launcher
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Start Screen Set Up
        primaryStage.setTitle("Pokemon");
        //Keeps the resolution of the application fixed
        primaryStage.setResizable(false);
        primaryStage.setScene(StartScene.startScene(primaryStage));
        //shows the stage on a window
        primaryStage.show();
        //some food for your ears
        musicPlease();
    }
}
