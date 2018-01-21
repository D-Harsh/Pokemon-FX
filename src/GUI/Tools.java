package GUI;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Harsh on 2018-01-21.
 */
public class Tools {
    public static final String IDLE_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #5c85d6;\n-fx-border-radius: 7;";
    public static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #002b80;\n-fx-border-radius: 7;";
    public static final String INVISIBLE_BUTTON_STYLE = "-fx-border-color: transparent;\n-fx-border-width: 0;\n" +
            "-fx-background-radius: 0;\n-fx-background-color: transparent;";
    public static void setCoordinates(Object a, int x, int y) {
        ((Node) a).setLayoutX(x);
        ((Node) a).setLayoutY(y);
    }

    public static Button button(String label) {
        Button button = new Button(label);
        button.setStyle(IDLE_BUTTON_STYLE);
        return button;
    }

    public static void setButtonHover(Button button){
        button.setOnMouseEntered(e -> button.setStyle(HOVERED_BUTTON_STYLE));
        button.setOnMouseExited(e -> button.setStyle(IDLE_BUTTON_STYLE));
    }

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
}