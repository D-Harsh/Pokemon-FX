package Pokemon;

import Moves.AttackMove;
import Moves.ConditionMove;
import Moves.HealMove;
import Moves.Move;
import Moves.StatusMove;
import javafx.scene.image.Image;

public class Pokemans {
    static Move waste = new AttackMove("Fire", 1, 1, 1);
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

            new Pokemon("Venusaur", "Grass", 80, 80, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/3.0.gif"), new Image("Images/Pokemon/3.1.gif"),3),

            new Pokemon("Charmander", "Fire", 39, 65, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/4.0.gif"), new Image("Images/Pokemon/4.1.gif"),4),

            new Pokemon("Charmeleon", "Fire", 58, 80, 0.85, waste, waste, waste, waste,
            new Image("Images/Pokemon/5.0.gif"), new Image("Images/Pokemon/5.1.gif"), 5),

            new Pokemon("Charizard", "Fire", 78, 100, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/6.0.gif"), new Image("Images/Pokemon/6.1.gif"), 6),

            new Pokemon("Squirtle", "Water", 44, 43, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/7.0.gif"), new Image("Images/Pokemon/7.1.gif"),7),

            new Pokemon("Wartortle", "Water", 59, 58, 0.85, waste, waste, waste, waste,
            new Image("Images/Pokemon/8.0.gif"), new Image("Images/Pokemon/8.1.gif"),8),

            new Pokemon("Blastoise", "Water", 79, 78, 1.25, waste, waste, waste, waste,
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

            new Pokemon("Pidgeot", "Flying", 83, 101, 1.15, waste, waste, waste, waste,
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

            new Pokemon("Dugtrio", "Ground", 35, 120, 1.35, waste, waste, waste, waste,
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

            new Pokemon("Alakazam", "Psychic", 55, 120, 1.46, waste, waste, waste, waste,
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
            new Image("Images/Pokemon/76.0.gif"), new Image("Images/Pokemon/76.1.gif"),76),

            new Pokemon("Ponyta", "Fire", 50, 90, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/77.0.gif"), new Image("Images/Pokemon/77.1.gif"),77),

            new Pokemon("Rapidash", "Fire", 65, 105, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/78.0.gif"), new Image("Images/Pokemon/78.1.gif"),78),

            new Pokemon("Slowpoke", "Psychic", 90, 15, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/79.0.gif"), new Image("Images/Pokemon/79.1.gif"),79),

            new Pokemon("Slowbro", "Psychic", 95, 30, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/80.0.gif"), new Image("Images/Pokemon/80.1.gif"),80),

            new Pokemon("Magnemite", "Steel", 25, 45, 0.95, waste, waste, waste, waste,
            new Image("Images/Pokemon/81.0.gif"), new Image("Images/Pokemon/81.1.gif"), 81),

            new Pokemon("Magneton", "Steel", 50, 70, 1.15, waste, waste, waste, waste,
            new Image("Images/Pokemon/82.0.gif"), new Image("Images/Pokemon/82.1.gif"), 82),

            new Pokemon("Farfetch'd", "Flying", 52, 60, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/83.0.gif"), new Image("Images/Pokemon/83.1.gif"),83),

            new Pokemon("Doduo", "Flying", 35, 75, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/84.0.gif"), new Image("Images/Pokemon/84.1.gif"),84),

            new Pokemon("Dodrio", "Flying", 60, 110, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/85.0.gif"), new Image("Images/Pokemon/85.1.gif"),85),

            new Pokemon("Seel", "Water", 65, 45, 0.75, waste, waste, waste, waste,
            new Image("Images/Pokemon/86.0.gif"), new Image("Images/Pokemon/86.1.gif"),86),

            new Pokemon("Dewgong", "Ice", 90, 70, 0.95, waste, waste, waste, waste,
            new Image("Images/Pokemon/87.0.gif"), new Image("Images/Pokemon/87.1.gif"), 87),

            new Pokemon("Grimer", "Poison", 80, 25, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/88.0.gif"), new Image("Images/Pokemon/88.1.gif"), 88),

            new Pokemon("Muk", "Poison", 105, 50, 0.95, waste, waste, waste, waste,
            new Image("Images/Pokemon/89.0.gif"), new Image("Images/Pokemon/89.1.gif"),89),

            new Pokemon("Shellder", "Water", 30, 40, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/90.0.gif"), new Image("Images/Pokemon/90.1.gif"),90),

            new Pokemon("Cloyster", "Ice", 50, 70, 1.33, waste, waste, waste, waste,
            new Image("Images/Pokemon/91.0.gif"), new Image("Images/Pokemon/91.1.gif"),91),

            new Pokemon("Gastly", "Ghost", 30, 80, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/92.0.gif"), new Image("Images/Pokemon/92.1.gif"),92),

            new Pokemon("Haunter", "Ghost", 45, 95, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/93.0.gif"), new Image("Images/Pokemon/93.1.gif"), 93),

            new Pokemon("Gengar", "Ghost", 60, 110, 1.35, waste, waste, waste, waste,
            new Image("Images/Pokemon/94.0.gif"), new Image("Images/Pokemon/94.1.gif"), 94),

            new Pokemon("Onix", "Rock", 35, 70, 1.05, waste, waste, waste, waste,
            new Image("Images/Pokemon/95.0.gif"), new Image("Images/Pokemon/95.1.gif"),95),

            new Pokemon("Drowzee", "Psychic", 60, 42, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/96.0.gif"), new Image("Images/Pokemon/96.1.gif"),96),

            new Pokemon("Hypno", "Psychic", 85, 67, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/97.0.gif"), new Image("Images/Pokemon/97.1.gif"),97),

            new Pokemon("Krabby", "Water", 30, 50, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/98.0.gif"), new Image("Images/Pokemon/98.1.gif"),98),

            new Pokemon("Kingler", "Water", 55, 75, 1.15, waste, waste, waste, waste,
            new Image("Images/Pokemon/99.0.gif"), new Image("Images/Pokemon/99.1.gif"), 99),

            new Pokemon("Voltorb", "Electric", 40, 100,0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/100.0.gif"), new Image("Images/Pokemon/100.1.gif"), 100),

            new Pokemon("Electrode", "Electric", 60, 150, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/101.0.gif"), new Image("Images/Pokemon/101.1.gif"),101),

            new Pokemon("Exeggcute", "Psychic", 60, 40, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/102.0.gif"), new Image("Images/Pokemon/102.1.gif"),102),

            new Pokemon("Exeggutor", "Psychic", 95, 55, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/103.0.gif"), new Image("Images/Pokemon/103.1.gif"),103),

            new Pokemon("Cubone", "Ground", 50, 35, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/104.0.gif"), new Image("Images/Pokemon/104.1.gif"),104),

            new Pokemon("Marowak", "Ground", 60, 45, 1.4, waste, waste, waste, waste,
            new Image("Images/Pokemon/105.0.gif"), new Image("Images/Pokemon/105.1.gif"), 105),

            new Pokemon("Hitmonlee", "Fighting", 50, 87, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/106.0.gif"), new Image("Images/Pokemon/106.1.gif"), 106),

            new Pokemon("Hitmonchan", "Fighting", 50, 76, 1.28, waste, waste, waste, waste,
            new Image("Images/Pokemon/107.0.gif"), new Image("Images/Pokemon/107.1.gif"),107),

            new Pokemon("Lickitung", "Normal", 90, 50, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/108.0.gif"), new Image("Images/Pokemon/108.1.gif"),108),

            new Pokemon("Koffing", "Poison", 40, 35, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/109.0.gif"), new Image("Images/Pokemon/109.1.gif"),109),

            new Pokemon("Weezing", "Poison", 65, 60, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/110.0.gif"), new Image("Images/Pokemon/110.1.gif"),110),

            new Pokemon("Rhyhorn", "Ground", 80, 25, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/111.0.gif"), new Image("Images/Pokemon/111.1.gif"), 111),

            new Pokemon("Rhydon", "Ground", 105, 40, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/112.0.gif"), new Image("Images/Pokemon/112.1.gif"), 112),

            new Pokemon("Chansey", "Normal", 250, 50, 0.55, waste, waste, waste, waste,
            new Image("Images/Pokemon/113.0.gif"), new Image("Images/Pokemon/113.1.gif"),113),

            new Pokemon("Tangela", "Grass", 65, 60, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/114.0.gif"), new Image("Images/Pokemon/114.1.gif"),114),

            new Pokemon("Kangaskhan", "Normal", 105, 90, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/115.0.gif"), new Image("Images/Pokemon/115.1.gif"),115),

            new Pokemon("Horsea", "Water", 30, 60, 0.75, waste, waste, waste, waste,
            new Image("Images/Pokemon/116.0.gif"), new Image("Images/Pokemon/116.1.gif"),116),

            new Pokemon("Seadra", "Water", 55, 85, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/117.0.gif"), new Image("Images/Pokemon/117.1.gif"), 117),

            new Pokemon("Goldeen", "Water", 45, 63, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/118.0.gif"), new Image("Images/Pokemon/118.1.gif"), 118),

            new Pokemon("Seaking", "Water", 80, 68, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/119.0.gif"), new Image("Images/Pokemon/119.1.gif"),119),

            new Pokemon("Staryu", "Water", 30, 85, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/120.0.gif"), new Image("Images/Pokemon/120.1.gif"),120),

            new Pokemon("Starmie", "Water", 60, 115, 1.3, waste, waste, waste, waste,
            new Image("Images/Pokemon/121.0.gif"), new Image("Images/Pokemon/121.1.gif"),121),

            new Pokemon("Mr.Mime", "Psychic", 40, 90, 1.1, waste, waste, waste, waste,
            new Image("Images/Pokemon/122.0.gif"), new Image("Images/Pokemon/122.1.gif"),122),

            new Pokemon("Scyther", "Flying", 70,105, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/123.0.gif"), new Image("Images/Pokemon/123.1.gif"), 123),

            new Pokemon("Jynx", "Ice", 65, 95, 0.95, waste, waste, waste, waste,
            new Image("Images/Pokemon/124.0.gif"), new Image("Images/Pokemon/124.1.gif"), 124),

            new Pokemon("Electabuzz", "Electric", 65, 105, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/125.0.gif"), new Image("Images/Pokemon/125.1.gif"),125),

            new Pokemon("Magmar", "Fire", 65, 93, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/126.0.gif"), new Image("Images/Pokemon/126.1.gif"),126),

            new Pokemon("Pinsir", "Bug", 65, 85, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/127.0.gif"), new Image("Images/Pokemon/127.1.gif"),127),

            new Pokemon("Tauros", "Normal", 75, 110, 1.05, waste, waste, waste, waste,
            new Image("Images/Pokemon/128.0.gif"), new Image("Images/Pokemon/128.1.gif"),128),

            new Pokemon("Magikarp", "Water", 20, 80, 10, waste, waste, waste, waste,
            new Image("Images/Pokemon/129.0.gif"), new Image("Images/Pokemon/129.1.gif"), 129),

            new Pokemon("Gyarados", "Water", 95, 81, 1.32, waste, waste, waste, waste,
            new Image("Images/Pokemon/130.0.gif"), new Image("Images/Pokemon/130.1.gif"), 130),

            new Pokemon("Lapras", "Water", 130, 60, 1.26, waste, waste, waste, waste,
            new Image("Images/Pokemon/131.0.gif"), new Image("Images/Pokemon/131.1.gif"), 131),

            new Pokemon("Ditto", "Normal", 48, 48, 1.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/132.0.gif"), new Image("Images/Pokemon/132.1.gif"), 132),

            new Pokemon("Eevee", "Normal", 55, 55, 0.9, waste, waste, waste, waste,
            new Image("Images/Pokemon/133.0.gif"), new Image("Images/Pokemon/133.1.gif"),133),

            new Pokemon("Vaporeon", "Water", 130, 65, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/134.0.gif"), new Image("Images/Pokemon/134.1.gif"),134),

            new Pokemon("Jolteon", "Electric", 65, 130, 1.25, waste, waste, waste, waste,
            new Image("Images/Pokemon/135.0.gif"), new Image("Images/Pokemon/135.1.gif"),135),

            new Pokemon("Flareon", "Fire", 65, 65, 1.44, waste, waste, waste, waste,
            new Image("Images/Pokemon/136.0.gif"), new Image("Images/Pokemon/136.1.gif"),136),

            new Pokemon("Porygon", "Normal", 65, 40, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/137.0.gif"), new Image("Images/Pokemon/137.1.gif"), 137),

            new Pokemon("Omanyte", "Rock", 35, 35, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/138.0.gif"), new Image("Images/Pokemon/138.1.gif"), 138),

            new Pokemon("Omastar", "Rock", 70, 55, 1.2, waste, waste, waste, waste,
            new Image("Images/Pokemon/139.0.gif"), new Image("Images/Pokemon/139.1.gif"),139),

            new Pokemon("Kabuto", "Rock", 30, 55, 0.7, waste, waste, waste, waste,
            new Image("Images/Pokemon/140.0.gif"), new Image("Images/Pokemon/140.1.gif"),140),

            new Pokemon("Kabutops", "Rock", 60, 80, 1.23, waste, waste, waste, waste,
            new Image("Images/Pokemon/141.0.gif"), new Image("Images/Pokemon/141.1.gif"),141),

            new Pokemon("Aerodactyl", "Rock", 80, 130, 1.15, waste, waste, waste, waste,
            new Image("Images/Pokemon/142.0.gif"), new Image("Images/Pokemon/142.1.gif"),142),

            new Pokemon("Snorlax", "Normal", 180, 30, 0.86, waste, waste, waste, waste,
            new Image("Images/Pokemon/143.0.gif"), new Image("Images/Pokemon/143.1.gif"), 143),

            new Pokemon("Articuno", "Ice", 90, 85, 1.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/144.0.gif"), new Image("Images/Pokemon/144.1.gif"), 144),

            new Pokemon("Zapdos", "Electric", 90, 100, 1.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/145.0.gif"), new Image("Images/Pokemon/145.1.gif"),145),

            new Pokemon("Moltres", "Fire", 90, 90, 1.5, waste, waste, waste, waste,
            new Image("Images/Pokemon/146.0.gif"), new Image("Images/Pokemon/146.1.gif"),146),

            new Pokemon("Dratini", "Dragon", 41, 50, 0.8, waste, waste, waste, waste,
            new Image("Images/Pokemon/147.0.gif"), new Image("Images/Pokemon/147.1.gif"),147),

            new Pokemon("Dragonair", "Dragon", 61, 70, 1, waste, waste, waste, waste,
            new Image("Images/Pokemon/148.0.gif"), new Image("Images/Pokemon/148.1.gif"),148),

            new Pokemon("Dragonite", "Dragon", 91, 70, 1.45, waste, waste, waste, waste,
            new Image("Images/Pokemon/149.0.gif"), new Image("Images/Pokemon/149.1.gif"),149),

            new Pokemon("Mewtwo", "Psychic", 106, 130, 1.65, waste, waste, waste, waste,
            new Image("Images/Pokemon/150.0.gif"), new Image("Images/Pokemon/150.1.gif"),150),

            new Pokemon("Mew", "Psychic", 100, 100, 1.38, waste, waste, waste, waste,
            new Image("Images/Pokemon/151.0.gif"), new Image("Images/Pokemon/151.1.gif"), 151)
    };



}
