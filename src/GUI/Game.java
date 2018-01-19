package GUI;

import Moves.AttackMove;
import Moves.Move;
import Pokemon.Pokemon;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class Game {
    static final String TRANSPARENT_BUTTON_HOVER = "-fx-background-color: rgba(0, 0, 0, 0.5); -fx-background-radius: 10000;";
    static final String MOVE_BUTTON_STYLE = "-fx-min-width: 150px; -fx-max-height: 80px; -fx-border-width: 3px; " +
            "-fx-border-color: rgba(0, 0, 0, 0.3); -fx-border-radius: 5; -fx-background-radius: 5;";
    static final String MOVE_BUTTON_HOVER_STYLE = "-fx-min-width: 150px; -fx-max-height: 80px; -fx-border-width: 3px;" +
            "-fx-border-color: rgba(0, 0, 0, 0.7); -fx-border-radius: 5; -fx-background-radius: 5;";
    static Move waste = new AttackMove("Fire",25,100,new Image("Images/trainer1.gif"));
    static Pokemon[] pokedex = {new Pokemon("Charmander","Fire",255,250,1.3,
            waste,waste,waste,waste,new Image("Images/1.gif"),1),
            new Pokemon("Charmaleon","Fire",255,250,1.3,
                    waste,waste,waste,waste,new Image("Images/2.gif"),2),
            new Pokemon("Charizard","Fire",255,250,1.3,
                    waste,waste,waste,waste,new Image("Images/3.gif"),3)};

    static public Scene startGameScene(Stage primaryStage){
        ImageView battleground = new ImageView(), bg = new ImageView(), poke1 = new ImageView(), poke2 = new ImageView(),
                p1Text = new ImageView(), p2Text = new ImageView();
        Image[] backgrounds = {new Image("Images/bb1.png"), new Image("Images/bb2.png"),new Image("Images/bb3.jpg"),
                new Image("Images/bb4.png"), new Image("Images/bb5.png"), new Image("Images/bb6.png"),
                new Image("Images/bb7.jpg"), new Image("Images/bb8.png"), new Image("Images/bb9.png")};

        Pokemon[] player1 = {pokedex[0], pokedex[0], pokedex[1], pokedex[1], pokedex[2], pokedex[2]};
        Pokemon[] player2 = {pokedex[0], pokedex[0], pokedex[1], pokedex[1], pokedex[2], pokedex[2]};

        //Media media = new Media(
        //"file:/C:/Users/Harsh/Documents/School%20Stuff/Grade%2012/CompSci/Pokemon-FX/src/Images/Theme.mp3");
        //MediaPlayer player = new MediaPlayer(media);
        ImageView[] player1Pokeballs = {new ImageView(), new ImageView(), new ImageView(), new ImageView(), new ImageView(), new ImageView()};
        ImageView[] player2Pokeballs = {new ImageView(), new ImageView(), new ImageView(), new ImageView(), new ImageView(), new ImageView()};
        Pane root = new Pane();
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
        randBB(battleground,backgrounds); // Randomize the background of the battlefield

        // CREATING STYLING AND PLACING LINES:
        Line line = new Line(482, 326,   482,   600);
        line.setStyle("-fx-stroke: rgba(255, 255, 255, 0.5); -fx-stroke-width: 5");
        root.getChildren().add(line);
        Line p1team = new Line(221, 60,   467,   60);
        p1team.setStyle("-fx-stroke: rgba(0, 0, 0, 0.5); -fx-stroke-width: 10");
        Line p2team = new Line(509, 260,   755,   260);
        p2team.setStyle("-fx-stroke: rgba(0, 0, 0, 0.5); -fx-stroke-width: 10");

        // PLACING THE TWO TRAINERS THAT REPRESENT EACH PLAYER
        ImageView trainer1 = new ImageView(new Image("Images/trainer1.gif"));
        setCoordinates(trainer1, 50, 180);
        ImageView trainer2 = new ImageView(new Image("Images/trainer2.gif"));
        setCoordinates(trainer2, 820, 60);
        trainer1.setPreserveRatio(true); // Prevents the trainer image from being distorted
        trainer1.setFitHeight(100);trainer1.setFitWidth(100); // Sets size of trainer1
        trainer2.setPreserveRatio(true); // Prevents the trainer image from being distorted
        trainer2.setFitHeight(100);trainer2.setFitWidth(100); // Sets size of trainer2

        // PLACING THE PLAYER1 and PLAYER2 TEXT
        p1Text.setImage(new Image("Images/player1.png")); p2Text.setImage(new Image("Images/player2.png"));
        p1Text.setPreserveRatio(true); p2Text.setPreserveRatio(true);
        p1Text.setFitWidth(170);p2Text.setFitWidth(170);
        setCoordinates(p1Text, 10, 260); setCoordinates(p2Text,770,140);

        // PLACING THE IMAGEVIEWS WHERE THE POKEMON GO ON THE BATTLEFIELD
        poke1.setFitHeight(150); poke2.setFitHeight(150);
        Pokemon currPoke1 = player1[0]; Pokemon currPoke2 = player2[0];
        poke1.setImage(currPoke1.getPokemonImage()); poke2.setImage(currPoke2.getPokemonImage());
        setCoordinates(poke1, 230, 150); setCoordinates(poke2, 530, -10);

        // ADDING MOST OF THE COMPONENTS TO THE SCENE
        root.getChildren().addAll(battleground, poke1, poke2, trainer1, trainer2, p1Text, p2Text, p1team, p2team);


        // POKEMON SWITCH BUTTONS AT THE BOTTOM
        for(int i = 0; i < 6; i++){
            Button pokeButton = pokeSwitchButton(player1[i].getPokemonImage());
            setCoordinates(pokeButton, (150 + (40*i)), 500);
//            pokeButton.setOnAction(e->{
//
//            });
            root.getChildren().add(pokeButton);
        }
        for(int i = 0; i < 6; i++){
            Button pokeButton = pokeSwitchButton(player2[i].getPokemonImage());
            setCoordinates(pokeButton, (520 + (40*i)), 500);
//            pokeButton.setOnAction(e->{
//
//            });
            root.getChildren().add(pokeButton);
        }

        // MOVE BUTTONS
        Button p1m1 = moveButton("waste"), p1m2 = moveButton("waste"), p1m3 = moveButton("waste"),
                p1m4 = moveButton("waste"), p2m1 = moveButton("waste"), p2m2 = moveButton("waste"),
                p2m3 = moveButton("waste"), p2m4 = moveButton("waste");
        setCoordinates(p1m1, 60, 380); setCoordinates(p1m2, 240, 380); setCoordinates(p1m3, 60, 440);
        setCoordinates(p1m4, 240, 440);
        setCoordinates(p2m1, 580, 380); setCoordinates(p2m2, 760, 380); setCoordinates(p2m3, 580, 440);
        setCoordinates(p2m4, 760, 440);
        root.getChildren().addAll(p1m1,p1m2,p1m3,p1m4,p2m1,p2m2,p2m3,p2m4);

        // PLACING POKEBALLS TO INDICATE EACH PLAYERS TEAM:
        for(int i = 0; i < 6; i++){
            setCoordinates(player1Pokeballs[i], (225 + (40 *i)), 40);
            player1Pokeballs[i].setImage(new Image("Images/rightpokeball.png"));
            player1Pokeballs[i].setPreserveRatio(true);
            player1Pokeballs[i].setFitWidth(35);
            root.getChildren().addAll(player1Pokeballs[i]);
        }
        for(int i = 0; i <6; i++){
            setCoordinates(player2Pokeballs[i], (720 - (40 *i)), 240);
            player2Pokeballs[i].setImage(new Image("Images/leftpokeball.png"));
            player2Pokeballs[i].setPreserveRatio(true);
            player2Pokeballs[i].setFitWidth(35);
            root.getChildren().addAll(player2Pokeballs[i]);
        }

        return battle;
    }

    static public Button pokeSwitchButton(Image pokeImage) {
        Button pokeSwitchButton = new Button();
        pokeSwitchButton.setStyle(StartScene.INVISIBLE_BUTTON_STYLE);
        ImageView pokemon = new ImageView(pokeImage);
        pokemon.setPreserveRatio(true);
        pokemon.setFitHeight(75);
        pokeSwitchButton.setGraphic(pokemon);
        pokeSwitchButton.setOnMouseEntered(e -> {
            pokeSwitchButton.setStyle(TRANSPARENT_BUTTON_HOVER);
        });
        pokeSwitchButton.setOnMouseExited(e -> {
            pokeSwitchButton.setStyle(StartScene.INVISIBLE_BUTTON_STYLE);
        });
        return pokeSwitchButton;
    }

    static public Button moveButton(String moveName){
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

    static public void setCoordinates(Object a, int x, int y) {
        ((Node) a).setLayoutX(x);
        ((Node) a).setLayoutY(y);
    }

    static public void randBB(ImageView battleground, Image[] backgrounds){
        int arrayNum = (int)(Math.random() * 8);
        battleground.setStyle("-fx-border-color: #4d4d4d; -fx-background-radius: 5; -fx-border-width: 6px;; -fx-border-radius: 5;" +
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
        battleground.setImage(backgrounds[arrayNum]);
    }
}