package GUI;
//Package Declaration and Imports for JavaFX Libraries
import Pokemon.Pokemans;
import Pokemon.Pokemon;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//Custom Made tools class import
import static GUI.Tools.*;

public class SelectPokemon {
    //Pokedex from the Pokemon Package
    static Pokemon[] pokedex = Pokemans.pokedex;

    static public Scene getChooseScene(Stage primaryStage) {

        //sets up the background elements and pokemon field for this scene
        ImageView trainer1 = new ImageView(new Image("Images/trainer1.gif"));
        ImageView trainer2 = new ImageView(new Image("Images/trainer2.gif"));
        ImageView pokeball = new ImageView(new Image("Images/pokeballanimated.gif"));
        ImageView players = new ImageView(new Image("Images/p1p2.png"));
        ImageView pokefield = new ImageView();

        //organizes the images in the scene and places them
        trainer2.setFitHeight(200);
        trainer2.setFitWidth(200);
        trainer2.setPreserveRatio(true);
        players.setFitWidth(400);
        players.setFitHeight(200);
        players.setPreserveRatio(true);
        setCoordinates(players, 295, 20);
        setCoordinates(pokefield, 450, 350);
        setCoordinates(pokeball, 350, 400);
        setCoordinates(trainer1, 30, 100);
        setCoordinates(trainer2, 700, 100);

        //Background and Pane Set Up
        ImageView background = new ImageView(new Image("Images/pikbg.gif"));
        background.setFitHeight(600);
        background.setFitWidth(965);
        Pane selectPane = new Pane();
        selectPane.getChildren().addAll(background, trainer1, trainer2, players, pokeball, pokefield);

        //Text Field List for team 1 is created and a stats field is also created and positioned
        TextField[] team1 = new TextField[6];
        Button[] buttons1 = new Button[6];
        TextArea stat = new TextArea();
        stat.setOpacity(0.95);
        stat.setWrapText(true);
        stat.setDisable(true);
        stat.setPrefColumnCount(10);
        stat.setPrefRowCount(10);
        stat.setStyle("-fx-background-color: rgba(0,0,0,0.7);");
        stat.setOnMouseEntered(e-> stat.setStyle("-fx-background-color: rgba(255,255,255,0.7);"));
        setCoordinates(stat, 425, 160);


        //Text fields for team 1 and buttons for team 1 are created and assigned functions
        for (int i = 1; i <= 6; i++) {
            TextField tf = new TextField("Enter Pokedex Num");
            tf.setOpacity(0.90);
            setCoordinates(tf, 50, 250 + (i * 50));
            Button show = pokebutton();
            setCoordinates(show, 200, 250 + (i * 50));
            tf.setOnAction(e -> checkPokedexNum(tf, pokefield, stat));
            show.setOnAction(e -> checkPokedexNum(tf, pokefield, stat));
            selectPane.getChildren().addAll(tf, show);
            team1[i - 1] = tf;
            buttons1[i - 1] = show;
        }

        //Team 2 setup
        //Text fields for team 2 and buttons for team 2 are created and assigned functions
        TextField[] team2 = new TextField[6];
        Button[] buttons2 = new Button[6];
        for (int i = 1; i <= 6; i++) {
            TextField tf = new TextField("Enter Pokedex Num");
            tf.setOpacity(0.90);
            setCoordinates(tf, 750, 250 + (i * 50));
            Button show = pokebutton();
            setCoordinates(show, 725, 250 + (i * 50));
            tf.setOnAction(e -> checkPokedexNum(tf, pokefield, stat));
            show.setOnAction(e -> checkPokedexNum(tf, pokefield, stat));
            selectPane.getChildren().addAll(tf, show);
            team2[i - 1] = tf;
            buttons2[i - 1] = show;
        }

        //The randomize button is created for the random battle option
        Button random = button("Randomize");
        setButtonHover(random);
        setCoordinates(random, 240, 500);

        //When clicked the random button sets values for each pokemon
        random.setOnAction(e -> {
            for (int x = 0; x < team1.length; x++) {
                team1[x].setText(String.valueOf((int) Math.floor(Math.random() * 150) + 1));
                team2[x].setText(String.valueOf((int) Math.floor(Math.random() * 150) + 1));
            }
        });

        //Confirm Button to start game play
        Button confirm = button("Confirm");
        setButtonHover(confirm);
        setCoordinates(confirm, 590, 500);
        confirm.setOnAction(e -> {
            if (checkConfirm(team1, team2, pokefield)) {
                primaryStage.setScene(Game.startGameScene(primaryStage, getPokemonTeam(team1), getPokemonTeam(team2)));
            }
        });

        //Makes Home Button
        Button home = homeButton(primaryStage);
        //Final setup of GUI elements and the Scene is returned
        selectPane.getChildren().addAll(confirm, random, stat, home);
        selectPane.setCursor(new ImageCursor(new Image("Images/cursor.gif"), 2, 2));
        return new Scene(selectPane, 965, 600);
    }

    //Method for matching pokedex number to pokemon and image
    static public boolean checkPokedexNum(TextField choice, ImageView pokefield, TextArea stat) {
        try {
            int num = Integer.parseInt(choice.getText());
            if (num > 151 || num < 1) {
                choice.setText("Invalid Input");
                return false;
            }
            for (Pokemon pok : pokedex) {
                if (pok.getPokedexNum() == num) {
                    pokefield.setImage(pok.getPokemonImage());
                    stat.setText(pok.toString());
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            choice.setText("Invalid Input");
            return false;
        }
    }

    //Makes sure every thing works before proceeding with the game
    static public boolean checkConfirm(TextField[] team1, TextField[] team2, ImageView pokefield) {
        for (TextField a : team1) {
            if (checkPokedexNum(a, pokefield, new TextArea()))
                continue;
            else {
                AlertBox.display("Error", "Error with pokemon on Team 1");
                return false;
            }
        }
        for (TextField a : team2) {
            if (checkPokedexNum(a, pokefield, new TextArea()))
                continue;
            else {
                AlertBox.display("Error", "Error with pokemon on Team 2");
                return false;
            }
        }
        return true;
    }

    //Obtains the Pokemon Team for the battles stage of the game
    static public Pokemon[] getPokemonTeam(TextField[] pokedexNums) {
        Pokemon[] team = new Pokemon[6];
        int index = 0;
        for (TextField pokemon : pokedexNums) {
            for (Pokemon p : pokedex) {
                if (p.getPokedexNum() == Integer.parseInt(pokemon.getText())) {
                    team[index] = p;
                    break;
                }
            }
            index++;
        }
        return team;
    }

}
