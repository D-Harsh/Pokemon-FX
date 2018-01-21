package Moves;

import Pokemon.Pokemon; /* Requires variables such as the strengthStat of a pokemon which are stored under the Pokemon Class
						and thus the Pokemon class from the Pokemon folder must be imported to gain access to such variables*/



public class StatusMove extends Move { // StatusMove is a type of a Move and thus inherits the Move class
		int statraise; 	// if statraise = 1 speed will be doubled and if statraise = 2 strength will be doubled, 3 is both
		double multiplier; // The amount the move multiplies the stat(s)
		String reciever; /* If reciever = "s" then the move is used on the pokemon using it, if "o" it is used on the
						opposition*/
	    public StatusMove(String type,String name, int pp,int acc, int statraise, double multiplier, String reciever) {
	        super(type,name, pp, acc);
	        this.statraise = statraise;
	        this.multiplier = multiplier;
	        this.reciever = reciever;
	    }
	    // ^ Constructor that allows status changing moves to be created

	    @Override
	    public int calculateDamage(Pokemon pokemon) {
	        return 0;
	    } // Because this kind of move does not do damage

	    public void makeMove(Pokemon self, Pokemon opponent) { /* Takes in the pokemon using the move as a pararmeter, since the
	    stat changes will apply to the pokemon using the move */
	    	if (ppCheck()){
				if (reciever.equals("s")){
					if (statraise == 1) {
						int SS = self.getSpeedStat();
						self.setSpeedStat((int)(SS*multiplier));
					}
					if (statraise == 2) {
						double StrS = self.getStrengthStat();
						self.setStrengthStat(StrS*multiplier);
					}
					if (statraise == 3) {
						int SS = self.getSpeedStat();
						self.setSpeedStat((int)(SS*multiplier));
						double StrS = self.getStrengthStat();
						self.setStrengthStat(StrS*multiplier);
					}
				}
				if (reciever.equals("o")){
					if (statraise == 1) {
						int SS = opponent.getSpeedStat();
						opponent.setSpeedStat((int)(SS*multiplier));
					}
					if (statraise == 2) {
						double StrS = opponent.getStrengthStat();
						opponent.setStrengthStat(StrS*multiplier);
					}
					if (statraise == 3) {
						int SS = opponent.getSpeedStat();
						opponent.setSpeedStat((int)(SS*multiplier));
						double StrS = opponent.getStrengthStat();
						opponent.setStrengthStat(StrS*multiplier);
					}
				}
	    	}
	    }
	    /*Sets the new stat of the pokemon depending on what stat(s) is/are being raised and on what pokemon the stats
	    * are being applied to */
}
