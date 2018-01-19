package Pokemon;

import Moves.AttackMove;
import Moves.Move;
import javafx.scene.image.Image;

public class Pokemans {
    static Move waste = new AttackMove("Fire",25,100,100);
    public static Pokemon[] pokedex = {
            new Pokemon("Bulbasaur", "Grass", 45, 45, 0.6, waste,
            waste, waste, waste, new Image("Images/Pokemon/1.0.gif"), new Image("Images/Pokemon/1.1.gif"), 1),

            new Pokemon("Ivysaur", "Grass", 60, 60, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/2.0.gif"), new Image("Images/Pokemon/2.1.gif"), 2),

            new Pokemon("Venusaur", "Grass", 80, 80, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/3.0.gif"), new Image("Images/Pokemon/3.1.gif"), 3),

            new Pokemon("Charmander", "Fire", 39, 65, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/4.0.gif"), new Image("Images/Pokemon/4.1.gif"), 4),

            new Pokemon("Charmeleon", "Fire", 58, 80, 0.8, waste, waste, waste, waste,
                    new Image("Images/Pokemon/5.0.gif"), new Image("Images/Pokemon/5.1.gif"), 5),

            new Pokemon("Charizard", "Fire", 78, 100, 1, waste, waste, waste, waste,
                    new Image("Images/Pokemon/6.0.gif"), new Image("Images/Pokemon/6.1.gif"), 6)
    };



}
