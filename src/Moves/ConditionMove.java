package Moves;
import Pokemon.Pokemon;
import javafx.scene.image.Image;

public class ConditionMove extends Move{
    public ConditionMove(String type, int pp, Image move) {
        super(type, pp, move);
    }

    @Override
    public int calculateDamage(Pokemon pokemon) {
        return 0;
    }

    @Override
    public void makeMove(Pokemon pokemon) {

    }
}
