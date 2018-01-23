package GUI;
//Package Declaration and Imports for JavaFX Libraries

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import static GUI.Tools.*;

//Inheritance of the Application JavaFX Library
public class StartScene {


    //Starts the application
    static public Scene startScene(Stage primaryStage) {
        //Basic Pane and Scene for start screen GUI
        Pane pane = new Pane();
        Scene startScene;
        //Buttons for different modes of the game and their actions when clicked
        Button PvP = button("Player vs Player"), PvE = button("Elite Four");
        PvP.setOnAction(e -> primaryStage.setScene(SelectPokemon.getChooseScene(primaryStage)));
        PvE.setOnAction(e -> primaryStage.setScene(Elite4.getChooseScene(primaryStage)));
        //Easter Egg button that pops a Pikachu from no where  for fun
        Button easterEgg = new Button();
        easterEgg.setStyle(INVISIBLE_BUTTON_STYLE);
        easterEgg.setMinSize(75, 75);
        ImageView field = new ImageView();
        //Sets up the easter egg button field and shows a pikachu when that button is activated
        field.setFitWidth(150);
        field.setFitHeight(150);
        easterEgg.setOnMouseEntered(e -> {
            field.setImage(new Image("Images/pikachu.gif"));
        });
        easterEgg.setOnMouseExited(e -> {
            field.setImage(null);
        });
        //Some music for the game
//        musicPlease();
        //More ImageViews for On screen Pokemon with dimension constraints
        ImageView mew = new ImageView(new Image("Images/mew.gif"));
        ImageView mewtwo = new ImageView(new Image("Images/mewtwo.gif"));
        mew.setFitWidth(48);
        mew.setFitHeight(61.2);
        //sets up the background for this scene
        ImageView background = new ImageView();
        background.setImage(new Image("Images/background.jpg"));
        background.setFitHeight(600);
        background.setFitWidth(965);
        background.setPreserveRatio(true);
        ImageView title = new ImageView("Images/title.png");
        //places everything on the Start Scene
        setCoordinates(easterEgg, 140, 110);
        setCoordinates(field, 50, 110);
        setCoordinates(title, 100, 230);
        setCoordinates(mew, 90, 370);
        setCoordinates(mewtwo, 650, 370);
        setCoordinates(PvP, 300, 375);
        setCoordinates(PvE, 500, 375);
        setButtonHover(PvP);
        setButtonHover(PvE);
        //Adds everything the Pane and the Start scene is added to the Window
        pane.getChildren().addAll(background, title, field, easterEgg, mew, mewtwo, PvP, PvE);
        pane.setCursor(new ImageCursor(new Image("Images/cursor.gif"), 2, 2));
        startScene = new Scene(pane, 965, 600);
        return startScene;
    }

}
