package GUI;

import javafx.application.Application;
import javafx.stage.Stage;

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
        primaryStage.show();
        musicPlease();
    }
}
