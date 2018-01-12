package GUI;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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
		Button pok1 = pokebutton(), pok2 = pokebutton(), pok3 = pokebutton(), pok4 = pokebutton(), pok5 = pokebutton(),
                pok6 = pokebutton();
//		 Media media = new Media(
//		 "file:/C:/Users/Harsh/Documents/School%20Stuff/Grade%2012/CompSci/Pokemon-FX/src/Images/Theme.mp3");
//		 MediaPlayer player = new MediaPlayer(media);
//		 player.play();
        ImageView field = new ImageView(), bg = new ImageView(), field2 = new ImageView();
        bg.setImage(new Image("Images/background.jpg"));
		bg.setFitHeight(600);
		bg.setFitWidth(1000);
		bg.setPreserveRatio(true);
		Image img1 = new Image("Images/1.gif");
		Image img2 = new Image("Images/2.gif");
		Image img3 = new Image("Images/3.gif");
        Image img4 = new Image("Images/4.gif");
        Image img5 = new Image("Images/5.gif");
        Image img6 = new Image("Images/6.gif");
		Image[] opplist = { img1, img2, img3 };
		Image[] ownlist = { img4, img5, img6};
        field.setFitWidth(250);field.setFitHeight(250);
        field.setImage(img1);
        field2.setFitWidth(150);field2.setFitHeight(150);
        field2.setImage(img4);
		pok1.setOnAction(e -> {
			field.setImage(opplist[0]);
		});
		pok2.setOnAction(e -> {
			field.setImage(opplist[1]);
		});
		pok3.setOnAction(e -> {
			field.setImage(opplist[2]);
		});
        pok4.setOnAction(e -> {
            field2.setImage(ownlist[0]);
        });
        pok5.setOnAction(e -> {
            field2.setImage(ownlist[1]);
        });
        pok6.setOnAction(e -> {
            field2.setImage(ownlist[2]);
        });
		Pane root = new Pane();
		setCoordinates(pok1, 900, 20);
		setCoordinates(pok2, 900, 80);
		setCoordinates(pok3, 900, 140);
        setCoordinates(pok4, 10, 420);
        setCoordinates(pok5, 10, 480);
        setCoordinates(pok6, 10, 540);
		setCoordinates(field,650, 100);
        setCoordinates(field2,200, 300);
		root.getChildren().addAll(bg, pok1, pok2, pok3,pok4,pok5,pok6, field, field2);
		primaryStage.setScene(new Scene(root, 965, 600));
		primaryStage.show();

	}

	public void setCoordinates(Object a, int x, int y) {
		((Node) a).setLayoutX(x);
		((Node) a).setLayoutY(y);
	}

	public Button pokebutton() {
		Button pok1 = new Button();
		pok1.setStyle("-fx-background-radius: 5em; " + "-fx-min-width: 50px; " + "-fx-min-height: 50px; "
				+ "-fx-max-width: 50px; " + "-fx-max-height: 50px;");
		Image ball = new Image("Images/pokeball.png");
		ImageView pokeball = new ImageView(ball);
		pokeball.setFitHeight(50);
		pokeball.setFitWidth(50);
		pok1.setGraphic(pokeball);
		return pok1;
	}
}
