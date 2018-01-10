package GUI;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Harsh on 2018-01-09.
 */
public class Practice extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Pokemon");
		Button pok1 = new Button(), pok2 = new Button(), pok3 = new Button();
//		pok1.setText("Charmaleon");
		pok1.setStyle(
                "-fx-background-radius: 5em; " +
                "-fx-min-width: 50px; " +
                "-fx-min-height: 50px; " +
                "-fx-max-width: 50px; " +
                "-fx-max-height: 50px;"
        );
		pok2.setStyle("-fx-background-radius: 5em; " +
                "-fx-min-width: 50px; " +
                "-fx-min-height: 50px; " +
                "-fx-max-width: 50px; " +
                "-fx-max-height: 50px;"
                );
		pok3.setStyle("-fx-background-radius: 5em; " +
                "-fx-min-width: 50px; " +
                "-fx-min-height: 50px; " +
                "-fx-max-width: 50px; " +
                "-fx-max-height: 50px;"
                );
		//Media media = new Media(
		//		"file:/C:/Users/Harsh/Documents/School%20Stuff/Grade%2012/CompSci/Pokemon-FX/src/Images/Theme.mp3");
		//MediaPlayer player = new MediaPlayer(media);
		//player.play();
		Image img1 = new Image(
				"Images/1.gif");
		Image img2 = new Image(
				"Images/2.gif");
		Image img3 = new Image(
				"Images/3.gif");
		Image img4 = new Image(
				"Images/pokeball.png");
		Image[] list = { img1, img2, img3 };
		ImageView field = new ImageView(), bg = new ImageView(), pokeball = new ImageView(img4), pokeball1 = new ImageView(img4), pokeball2 = new ImageView(img4);
		bg.setImage(new Image("Images/bg.png"));
		bg.setFitHeight(600);
		bg.setFitWidth(1000);
		bg.setPreserveRatio(true);
		field.setImage(img1);
		pokeball.setFitHeight(50);pokeball.setFitWidth(50);
		pokeball1.setFitHeight(50);pokeball1.setFitWidth(50);
		pokeball2.setFitHeight(50);pokeball2.setFitWidth(50);
		pok1.setGraphic(pokeball);
		pok2.setGraphic(pokeball1);
		pok3.setGraphic(pokeball2);
		pok1.setOnAction(e -> {
			field.setImage(list[0]);
		});
		pok2.setOnAction(e -> {
			field.setImage(list[1]);
		});
		pok3.setOnAction(e -> {
			field.setImage(list[2]);
		});
		Pane root = new Pane();
		setCoordinates(pok1, 0, 0);
		setCoordinates(pok2, 0, 50);
		setCoordinates(pok3, 0, 100);
		setCoordinates(field, 100, 0);
		root.getChildren().addAll(bg,pok1, pok2, pok3, field);
		primaryStage.setScene(new Scene(root, 1000,600 ));
		primaryStage.show();

	}


	public void setCoordinates(Object a, int x, int y) {
		((Node) a).setLayoutX(x);
		((Node) a).setLayoutY(y);
	}
}
