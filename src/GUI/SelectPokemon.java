package GUI;
import Moves.AttackMove;
import Moves.Move;
import Pokemon.Pokemon;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.xml.soap.Text;

/**
 * Created by Harsh on 2018-01-17.
 */
public class SelectPokemon extends Application{
    Move waste = new AttackMove("Fire",25,100,new Image("Images/trainer1.gif"));
    Pokemon[] pokedex = {new Pokemon("Charmander","Fire",255,250,1.3,
            waste,waste,waste,waste,new Image("Images/1.gif"),1),
                        new Pokemon("Charmaleon","Fire",255,250,1.3,
            waste,waste,waste,waste,new Image("Images/2.gif"),2),
                         new Pokemon("Charizard","Fire",255,250,1.3,
            waste,waste,waste,waste,new Image("Images/3.gif"),3)};

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Choose Scene");
        ImageView trainer1 = new ImageView(new Image("Images/trainer1.gif"));
        ImageView trainer2 = new ImageView(new Image("Images/trainer2.gif"));
        ImageView pokeball = new ImageView(new Image("Images/pokeballanimated.gif"));
        ImageView players = new ImageView(new Image("Images/p1p2.png"));
        ImageView pokefield = new ImageView();
        pokefield.setFitHeight(225);pokefield.setFitWidth(225);
        pokefield.setPreserveRatio(true);
        trainer2.setFitHeight(200);trainer2.setFitWidth(200);
        trainer2.setPreserveRatio(true);
        players.setFitWidth(400); players.setFitHeight(200);
        players.setPreserveRatio(true);
        setCoordinates(players,295,20);
        setCoordinates(pokefield,380,200);
        setCoordinates(pokeball,350,400);
        setCoordinates(trainer1,30,100);
        setCoordinates(trainer2,700,100);





        ImageView background = new ImageView(new Image("Images/background.jpg"));
        background.setFitHeight(600);
        background.setFitWidth(965);
        Pane selectPane = new Pane();
        selectPane.getChildren().addAll(background, trainer1,trainer2,players,pokeball,pokefield);



        //text fields and buttons
        //Team 1 setup
        TextField[] team1 = new TextField[6];
        Button[] buttons1 = new Button[6];
        for (int i = 1; i <= 6; i++) {
            TextField tf = new TextField("Enter Pokedex Num");
            String name = "Text field "+i ;
            tf.setOnAction(e -> {
                System.out.println("Action on "+name+": text is "+tf.getText());
            });
            setCoordinates(tf, 50,250+(i*50));

            Button pokemon = pokebutton();
            pokemon.setOnAction(e->{
                int num = Integer.parseInt(tf.getText());
                for (Pokemon pok: pokedex){
                    if (pok.getPokedexNum() == num){
                        pokefield.setImage(pok.getPokemonImage());
                    }
                }
            });
            setCoordinates(pokemon, 200,250+(i*50));

            selectPane.getChildren().addAll(tf,pokemon);
            team1[i-1] = tf ;
            buttons1[i-1] = pokemon;
        }

        //Team 2 setup
        TextField[] team2 = new TextField[6];
        Button[] buttons2 = new Button[6];
        for (int i = 1; i <= 6; i++) {
            TextField tf = new TextField("Enter Pokedex Num");
            String name = "Text field "+i ;
            tf.setOnAction(e -> {
                System.out.println("Action on "+name+": text is "+tf.getText());
            });
            setCoordinates(tf, 750,250+(i*50));

            Button pokemon = pokebutton();
            setCoordinates(pokemon, 725,250+(i*50));
            pokemon.setOnAction(e->{
                int num = Integer.parseInt(tf.getText());
                for (Pokemon pok: pokedex){
                    if (pok.getPokedexNum() == num){
                        pokefield.setImage(pok.getPokemonImage());
                    }
                }
            });
            selectPane.getChildren().addAll(tf,pokemon);
            team2[i-1] = tf ;
            buttons2[i-1] = pokemon;
        }







        primaryStage.setScene(new Scene(selectPane, 965, 600));
        primaryStage.show();
    }
    public void setCoordinates(Object a, int x, int y) {
        ((Node) a).setLayoutX(x);
        ((Node) a).setLayoutY(y);
    }
    public Button pokebutton() {
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

}
