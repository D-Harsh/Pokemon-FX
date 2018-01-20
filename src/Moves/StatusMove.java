package Moves;

import Pokemon.Pokemon;


public class StatusMove extends Move {
	int status; // 1 is paralyze 2 is burn
    public StatusMove(String type, int pp,int acc, int status) {
        super(type, pp, acc);
        this.status = status;
    }

    @Override
    public int calculateDamage(Pokemon pokemon) {
        return 0;
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
