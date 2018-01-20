package Moves;
import GUI.AlertBox;
import Pokemon.Pokemon;


public class HealMove extends Move{
	double healstr;
    public HealMove(String type, int pp, int acc, double healstr) {
        super(type, pp,acc);
        this.healstr = healstr;
    }

    @Override
    public void makeMove(Pokemon self) {
        if (ppCheck()) {
            double max = self.getMaxhP(), hp = self.getMaxhP(), newhP = hp + (healstr * max);
            if (newhP <= max) {
                self.sethP(newhP);
            } else {
                self.sethP(max);
            }
        }

    }
}
