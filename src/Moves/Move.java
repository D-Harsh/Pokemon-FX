package Moves;
import Pokemon.Pokemon;
import javafx.scene.image.Image;
public class Move {
	String type;
	int pp;
	Image move;

	public Move(String type, int pp, Image move) {
		this.type = type;
		this.pp = pp;
		this.move = move;
	}

	public int calculateDamage(Pokemon pokemon){
	return 0;
	}
	public void makeMove(Pokemon pokemon){
	}
}
