package Pokemon;
import Moves.Move;
import javafx.scene.image.Image;
/**
 * Created by Harsh on 2018-01-08.
 */

public class Pokemon {
    String name, type;
    int hP, healthStat, speedStat, stengthStat;
    Move move0, move1, move2, move3;
    Image pokemon;



    public Pokemon(String name, String type, int hP, int healthStat, int speedStat, int stengthStat, Move move0,
                   Move move1, Move move2, Move move3, Image pokemon) {
        this.name = name;
        this.type = type;
        this.hP = hP;
        this.healthStat = healthStat;
        this.speedStat = speedStat;
        this.stengthStat = stengthStat;
        this.move0 = move0;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.pokemon = pokemon;
    }

    public void useMove(Pokemon opponent, Move move) {
        move.makeMove(opponent);
    }
}