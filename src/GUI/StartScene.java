package GUI;

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class StartScene extends Application {
    static Pane pane = new Pane();
    static Scene startScene;
    static final String IDLE_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #5c85d6;\n-fx-border-radius: 7;";
    static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #002b80;\n-fx-border-radius: 7;";
    static final String INVISIBLE_BUTTON_STYLE = "-fx-border-color: transparent;\n-fx-border-width: 0;\n" +
            "-fx-background-radius: 0;\n-fx-background-color: transparent;";
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pokemon");
        primaryStage.setResizable(false);
        Button PvP = button("Player vs Player"), PvC = button("Computer"), PvE = button("Elite Four");
        PvP.setOnAction(e->primaryStage.setScene(SelectPokemon.getChooseScene(primaryStage)));
        Button easterEgg = new Button();
        easterEgg.setStyle(INVISIBLE_BUTTON_STYLE);
        easterEgg.setMinSize(75, 75);
        setCoordinates(easterEgg, 140, 110);
        ImageView field = new ImageView();
        field.setFitWidth(150);field.setFitHeight(150);
        setCoordinates(field,50, 110);
        easterEgg.setOnMouseEntered(e -> {
            field.setImage(new Image("Images/pikachu.gif"));
        });
        easterEgg.setOnMouseExited(e ->{
            field.setImage(null);
        });
        ImageView mew = new ImageView(new Image("Images/mew.gif")); ImageView mewtwo = new ImageView(new Image("Images/mewtwo.gif"));
        mew.setFitWidth(48);mew.setFitHeight(61.2);
//        mewtwo.setFitWidth(120);mewtwo.setFitHeight(105.6);
        setCoordinates(mew, 90, 370); setCoordinates(mewtwo,650, 370);
//		 Media media = new Media(
//		 "file:/C:/Users/Harsh/Documents/School%20Stuff/Grade%2012/CompSci/Pokemon-FX/src/Images/Theme.mp3");
//		 MediaPlayer player = new MediaPlayer(media);
//		 player.play();
        ImageView background = new ImageView();
        background.setImage(new Image("Images/background.jpg"));
        background.setFitHeight(600); background.setFitWidth(965);
        background.setPreserveRatio(true);
        ImageView title = new ImageView("Images/title.png");
        setCoordinates(title, 100, 230);
        setCoordinates(PvP, 300, 80);
        setCoordinates(PvC, 200, 170);
        setCoordinates(PvE, 451, 170);
        setButtonHover(PvP); setButtonHover(PvC); setButtonHover(PvE);
//      PvP.setOnAction(e ->{
//            primaryStage.setScene(TBD);
//        });
//        PvC.setOnAction(e ->{
//            primaryStage.setScene(TBD);
//        });
//        PvE.setOnAction(e ->{
//            primaryStage.setScene(TBD);
//        });
        pane.getChildren().addAll(background, PvP, PvC, PvE, title, field, easterEgg, mew, mewtwo);
        pane.setCursor(new ImageCursor(new Image("Images/cursor.gif"), 2,2));
        startScene = new Scene(pane, 965, 600);
        primaryStage.setScene(startScene);
        primaryStage.show();

    }

    public void setCoordinates(Object a, int x, int y) {
        ((Node) a).setLayoutX(x);
        ((Node) a).setLayoutY(y);
    }

    public Button button(String label) {
        Button button = new Button(label);
        button.setStyle(IDLE_BUTTON_STYLE);
        return button;
    }

    public void setButtonHover(Button button){
        button.setOnMouseEntered(e -> button.setStyle(HOVERED_BUTTON_STYLE));
        button.setOnMouseExited(e -> button.setStyle(IDLE_BUTTON_STYLE));
    }
}
