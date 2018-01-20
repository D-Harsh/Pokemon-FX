package Moves;
import Pokemon.Pokemon;


public class HealMove extends Move{
	int healstr;
    public HealMove(String type, int pp, int acc, int healstr) {
        super(type, pp,acc);
        this.healstr = healstr;
    }

    @Override
    public void makeMove(Pokemon opponent) {
    	double hP = opponent.gethP();
    	hP = hP + healstr;
    	opponent.sethP(hP);
    }
}
