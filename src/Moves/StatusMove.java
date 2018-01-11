package Moves;

import Pokemon.Pokemon;
import javafx.scene.image.Image;

public class StatusMove extends Move {
    public StatusMove(String type, int pp,int acc, Image move) {
        super(type, pp,acc, move);
    }

    @Override
    public int calculateDamage(Pokemon pokemon) {
        return 0;
    }


    @Override
    public void makeMove(Pokemon pokemon) {

    }
}
