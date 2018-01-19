package GUI;

import Moves.AttackMove;
import Moves.Move;
import Pokemon.Pokemon;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;




/**
 * Created by Harsh on 2018-01-17.
 */
public class SelectPokemon {
    static Move waste = new AttackMove("Fire", 25, 100, 100);
    static Pokemon[] pokedex = Pokemon.Pokemans.pokedex;
    static public Scene getChooseScene(Stage primaryStage) {
        ImageView trainer1 = new ImageView(new Image("Images/trainer1.gif"));
        ImageView trainer2 = new ImageView(new Image("Images/trainer2.gif"));
        ImageView pokeball = new ImageView(new Image("Images/pokeballanimated.gif"));
        ImageView players = new ImageView(new Image("Images/p1p2.png"));
        ImageView pokefield = new ImageView();
        pokefield.setFitHeight(225);
        pokefield.setFitWidth(225);
        pokefield.setPreserveRatio(true);
        trainer2.setFitHeight(200);
        trainer2.setFitWidth(200);
        trainer2.setPreserveRatio(true);
        players.setFitWidth(400);
        players.setFitHeight(200);
        players.setPreserveRatio(true);
        setCoordinates(players, 295, 20);
        setCoordinates(pokefield, 380, 200);
        setCoordinates(pokeball, 350, 400);
        setCoordinates(trainer1, 30, 100);
        setCoordinates(trainer2, 700, 100);
        ImageView background = new ImageView(new Image("Images/background.jpg"));
        background.setFitHeight(600);
        background.setFitWidth(965);
        Pane selectPane = new Pane();
        selectPane.getChildren().addAll(background, trainer1, trainer2, players, pokeball, pokefield);
        //text fields and buttons
        //Team 1 setup
        TextField[] team1 = new TextField[6];
        Button[] buttons1 = new Button[6];

        for (int i = 1; i <= 6; i++) {
            TextField tf = new TextField("Enter Pokedex Num");
            tf.setOpacity(0.90);
            setCoordinates(tf, 50, 250 + (i * 50));
            Button show = pokebutton();
            setCoordinates(show, 200, 250 + (i * 50));
            tf.setOnAction(e -> checkPokedexNum(tf, pokefield));
            show.setOnAction(e -> checkPokedexNum(tf, pokefield));
            selectPane.getChildren().addAll(tf, show);
            team1[i - 1] = tf;
            buttons1[i - 1] = show;
        }

        //Team 2 setup
        TextField[] team2 = new TextField[6];
        Button[] buttons2 = new Button[6];
        for (int i = 1; i <= 6; i++) {
            TextField tf = new TextField("Enter Pokedex Num");
            tf.setOpacity(0.90);
            setCoordinates(tf, 750, 250 + (i * 50));
            Button show = pokebutton();
            setCoordinates(show, 725, 250 + (i * 50));
            tf.setOnAction(e -> checkPokedexNum(tf, pokefield));
            show.setOnAction(e -> checkPokedexNum(tf, pokefield));
            selectPane.getChildren().addAll(tf, show);
            team2[i - 1] = tf;
            buttons2[i - 1] = show;
        }
        Button confirm = button("Confirm");
        setButtonHover(confirm);
        setCoordinates(confirm, 450, 200);
        confirm.setOnAction(e-> {
            if (checkConfirm(team1,team2,pokefield)){
                primaryStage.setScene(Game.startGameScene(primaryStage));
            }
        });
        selectPane.getChildren().add(confirm);
        return new Scene(selectPane, 965, 600);
    }

    static public void setCoordinates(Object a, int x, int y) {
        ((Node) a).setLayoutX(x);
        ((Node) a).setLayoutY(y);
    }

    static public Button pokebutton() {
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

    static public boolean checkPokedexNum(TextField choice, ImageView pokefield) {
        try {
            int num = Integer.parseInt(choice.getText());
            if (num > 151 || num < 1) {
                choice.setText("Invalid Input");
                return false;
            }
            for (Pokemon pok : pokedex) {
                if (pok.getPokedexNum() == num) {
                    pokefield.setImage(pok.getPokemonImage());
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            choice.setText("Invalid Input");
            return false;
        }
    }

    static final String IDLE_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #5c85d6;\n-fx-border-radius: 7;";
    static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #ffcc00;\n-fx-background-radius:13;\n" +
            "\n-fx-text-fill: white;\n-fx-font: 20px Tahoma;\n-fx-border-width: 6px;\n" +
            "-fx-border-color: #002b80;\n-fx-border-radius: 7;";
    static final String INVISIBLE_BUTTON_STYLE = "-fx-border-color: transparent;\n-fx-border-width: 0;\n" +
            "-fx-background-radius: 0;\n-fx-background-color: transparent;";

    static public Button button(String label) {
        Button button = new Button(label);
        button.setStyle(IDLE_BUTTON_STYLE);
        return button;
    }

    static public void setButtonHover(Button button){
        button.setOnMouseEntered(e -> button.setStyle(HOVERED_BUTTON_STYLE));
        button.setOnMouseExited(e -> button.setStyle(IDLE_BUTTON_STYLE));
    }

    static public boolean checkConfirm(TextField[] team1, TextField[] team2, ImageView pokefield ){
        for (TextField a:team1){
            if (checkPokedexNum(a,pokefield))
                continue;
            else{
                AlertBox.display("Error","Error with pokemon on Team 1");
                return false;
            }
        }
        for (TextField a:team2){
            if (checkPokedexNum(a,pokefield))
                continue;
            else{
                AlertBox.display("Error","Error with pokemon on Team 2");
                return false;
            }
        }
        return true;
    }
}
