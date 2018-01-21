package Moves;
import Pokemon.Pokemon;


public class AttackMove extends Move{
	double damage;
    public AttackMove(String type, String name, int pp, int accuracy, int damage){
    	super(type,name, pp, accuracy);
    	this.damage = damage;
    }


    public void calculateDamage (Pokemon attacker, Pokemon defender) {
    	double strengthStat = attacker.getStrengthStat();
    	double dmgmult = 1;
    	String attackertype = attacker.getType();
    	String defendertype = defender.getType();
    	if (type.equals("Normal")) {
    		if (defendertype.equals("Rock")) {
    			dmgmult = 0.5;
    		}
    		if (defendertype.equals("Ghost")) {
    			dmgmult = 0;
    		}
    	}
    	if (type.equals("Fighting")) {
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
    	
    	if (attackertype.equals("Bug")) {
    		if (defendertype.equals("Poison") || defendertype.equals("Grass") || defendertype.equals("Psychic")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Fight") || defendertype.equals("Flying") || defendertype.equals("Ghost") || defendertype.equals("Fire")) {
    			dmgmult = 0.5;
    		}
    	}
    	
    	if (attackertype.equals("Ghost")) {
    		if (defendertype.equals("Ghost")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Psychic") || defendertype.equals("Normal")) {
    			dmgmult = 0;
    		}
    	}
    	
    	if (attackertype.equals("Fire")) {
    		if (defendertype.equals("Bug") || defendertype.equals("Grass") || defendertype.equals("Ice") ) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Ground") || defendertype.equals("Water") || defendertype.equals("Fire") || defendertype.equals("Dragon")) {
    			dmgmult = 0.5;
    		}
    	}
    	
    	if (attackertype.equals("Water")) {
    		if (defendertype.equals("Ground") || defendertype.equals("Rock") || defendertype.equals("Fire") ) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Grass") || defendertype.equals("Water") || defendertype.equals("Dragon")) {
    			dmgmult = 0.5;
    		}
    	}
    	
    	if (attackertype.equals("Electric")) {
    		if (defendertype.equals("Flying") || defendertype.equals("Water")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Electric") || defendertype.equals("Grass") || defendertype.equals("Dragon")) {
    			dmgmult = 0.5;
    		}
    		if (defendertype.equals("Ground")) {
    			dmgmult = 0;
    		}
    	}
    	
    	if (attackertype.equals("Psychic")) {
    		if (defendertype.equals("Fighting") || defendertype.equals("Poison")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Psychic")) {
    			dmgmult = 0.5;
    		}
    	}
    	
    	if (attackertype.equals("Ice")) {
    		if (defendertype.equals("Flying") || defendertype.equals("Grass") || defendertype.equals("Ground") || defendertype.equals("Dragon")) {
    			dmgmult = 2;
    		}
    		if (defendertype.equals("Water") || defendertype.equals("Ice") ) {
    			dmgmult = 0.5;
    		}
    	}
    	
    	if (attackertype.equals("Dragon")) {
    		if (defendertype.equals("Dragon")){
    			dmgmult = 2;
    		}
    	}

    	this.damage = strengthStat * dmgmult * damage;
    }
    
    

    public void makeMove(Pokemon opponent, Pokemon attacker) {
    	double hP = opponent.gethP();
    	calculateDamage(attacker, opponent);
    	hP = hP - damage;
    	opponent.sethP(hP);
    }
}
