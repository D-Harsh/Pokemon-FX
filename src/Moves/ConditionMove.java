package Moves;
import Pokemon.Pokemon;


public class ConditionMove extends Move{
	// if statraise = 1 speed will be doubled and if statraise = 2 strength will be doubled
	int statraise;
    public ConditionMove(String type, int pp,int acc, int statraise) {
        super(type, pp, acc);
        this.statraise = statraise;
    }

    @Override
    public int calculateDamage(Pokemon pokemon) {
        return 0;
    }

    @Override
    public void makeMove(Pokemon userpokemon) {
    	if (statraise == 1) {
    		int SS = userpokemon.getSpeedStat();
    		userpokemon.setSpeedStat(SS*2);
    	}
    	if (statraise == 2) {
    		double StrS = userpokemon.getStrengthStat();
    		userpokemon.setStrengthStat(StrS*2);
    	}
    }
}
