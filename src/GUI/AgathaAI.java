package GUI;

import Pokemon.Pokemon;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.Arrays;
import static GUI.Tools.*;
import Moves.Move;

public class AgathaAI {
    static boolean turn;

    static public Scene startGameScene(Stage primaryStage, Pokemon[] player1, Pokemon[] AgathaTeam1) {
        final ImageView battleground = new ImageView(), bg = new ImageView(), poke1 = new ImageView(), poke2 = new ImageView(),
                p1Text = new ImageView(), p2Text = new ImageView();
        Image[] backgrounds = {new Image("Images/bb1.png"), new Image("Images/bb2.png"), new Image("Images/bb3.jpg"),
                new Image("Images/bb4.png"), new Image("Images/bb5.png"), new Image("Images/bb6.png"),
                new Image("Images/bb7.jpg"), new Image("Images/bb8.png"), new Image("Images/bb9.png")};

        Button Nextmember = button("Next Member");
        Nextmember.setDisable(true);
        
        
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


        // PLACING THE TWO TRAINERS THAT REPRESENT EACH PLAYER
        ImageView trainer1 = new ImageView(new Image("Images/trainer1.gif"));
        setCoordinates(trainer1, 50, 200);
        ImageView Lorelei = new ImageView(new Image("Images/Agatha.png"));
        setCoordinates(Lorelei, 820, 40);
        trainer1.setPreserveRatio(true); // Prevents the trainer image from being distorted
        trainer1.setFitHeight(100);
        trainer1.setFitWidth(100); // Sets size of trainer1
        Lorelei.setPreserveRatio(true); // Prevents the trainer image from being distorted
        Lorelei.setFitHeight(100);
        Lorelei.setFitWidth(100); // Sets size of trainer2

        // PLACING THE PLAYER1 and PLAYER2 TEXT
        p1Text.setImage(new Image("Images/player1.png"));
        p2Text.setImage(new Image("Images/Agathatxt.png"));
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
        Pokemon currPoke2 = AgathaTeam1[0];
        poke1.setImage(currPoke1.getPokemonImage());
        poke2.setImage(currPoke2.getPokemonImage());
        currPoke1 = getCurrentPok(poke1, player1);
        currPoke2 = getCurrentPok(poke2, AgathaTeam1);
        setCoordinates(poke1, 245, 140);
        setCoordinates(poke2, 565, 20);
        // ADDING MOST OF THE COMPONENTS TO THE SCENE
        root.getChildren().addAll(battleground, poke1, poke2, trainer1, Lorelei, p1Text, p2Text);


        //Making Stat Boxes for Both Current Pokemon
        final TextArea stat1 = makeStatBox(30, 10), stat2 = makeStatBox(800, 175);
        stat1.setText(currPoke1.toString());
        stat2.setText(currPoke2.toString());
        root.getChildren().addAll(stat1, stat2);


        final Button p1m1 = moveButton(currPoke1.getMove0()), p1m2 = moveButton(currPoke1.getMove1()), p1m3 = moveButton(currPoke1.getMove2()),
                p1m4 = moveButton(currPoke1.getMove3());

        Button home = homeButton(primaryStage);
        setCoordinates(home, 430,320);
        root.getChildren().add(home);

        // POKEMON SWITCH BUTTONS AT THE BOTTOM
        Button[] switchTeam1= new Button[6];
        Button player1Moves[] = {p1m1,p1m2,p1m3,p1m4};
        Pokemon pok1 = getCurrentPok(poke1, player1), pok2 = getCurrentPok(poke2, AgathaTeam1);
        
        if(!turn)disable(player1Moves);
        if (pok1.getSpeedStat() > pok2.getSpeedStat()) {checkWin(player1,AgathaTeam1,primaryStage);
        	for (int i = 0; i < 4; i++) {
                int a = i;
                player1Moves[i].setOnAction(e -> {
                    switch(a) {
                        case(0): getCurrentPok(poke1,player1).move0.makeMove(getCurrentPok(poke2,AgathaTeam1),getCurrentPok(poke1,player1));
                        case(1): getCurrentPok(poke1,player1).move1.makeMove(getCurrentPok(poke2,AgathaTeam1),getCurrentPok(poke1,player1));
                        case(2): getCurrentPok(poke1,player1).move2.makeMove(getCurrentPok(poke2,AgathaTeam1),getCurrentPok(poke1,player1));
                        case(3): getCurrentPok(poke1,player1).move3.makeMove(getCurrentPok(poke2,AgathaTeam1),getCurrentPok(poke1,player1));
                    }
                    stat1.setText(getCurrentPok(poke1, player1).toString());
                    stat2.setText(getCurrentPok(poke2, AgathaTeam1).toString());
                    if (getCurrentPok(poke2,AgathaTeam1).gethP() > 0) {
                    	makeMoveAI(getCurrentPok(poke2, AgathaTeam1), getCurrentPok(poke1, player1));
                    	
                        disable(player1Moves);
                        disable(switchTeam1);
                    }
                    else{
                        poke2.setImage(null);
                        for (Pokemon x : AgathaTeam1) {
                        	if (x.gethP() > 0) {
                        		poke2.setImage(x.getPokemonImage());                        		
                        	}
                        	else {
                        		Nextmember.setDisable(false);
                        		Nextmember.setOnAction(z -> primaryStage.setScene(LanceAI.startGameScene(primaryStage, player1, AgathaTeam1)));
                        	}
                        }
                        
                        stat2.setText(getCurrentPok(poke2, AgathaTeam1).toString());
                        disable(player1Moves);
                        disable(switchTeam1);
                    }
                    checkWin(player1,AgathaTeam1,primaryStage);
                });
            }
        }
        
        
        for (int i = 0; i < 6; i++) {
           switchTeam1[i] = pokeSwitchButton(player1[i].getPokemonImage());
            setCoordinates(switchTeam1[i], ((30 * 2 * i)), 500);
            final int a = i;
            switchTeam1[i].setOnAction(e -> {checkWin(player1,AgathaTeam1,primaryStage);
                if (player1[a].gethP() <= 0){
                    root.getChildren().remove(switchTeam1[a]);
                }
                poke1.setImage(player1[a].getPokemonImage());
                p1m1.setText(getCurrentPok(poke1, player1).getMove0());
                p1m2.setText(getCurrentPok(poke1, player1).getMove1());
                p1m3.setText(getCurrentPok(poke1, player1).getMove2());
                p1m4.setText(getCurrentPok(poke1, player1).getMove3());
                stat1.setText(getCurrentPok(poke1, player1).toString());
                makeMoveAI(getCurrentPok(poke2, AgathaTeam1), getCurrentPok(poke1, player1));
                disable(player1Moves);
                disable(switchTeam1);
                checkWin(player1,AgathaTeam1,primaryStage);
            });
            root.getChildren().add(switchTeam1[i]);
        }

        

        // MOVE BUTTONS
        setCoordinates(p1m1, 60, 400);
        setCoordinates(p1m2, 240, 400);
        setCoordinates(p1m3, 580, 400);
        setCoordinates(p1m4, 760, 400);
       
        root.getChildren().addAll(p1m1, p1m2, p1m3, p1m4/*, p2m1, p2m2, p2m3, p2m4*/);

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
        return battle;
    }


	static Button pokeSwitchButton(Image pokeImage) {
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

    static Button moveButton(String moveName) {
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

    static void randBB(ImageView battleground, Image[] backgrounds) {
        int arrayNum = (int) (Math.random() * 8);
        battleground.setStyle("-fx-border-color: #4d4d4d; -fx-background-radius: 5; -fx-border-width: 6px;; -fx-border-radius: 5;" +
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
        battleground.setImage(backgrounds[arrayNum]);
    }

    static TextArea makeStatBox(int x, int y) {
        TextArea stat = new TextArea();
        stat.setOpacity(0.95);
        stat.setWrapText(true);
        stat.setDisable(true);
        stat.setPrefColumnCount(10);
        stat.setPrefRowCount(10);
        stat.setStyle("-fx-background-color: rgba(0,0,0,0.7);");
        setCoordinates(stat, x, y);
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

    static boolean checkWin(Pokemon[] team1, Pokemon[] team2, Stage primary){
        int counter = 0;
        for (Pokemon pok: team1){
            if (pok.gethP()<0){
                counter++;
                if (counter == 6){
                    AlertBox.display("Winner","Player 2 won");
                    primary.setScene(StartScene.startScene(primary));
                    return true;
                }
                continue;
            }
            counter = 0;
            break;
        }
        for (Pokemon pok: team2){
            if (pok.gethP()<0){
                counter++;
                if (counter == 6){
                    AlertBox.display("Winner","Player 2 won");
                    primary.setScene(StartScene.startScene(primary));
                    return true;
                }
                continue;
            }
            break;
        }
        return false;
    }

    static void disable(Button[] moves){
        for(Button a: moves ){
            a.setDisable(true);
        }
    }

    static void enable(Button[] moves){
        for(Button a: moves ){
            a.setDisable(false);
        }
    }
    

    static void findDeadPokemon(Pokemon[] pokemons,Button[] switchButtons, Pane root) {
        for (int i = 0; i < 6; i++) {
            if (pokemons[i].gethP() <= 0) {
                root.getChildren().remove(switchButtons[i]);
            }
        }
    }
    public static Move makeMoveAI(Pokemon attacker, Pokemon defender){
        Move[] moves = {attacker.move0, attacker.move1, attacker.move2, attacker.move3};
        double maxDMG = 0;
        int choice = (int)(Math.random()*100);
        if (choice > 70){
            int randomMove = (int)(Math.random()*4);
            if (randomMove == 0){
                return attacker.move0;
            }
            if (randomMove == 1){
                return attacker.move1;
            }
            if (randomMove == 2){
                return  attacker.move2;
            }
            if (randomMove == 3){
                return attacker.move3;
            }
        }
        if (choice <= 70) {
            for (int i = 0; i < 4; i++) {
                moves[i].calculateDamage(attacker, defender);
                if (maxDMG < moves[i].getDamage()) {
                    maxDMG = moves[i].getDamage();
                }
            }
            for (Move x : moves) {
                if (x.getDamage() == maxDMG) {
                    return x;
                }
            }
        }
        return randomMove(attacker);
    }

    public static Move randomMove(Pokemon attacker){
        int randomMove = (int)(Math.random()*4);
        if (randomMove == 0){
            return attacker.move0;
        }
        if (randomMove == 1){
            return attacker.move1;
        }
        if (randomMove == 2){
            return  attacker.move2;
        }
        if (randomMove == 3){
            return attacker.move3;
        }
        else{
            return attacker.move0;
        }
    }
}