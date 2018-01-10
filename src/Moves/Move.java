package Moves;
import Pokemon.Pokemon;
import javafx.scene.image.Image;
public class Move {
	String type;
	int pp;
	Image move;
	int accuracy;

	public Move(String type, int pp, int accuracy, Image move) {
		this.type = type;
		this.pp = pp;
		this.move = move;
		this.accuracy = accuracy;
	}

	public int calculateDamage(Pokemon pokemon){
	return 0;
	}

	public void makeMove(Pokemon pokemon){
	}
}
public class fireBall extends Move{
}

