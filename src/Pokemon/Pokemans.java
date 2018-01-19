package Pokemon;

import Moves.AttackMove;
import Moves.Move;
import javafx.scene.image.Image;

public class Pokemans {
    static Move waste = new AttackMove("Fire",25,100,100);
    public static Pokemon[] pokedex = {
            new Pokemon("Bulbasaur", "Grass", 45, 45, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/1.0.gif"), new Image("Images/Pokemon/1.1.gif"),1),

            new Pokemon("Ivysaur", "Grass", 60, 60, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/2.0.gif"), new Image("Images/Pokemon/2.1.gif"),2),

            new Pokemon("Venusaur", "Grass", 80, 80, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/3.0.gif"), new Image("Images/Pokemon/3.1.gif"),3),

            new Pokemon("Charmander", "Fire", 39, 65, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/4.0.gif"), new Image("Images/Pokemon/4.1.gif"),4),

            new Pokemon("Charmeleon", "Fire", 58, 80, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/5.0.gif"), new Image("Images/Pokemon/5.1.gif"), 5),

            new Pokemon("Charizard", "Fire", 78, 100, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/6.0.gif"), new Image("Images/Pokemon/6.1.gif"), 6),

            new Pokemon("Squirtle", "Water", 44, 43, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/7.0.gif"), new Image("Images/Pokemon/7.1.gif"),7),

            new Pokemon("Wartortle", "Water", 59, 58, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/8.0.gif"), new Image("Images/Pokemon/8.1.gif"),8),

            new Pokemon("Blastoise", "Water", 79, 78, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/9.0.gif"), new Image("Images/Pokemon/9.1.gif"),9),

            new Pokemon("Caterpie", "Bug", 45, 45, 0.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/10.0.gif"), new Image("Images/Pokemon/10.1.gif"),10),

            new Pokemon("Metapod", "Bug", 70, 30, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/11.0.gif"), new Image("Images/Pokemon/11.1.gif"), 11),

            new Pokemon("Butterfree", "Bug", 60, 70, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/12.0.gif"), new Image("Images/Pokemon/12.1.gif"), 12),

            new Pokemon("Weedle", "Bug", 40, 50, 0.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/13.0.gif"), new Image("Images/Pokemon/13.1.gif"),13),

            new Pokemon("Kakuna", "Bug", 45, 35, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/14.0.gif"), new Image("Images/Pokemon/14.1.gif"),14),

            new Pokemon("Beedrill", "Bug", 65, 75, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/15.0.gif"), new Image("Images/Pokemon/15.1.gif"),15),

            new Pokemon("Pidgey", "Flying", 40, 56, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/16.0.gif"), new Image("Images/Pokemon/16.1.gif"),16),

            new Pokemon("Pidgeotto", "Flying", 63, 71, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/17.0.gif"), new Image("Images/Pokemon/17.1.gif"), 17),

            new Pokemon("Pidgeot", "Flying", 83, 101, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/18.0.gif"), new Image("Images/Pokemon/18.1.gif"), 18),

            new Pokemon("Rattata", "Normal", 30, 72, 0.4, waste, waste, waste, waste,
            new Image("Images/Pokemon/19.0.gif"), new Image("Images/Pokemon/19.1.gif"),19),

            new Pokemon("Raticate", "Normal", 55, 97, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/20.0.gif"), new Image("Images/Pokemon/20.1.gif"),20),

            new Pokemon("Spearow", "Flying", 40, 70, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/21.0.gif"), new Image("Images/Pokemon/21.1.gif"),21),

            new Pokemon("Fearow", "Flying", 65, 100, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/22.0.gif"), new Image("Images/Pokemon/22.1.gif"),22),

            new Pokemon("Ekans", "Poison", 35, 55, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/23.0.gif"), new Image("Images/Pokemon/23.1.gif"), 23),

            new Pokemon("Arbok", "Poison", 60, 80, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/24.0.gif"), new Image("Images/Pokemon/24.1.gif"), 24),

            new Pokemon("Pikachu", "Electric", 35, 90, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/25.0.gif"), new Image("Images/Pokemon/25.1.gif"),25),

            new Pokemon("Raichu", "Electric", 60, 110, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/26.0.gif"), new Image("Images/Pokemon/26.1.gif"),26),

            new Pokemon("Sandshrew", "Ground", 50, 40, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/27.0.gif"), new Image("Images/Pokemon/27.1.gif"),27),

            new Pokemon("Sandslash", "Ground", 75, 65, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/28.0.gif"), new Image("Images/Pokemon/28.1.gif"),28),

            new Pokemon("NidoranF", "Poison", 55, 41, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/29.0.gif"), new Image("Images/Pokemon/29.1.gif"), 29),

            new Pokemon("Nidorina", "Poison", 78, 100, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/30.0.gif"), new Image("Images/Pokemon/30.1.gif"), 30),

            // START HERE

            new Pokemon("Nidoqueen", "Poison", 45, 45, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/31.0.gif"), new Image("Images/Pokemon/31.1.gif"),31),

            new Pokemon("NidoranM", "Poison", 60, 60, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/32.0.gif"), new Image("Images/Pokemon/32.1.gif"),32),

            new Pokemon("Nidorina", "Poison", 80, 80, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/33.0.gif"), new Image("Images/Pokemon/33.1.gif"),33),

            new Pokemon("Nidoking", "Poison", 39, 65, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/34.0.gif"), new Image("Images/Pokemon/34.1.gif"),34),

            new Pokemon("Clefairy", "Normal", 70, 35, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/35.0.gif"), new Image("Images/Pokemon/35.1.gif"), 35),

            new Pokemon("Clefable", "Normal", 78, 100, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/36.0.gif"), new Image("Images/Pokemon/36.1.gif"), 36),

            new Pokemon("Vulpix", "Fire", 44, 43, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/37.0.gif"), new Image("Images/Pokemon/37.1.gif"),37),

            new Pokemon("Ninetales", "Fire", 59, 58, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/38.0.gif"), new Image("Images/Pokemon/38.1.gif"),38),

            new Pokemon("Jigglypuff", "Normal", 79, 78, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/39.0.gif"), new Image("Images/Pokemon/39.1.gif"),39),

            new Pokemon("Wigglytuff", "Normal", 45, 45, 0.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/40.0.gif"), new Image("Images/Pokemon/40.1.gif"),40),

            new Pokemon("Zubat", "Poison", 70, 30, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/41.0.gif"), new Image("Images/Pokemon/41.1.gif"), 41),

            new Pokemon("Golbat", "Poison", 60, 70, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/42.0.gif"), new Image("Images/Pokemon/42.1.gif"), 42),

            new Pokemon("Oddish", "Grass", 40, 50, 0.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/43.0.gif"), new Image("Images/Pokemon/43.1.gif"),43),

            new Pokemon("Gloom", "Poison", 45, 35, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/44.0.gif"), new Image("Images/Pokemon/44.1.gif"),44),

            new Pokemon("Vileplume", "Poison", 65, 75, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/45.0.gif"), new Image("Images/Pokemon/45.1.gif"),45),

            new Pokemon("Paras", "Bug", 40, 56, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/46.0.gif"), new Image("Images/Pokemon/46.1.gif"),46),

            new Pokemon("Parasect", "Bug", 63, 71, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/47.0.gif"), new Image("Images/Pokemon/47.1.gif"), 47),

            new Pokemon("Venonat", "Poison", 83, 101, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/48.0.gif"), new Image("Images/Pokemon/48.1.gif"), 48),

            new Pokemon("Venomoth", "Poison", 30, 72, 0.4, waste, waste, waste, waste,
            new Image("Images/Pokemon/49.0.gif"), new Image("Images/Pokemon/49.1.gif"),49),

            new Pokemon("Diglett", "Ground", 55, 97, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/50.0.gif"), new Image("Images/Pokemon/50.1.gif"),50),

            new Pokemon("Dugtrio", "Ground", 40, 70, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/51.0.gif"), new Image("Images/Pokemon/51.1.gif"),51),

            new Pokemon("Meowth", "Normal", 65, 100, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/52.0.gif"), new Image("Images/Pokemon/52.1.gif"),52),

            new Pokemon("Persian", "Normal", 35, 55, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/53.0.gif"), new Image("Images/Pokemon/53.1.gif"), 53),

            new Pokemon("Psyduck", "Water", 60, 80, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/54.0.gif"), new Image("Images/Pokemon/54.1.gif"), 54),

            new Pokemon("Golduck", "Water", 35, 90, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/55.0.gif"), new Image("Images/Pokemon/55.1.gif"),55),

            new Pokemon("Mankey", "Fighting", 60, 110, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/56.0.gif"), new Image("Images/Pokemon/56.1.gif"),56),

            new Pokemon("Primeape", "Fighting", 50, 40, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/57.0.gif"), new Image("Images/Pokemon/57.1.gif"),57),

            new Pokemon("Growlithe", "Fire", 75, 65, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/58.0.gif"), new Image("Images/Pokemon/58.1.gif"),58),

            new Pokemon("Arcanine", "Fire", 55, 41, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/59.0.gif"), new Image("Images/Pokemon/59.1.gif"), 59),

            new Pokemon("Poliwag", "Water", 78, 100, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/60.0.gif"), new Image("Images/Pokemon/60.1.gif"), 60),

    };



}
