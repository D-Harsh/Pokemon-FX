package Pokemon;

import Moves.AttackMove;
import Moves.ConditionMove;
import Moves.HealMove;
import Moves.Move;
import Moves.StatusMove;
import javafx.scene.image.Image;

public class Pokemans {
    static Move Flamethrower = new AttackMove("Fire", 25, 100, 35);
    static Move Earthquake = new AttackMove("Ground", 25, 100, 35);
    static Move Bug_Buzz = new AttackMove("Bug", 25, 90, 30);
    static Move Outrage = new AttackMove("Dragon", 10, 100, 40);
    static Move Ice_Beam = new AttackMove("Ice", 15, 100, 30);
    static Move Close_Combat = new AttackMove("Fighting", 5, 95, 40);
    static Move Hurricane = new AttackMove("Flying",10, 70, 42);
    static Move Vine_Whip = new AttackMove("Grass", 8, 85, 42);
    static Move Shadow_Ball = new AttackMove("Ghost", 20, 100, 35);
    static Move Thunderbolt = new AttackMove("Electric",20, 100, 37);
    static Move Hyperbeam = new AttackMove("Normal", 5, 100, 40);
    static Move Gunk_Shot = new AttackMove("Poison", 15, 90, 40);
    static Move Psychic = new AttackMove("Psychic", 20, 100 ,37);
    static Move Stone_Edge = new AttackMove("Rock", 10, 70, 40);
    static Move Hydropump = new AttackMove("Water", 10, 80, 45);
    static Move Recover = new HealMove("Fire", 16, 100, 25);
    static Move Synthesis = new HealMove("Fire", 8, 100, 15);
    static Move Roost = new HealMove("Flying", 16, 100, 20);
    static Move Thunderwave = new StatusMove("Electric", 32 , 90, 1);
    static Move WillOWisp = new StatusMove("Fire",32, 85,2);
    static Move SwordsDance = new ConditionMove("Normal", 25, 100, 2);
    static Move DragonDance = new ConditionMove("Dragon",25,100, 3);
    static Move Agility = new ConditionMove("Psychic",25, 100, 1);
    static Move Leaf_Blade = new AttackMove("Grass", 16, 90, 32);
    static Move Tackle = new AttackMove("Normal", 32, 100, 10);
    
    
    public static Pokemon[] pokedex = {
            new Pokemon("Bulbasaur", "Grass", 45, 45, 0.7, Tackle, Gunk_Shot, Synthesis, Leaf_Blade,
            new Image("Images/Pokemon/1.0.gif"), new Image("Images/Pokemon/1.1.gif"),1),

            new Pokemon("Ivysaur", "Grass", 60, 60, 0.85, waste, waste, waste, waste,
            new Image("Images/Pokemon/2.0.gif"), new Image("Images/Pokemon/2.1.gif"),2),

            new Pokemon("Venusaur", "Grass", 80, 80, 1.2, Vine_Whip, waste, waste, waste,
            new Image("Images/Pokemon/3.0.gif"), new Image("Images/Pokemon/3.1.gif"),3),

            new Pokemon("Charmander", "Fire", 39, 65, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/4.0.gif"), new Image("Images/Pokemon/4.1.gif"),4),

            new Pokemon("Charmeleon", "Fire", 58, 80, 0.85, waste, waste, waste, waste,
            new Image("Images/Pokemon/5.0.gif"), new Image("Images/Pokemon/5.1.gif"), 5),

            new Pokemon("Charizard", "Fire", 78, 100, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/6.0.gif"), new Image("Images/Pokemon/6.1.gif"), 6),

            new Pokemon("Squirtle", "Water", 44, 43, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/7.0.gif"), new Image("Images/Pokemon/7.1.gif"),7),

            new Pokemon("Wartortle", "Water", 59, 58, 0.85, waste, waste, waste, waste,
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

            new Pokemon("Pidgeot", "Flying", 83, 101, 1.05, waste, waste, waste, waste,
            new Image("Images/Pokemon/18.0.gif"), new Image("Images/Pokemon/18.1.gif"), 18),

            new Pokemon("Rattata", "Normal", 30, 72, 0.45, waste, waste, waste, waste,
            new Image("Images/Pokemon/19.0.gif"), new Image("Images/Pokemon/19.1.gif"),19),

            new Pokemon("Raticate", "Normal", 55, 97, 0.88, waste, waste, waste, waste,
            new Image("Images/Pokemon/20.0.gif"), new Image("Images/Pokemon/20.1.gif"),20),

            new Pokemon("Spearow", "Flying", 40, 70, 0.67, waste, waste, waste, waste,
            new Image("Images/Pokemon/21.0.gif"), new Image("Images/Pokemon/21.1.gif"),21),

            new Pokemon("Fearow", "Flying", 65, 100, 0.95, waste, waste, waste, waste,
            new Image("Images/Pokemon/22.0.gif"), new Image("Images/Pokemon/22.1.gif"),22),

            new Pokemon("Ekans", "Poison", 35, 55, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/23.0.gif"), new Image("Images/Pokemon/23.1.gif"), 23),

            new Pokemon("Arbok", "Poison", 60, 80, 0.95, waste, waste, waste, waste,
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

            new Pokemon("Nidorina", "Poison", 70, 56,0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/30.0.gif"), new Image("Images/Pokemon/30.1.gif"), 30),

            // START HERE

            new Pokemon("Nidoqueen", "Poison", 90, 76, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/31.0.gif"), new Image("Images/Pokemon/31.1.gif"),31),

            new Pokemon("NidoranM", "Poison", 46, 50, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/32.0.gif"), new Image("Images/Pokemon/32.1.gif"),32),

            new Pokemon("Nidorino", "Poison", 61, 65, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/33.0.gif"), new Image("Images/Pokemon/33.1.gif"),33),

            new Pokemon("Nidoking", "Poison", 81, 85, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/34.0.gif"), new Image("Images/Pokemon/34.1.gif"),34),

            new Pokemon("Clefairy", "Normal", 70, 35, 0.6, waste, waste, waste, waste,
            new Image("Images/Pokemon/35.0.gif"), new Image("Images/Pokemon/35.1.gif"), 35),

            new Pokemon("Clefable", "Normal", 100, 60, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/36.0.gif"), new Image("Images/Pokemon/36.1.gif"), 36),

            new Pokemon("Vulpix", "Fire", 38, 65, 0.75, waste, waste, waste, waste,
            new Image("Images/Pokemon/37.0.gif"), new Image("Images/Pokemon/37.1.gif"),37),

            new Pokemon("Ninetales", "Fire", 73, 100, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/38.0.gif"), new Image("Images/Pokemon/38.1.gif"),38),

            new Pokemon("Jigglypuff", "Normal", 115, 20, 0.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/39.0.gif"), new Image("Images/Pokemon/39.1.gif"),39),

            new Pokemon("Wigglytuff", "Normal", 140, 45, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/40.0.gif"), new Image("Images/Pokemon/40.1.gif"),40),

            new Pokemon("Zubat", "Poison", 40, 55, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/41.0.gif"), new Image("Images/Pokemon/41.1.gif"), 41),

            new Pokemon("Golbat", "Poison", 75, 90, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/42.0.gif"), new Image("Images/Pokemon/42.1.gif"), 42),

            new Pokemon("Oddish", "Grass", 45, 30, 0.67, waste, waste, waste, waste,
            new Image("Images/Pokemon/43.0.gif"), new Image("Images/Pokemon/43.1.gif"),43),

            new Pokemon("Gloom", "Poison", 60, 40, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/44.0.gif"), new Image("Images/Pokemon/44.1.gif"),44),

            new Pokemon("Vileplume", "Poison", 75, 50, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/45.0.gif"), new Image("Images/Pokemon/45.1.gif"),45),

            new Pokemon("Paras", "Bug", 35, 35, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/46.0.gif"), new Image("Images/Pokemon/46.1.gif"),46),

            new Pokemon("Parasect", "Bug", 60, 30, 0.92, waste, waste, waste, waste,
            new Image("Images/Pokemon/47.0.gif"), new Image("Images/Pokemon/47.1.gif"), 47),

            new Pokemon("Venonat", "Poison", 60, 45, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/48.0.gif"), new Image("Images/Pokemon/48.1.gif"), 48),

            new Pokemon("Venomoth", "Poison", 70, 90, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/49.0.gif"), new Image("Images/Pokemon/49.1.gif"),49),

            new Pokemon("Diglett", "Ground", 10, 95, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/50.0.gif"), new Image("Images/Pokemon/50.1.gif"),50),

            new Pokemon("Dugtrio", "Ground", 35, 120, 1.4, waste, waste, waste, waste,
            new Image("Images/Pokemon/51.0.gif"), new Image("Images/Pokemon/51.1.gif"),51),

            new Pokemon("Meowth", "Normal", 40, 90, 0.85, waste, waste, waste, waste,
            new Image("Images/Pokemon/52.0.gif"), new Image("Images/Pokemon/52.1.gif"),52),

            new Pokemon("Persian", "Normal", 65, 115, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/53.0.gif"), new Image("Images/Pokemon/53.1.gif"), 53),

            new Pokemon("Psyduck", "Water", 50, 55, 0.75, waste, waste, waste, waste,
            new Image("Images/Pokemon/54.0.gif"), new Image("Images/Pokemon/54.1.gif"), 54),

            new Pokemon("Golduck", "Water", 80, 85, 0.95, waste, waste, waste, waste,
            new Image("Images/Pokemon/55.0.gif"), new Image("Images/Pokemon/55.1.gif"),55),

            new Pokemon("Mankey", "Fighting", 40, 70, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/56.0.gif"), new Image("Images/Pokemon/56.1.gif"),56),

            new Pokemon("Primeape", "Fighting", 65, 95, 1.15, waste, waste, waste, waste,
            new Image("Images/Pokemon/57.0.gif"), new Image("Images/Pokemon/57.1.gif"),57),

            new Pokemon("Growlithe", "Fire", 55, 60, 0.76, waste, waste, waste, waste,
            new Image("Images/Pokemon/58.0.gif"), new Image("Images/Pokemon/58.1.gif"),58),

            new Pokemon("Arcanine", "Fire", 90, 95, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/59.0.gif"), new Image("Images/Pokemon/59.1.gif"), 59),

            new Pokemon("Poliwag", "Water", 40, 90, 0.65, waste, waste, waste, waste,
            new Image("Images/Pokemon/60.0.gif"), new Image("Images/Pokemon/60.1.gif"), 60),

            new Pokemon("Poliwhirl", "Water", 65, 90, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/61.0.gif"), new Image("Images/Pokemon/61.1.gif"), 61),

            new Pokemon("Poliwrath", "Water", 90, 70, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/62.0.gif"), new Image("Images/Pokemon/62.1.gif"), 62),

            new Pokemon("Abra", "Psychic", 25, 90, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/63.0.gif"), new Image("Images/Pokemon/63.1.gif"),63),

            new Pokemon("Kadabra", "Psychic", 40, 105, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/64.0.gif"), new Image("Images/Pokemon/64.1.gif"),64),

            new Pokemon("Alakazam", "Psychic", 55, 120, 1.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/65.0.gif"), new Image("Images/Pokemon/65.1.gif"),65),

            new Pokemon("Machop", "Fighting", 70, 35, 0.75, waste, waste, waste, waste,
            new Image("Images/Pokemon/66.0.gif"), new Image("Images/Pokemon/66.1.gif"),66),

            new Pokemon("Machoke", "Fighting", 80, 45, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/67.0.gif"), new Image("Images/Pokemon/67.1.gif"), 67),

            new Pokemon("Machamp", "Fighting", 90, 55, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/68.0.gif"), new Image("Images/Pokemon/68.1.gif"), 68),

            new Pokemon("Bellsprout", "Grass", 50, 40, 0.65, waste, waste, waste, waste,
            new Image("Images/Pokemon/69.0.gif"), new Image("Images/Pokemon/69.1.gif"),69),

            new Pokemon("Weepinbell", "Grass", 65, 55, 0.75, waste, waste, waste, waste,
            new Image("Images/Pokemon/70.0.gif"), new Image("Images/Pokemon/60.1.gif"),70),

            new Pokemon("Victreebel", "Grass", 80, 70, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/71.0.gif"), new Image("Images/Pokemon/71.1.gif"),71),

            new Pokemon("Tentacool", "Water", 40, 70, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/72.0.gif"), new Image("Images/Pokemon/72.1.gif"),72),

            new Pokemon("Tentacruel", "Water", 80, 100, 1.05, waste, waste, waste, waste,
            new Image("Images/Pokemon/73.0.gif"), new Image("Images/Pokemon/73.1.gif"), 73),

            new Pokemon("Geodude", "Rock", 40, 20, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/74.0.gif"), new Image("Images/Pokemon/74.1.gif"), 74),

            new Pokemon("Graveler", "Rock", 55, 35, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/75.0.gif"), new Image("Images/Pokemon/75.1.gif"),75),

            new Pokemon("Golem", "Rock", 80, 45, 1.3, waste, waste, waste, waste,
            new Image("Images/Pokemon/76.0.gif"), new Image("Images/Pokemon/76.1.gif"),76)

    };



}
