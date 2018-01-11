package Moves;
import Pokemon.Pokemon;
import javafx.scene.image.Image;

public class AttackMove extends Move{
    public AttackMove(String type, int pp, int accuracy, Image move) {
        super(type, pp, accuracy, move);
    }

    @Override
    public int calculateDamage(Pokemon pokemon) {
        return 0;
    }

    @Override
    public void makeMove(Pokemon pokemon) {

    }
}
