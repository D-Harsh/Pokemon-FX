package Moves; // Part of the Moves package of the pokemon class

import Pokemon.Pokemon; /* Requires variables such as the hP of a pokemon which are stored under the Pokemon Class
						and thus the Pokemon class from the Pokemon folder must be imported to gain access to such variables*/


public class HealMove extends Move{ // HealMove is a type of a Move and thus inherits the Move class
    double healstr; // Variable that represents the amount any heal move heals. healstr is a percentage heal
    public HealMove(String type,String name, int pp, int acc, double healstr) {
        super(type,name, pp,acc);
        this.healstr = healstr;
    }
    // ^ Constructor that allows for the creation of healing moves which aid a pokemon when it is low

    @Override
    public void makeMove(Pokemon opponent, Pokemon user) { /* Takes in the parameter self which represents the pokemon using the move,
                                        because heal moves heal the pokemon that uses the move*/
        if (ppCheck()) { // If the move has pp and is able to be used:
            double max = user.getMaxhP(), hp = user.gethP(), newhP = hp + ((0.01*healstr) * max); /* Gets the maxhP of the pokemon
            and the current hP. These variables are used to calculate the newhP of the pokemon according to how much the
            heal move heals (a percentage)*/
            if (newhP <= max) {
                user.sethP(newhP);
            } else {
                user.sethP(max);
            }
            // ^ Sets the hP of the pokemon who used the heal move to the new hP after the move has been used
        }

    }
    public String displayInfo(){
        return (getName() + "\nType='" + type + "'\nPP: " + getPp() + "/" + getMaxPP() + "\nHeal: "
                + healstr + "%" + "\nAccuracy: " + getAccuracy() + "%");
    }
}
