package GUI;
//Package Declaration and Imports for JavaFX Libraries

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * Created by Harsh on 2018-01-21.
 */
//Class for reusing important CSS and Methods
public class Tools {
    //CSS for different button styles
    public static final String IDLE_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #5c85d6;\n-fx-border-radius: 7;";
    public static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #002b80;\n-fx-border-radius: 7;";
    public static final String INVISIBLE_BUTTON_STYLE = "-fx-border-color: transparent;\n-fx-border-width: 0;\n" +
            "-fx-background-radius: 0;\n-fx-background-color: transparent;";
    public static final String TRANSPARENT_BUTTON_HOVER = "-fx-background-color: rgba(0, 0, 0, 0.5); -fx-background-radius: 10000;";
    public static final String MOVE_BUTTON_STYLE = "-fx-min-width: 150px; -fx-max-height: 80px; -fx-border-width: 3px; " +
            "-fx-border-color: rgba(0, 0, 0, 0.3); -fx-border-radius: 5; -fx-background-radius: 5;";
    public static final String MOVE_BUTTON_HOVER_STYLE = "-fx-min-width: 150px; -fx-max-height: 80px; -fx-border-width: 3px;" +
            "-fx-border-color: rgba(0, 0, 0, 0.7); -fx-border-radius: 5; -fx-background-radius: 5;";

    //Positioning Method for any GUI element
    public static void setCoordinates(Object a, int x, int y) {
        ((Node) a).setLayoutX(x);
        ((Node) a).setLayoutY(y);
    }

    //Simple Button Method with predefined styles
    public static Button button(String label) {
        Button button = new Button(label);
        button.setStyle(IDLE_BUTTON_STYLE);
        return button;
    }

    //Button Hover method
    public static void setButtonHover(Button button) {
        button.setOnMouseEntered(e -> button.setStyle(HOVERED_BUTTON_STYLE));
        button.setOnMouseExited(e -> button.setStyle(IDLE_BUTTON_STYLE));
    }

    //Pokeball button creation method
    public static Button pokebutton() {
        Button pok1 = new Button();
        pok1.setStyle("-fx-background-radius: 4em; " + "-fx-min-width: 20px; " + "-fx-min-height: 20px; "
                + "-fx-max-width: 20px; " + "-fx-max-height: 20px;");
        Image ball = new Image("Images/pokeball.png");
        ImageView pokeball = new ImageView(ball);
        pokeball.setFitHeight(50);
        pokeball.setFitWidth(50);
        pok1.setGraphic(pokeball);
        return pok1;
    }

    //Music Player Method
    public static void musicPlease() {
        Media media = new Media(
                "file:/" + (System.getProperty("user.dir").replace('\\', '/')).replace(" ", "%20") + "/" + "src/Images/Theme.mp3");
        MediaPlayer player = new MediaPlayer(media);
        player.play();
    }
    public static Button homeButton(Stage primaryStage){
        Button Home = button("Home");
        setButtonHover(Home);
        setCoordinates(Home, 0, 0);
        Scene Back = StartScene.startScene(primaryStage);
        Home.setOnAction(e-> primaryStage.setScene(Back));
        return Home;
    }
}
