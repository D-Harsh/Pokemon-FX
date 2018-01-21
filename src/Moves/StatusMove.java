package Moves;

import Pokemon.Pokemon;


public class StatusMove extends Move {
	// if statraise = 1 speed will be doubled and if statraise = 2 strength will be doubled, 3 is both
		int statraise;
	    public StatusMove(String type,String name, int pp,int acc, int statraise) {
	        super(type,name, pp, acc);
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
	    	if (statraise == 3) {
	    		int SS = userpokemon.getSpeedStat();
	    		userpokemon.setSpeedStat(SS*2);
	    		double StrS = userpokemon.getStrengthStat();
	    		userpokemon.setStrengthStat(StrS*2);
	    	}
	    }
}
