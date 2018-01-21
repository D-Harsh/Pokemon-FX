package Moves;
import Pokemon.Pokemon;


public class ConditionMove extends Move{
	
    int status; // 1 is paralyze 2 is burn
    public ConditionMove(String type, int pp,int acc, int status) {
        super(type, pp, acc);
        this.status = status;
    }




    @Override
    public void makeMove(Pokemon userpokemon) {
    	if (status == 1) {
    		int SS = userpokemon.getSpeedStat();
    		userpokemon.setSpeedStat((int) (SS*0.5));
    	}
    	if (status == 2) {
    		double StrS = userpokemon.getStrengthStat();
    		userpokemon.setStrengthStat(StrS*0.5);
    	}
    }
}
