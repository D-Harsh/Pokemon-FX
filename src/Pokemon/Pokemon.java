package Pokemon; // Part of the pokemon package of the pokemonfx file
import Moves.Move; // Imports move.move as each pokemon is assigned 4 moves
import javafx.scene.image.Image; // Images need to be used to represent pokemon (gifs)

public class Pokemon {
    String name, type; // Variables representing the name and type of a pokemon
    int speedStat, healthIV, speedIV,pokedexNum; // Integer variables that represent certain stats a Pokemon has such as Speed
    double strengthStat, strengthIV, hP, maxhP; // Double variables for stats that a Pokemon has such as Strength
    public Move move0, move1, move2, move3; // Moves that a pokemon has
    Image pokemonview, pokemonview2; // Images/Gifs of the pokemon

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

    // The above are getters for various variables/attributes of Pokemon

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
    /* Constructor of the Pokemon class, allows for the creation of pokemon with distinct characteristics such as type
       and StrengthStat. Also generates IVs which are used to prevent each pokemon of one kind from being the same. Ex.
       Some Mewtwos may be stronger than others*/

    public String getType() {
        return type;
    }

    public int getPokedexNum() {
        return pokedexNum;
    }

    // More getters to gain public access to certain attributes of Pokemon

    @Override
    public String toString() {
        return "\nName='" + name + '\'' +
                ", \nType='" + type + '\'' +
                ", \nSpeedStat=" + speedStat +
                ", \nSpeedIV=" + speedIV +
                ", \nStrengthIV=" + strengthIV +
                ", \nPokedexNum=" + pokedexNum +
                ", \nStrengthStat=" + strengthStat +
                ", \nhP=" + hP;
    }
    /* The toString method returns a string representation of all the attributes of a Pokemon, this is useful for when
       the information of a Pokemon needs to be displayed to the user so they can choose which pokemon they want to use*/
    public Image getPokemonImage() {
        return pokemonview;
    }

    public Image getPokemonImage2(){
        return pokemonview2;
    }

    /* Getters for pokemon images (Gifs in this case), which are used throughout the game and allow from the graphical
       illustration of pokemon*/

    public void generateIVs() {
        this.healthIV = (int)(Math.random() * 31);
        this.speedIV = (int)(Math.random() * 31);
        this.strengthIV = (int)(Math.random() * 31);
    }
    // Generates 3 random IVs

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

    public int getHealthIV() {
        return healthIV;
    }

    public int getSpeedIV() {
        return speedIV;
    }

    public double getStrengthIV() {
        return strengthIV;
    }

    public void setStrengthStat(double stengthStat) {
        this.strengthStat = stengthStat;
    }

    // ^ More getters and setters for pokemon attributes such as hP and IVS

    public void useMove(Pokemon opponent, Move move) {
        move.makeMove(opponent, this);
    } /* Allows for the execution
    of a move directly by a pokemon */

}