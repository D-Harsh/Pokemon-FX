package Moves; // Part of the Moves package of the pokemon class
//Imports for Alert boxes and the Pokemon class

import GUI.AlertBox;
import Pokemon.Pokemon;

public class Move {
    //Atrributes of the move class
    String type, name;
    int pp, accuracy, maxPP;

    //Getters
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

    public String getName() {
        return name;
    }
    //Constructor
    public Move(String type, String name, int pp, int accuracy) {
        this.name = name;
        this.type = type;
        this.pp = pp;
        this.maxPP = pp;
        this.accuracy = accuracy;
    }
    //Overridden Methods for extended classes
    public void calculateDamage(Pokemon attacker, Pokemon pokemon) {
    }

    public double getDamage() {
        return 0;
    }

    public void makeMove(Pokemon opponent, Pokemon user) {
    }
    public String displayInfo() {
        return "";
    }
    //General pp check for all types of moves
    public boolean ppCheck() {
        if (pp <= 0) {
            AlertBox.display("No More PP", "This move cannot be made");
            return false;
        }
        pp--;
        return true;
    }
}


