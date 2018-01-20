package Moves;
import Pokemon.Pokemon;

public class Move {
	String type;
	int pp;
	int accuracy;

	public Move(String type, int pp, int accuracy) {
		this.type = type;
		this.pp = pp;
		this.accuracy = accuracy;
	}

	public int calculateDamage(Pokemon pokemon){
		return 0;
	}

	public void makeMove(Pokemon opponent){
	}
}


