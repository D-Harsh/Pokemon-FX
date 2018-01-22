package GUI;

import Moves.Move;
import Pokemon.Pokemon;

public class AI {
    public Move makeMove(Pokemon attacker, Pokemon defender){
        Move[] moves = {attacker.move0, attacker.move1, attacker.move2, attacker.move3};
        double maxDMG = 0;
        int choice = (int)(Math.random()*100);
        if (choice > 70){
            int randomMove = (int)(Math.random()*4);
            if (randomMove == 0){
                return attacker.move0;
            }
            if (randomMove == 1){
                return attacker.move1;
            }
            if (randomMove == 2){
                return  attacker.move2;
            }
            if (randomMove == 3){
                return attacker.move3;
            }
        }
        if (choice <= 70) {
            for (int i = 0; i < 4; i++) {
                moves[i].calculateDamage(attacker, defender);
                if (maxDMG < moves[i].getDamage()) {
                    maxDMG = moves[i].getDamage();
                }
            }
            for (Move x : moves) {
                if (x.getDamage() == maxDMG) {
                    return x;
                }
            }
        }
        return randomMove(attacker);
    }

    public Move randomMove(Pokemon attacker){
        int randomMove = (int)(Math.random()*4);
        if (randomMove == 0){
            return attacker.move0;
        }
        if (randomMove == 1){
            return attacker.move1;
        }
        if (randomMove == 2){
            return  attacker.move2;
        }
        if (randomMove == 3){
            return attacker.move3;
        }
        else{
            return attacker.move0;
        }
    }
}
