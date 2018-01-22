package Moves;
import GUI.AlertBox;
import Pokemon.Pokemon;

public class Move {
	public String getType() {
		return type;
	}

	public int getPp() {
		return pp;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getMaxPP() {
		return maxPP;
	}

	String type, name;
	int pp, accuracy, maxPP;

	public String getName() {
		return name;
	}

	public Move(String type, String name, int pp, int accuracy) {
		this.name = name;
		this.type = type;
		this.pp = pp;
		this.maxPP = pp;
		this.accuracy = accuracy;
	}

	public void calculateDamage(Pokemon attacker, Pokemon pokemon){}

	public double getDamage(){
		return 0;
	}

	public void makeMove(Pokemon opponent, Pokemon user){
	}
	public String displayInfo(){
		return "";
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


