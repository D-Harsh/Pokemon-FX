package Moves;

import Pokemon.Pokemon; /* Requires variables such as the type of a pokemon which are stored under the Pokemon Class
                        and thus the Pokemon class from the Pokemon folder must be imported to gain access to such variables*/


public class AttackMove extends Move { // AttackMove is a type of a Move and thus inherits the Move class
    double damage; // This variable represents the amount of damage to HP an attacking move will do

    public AttackMove(String type, String name, int pp, int accuracy, int damage) {
        super(type, name, pp, accuracy); /* Sets the parameters/attributes of the superclass Move, to which the "AttackMove"
										class belongs*/
        this.damage = damage;
    }
    // ^ Constructor of the AttackMove class, which allows attacks moves to be created


    public void calculateDamage(Pokemon attacker, Pokemon defender) { /* This method is used to calculate the damage
    																	that any move executed by an attacker will do to
    																	a defender*/
        double strengthStat = attacker.getStrengthStat(); // Retrieves the "StrengthStat" of the attacking pokemon from the Pokemon class
        double dmgmult = 1; /* Standard multiplier is set to 1, meaning it wont alter the effectiveness of the move unless
							one of the following conditions is met*/
        double STAB = 1; // Same Type Attack Bonus is a multiplier which adds damage to a move if it is of the same type as the pokemon using it
        String attackertype = attacker.getType(); // Gets pokemon type of attacker
        String defendertype = defender.getType(); // Gets pokemon type of defender
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

        if (type.equals("Flying")) {
            if (defendertype.equals("Grass") || defendertype.equals("Fighting") || defendertype.equals("Bug")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Rock") || defendertype.equals("Electric")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Poison")) {
            if (defendertype.equals("Bug") || defendertype.equals("Grass")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Ground") || defendertype.equals("Poison") || defendertype.equals("Rock") || defendertype.equals("Ghost")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Ground")) {
            if (defendertype.equals("Poison") || defendertype.equals("Rock") || defendertype.equals("Fire") || defendertype.equals("Electric")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Bug") || defendertype.equals("Grass")) {
                dmgmult = 0.5;
            }
            if (defendertype.equals("Flying")) {
                dmgmult = 0;
            }
        }

        if (type.equals("Rock")) {
            if (defendertype.equals("Flying") || defendertype.equals("Bug") || defendertype.equals("Fire") || defendertype.equals("Ice")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Fighting") || defendertype.equals("Ground")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Bug")) {
            if (defendertype.equals("Poison") || defendertype.equals("Grass") || defendertype.equals("Psychic")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Fight") || defendertype.equals("Flying") || defendertype.equals("Ghost") || defendertype.equals("Fire")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Ghost")) {
            if (defendertype.equals("Ghost")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Psychic") || defendertype.equals("Normal")) {
                dmgmult = 0;
            }
        }

        if (type.equals("Fire")) {
            if (defendertype.equals("Bug") || defendertype.equals("Grass") || defendertype.equals("Ice")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Ground") || defendertype.equals("Water") || defendertype.equals("Fire") || defendertype.equals("Dragon")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Water")) {
            if (defendertype.equals("Ground") || defendertype.equals("Rock") || defendertype.equals("Fire")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Grass") || defendertype.equals("Water") || defendertype.equals("Dragon")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Grass")) {
            if (defendertype.equals("Rock") || defendertype.equals("Water")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Poison") || defendertype.equals("Bug") || defendertype.equals("Fire") || defendertype.equals("Flying") || defendertype.equals("Grass")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Electric")) {
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

        if (type.equals("Psychic")) {
            if (defendertype.equals("Fighting") || defendertype.equals("Poison")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Psychic")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Ice")) {
            if (defendertype.equals("Flying") || defendertype.equals("Grass") || defendertype.equals("Ground") || defendertype.equals("Dragon")) {
                dmgmult = 2;
            }
            if (defendertype.equals("Water") || defendertype.equals("Ice")) {
                dmgmult = 0.5;
            }
        }

        if (type.equals("Dragon")) {
            if (defendertype.equals("Dragon")) {
                dmgmult = 2;
            }
        }
    	/* ^ These if statements are used to determine if a move made by the attacking pokemon is effective, not very effective
    	or ineffective on the defending pokemon based on the type of the move and the type of the pokemon defending*/

        if (attackertype.equals(type)) {
            STAB = 1.3;
        }
		/* If the type of the of the move a pokemon uses is the same as the type of the pokemon itself, then an additional
			30% of damage is dealt by the move*/

        if (Math.random()*99 + 1 <= accuracy) {
            this.damage = strengthStat * dmgmult * damage * STAB; // The total damage the move does is the product of these multipliers
        }
        else {
            this.damage = 0;
        }
    }

    @Override
    public void makeMove(Pokemon opponent, Pokemon attacker) {
        System.out.println("hello");
        if (ppCheck()) {
            double hP = opponent.gethP(); // Gets the hP of the opponent
            calculateDamage(attacker, opponent); // Calculates the damage the move will do
            hP = hP - damage; // Subtracting the damage the move does in hP from the hP of the defending pokemon
            opponent.sethP(hP); // Setting this new hP after the execution of the move to the hP of the defending pokemon
            System.out.println(hP);
        }
    }
    @Override
    public String displayInfo() {
        return ("\n" + getName() + "\nType='" + type + "'\nPP: " + getPp() + "/" + getMaxPP() + "\nBase Damage: "
                + damage + "\nAccuracy: " + getAccuracy() + "%");
    }
}
