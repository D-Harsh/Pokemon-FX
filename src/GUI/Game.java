package GUI;

import Pokemon.Pokemon;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import java.util.Arrays;
import static GUI.Tools.*;

public class Game {

    static public Scene startGameScene(Stage primaryStage, Pokemon[] player1, Pokemon[] player2) {
        final ImageView battleground = new ImageView(), bg = new ImageView(), poke1 = new ImageView(), poke2 = new ImageView(),
                p1Text = new ImageView(), p2Text = new ImageView();
        Image[] backgrounds = {new Image("Images/bb1.png"), new Image("Images/bb2.png"), new Image("Images/bb3.jpg"),
                new Image("Images/bb4.png"), new Image("Images/bb5.png"), new Image("Images/bb6.png"),
                new Image("Images/bb7.jpg"), new Image("Images/bb8.png"), new Image("Images/bb9.png")};


        //Media media = new Media(
        //"file:/C:/Users/Harsh/Documents/School%20Stuff/Grade%2012/CompSci/Pokemon-FX/src/Images/Theme.mp3");
        //MediaPlayer player = new MediaPlayer(media);
        ImageView[] player1Pokeballs = new ImageView[6];
        Arrays.setAll(player1Pokeballs, i -> new ImageView());
        ImageView[] player2Pokeballs = new ImageView[6];
        Arrays.setAll(player2Pokeballs, i -> new ImageView());
        Pane root = new Pane();
        root.setCursor(new ImageCursor(new Image("Images/cursor.gif"), 2, 2));
        Scene battle = new Scene(root, 965, 600);
        // SCENE BACKGROUND SETUP:
        bg.setImage(new Image("Images/battlescene.jpg"));
        bg.setFitHeight(600);
        bg.setFitWidth(965); // Sets the scene background size to fit the scene
        root.getChildren().add(bg);

        // BATTLEFIELD SETUP:
        battleground.setPreserveRatio(true);
        battleground.setFitHeight(326);
        setCoordinates(battleground, 216, 0); // Sets the battlefield background near the top centre
        randBB(battleground, backgrounds); // Randomize the background of the battlefield

        // CREATING STYLING AND PLACING LINES:
        Line line = new Line(482, 326, 482, 600);
        line.setStyle("-fx-stroke: rgba(255, 255, 255, 0.5); -fx-stroke-width: 5");
        root.getChildren().add(line);
        Line p1team = new Line(221, 60, 467, 60);
        p1team.setStyle("-fx-stroke: rgba(0, 0, 0, 0.5); -fx-stroke-width: 10");
        Line p2team = new Line(509, 260, 755, 260);
        p2team.setStyle("-fx-stroke: rgba(0, 0, 0, 0.5); -fx-stroke-width: 10");

        // PLACING THE TWO TRAINERS THAT REPRESENT EACH PLAYER
        ImageView trainer1 = new ImageView(new Image("Images/trainer1.gif"));
        setCoordinates(trainer1, 50, 200);
        ImageView trainer2 = new ImageView(new Image("Images/trainer2.gif"));
        setCoordinates(trainer2, 820, 40);
        trainer1.setPreserveRatio(true); // Prevents the trainer image from being distorted
        trainer1.setFitHeight(100);
        trainer1.setFitWidth(100); // Sets size of trainer1
        trainer2.setPreserveRatio(true); // Prevents the trainer image from being distorted
        trainer2.setFitHeight(100);
        trainer2.setFitWidth(100); // Sets size of trainer2

        // PLACING THE PLAYER1 and PLAYER2 TEXT
        p1Text.setImage(new Image("Images/player1.png"));
        p2Text.setImage(new Image("Images/player2.png"));
        p1Text.setPreserveRatio(true);
        p2Text.setPreserveRatio(true);
        p1Text.setFitWidth(170);
        p2Text.setFitWidth(170);
        setCoordinates(p1Text, 10, 275);
        setCoordinates(p2Text, 770, 120);

        // PLACING THE IMAGEVIEWS WHERE THE POKEMON GO ON THE BATTLEFIELD
        poke1.setFitHeight(100);
        poke2.setFitHeight(100);
        poke1.setPreserveRatio(true);
        poke2.setPreserveRatio(true);
        Pokemon currPoke1 = player1[0];
        Pokemon currPoke2 = player2[0];
        poke1.setImage(currPoke1.getPokemonImage());
        poke2.setImage(currPoke2.getPokemonImage());
        currPoke1 = getCurrentPok(poke1, player1);
        currPoke2 = getCurrentPok(poke2, player2);
        setCoordinates(poke1, 245, 140);
        setCoordinates(poke2, 565, 20);
        // ADDING MOST OF THE COMPONENTS TO THE SCENE
        root.getChildren().addAll(battleground, poke1, poke2, trainer1, trainer2, p1Text, p2Text, p1team, p2team);


        //Making Stat Boxes for Both Current Pokemon
        final TextArea stat1 = makeStatBox(30, 10 ), stat2  = makeStatBox(800,175);
        stat1.setText(currPoke1.toString()); stat2.setText(currPoke2.toString());
        root.getChildren().addAll(stat1,stat2);


        final Button p1m1 = moveButton(currPoke1.getMove0()), p1m2 = moveButton(currPoke1.getMove1()), p1m3 = moveButton(currPoke1.getMove2()),
                p1m4 = moveButton(currPoke1.getMove3()), p2m1 = moveButton(currPoke2.getMove0()), p2m2 = moveButton(currPoke2.getMove1()),
                p2m3 = moveButton(currPoke2.getMove2()), p2m4 = moveButton(currPoke2.getMove3());
        // POKEMON SWITCH BUTTONS AT THE BOTTOM
        for (int i = 0; i < 6; i++) {
            Button pokeButton = pokeSwitchButton(player1[i].getPokemonImage());
            setCoordinates(pokeButton, ((30 * 2 * i)), 500);
            final int a = i;
            pokeButton.setOnAction(e -> {
                poke1.setImage(player1[a].getPokemonImage());
                p1m1.setText(getCurrentPok(poke1, player1).getMove0());
                p1m2.setText(getCurrentPok(poke1, player1).getMove1());
                p1m3.setText(getCurrentPok(poke1, player1).getMove2());
                p1m4.setText(getCurrentPok(poke1, player1).getMove3());
                stat1.setText(getCurrentPok(poke1, player1).toString());
            });
            root.getChildren().add(pokeButton);
        }
        for (int i = 0; i < 6; i++) {
            Button pokeButton = pokeSwitchButton(player2[i].getPokemonImage());
            setCoordinates(pokeButton, (500 + (30 * 2 * i)), 500);
            final int a = i;
            pokeButton.setOnAction(e -> {
                poke2.setImage(player2[a].getPokemonImage());
                p2m1.setText(getCurrentPok(poke2, player2).getMove0());
                p2m2.setText(getCurrentPok(poke2, player2).getMove1());
                p2m3.setText(getCurrentPok(poke2, player2).getMove2());
                p2m4.setText(getCurrentPok(poke2, player2).getMove3());
                stat2.setText(getCurrentPok(poke2, player2).toString());
            });
            root.getChildren().add(pokeButton);
        }

        // MOVE BUTTONS
        setCoordinates(p1m1, 60, 380);
        setCoordinates(p1m2, 240, 380);
        setCoordinates(p1m3, 60, 440);
        setCoordinates(p1m4, 240, 440);
        setCoordinates(p2m1, 580, 380);
        setCoordinates(p2m2, 760, 380);
        setCoordinates(p2m3, 580, 440);
        setCoordinates(p2m4, 760, 440);
        root.getChildren().addAll(p1m1, p1m2, p1m3, p1m4, p2m1, p2m2, p2m3, p2m4);

        // PLACING POKEBALLS TO INDICATE EACH PLAYERS TEAM:
        for (int i = 0; i < 6; i++) {
            setCoordinates(player1Pokeballs[i], (225 + (40 * i)), 40);
            player1Pokeballs[i].setImage(new Image("Images/rightpokeball.png"));
            player1Pokeballs[i].setPreserveRatio(true);
            player1Pokeballs[i].setFitWidth(35);
            root.getChildren().addAll(player1Pokeballs[i]);
        }
        for (int i = 0; i < 6; i++) {
            setCoordinates(player2Pokeballs[i], (720 - (40 * i)), 240);
            player2Pokeballs[i].setImage(new Image("Images/leftpokeball.png"));
            player2Pokeballs[i].setPreserveRatio(true);
            player2Pokeballs[i].setFitWidth(35);
            root.getChildren().addAll(player2Pokeballs[i]);
        }
        musicPlease();


        return battle;
    }

    static public Button pokeSwitchButton(Image pokeImage) {
        Button pokeSwitchButton = new Button();
        pokeSwitchButton.setStyle(INVISIBLE_BUTTON_STYLE);
        ImageView pokemon = new ImageView(pokeImage);
        pokemon.setPreserveRatio(true);
        pokemon.setFitHeight(75);
        pokeSwitchButton.setGraphic(pokemon);
        pokeSwitchButton.setOnMouseEntered(e -> {
            pokeSwitchButton.setStyle(TRANSPARENT_BUTTON_HOVER);
        });
        pokeSwitchButton.setOnMouseExited(e -> {
            pokeSwitchButton.setStyle(INVISIBLE_BUTTON_STYLE);
        });
        return pokeSwitchButton;
    }

    static public Button moveButton(String moveName) {
        Button moveButton = new Button(moveName);
        moveButton.setStyle(MOVE_BUTTON_STYLE);
        moveButton.setOnMouseEntered(e -> {
            moveButton.setStyle(MOVE_BUTTON_HOVER_STYLE);
            // display move info somehow...
        });
        moveButton.setOnMouseExited(e -> {
            moveButton.setStyle(MOVE_BUTTON_STYLE);
        });
        // execute move code here....
        return moveButton;
    }

    static public void randBB(ImageView battleground, Image[] backgrounds) {
        int arrayNum = (int) (Math.random() * 8);
        battleground.setStyle("-fx-border-color: #4d4d4d; -fx-background-radius: 5; -fx-border-width: 6px;; -fx-border-radius: 5;" +
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
        battleground.setImage(backgrounds[arrayNum]);
    }

    static public TextArea makeStatBox(int x, int y){
        TextArea stat = new TextArea();
        stat.setOpacity(0.95);
        stat.setWrapText(true);
        stat.setDisable(true);
        stat.setPrefColumnCount(10);
        stat.setPrefRowCount(10);
        stat.setStyle("-fx-background-color: rgba(0,0,0,0.7);");
        setCoordinates(stat,x,y);
        return stat;
    }

    static Pokemon getCurrentPok(ImageView pokImage, Pokemon[] team) {
        for (Pokemon p : team) {
            if (p.getPokemonImage() == pokImage.getImage()) {
                return p;
            }
        }
        return null;
    }
}