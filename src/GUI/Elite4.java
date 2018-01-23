package GUI;

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
import static GUI.Tools.*;

public class Elite4 {

    static Pokemon[] pokedex = Pokemans.pokedex;

    static public Scene getChooseScene(Stage primaryStage) {

        //sets up the background elements and pokemon field for this scene
        ImageView trainer1 = new ImageView(new Image("Images/trainer1.gif"));
        ImageView Lorelei = new ImageView(new Image("Images/Lorelei.png"));
        ImageView Bruno = new ImageView(new Image("Images/Bruno.png"));
        ImageView LanceAgatha = new ImageView(new Image("Images/LanceAgatha.png"));
        ImageView pokeball = new ImageView(new Image("Images/pokeballanimated.gif"));
        ImageView El4text = new ImageView(new Image("Images/E4 text.png"));
        ImageView pokefield = new ImageView();

        //organizes the images in the scene and places them
        Lorelei.setFitHeight(200);
        Lorelei.setFitWidth(200);
        Lorelei.setPreserveRatio(true);
        Bruno.setFitHeight(150);
        Bruno.setFitWidth(150);
        Bruno.setPreserveRatio(true);
        LanceAgatha.setFitHeight(200);
        LanceAgatha.setFitWidth(250);
        LanceAgatha.setPreserveRatio(true);
        El4text.setFitWidth(400);
        El4text.setFitHeight(200);
        El4text.setPreserveRatio(true);
        setCoordinates(El4text, 295, 20);
        setCoordinates(pokefield, 450, 350);
        setCoordinates(pokeball, 350, 400);
        setCoordinates(trainer1, 30, 100);
        setCoordinates(Lorelei, 600, 100);
        setCoordinates(Bruno, 775, 170);
        setCoordinates(LanceAgatha, 700, 275);

        //Background and Pane Set Up
        ImageView background = new ImageView(new Image("Images/E4 Background.gif"));
        
        background.setFitHeight(600);
        background.setFitWidth(965);
        Pane selectPane = new Pane();
        selectPane.getChildren().addAll(background, trainer1, Lorelei, El4text, pokeball, pokefield, Bruno, LanceAgatha);

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
        setCoordinates(stat, 400, 160);

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
       

        int LoreleiTeam[] = new int [6];
        LoreleiTeam[0] = 87;
        LoreleiTeam[1] = 91;
        LoreleiTeam[2] = 80;
        LoreleiTeam[3] = 124;
        LoreleiTeam[4] = 131;
        LoreleiTeam[5] = 129;
        
        int BrunoTeam[] = new int [6];
        BrunoTeam[0] = 95;
        BrunoTeam[1] = 95;
        BrunoTeam[2] = 106;
        BrunoTeam[3] = 107;
        BrunoTeam[4] = 68;
        BrunoTeam[5] = 129;
        
        int AgathaTeam[] = new int [6];
        AgathaTeam[0] = 93;
        AgathaTeam[1] = 94;
        AgathaTeam[2] = 94;
        AgathaTeam[3] = 42;
        AgathaTeam[4] = 24;
        AgathaTeam[5] = 129;
        
        int LanceTeam[] = new int [6];
        LanceTeam[0] = 147;
        LanceTeam[1] = 147;
        LanceTeam[2] = 148;
        LanceTeam[3] = 130;
        LanceTeam[4] = 142;
        LanceTeam[5] = 129;
        
        Pokemon[] LanceTeam1 = getPokemonTeam(LanceTeam);
        Pokemon[] AgathaTeam1 = getPokemonTeam(BrunoTeam);
        Pokemon[] BrunoTeam1 = getPokemonTeam(BrunoTeam);
        
        //The randomize button is created for teh random battle option
        Button random = button("Randomize");
        setButtonHover(random);
        setCoordinates(random, 240, 500);

        //When clicked the random button sets values for each pokemon
        random.setOnAction(e -> {
            for (int x = 0; x < team1.length; x++) {
                team1[x].setText(String.valueOf((int) Math.floor(Math.random() * 150) + 1));
            }
        });

        //Confirm Button to start game play
        Button confirm = button("Confirm");
        setButtonHover(confirm);
        setCoordinates(confirm, 590, 500);
        confirm.setOnAction(e -> {
            if (checkConfirm(team1, pokefield)) {
                primaryStage.setScene(AIGame.startGameScene(primaryStage, getPokemonTeam(ConvertTeam(team1)), getPokemonTeam(LoreleiTeam)));
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
    static public boolean checkConfirm(TextField[] team1, ImageView pokefield) {
        for (TextField a : team1) {
            if (checkPokedexNum(a, pokefield, new TextArea()))
                continue;
            else {
                AlertBox.display("Error", "Error with pokemon on Team 1");
                return false;
            }
        }
        return true;
    }

    //Obtains the Pokemon Team for the battles stage of the game
    static public Pokemon[] getPokemonTeam(int[] pokedexNums) {
        Pokemon[] team = new Pokemon[6];
        int index = 0;
        for (int pokemon : pokedexNums) {
            for (Pokemon p : pokedex) {
                if (p.getPokedexNum() == pokemon) {
                    team[index] = p;
                    break;
                }
            }
            index++;
        }
        return team;
    }
    static public int[]ConvertTeam (TextField[] team) {
    	int [] newteam1 = new int [6];
        int index = 0;
		for (TextField x : team) {
            newteam1[index] = Integer.parseInt(x.getText());
            index++;
        }
        return newteam1;
    }

}

