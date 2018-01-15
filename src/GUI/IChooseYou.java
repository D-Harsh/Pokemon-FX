package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class IChooseYou extends Application {
        static Pane pane2 = new Pane();
        static Scene ChoiceScene;
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Pokedex");
        ImageView background = new ImageView();
        background.setImage(new Image("Images/background.jpg"));
        background.setFitHeight(480);
        background.setFitWidth(768);
        primaryStage.setResizable(false);
        TextField pokeChoice = new TextField();
        Button Submit = new Button("Submit");

    }

    private boolean isValid(TextField input, String message){
        try{
            int pokeNum = Integer.parseInt(input.getText());
            if (pokeNum < 150){
                System.out.println("User is: " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
    }
}
