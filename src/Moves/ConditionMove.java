package Moves; // Part of the Moves package of the pokemon class
import Pokemon.Pokemon; /* Requires variables such as the hP of a pokemon which are stored under the Pokemon Class
						and thus the Pokemon class from the Pokemon folder must be imported to gain access to such variables*/


public class ConditionMove extends Move{ // ConditionMove is a type of a Move and thus inherits the Move class

    int status; // 1 is paralyze 2 is burn
    public ConditionMove(String type,String name, int pp,int acc, int status) {
        super(type,name, pp, acc);
        this.status = status;
    }
    // ^ Constructor that allows for the creation of condition moves that inflict certain conditions on pokemon

    @Override
    public void makeMove(Pokemon Opponent, Pokemon user) {
        if (ppCheck()&& Math.random()*99 + 1 <= accuracy){
            if (status == 1) {
                int SS = user.getSpeedStat();
                user.setSpeedStat((int) (SS * 0.5));
            }
            // ^ If the pokemon is paralyzed then its speed stat is halved
            if (status == 2) {
                double StrS = user.getStrengthStat();
                user.setStrengthStat(StrS * 0.5);
            }
            // ^ If the pokemon is burned then its strength stat is halved
        }
//        else{
//
//        }
    }
    public String displayInfo() {
        String condition = "";
        if (status == 1){
            condition = "Paralyze";
        }
        if (status == 2){
            condition = "Burn";
        }

        return (getName() + "\nType='" + type + "'\nPP: " + getPp() + "/" + getMaxPP() + "\nCondition: "
                + condition + "\nAccuracy: " + getAccuracy() + "%");
    }

}
