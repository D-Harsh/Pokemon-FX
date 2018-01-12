package GUI;

import javafx.application.Application;
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
    final String IDLE_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #5c85d6;\n-fx-border-radius: 7;";
    final String HOVERED_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #003cb3;\n-fx-border-radius: 7;";

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pokemon");
        primaryStage.setResizable(false);
        Button PvP = button("Player vs Player"), PvC = button("Computer"), PvE = button("Elite Four");
//		 Media media = new Media(
//		 "file:/C:/Users/Harsh/Documents/School%20Stuff/Grade%2012/CompSci/Pokemon-FX/src/Images/Theme.mp3");
//		 MediaPlayer player = new MediaPlayer(media);
//		 player.play();
        ImageView background = new ImageView();
        background.setImage(new Image("Images/background.jpg"));
        background.setFitHeight(480);
        background.setFitWidth(768);
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
        pane.getChildren().addAll(background, PvP, PvC, PvE, title);
        startScene = new Scene(pane, 768, 480);
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
