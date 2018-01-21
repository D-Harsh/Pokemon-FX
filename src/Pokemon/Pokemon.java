package Pokemon;
import Moves.Move;
import javafx.scene.image.Image;

/**
 * Created by Harsh on 2018-01-08.
 */

public class Pokemon {
    String name, type;
    int speedStat, healthIV, speedIV,pokedexNum;
    double strengthStat, strengthIV, hP, maxhP;
    Move move0, move1, move2, move3;
    Image pokemonview, pokemonview2;

    public String getMove0() {
        return move0.getName();
    }

    public String getMove1() {
        return move1.getName();
    }

    public String getMove2() {
        return move2.getName();
    }

    public String getMove3() {
        return move3.getName();
    }

    public double getMaxhP() {
        return maxhP;
    }

    public Pokemon(String name, String type, double hP, int speedStat, double strengthStat,
                   Move move0, Move move1, Move move2, Move move3, Image pokemonview, Image pokemonview2, int pokedexNum) {
        this.name = name;
        this.type = type;
        this.hP = hP;
        this.maxhP = hP;
        this.speedStat = speedStat;
        this.strengthStat = strengthStat;
        this.move0 = move0;
        this.move1 = move1;
        this.move2 = move2;

        this.move3 = move3;
        this.pokemonview = pokemonview;
        this.pokemonview2 = pokemonview2;
        this.pokedexNum = pokedexNum;
        generateIVs();
    }

    public String getType() {
        return type;
    }

    public int getPokedexNum() {
        return pokedexNum;
    }

    @Override
    public String toString() {
        return "\nName='" + name + '\'' +
                ", \nType='" + type + '\'' +
                ", \nSpeedStat=" + speedStat +
                ", \nHealthIV=" + healthIV +
                ", \nSpeedIV=" + speedIV +
                ", \nPokedexNum=" + pokedexNum +
                ", \nStrengthStat=" + strengthStat +
//                ", \nStrengthIV=" + strengthIV +
                ", \nhP=" + hP;
    }

    public Image getPokemonImage() {
        return pokemonview;
    }

    public Image getPokemonImage2(){
        return pokemonview2;
    }

    public void generateIVs() {
        this.healthIV = (int)(Math.random() * 31);
        this.speedIV = (int)(Math.random() * 31);
        this.strengthIV = (Math.random() * 0.5);
    }

    public double gethP() {
		return hP;
	}

	public void sethP(double hP) {
		this.hP = hP;
	}

	public int getSpeedStat() {
		return speedStat;
	}

	public void setSpeedStat(int speedStat) {
		this.speedStat = speedStat;
	}

	public double getStrengthStat() {
		return strengthStat;
	}

	public void setStrengthStat(double stengthStat) {
		this.strengthStat = stengthStat;
	}

	public void useMove(Pokemon opponent, Move move) {
        move.makeMove(opponent, this);
    }

//    public static class Charizad extends Pokemon {
//        public Charizad() {
//            super("Charizad", "Fire", 120, 270, 1.5, move0, move1, move2, move3, pokemon);
//
//        }
//    }
}