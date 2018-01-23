package GUI;
//Package Declaration and Imports for JavaFX Libraries
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
//Custom Made tools class import
import static GUI.Tools.*;

public class Game {
    //Boolean for turn determined through speed
    static boolean turn;
    //Method that returns the game play scene
    static public Scene startGameScene(Stage primaryStage, Pokemon[] player1, Pokemon[] player2) {
        //setting up Images and backgrounds on the battlefield
        final ImageView battleground = new ImageView(), bg = new ImageView(), poke1 = new ImageView(), poke2 = new ImageView(),
                p1Text = new ImageView(), p2Text = new ImageView();
        Image[] backgrounds = {new Image("Images/bb1.png"), new Image("Images/bb2.png"), new Image("Images/bb3.jpg"),
                new Image("Images/bb4.png"), new Image("Images/bb5.png"), new Image("Images/bb6.png"),
                new Image("Images/bb7.jpg"), new Image("Images/bb8.png"), new Image("Images/bb9.png")};

        //Pokeballs on battlefield
        ImageView[] player1Pokeballs = new ImageView[6];
        Arrays.setAll(player1Pokeballs, i -> new ImageView());
        ImageView[] player2Pokeballs = new ImageView[6];
        Arrays.setAll(player2Pokeballs, i -> new ImageView());

        //Pane and scene to hold different components of this part of the game
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
        poke1.setFitWidth(100);
        poke2.setFitHeight(100);
        poke2.setFitWidth(100);
        poke1.setPreserveRatio(true);
        poke2.setPreserveRatio(true);
        Pokemon currPoke1 = player1[0];
        Pokemon currPoke2 = player2[0];
        poke1.setImage(currPoke1.getPokemonImage2());
        poke2.setImage(currPoke2.getPokemonImage());
        currPoke1 = getCurrentPok(poke1, player1);
        currPoke2 = getCurrentPok(poke2, player2);
        setCoordinates(poke1, 245, 140);
        setCoordinates(poke2, 565, 20);
        // ADDING COMPONENTS TO THE SCENE
        root.getChildren().addAll(battleground, poke1, poke2, trainer1, trainer2, p1Text, p2Text, p1team, p2team);


        //Making Stat and hP Boxes for Both Current Pokemon
        final TextArea stat1 = makeStatBox(30, 10), stat2 = makeStatBox(800, 175),
                hp1 = makeHPBox(220,250), hp2 = makeHPBox(560,175);
        hp1.setText("Health: 100%");hp2.setText("Health: 100%");
        stat1.setText(currPoke1.toString());
        stat2.setText(currPoke2.toString());
        root.getChildren().addAll(stat1, stat2,hp1,hp2);

        final Button p1m1 = moveButton(currPoke1.getMove0()), p1m2 = moveButton(currPoke1.getMove1()), p1m3 = moveButton(currPoke1.getMove2()),
                p1m4 = moveButton(currPoke1.getMove3()), p2m1 = moveButton(currPoke2.getMove0()), p2m2 = moveButton(currPoke2.getMove1()),
                p2m3 = moveButton(currPoke2.getMove2()), p2m4 = moveButton(currPoke2.getMove3());

        Button home = homeButton(primaryStage);
        setCoordinates(home, 430,320);
        root.getChildren().add(home);

        // POKEMON SWITCH BUTTONS AND MOVE BUTTONS
        Button[] switchTeam1= new Button[6], switchTeam2 = new Button[6];
        Button player1Moves[] = {p1m1,p1m2,p1m3,p1m4};
        Button player2Moves[] = {p2m1,p2m2,p2m3,p2m4};
        //GETS THE CURRENT POKEMON ON THE FIELD
        Pokemon pok1 = getCurrentPok(poke1, player1), pok2 = getCurrentPok(poke2, player2);
        turn = pok1.getSpeedStat() > pok2.getSpeedStat();//DETERMINES TURN ACCORDING TO SPEED
        if(turn)disable(player2Moves);
        else{disable(player1Moves);}
        //LOOP FOR ASSIGNING MOVE BUTTONS FOR PLAYER 1 THEIR FUNCTIONALITY
        TextArea MoveInfo = new TextArea();
        MoveInfo.setWrapText(true);
        MoveInfo.setDisable(true);
        MoveInfo.setPrefColumnCount(10);
        MoveInfo.setPrefRowCount(6);
        MoveInfo.setStyle("-fx-background-color: #000000;");
        MoveInfo.setOpacity(0);
        setCoordinates(MoveInfo, 393, 382);
        root.getChildren().add(MoveInfo);
        for (int i = 0; i < 4; i++) {
            int a = i;
            //MOVES BUTTONS MAKE THE MOVE THEY POSSESS WHEN CLICKED AND SWITCH TURNS
            player1Moves[i].setOnAction(e -> {
                if(a==0)
                    getCurrentPok(poke1,player1).move0.makeMove(getCurrentPok(poke2,player2),getCurrentPok(poke1,player1));
                if(a==1)
                    getCurrentPok(poke1,player1).move1.makeMove(getCurrentPok(poke2,player2),getCurrentPok(poke1,player1));
                if(a==2)
                    getCurrentPok(poke1,player1).move2.makeMove(getCurrentPok(poke2,player2),getCurrentPok(poke1,player1));
                if(a==3)
                    getCurrentPok(poke1,player1).move3.makeMove(getCurrentPok(poke2,player2),getCurrentPok(poke1,player1));
                //FINDS IF ANY POKEMON DIED BECAUSE OF THE MOVE
                findDeadPokemon(player2,switchTeam2,root,player2Pokeballs,"r");
                //REFRESHES STAT BOXES
                stat1.setText(getCurrentPok(poke1, player1).toString());
                stat2.setText(getCurrentPok(poke2, player2).toString());
                //REFRESHES HP BOXES
                hp1.setText("Health: "+(int)(getCurrentPok(poke1, player1).gethP()*100/getCurrentPok(poke1, player1).getMaxhP())+"%");
                hp2.setText("Health: "+(int)(getCurrentPok(poke2, player2).gethP()*100/getCurrentPok(poke2, player2).getMaxhP())+"%");
                //CHECKS IF A WINNER EXISTS
                checkWin(player1,player2,primaryStage);
                //NEXT TURN SETUP
                if (getCurrentPok(poke2,player2).gethP() > 0) {
                    enable(player2Moves);
                    enable(switchTeam2);
                    disable(player1Moves);
                    disable(switchTeam1);
                }
                else{
                    poke2.setImage(null);
                    enable(switchTeam2);
                    disable(player1Moves);
                    disable(switchTeam1);
                }
            });
            player1Moves[i].setOnMouseEntered(e ->{
                MoveInfo.setOpacity(0.9);
                if(a==0)
                    MoveInfo.setText(getCurrentPok(poke1,player1).move0.displayInfo());
                if(a==1)
                    MoveInfo.setText(getCurrentPok(poke1,player1).move1.displayInfo());
                if(a==2)
                    MoveInfo.setText(getCurrentPok(poke1,player1).move2.displayInfo());
                if(a==3)
                    MoveInfo.setText(getCurrentPok(poke1,player1).move3.displayInfo());
            });
            player1Moves[i].setOnMouseExited(e ->{
                MoveInfo.setOpacity(0);
                MoveInfo.setText("");
            });
        }
        //LOOP FOR ASSIGNING MOVE BUTTONS FOR PLAYER 2 THEIR FUNCTIONALITY
        for (int i = 0; i < 4; i++) {
            int a = i;
            //MOVES BUTTONS MAKE THE MOVE THEY POSSESS WHEN CLICKED AND SWITCH TURNS
            player2Moves[i].setOnAction(e -> {
                if(a==0)
                    getCurrentPok(poke2,player2).move0.makeMove(getCurrentPok(poke1,player1),getCurrentPok(poke2,player2));
                if(a==1)
                    getCurrentPok(poke2,player2).move1.makeMove(getCurrentPok(poke1,player1),getCurrentPok(poke2,player2));
                if(a==2)
                    getCurrentPok(poke2,player2).move2.makeMove(getCurrentPok(poke1,player1),getCurrentPok(poke2,player2));
                if(a==3)
                    getCurrentPok(poke2,player2).move3.makeMove(getCurrentPok(poke1,player1),getCurrentPok(poke2,player2));
                //FINDS IF ANY POKEMON DIED BECAUSE OF THE MOVE
                findDeadPokemon(player1,switchTeam1,root,player1Pokeballs,"l");

                //REFRESHES STAT BOXES
                stat1.setText(getCurrentPok(poke1, player1).toString());
                stat2.setText(getCurrentPok(poke2, player2).toString());
                //REFRESHES HP BOXES
                hp1.setText("Health: "+(int)(getCurrentPok(poke1, player1).gethP()*100/getCurrentPok(poke1, player1).getMaxhP())+"%");
                hp2.setText("Health: "+(int)(getCurrentPok(poke2, player2).gethP()*100/getCurrentPok(poke2, player2).getMaxhP())+"%");
                checkWin(player1,player2,primaryStage);
                //CHECKS IF A WINNER EXISTS
                //NEXT TURN SETUP
                if (getCurrentPok(poke1,player1).gethP() > 0) {
                    enable(player1Moves);
                    enable(switchTeam1);
                    disable(player2Moves);
                    disable(switchTeam2);
                }
                else{
                    poke1.setImage(null);
                    enable(switchTeam1);
                    disable(player2Moves);
                    disable(switchTeam2);
                }
            });
            player2Moves[i].setOnMouseEntered(e ->{
                MoveInfo.setOpacity(0.9);
                if(a==0)
                    MoveInfo.setText(getCurrentPok(poke2,player2).move0.displayInfo());
                if(a==1)
                    MoveInfo.setText(getCurrentPok(poke2,player2).move1.displayInfo());
                if(a==2)
                    MoveInfo.setText(getCurrentPok(poke2,player2).move2.displayInfo());
                if(a==3)
                    MoveInfo.setText(getCurrentPok(poke2,player2).move3.displayInfo());
            });
            player2Moves[i].setOnMouseExited(e ->{
                MoveInfo.setOpacity(0);
                MoveInfo.setText("");
            });
        }
        //LOOPS FOR SETTING THE FUNCTIONALITY OF THE SWITCH POKEMON BUTTONS FOR PLAYER 1
        for (int i = 0; i < 6; i++) {
           switchTeam1[i] = pokeSwitchButton(player1[i].getPokemonImage());
            setCoordinates(switchTeam1[i], ((30 * 2 * i)), 500);
            final int a = i;
            //ASSIGNING THE CHANGE POKEMON FUNCTION TO SWITCH BUTTONS
            switchTeam1[i].setOnAction(e -> {
                checkWin(player1,player2,primaryStage);
                if (player1[a].gethP() <= 0){
                    root.getChildren().remove(switchTeam1[a]);
                }
                //STAT BOX, HP BOX AND IMAGE CHANGE FOR SWITCHED OUT POKEMON
                poke1.setImage(player1[a].getPokemonImage2());
                p1m1.setText(getCurrentPok(poke1, player1).getMove0());
                p1m2.setText(getCurrentPok(poke1, player1).getMove1());
                p1m3.setText(getCurrentPok(poke1, player1).getMove2());
                p1m4.setText(getCurrentPok(poke1, player1).getMove3());
                stat1.setText(getCurrentPok(poke1, player1).toString());
                hp1.setText("Health: "+(int)(getCurrentPok(poke1, player1).gethP()*100/getCurrentPok(poke1, player1).getMaxhP())+"%");
                //A SWITCH COUNTS AS A TURN AND SETS UP THE NEXT TURN
                enable(player2Moves);
                enable(switchTeam2);
                disable(player1Moves);
                disable(switchTeam1);
            });
            //ADDS SWITCH BUTTONS TO SCENE FOR TEAM/PLAYER 1
            root.getChildren().add(switchTeam1[i]);
        }
        //LOOPS FOR SETTING THE FUNCTIONALITY OF THE SWITCH POKEMON BUTTONS FOR PLAYER 1
        for (int i = 0; i < 6; i++) {
            switchTeam2[i] = pokeSwitchButton(player2[i].getPokemonImage());
            setCoordinates(switchTeam2[i], (500 + (60 * i)), 500);
            final int a = i;
            //ASSIGNING THE CHANGE POKEMON FUNCTION TO SWITCH BUTTONS
            switchTeam2[i].setOnAction(e -> {
                checkWin(player1,player2,primaryStage);
                if (player2[a].gethP() <= 0){
                    root.getChildren().remove(switchTeam2[a]);
                }
                //STAT BOX, HP BOX AND IMAGE CHANGE FOR SWITCHED OUT POKEMON
                poke2.setImage(player2[a].getPokemonImage());
                p2m1.setText(getCurrentPok(poke2, player2).getMove0());
                p2m2.setText(getCurrentPok(poke2, player2).getMove1());
                p2m3.setText(getCurrentPok(poke2, player2).getMove2());
                p2m4.setText(getCurrentPok(poke2, player2).getMove3());
                stat2.setText(getCurrentPok(poke2, player2).toString());
                hp2.setText("Health: "+(int)(getCurrentPok(poke2, player2).gethP()*100/getCurrentPok(poke2, player2).getMaxhP())+"%");
                //A SWITCH COUNTS AS A TURN AND SETS UP THE NEXT TURN
                enable(player1Moves);
                enable(switchTeam1);
                disable(player2Moves);
                disable(switchTeam2);
            });
            //ADDS SWITCH BUTTONS TO SCENE FOR TEAM/PLAYER 1
            root.getChildren().add(switchTeam2[i]);
        }

        // MOVE BUTTONS SETUP ON GUI
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
        //returns the finished scene
        return battle;
    }

    //METHOD FOR MAKING THE POKESWITCH BUTTONS USED TO CHANGE POKEMON
    static Button pokeSwitchButton(Image pokeImage) {
        Button pokeSwitchButton = new Button();
        pokeSwitchButton.setStyle(INVISIBLE_BUTTON_STYLE);
        ImageView pokemon = new ImageView(pokeImage);
        pokemon.setPreserveRatio(true);
        pokemon.setFitHeight(75);
        pokemon.setFitWidth(75);
        pokeSwitchButton.setGraphic(pokemon);
        pokeSwitchButton.setOnMouseEntered(e -> {
            pokeSwitchButton.setStyle(TRANSPARENT_BUTTON_HOVER);
        });
        pokeSwitchButton.setOnMouseExited(e -> {
            pokeSwitchButton.setStyle(INVISIBLE_BUTTON_STYLE);
        });
        return pokeSwitchButton;
    }
    //METHOD FOR MAKE THE MOVE BUTTONS
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
    //METHOD FOR RANDOMIZING THE BACKGROUNDS THAT APPEAR
    static void randBB(ImageView battleground, Image[] backgrounds) {
        int arrayNum = (int) (Math.random() * 8);
        battleground.setStyle("-fx-border-color: #4d4d4d; -fx-background-radius: 5; -fx-border-width: 6px;; -fx-border-radius: 5;" +
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
        battleground.setImage(backgrounds[arrayNum]);
    }
    //METHOD FOR MAKING THE STATBOX FOR ON SCREEN POKEMON POKEMON
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
    //METHOD FOR MARKING THE HP BOX FOR ON SCREEN POKEMON
    static TextArea makeHPBox(int x, int y){
        TextArea hp = new TextArea();
        hp.setOpacity(0.95);
        hp.setWrapText(true);
        hp.setDisable(true);
        hp.setPrefColumnCount(10);
        hp.setPrefRowCount(2);
        hp.setStyle("-fx-background-color: rgba(0,0,0,0.7);");
        setCoordinates(hp, x, y);
        return hp;
    }
    //METHOD FOR OBTAINING THE CURRENT ON SCREEN POKEMON
    static Pokemon getCurrentPok(ImageView pokImage, Pokemon[] team) {
        for (Pokemon p : team) {
            if (p.getPokemonImage() == pokImage.getImage() || p.getPokemonImage2() == pokImage.getImage()) {
                return p;
            }
        }
        return null;
    }
    //METHOD FOR CHECKING IS A WINNER HAS BEEN DETERMINED
    static boolean checkWin(Pokemon[] team1, Pokemon[] team2, Stage primary){
        int counter = 0;
        for (Pokemon pok: team1){
            if (pok.gethP()<= 0){
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
            if (pok.gethP()<=0){
                counter++;
                if (counter == 6){
                    AlertBox.display("Winner","Player 1 won");
                    primary.setScene(StartScene.startScene(primary));
                    return true;
                }
                continue;
            }
            break;
        }
        return false;
    }
    //METHOD FOR DISABLING A PLAYERS BUTTONS WHEN IT IS NOT THEIR TURN
    static void disable(Button[] moves){
        for(Button a: moves ){
            a.setDisable(true);
        }
    }
    //METHOD FOR ENABLING A PLAYER'S BUTTONS WHEN IT IS THEIR TURN
    static void enable(Button[] moves){
        for(Button a: moves ){
            a.setDisable(false);
        }
    }
    //METHOD FOR FINDING IF POKEMON HAVE FAINTED
    static void findDeadPokemon(Pokemon[] pokemons,Button[] switchButtons, Pane root, ImageView[] pokeBalls, String orientation) {
        for (int i = 0; i < 6; i++) {
            if (pokemons[i].gethP() <= 0) {
                root.getChildren().remove(switchButtons[i]);
                if (orientation == "r"){
                    pokeBalls[i].setImage(new Image("Images/deadleftpokeball.png"));
                }
                else{
                    pokeBalls[i].setImage(new Image("Images/deadrightpokeball.png"));
                }


            }
        }
    }
}