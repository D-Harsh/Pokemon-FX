package Moves;
import Pokemon.Pokemon;


public class AttackMove extends Move{
	int damage;
    public AttackMove(String type, int pp, int accuracy, int damage){
    	super(type, pp, accuracy);
    	this.damage = damage;
    }


    public double damagemultiplier (Pokemon attacker, Pokemon defender) {
    	double dmgmult = 1;
    	String attackertype = attacker.getType();
    	String defendertype = defender.getType();
    	if (attackertype.equals("Normal")) {
    		if (defendertype.equals("Rock")) {
    			dmgmult = 0.5;
    		}
    		if (defendertype.equals("Ghost")) {
    			dmgmult = 0;
    		}
    	}
    	if (attackertype.equals("Fighting")) {
    		if (defendertype.equals("Normal") || defendertype.equals("Rock") || defendertype.equals("Ice")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Flying") || defendertype.equals("Poison") || defendertype.equals("Bug") || defendertype.equals("Psychic")) {
    			dmgmult = 0.5;
    		}
    		if (defendertype.equals("Ghost")) {
    			dmgmult = 0;
    		}
    	}
    	
    	if (attackertype.equals("Flying")) {
    		if (defendertype.equals("Grass") || defendertype.equals("Fighting") || defendertype.equals("Bug")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Rock") || defendertype.equals("Electric")) {
    			dmgmult = 0.5;
    		}
    	}
    	
    	if (attackertype.equals("Poison")) {
    		if (defendertype.equals("Bug") || defendertype.equals("Grass")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Ground") || defendertype.equals("Poison") || defendertype.equals("Rock") || defendertype.equals("Ghost")) {
    			dmgmult = 0.5;
    		}
    	}
    	
    	if (attackertype.equals("Ground")) {
    		if (defendertype.equals("Poison") || defendertype.equals("Rock") || defendertype.equals("Fire") || defendertype.equals("Electric") ) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Bug") || defendertype.equals("Grass")) {
    			dmgmult = 0.5;
    		}
    		if (defendertype.equals("Flying")) {
    			dmgmult = 0;
    		}
    	}
    	
    	if (attackertype.equals("Rock")) {
    		if (defendertype.equals("Flying") || defendertype.equals("Bug") || defendertype.equals("Fire") || defendertype.equals("Ice") ) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Fighting") || defendertype.equals("Ground")) {
    			dmgmult = 0.5;
    		}
    	}

    	
    return dmgmult;
    }
    
    public int calculateDamage(Pokemon pokemon) {
    	
        return damage;
    }

    @Override
    public void makeMove(Pokemon pokemon) {

    }
}
