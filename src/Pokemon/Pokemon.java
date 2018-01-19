package Pokemon;
import Moves.Move;
import javafx.scene.image.Image;

/**
 * Created by Harsh on 2018-01-08.
 */

public class Pokemon {
    String name, type;
    int hP, speedStat, healthIV, speedIV,pokedexNum;
    double stengthStat, strengthIV;
    Move move0, move1, move2, move3;
    Image pokemon;

    public Pokemon(String name, String type, int hP, int speedStat, double stengthStat,
                   Move move0, Move move1, Move move2, Move move3, Image pokemon,int pokedexNum) {
        this.name = name;
        this.type = type;
        this.hP = hP;
        this.speedStat = speedStat;
        this.stengthStat = stengthStat;
        this.move0 = move0;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.pokemon = pokemon;
        this.pokedexNum = pokedexNum;
        generateIVs();
    }

    public String getType() {
        return type;
    }

    public int getPokedexNum() {
        return pokedexNum;
    }

    public Image getPokemonImage() {
        return pokemon;
    }

    public void generateIVs() {
        this.healthIV = (int)(Math.random() * 31);
        this.speedIV = (int)(Math.random() * 31);
        this.strengthIV = (Math.random() * 0.5);
    }

    public void useMove(Pokemon opponent, Move move) {
        move.makeMove(opponent);
    }

//    public static class Charizad extends Pokemon {
//        public Charizad() {
//            super("Charizad", "Fire", 120, 270, 1.5, move0, move1, move2, move3, pokemon);
//
//        }
//    }
}