package Moves;
import GUI.AlertBox;
import Pokemon.Pokemon;

public class Move {
	String type, name;
	int pp;
	int accuracy;

	public String getName() {
		return name;
	}

	public Move(String type, String name, int pp, int accuracy) {
		this.name = name;
		this.type = type;
		this.pp = pp;
		this.accuracy = accuracy;
	}

	public int calculateDamage(Pokemon pokemon){
		return 0;
	}

	public void makeMove(Pokemon opponent, Pokemon user){
	}
	public boolean ppCheck(){
		if (pp <= 0){
			AlertBox.display("No More PP","This move cannot be made");
			return false;
		}
		pp--;
		return true;
	}
}


