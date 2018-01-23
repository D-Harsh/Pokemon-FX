package Pokemon;

import Moves.AttackMove;
import Moves.ConditionMove;
import Moves.HealMove;
import Moves.Move;
import Moves.StatusMove; // The above imports including this one import all the
import javafx.scene.image.Image; // Imports javafx.scene.image.Image to allow for images to be used to represent Pokemon

public class Pokemans {
    static Move Dream_Eater = new AttackMove("Psychic", "Dream Eater", 8, 90, 18);;
    static Move Brave_Bird = new AttackMove("Flying", "Brave Bird", 16, 100, 19);
    static Move Signal_Beam = new AttackMove("Bug", "Signal Beam", 16, 100, 15);
    static Move Sludge_Wave = new AttackMove("Poison", "Sludge Wave", 16, 100, 16);
    static Move Night_Shade = new AttackMove("Ghost", "Night Shade", 16, 100, 19);
    static Move Struggle = new AttackMove("Normal", "Struggle", 100, 100, 1);
    static Move Flamethrower = new AttackMove("Fire", "Flamethrower", 25, 100, 17);
    static Move Earthquake = new AttackMove("Ground", "Earthquake", 25, 100, 17);
    static Move Bug_Buzz = new AttackMove("Bug", "Bug Buzz", 25, 90, 15);
    static Move Outrage = new AttackMove("Dragon", "Outrage", 10, 100, 20);
    static Move Ice_Beam = new AttackMove("Ice", "Ice Beam", 15, 100, 15);
    static Move Close_Combat = new AttackMove("Fighting", "Close Combat", 5, 95, 20);
    static Move Hurricane = new AttackMove("Flying", "Hurricane", 10, 70, 21);
    static Move Vine_Whip = new AttackMove("Grass", "Vine Whip", 8, 85, 17);
    static Move Shadow_Ball = new AttackMove("Ghost", "Shadow Ball", 20, 100, 17);
    static Move Thunderbolt = new AttackMove("Electric", "Thunderbolt", 20, 100, 19);
    static Move Hyperbeam = new AttackMove("Normal", "Hyperbeam", 5, 100, 20);
    static Move Gunk_Shot = new AttackMove("Poison","Gunk Shot", 15, 90, 20);
    static Move Psychic = new AttackMove("Psychic", "Psychic",20, 100, 18);
    static Move Stone_Edge = new AttackMove("Rock","Stone Edge", 10, 70, 20);
    static Move Hydropump = new AttackMove("Water", "Hydro Pump",10, 80, 22);
    static Move Recover = new HealMove("Fire","Recover", 16, 100, 25);
    static Move Synthesis = new HealMove("Fire","Synthesis", 8, 100, 15);
    static Move Roost = new HealMove("Flying", "Roost",16, 100, 20);
    static Move Thunder_Wave = new ConditionMove("Electric", "Thunder Wave",32, 90, 1);
    static Move WillOWisp = new ConditionMove("Fire","Willow Wisp", 32, 85, 2);
    static Move Swords_Dance = new StatusMove("Normal","Swords Dance", 25, 100, 2, 2, "s");
    static Move Dragon_Dance = new StatusMove("Dragon","Dragon Dance", 25, 100, 3, 1.5, "s");
    static Move Agility = new StatusMove("Psychic","Agility" ,25, 100, 1, 2, "s");
    static Move Razor_Leaf = new AttackMove("Grass","Razor Leaf" ,16, 90, 13);
    static Move Tackle = new AttackMove("Normal","Tackle" ,32, 100, 10);
    static Move Solar_Beam = new AttackMove("Grass", "Solar Beam", 8, 85, 21);
    static Move Acid_Spray = new AttackMove("Poison", "Acid Spray", 16, 100, 15);
    static Move Scratch = new AttackMove("Normal","Scratch" ,32, 100, 10);
    static Move Dragon_Rage = new AttackMove("Dragon","Dragon Rage" ,32, 100, 12);
    static Move Ember = new AttackMove("Fire", "Ember", 32, 100, 13);
    static Move Inferno = new AttackMove("Fire", "Inferno", 10, 50, 24);
    static Move Slash = new AttackMove("Normal", "Slash", 16, 100, 14);
    static Move Bubble = new AttackMove("Water", "Bubble", 16, 100, 12);
    static Move Water_Gun = new AttackMove("Water", "Water Gun", 16, 100, 13);
    static Move Water_Pulse = new AttackMove("Water", "Water Pulse", 16, 100, 13);
    static Move Aqua_Tail = new AttackMove("Water", "Aqua Tail", 16, 90, 14);
    static Move Skull_Bash = new AttackMove("Normal", "Skull Bash", 10, 100, 18);
    static Move Bug_Bite = new AttackMove("Bug", "Bug Bite", 20, 100, 13);
    static Move Psybeam = new AttackMove("Psychic", "Psybeam", 20, 100, 13);
    static Move Air_Slash = new AttackMove("Flying", "Air Slash", 16, 95, 14);
    static Move Poison_Jab = new AttackMove("Poison", "Poison Jab", 16, 100, 17);
    static Move Double_Edge = new AttackMove("Normal", "Double Edge", 8, 100, 20);
    static Move Hyper_Fang = new AttackMove("Normal", "Hyper Fang", 15, 95, 13);
    static Move Mud_Bomb = new AttackMove("Ground", "Mud Bomb", 16, 85, 12);
    static Move Swift = new AttackMove("Normal", "Swift", 20, 100, 12);
    static Move Thunder = new AttackMove("Electric", "Thunder", 8, 70, 20);
    static Move Poison_Fang = new AttackMove("Poison", "Poison Fang", 15, 95, 11);
    static Move Double_Kick = new AttackMove("Fighting", "Double Kick", 24, 100, 13);
    static Move Megahorn = new AttackMove("Bug", "Megahorm", 10, 85, 20);
    static Move Body_Slam = new AttackMove("Normal", "Body Slam", 15, 100, 18);
    static Move Hex = new AttackMove("Ghost", "Hex", 16, 100, 90);
    static Move Pound = new AttackMove("Normal", "Pound", 35, 100, 10);
    static Move Wing_Attack = new AttackMove("Flying", "Wing Attack", 35, 100, 12);
    static Move Leech_Life = new AttackMove("Bug", "Leech Life", 16, 100, 13);
    static Move Venoshock = new AttackMove("Poison", "Venoshock", 16, 100, 14);
    static Move Petal_Dance = new AttackMove("Grass", "Petal Dance", 12, 90, 18);
    static Move Dynamic_Punch = new AttackMove("Fighting", "Dynamic Punch", 8, 50, 20);
    static Move Leaf_Blade = new AttackMove("Grass", "Leaf Blade", 16, 100, 17);
    static Move Rock_Throw = new AttackMove("Rock", "Rock Throw", 16, 90, 11);
    static Move Take_Down = new AttackMove("Normal", "Take Down", 16, 90, 12);
    static Move Discharge = new AttackMove("Electric", "Discharge", 16, 100, 14);
    static Move Zap_Canon = new AttackMove("Electric", "Zap Canon", 5, 50, 20);
    static Move Aurora_Beam = new AttackMove("Ice", "Aurora Beam", 16, 100, 15);
    static Move Lick = new AttackMove("Ghost", "Lick", 30, 100, 9);
    static Move Zen_Headbutt = new AttackMove("Psychic", "Zen Headbutt", 20, 95, 17);
    static Move Crabhammer = new AttackMove("Water", "Crabhammer", 10, 90, 19);
    static Move Spark = new AttackMove("Electric", "Spark", 32, 100, 12);
    static Move Rollout = new AttackMove("Rock", "Rollout", 10, 90, 9);;
    static Move Leaf_Storm = new AttackMove("Grass", "Leaf Storm", 24, 95, 18);
    static Move Wood_Hammer = new AttackMove("Grass", "Wood Hammer", 8, 80, 19);
    static Move Thrash = new AttackMove("Normal", "Thrash", 8, 100, 17);
    static Move Bonemerang = new AttackMove("Ground", "Bonemerang", 10, 90, 12);
    static Move Bone_Club = new AttackMove("Ground", "Bone Club", 10, 100, 11);
    static Move Fire_Punch = new AttackMove("Fire", "Fire Punch", 10, 100, 14);
    static Move Ice_Punch = new AttackMove("Ice", "Ice Punch", 10, 100, 14);
    static Move Belch = new AttackMove("Poison", "Belch", 10, 90, 20);
    static Move Sludge_Bomb = new AttackMove("Poison", "Sludge Bomb", 10, 95, 17);
    static Move Horn_Attack = new AttackMove("Normal", "Horn Attack", 25, 100, 13);
    static Move Blizzard = new AttackMove("Ice", "Blizzard", 8, 70, 20);
    static Move Splash = new AttackMove("Water", "Splash", 32, 100, 0);
    static Move Last_Resort = new AttackMove("Normal", "Last Resort", 8, 100, 18);
    static Move Tri_Attack = new AttackMove("Normal", "Tri Attack", 16, 100, 17);
    static Move Ancient_Power = new AttackMove("Rock", "Ancient Power", 16, 100, 13);
    static Move High_Horsepower = new AttackMove("Ground", "High Horsepower", 10, 90, 19);
    static Move Burn_Up = new AttackMove("Fire", "Burn Up", 5, 100, 20);
    static Move Quiver_Dance = new StatusMove("Bug","Quiver Dance", 25, 100, 3, 1.5, "s");
    static Move Glare = new ConditionMove("Normal", "Glare",32, 100, 1);
    static Move Growl = new StatusMove("Normal","Growl" ,25, 100, 2, 0.5, "o");;
    static Move Leer = new StatusMove("Normal","Leer" ,25, 100, 2, 0.5, "o");;
    static Move Defense_Curl = new StatusMove("Normal","Defense Curl" ,25, 100, 2, 0.5, "o");;
    static Move Calm_Mind = new StatusMove("Psychic","Agility" ,25, 100, 2, 1.5, "s");;
    static Move Rock_Polish = new StatusMove("Rock","Rock Polish" ,25, 100, 1, 2, "s");;
    static Move Nasty_Plot = new StatusMove("Dark","Nasty Plot" ,25, 100, 2, 2, "s");
    static Move Transform = new AttackMove("Normal", "Transform", 32, 100, 0);

    // The lines above create a bunch of different moves with different properties

    public static Pokemon[] pokedex = { // List named pokedex which stores all the pokemon
            new Pokemon("Bulbasaur", "Grass", 45, 45, 0.7, Tackle, Acid_Spray, Synthesis, Razor_Leaf,
                    new Image("Images/Pokemon/1.0.gif"), new Image("Images/Pokemon/1.1.gif"), 1),

            new Pokemon("Ivysaur", "Grass", 60, 60, 0.85, Vine_Whip, Gunk_Shot, Synthesis, Razor_Leaf,
                    new Image("Images/Pokemon/2.0.gif"), new Image("Images/Pokemon/2.1.gif"), 2),

            new Pokemon("Venusaur", "Grass", 80, 80, 1.25, Vine_Whip, Gunk_Shot, Synthesis, Solar_Beam,
                    new Image("Images/Pokemon/3.0.gif"), new Image("Images/Pokemon/3.1.gif"), 3),

            new Pokemon("Charmander", "Fire", 39, 65, 0.7, Scratch, Dragon_Rage, Ember, Flamethrower,
                    new Image("Images/Pokemon/4.0.gif"), new Image("Images/Pokemon/4.1.gif"), 4),

            new Pokemon("Charmeleon", "Fire", 58, 80, 0.85, Dragon_Rage, Flamethrower, WillOWisp, Scratch,
                    new Image("Images/Pokemon/5.0.gif"), new Image("Images/Pokemon/5.1.gif"), 5),

            new Pokemon("Charizard", "Fire", 78, 100, 1.25, Slash, Inferno, Flamethrower, WillOWisp,
                    new Image("Images/Pokemon/6.0.gif"), new Image("Images/Pokemon/6.1.gif"), 6),

            new Pokemon("Squirtle", "Water", 44, 43, 0.7, Tackle, Bubble, Water_Gun, Water_Pulse,
                    new Image("Images/Pokemon/7.0.gif"), new Image("Images/Pokemon/7.1.gif"), 7),

            new Pokemon("Wartortle", "Water", 59, 58, 0.85, Water_Pulse, Hydropump, Skull_Bash, Aqua_Tail,
                    new Image("Images/Pokemon/8.0.gif"), new Image("Images/Pokemon/8.1.gif"), 8),

            new Pokemon("Blastoise", "Water", 79, 78, 1.25, Water_Pulse, Hydropump, Skull_Bash, Aqua_Tail,
                    new Image("Images/Pokemon/9.0.gif"), new Image("Images/Pokemon/9.1.gif"), 9),

            new Pokemon("Caterpie", "Bug", 45, 45, 0.5, Tackle, Bug_Bite, Struggle, Struggle,
                    new Image("Images/Pokemon/10.0.gif"), new Image("Images/Pokemon/10.1.gif"), 10),

            new Pokemon("Metapod", "Bug", 70, 30, 0.7, Tackle, Bug_Bite, Struggle, Struggle,
                    new Image("Images/Pokemon/11.0.gif"), new Image("Images/Pokemon/11.1.gif"), 11),

            new Pokemon("Butterfree", "Bug", 60, 70, 1, Bug_Buzz, Quiver_Dance, Psybeam, Air_Slash,
                    new Image("Images/Pokemon/12.0.gif"), new Image("Images/Pokemon/12.1.gif"), 12),

            new Pokemon("Weedle", "Bug", 40, 50, 0.5,Tackle, Bug_Bite, Struggle, Struggle,
                    new Image("Images/Pokemon/13.0.gif"), new Image("Images/Pokemon/13.1.gif"), 13),

            new Pokemon("Kakuna", "Bug", 45, 35, 0.6, Tackle, Bug_Bite, Struggle, Struggle,
                    new Image("Images/Pokemon/14.0.gif"), new Image("Images/Pokemon/14.1.gif"), 14),

            new Pokemon("Beedrill", "Bug", 65, 75, 1, Bug_Buzz, Poison_Jab, Agility, Bug_Bite,
                    new Image("Images/Pokemon/15.0.gif"), new Image("Images/Pokemon/15.1.gif"), 15),

            new Pokemon("Pidgey", "Flying", 40, 56, 0.6, Tackle, Roost, Agility, Air_Slash,
                    new Image("Images/Pokemon/16.0.gif"), new Image("Images/Pokemon/16.1.gif"), 16),

            new Pokemon("Pidgeotto", "Flying", 63, 71, 0.8, Dragon_Rage, Roost, Agility, Air_Slash,
                    new Image("Images/Pokemon/17.0.gif"), new Image("Images/Pokemon/17.1.gif"), 17),

            new Pokemon("Pidgeot", "Flying", 83, 101, 1.15, Hurricane, Roost, Agility, Air_Slash,
                    new Image("Images/Pokemon/18.0.gif"), new Image("Images/Pokemon/18.1.gif"), 18),

            new Pokemon("Rattata", "Normal", 30, 72, 0.45, Tackle, Struggle, Struggle, Struggle,
                    new Image("Images/Pokemon/19.0.gif"), new Image("Images/Pokemon/19.1.gif"), 19),

            new Pokemon("Raticate", "Normal", 55, 97, 0.88, Double_Edge, Hyper_Fang, Struggle, Struggle,
                    new Image("Images/Pokemon/20.0.gif"), new Image("Images/Pokemon/20.1.gif"), 20),

            new Pokemon("Spearow", "Flying", 40, 70, 0.67, Tackle, Roost, Struggle, Struggle,
                    new Image("Images/Pokemon/21.0.gif"), new Image("Images/Pokemon/21.1.gif"), 21),

            new Pokemon("Fearow", "Flying", 65, 100, 0.95, Hurricane, Roost, Agility, Air_Slash,
                    new Image("Images/Pokemon/22.0.gif"), new Image("Images/Pokemon/22.1.gif"), 22),

            new Pokemon("Ekans", "Poison", 35, 55, 0.6, Acid_Spray, Glare, Scratch, Struggle,
                    new Image("Images/Pokemon/23.0.gif"), new Image("Images/Pokemon/23.1.gif"), 23),

            new Pokemon("Arbok", "Poison", 60, 80, 0.95, Acid_Spray, Glare, Mud_Bomb, Gunk_Shot,
                    new Image("Images/Pokemon/24.0.gif"), new Image("Images/Pokemon/24.1.gif"), 24),

            new Pokemon("Pikachu", "Electric", 35, 90, 1, Thunderbolt, Agility, Struggle, Struggle,
                    new Image("Images/Pokemon/25.0.gif"), new Image("Images/Pokemon/25.1.gif"), 25),

            new Pokemon("Raichu", "Electric", 60, 110, 1.2, Thunderbolt, Thunder, Agility, Thunder_Wave,
                    new Image("Images/Pokemon/26.0.gif"), new Image("Images/Pokemon/26.1.gif"), 26),

            new Pokemon("Sandshrew", "Ground", 50, 40, 0.7, Scratch, Mud_Bomb, Growl, Struggle,
                    new Image("Images/Pokemon/27.0.gif"), new Image("Images/Pokemon/27.1.gif"), 27),

            new Pokemon("Sandslash", "Ground", 75, 65, 1, Earthquake, Swift, Swords_Dance, Bug_Bite,
                    new Image("Images/Pokemon/28.0.gif"), new Image("Images/Pokemon/28.1.gif"), 28),

            new Pokemon("NidoranF", "Poison", 55, 41, 0.6, Growl, Scratch, Poison_Fang, Double_Kick,
                    new Image("Images/Pokemon/29.0.gif"), new Image("Images/Pokemon/29.1.gif"), 29),

            new Pokemon("Nidorina", "Poison", 70, 56, 0.8, Growl, Gunk_Shot, Poison_Fang, Double_Kick,
                    new Image("Images/Pokemon/30.0.gif"), new Image("Images/Pokemon/30.1.gif"), 30),

            new Pokemon("Nidoqueen", "Poison", 90, 76, 1, Earthquake, Close_Combat, Poison_Fang, Gunk_Shot,
                    new Image("Images/Pokemon/31.0.gif"), new Image("Images/Pokemon/31.1.gif"), 31),

            new Pokemon("NidoranM", "Poison", 46, 50, 0.6, Leer, Scratch, Poison_Fang, Double_Kick,
                    new Image("Images/Pokemon/32.0.gif"), new Image("Images/Pokemon/32.1.gif"), 32),

            new Pokemon("Nidorino", "Poison", 61, 65, 0.8, Growl, Poison_Jab, Poison_Fang, Double_Kick,
                    new Image("Images/Pokemon/33.0.gif"), new Image("Images/Pokemon/33.1.gif"), 33),

            new Pokemon("Nidoking", "Poison", 81, 85, 1.2, Earthquake, Poison_Jab, Megahorn, Double_Edge,
                    new Image("Images/Pokemon/34.0.gif"), new Image("Images/Pokemon/34.1.gif"), 34),

            new Pokemon("Clefairy", "Normal", 70, 35, 0.6, Growl, Scratch, Body_Slam, Struggle,
                    new Image("Images/Pokemon/35.0.gif"), new Image("Images/Pokemon/35.1.gif"), 35),

            new Pokemon("Clefable", "Normal", 100, 60, 0.8, Growl, Scratch, Body_Slam, Hyperbeam,
                    new Image("Images/Pokemon/36.0.gif"), new Image("Images/Pokemon/36.1.gif"), 36),

            new Pokemon("Vulpix", "Fire", 38, 65, 0.75, Ember, WillOWisp, Hex, Struggle,
                    new Image("Images/Pokemon/37.0.gif"), new Image("Images/Pokemon/37.1.gif"), 37),

            new Pokemon("Ninetales", "Fire", 73, 100, 1.1, WillOWisp, Inferno, Hex, Flamethrower,
                    new Image("Images/Pokemon/38.0.gif"), new Image("Images/Pokemon/38.1.gif"), 38),

            new Pokemon("Jigglypuff", "Normal", 115, 20, 0.5, Body_Slam, Tackle, Struggle, Struggle,
                    new Image("Images/Pokemon/39.0.gif"), new Image("Images/Pokemon/39.1.gif"), 39),

            new Pokemon("Wigglytuff", "Normal", 140, 45, 0.7, Body_Slam, Double_Edge, Defense_Curl, Pound,
                    new Image("Images/Pokemon/40.0.gif"), new Image("Images/Pokemon/40.1.gif"), 40),

            new Pokemon("Zubat", "Poison", 40, 55, 0.8, Wing_Attack, Swift, Struggle, Struggle,
                    new Image("Images/Pokemon/41.0.gif"), new Image("Images/Pokemon/41.1.gif"), 41),

            new Pokemon("Golbat", "Poison", 75, 90, 1.1, Venoshock, Leech_Life, Wing_Attack, Air_Slash,
                    new Image("Images/Pokemon/42.0.gif"), new Image("Images/Pokemon/42.1.gif"), 42),

            new Pokemon("Oddish", "Grass", 45, 30, 0.67, Acid_Spray, Tackle, Razor_Leaf, Struggle,
                    new Image("Images/Pokemon/43.0.gif"), new Image("Images/Pokemon/43.1.gif"), 43),

            new Pokemon("Gloom", "Poison", 60, 40, 0.9, Acid_Spray, Tackle, Razor_Leaf, Synthesis,
                    new Image("Images/Pokemon/44.0.gif"), new Image("Images/Pokemon/44.1.gif"), 44),

            new Pokemon("Vileplume", "Poison", 75, 50, 1.1, Vine_Whip, Gunk_Shot, Synthesis, Petal_Dance,
                    new Image("Images/Pokemon/45.0.gif"), new Image("Images/Pokemon/45.1.gif"), 45),

            new Pokemon("Paras", "Bug", 35, 35, 0.7, Scratch, Razor_Leaf, Bug_Bite, Struggle,
                    new Image("Images/Pokemon/46.0.gif"), new Image("Images/Pokemon/46.1.gif"), 46),

            new Pokemon("Parasect", "Bug", 60, 30, 0.92, Bug_Buzz, Razor_Leaf, Gunk_Shot, Slash,
                    new Image("Images/Pokemon/47.0.gif"), new Image("Images/Pokemon/47.1.gif"), 47),

            new Pokemon("Venonat", "Poison", 60, 45, 0.7, Tackle, Psybeam, Bug_Bite, Acid_Spray,
                    new Image("Images/Pokemon/48.0.gif"), new Image("Images/Pokemon/48.1.gif"), 48),

            new Pokemon("Venomoth", "Poison", 70, 90, 0.9, Psychic, Gunk_Shot, Bug_Bite, WillOWisp,
                    new Image("Images/Pokemon/49.0.gif"), new Image("Images/Pokemon/49.1.gif"), 49),

            new Pokemon("Diglett", "Ground", 10, 95, 0.9, Growl, Scratch, Mud_Bomb, Struggle,
                    new Image("Images/Pokemon/50.0.gif"), new Image("Images/Pokemon/50.1.gif"), 50),

            new Pokemon("Dugtrio", "Ground", 35, 120, 1.35, Earthquake, Swords_Dance, Slash, Growl,
                    new Image("Images/Pokemon/51.0.gif"), new Image("Images/Pokemon/51.1.gif"), 51),

            new Pokemon("Meowth", "Normal", 40, 90, 0.85, Scratch, Growl, Struggle, Struggle,
                    new Image("Images/Pokemon/52.0.gif"), new Image("Images/Pokemon/52.1.gif"), 52),

            new Pokemon("Persian", "Normal", 65, 115, 1, Stone_Edge, Double_Edge, Slash, Swords_Dance,
                    new Image("Images/Pokemon/53.0.gif"), new Image("Images/Pokemon/53.1.gif"), 53),

            new Pokemon("Psyduck", "Water", 50, 55, 0.75, Bubble, Psybeam, Scratch, Aqua_Tail,
                    new Image("Images/Pokemon/54.0.gif"), new Image("Images/Pokemon/54.1.gif"), 54),

            new Pokemon("Golduck", "Water", 80, 85, 0.95, Hydropump, Psychic, Water_Pulse, Aqua_Tail,
                    new Image("Images/Pokemon/55.0.gif"), new Image("Images/Pokemon/55.1.gif"), 55),

            new Pokemon("Mankey", "Fighting", 40, 70, 0.9, Double_Kick, Scratch, Struggle, Struggle,
                    new Image("Images/Pokemon/56.0.gif"), new Image("Images/Pokemon/56.1.gif"), 56),

            new Pokemon("Primeape", "Fighting", 65, 95, 1.15, Outrage, Close_Combat, Double_Edge, Swords_Dance,
                    new Image("Images/Pokemon/57.0.gif"), new Image("Images/Pokemon/57.1.gif"), 57),

            new Pokemon("Growlithe", "Fire", 55, 60, 0.76, Ember, Agility, Struggle, Struggle,
                    new Image("Images/Pokemon/58.0.gif"), new Image("Images/Pokemon/58.1.gif"), 58),

            new Pokemon("Arcanine", "Fire", 90, 95, 1.2, Agility, Flamethrower, Close_Combat, Inferno,
                    new Image("Images/Pokemon/59.0.gif"), new Image("Images/Pokemon/59.1.gif"), 59),

            new Pokemon("Poliwag", "Water", 40, 90, 0.65, Bubble, Water_Gun, Struggle, Struggle,
                    new Image("Images/Pokemon/60.0.gif"), new Image("Images/Pokemon/60.1.gif"), 60),

            new Pokemon("Poliwhirl", "Water", 65, 90, 0.9, Bubble, Water_Gun, Mud_Bomb, Slash,
                    new Image("Images/Pokemon/61.0.gif"), new Image("Images/Pokemon/61.1.gif"), 61),

            new Pokemon("Poliwrath", "Water", 90, 70, 1.2, Hydropump, Swords_Dance, Mud_Bomb, Slash,
                    new Image("Images/Pokemon/62.0.gif"), new Image("Images/Pokemon/62.1.gif"), 62),

            new Pokemon("Abra", "Psychic", 25, 90, 0.8, Struggle, Struggle, Struggle, Struggle,
                    new Image("Images/Pokemon/63.0.gif"), new Image("Images/Pokemon/63.1.gif"), 63),

            new Pokemon("Kadabra", "Psychic", 40, 105, 1.1, Psybeam, Recover, Psychic, Calm_Mind,
                    new Image("Images/Pokemon/64.0.gif"), new Image("Images/Pokemon/64.1.gif"), 64),

            new Pokemon("Alakazam", "Psychic", 55, 120, 1.46, Recover, Shadow_Ball, Psychic, Calm_Mind,
                    new Image("Images/Pokemon/65.0.gif"), new Image("Images/Pokemon/65.1.gif"), 65),

            new Pokemon("Machop", "Fighting", 70, 35, 0.75, Leer, Double_Kick, Struggle, Struggle,
                    new Image("Images/Pokemon/66.0.gif"), new Image("Images/Pokemon/66.1.gif"), 66),

            new Pokemon("Machoke", "Fighting", 80, 45, 0.9, Dynamic_Punch, Swords_Dance, Leer, Double_Kick,
                    new Image("Images/Pokemon/67.0.gif"), new Image("Images/Pokemon/67.1.gif"), 67),

            new Pokemon("Machamp", "Fighting", 90, 55, 1.1, Dynamic_Punch, Swords_Dance, Close_Combat, Double_Kick,
                    new Image("Images/Pokemon/68.0.gif"), new Image("Images/Pokemon/68.1.gif"), 68),

            new Pokemon("Bellsprout", "Grass", 50, 40, 0.65, Vine_Whip, Scratch, Acid_Spray, Struggle,
                    new Image("Images/Pokemon/69.0.gif"), new Image("Images/Pokemon/69.1.gif"), 69),

            new Pokemon("Weepinbell", "Grass", 65, 55, 0.75, Vine_Whip, Scratch, Acid_Spray, Razor_Leaf,
                    new Image("Images/Pokemon/70.0.gif"), new Image("Images/Pokemon/60.1.gif"), 70),

            new Pokemon("Victreebel", "Grass", 80, 70, 0.9, Vine_Whip, Poison_Jab, Petal_Dance, Leaf_Blade,
                    new Image("Images/Pokemon/71.0.gif"), new Image("Images/Pokemon/71.1.gif"), 71),

            new Pokemon("Tentacool", "Water", 40, 70, 0.7, Acid_Spray, Water_Pulse, Struggle, Struggle,
                    new Image("Images/Pokemon/72.0.gif"), new Image("Images/Pokemon/72.1.gif"), 72),

            new Pokemon("Tentacruel", "Water", 80, 100, 1.05, WillOWisp, Water_Pulse, Hydropump, Gunk_Shot,
                    new Image("Images/Pokemon/73.0.gif"), new Image("Images/Pokemon/73.1.gif"), 73),

            new Pokemon("Geodude", "Rock", 40, 20, 0.8, Tackle, Rock_Throw, Rock_Polish, Struggle,
                    new Image("Images/Pokemon/74.0.gif"), new Image("Images/Pokemon/74.1.gif"), 74),

            new Pokemon("Graveler", "Rock", 55, 35, 1, Stone_Edge, Double_Edge, Earthquake, Rock_Polish,
                    new Image("Images/Pokemon/75.0.gif"), new Image("Images/Pokemon/75.1.gif"), 75),

            new Pokemon("Golem", "Rock", 80, 45, 1.3, Stone_Edge, Double_Edge, Earthquake, Rock_Polish,
                    new Image("Images/Pokemon/76.0.gif"), new Image("Images/Pokemon/76.1.gif"), 76),

            new Pokemon("Ponyta", "Fire", 50, 90, 0.7, Growl, Tackle, Ember, Agility,
                    new Image("Images/Pokemon/77.0.gif"), new Image("Images/Pokemon/77.1.gif"), 77),

            new Pokemon("Rapidash", "Fire", 65, 105, 1.1, Inferno, Take_Down, Ember, Agility,
                    new Image("Images/Pokemon/78.0.gif"), new Image("Images/Pokemon/78.1.gif"), 78),

            new Pokemon("Slowpoke", "Psychic", 90, 15, 0.8, Growl, Tackle, Water_Gun, Psybeam,
                    new Image("Images/Pokemon/79.0.gif"), new Image("Images/Pokemon/79.1.gif"), 79),

            new Pokemon("Slowbro", "Psychic", 95, 30, 1, Hydropump, Psychic, Recover, Psybeam,
                    new Image("Images/Pokemon/80.0.gif"), new Image("Images/Pokemon/80.1.gif"), 80),

            new Pokemon("Magnemite", "Electric", 25, 45, 0.95, Thunder_Wave, Tackle, Discharge, Struggle,
                    new Image("Images/Pokemon/81.0.gif"), new Image("Images/Pokemon/81.1.gif"), 81),

            new Pokemon("Magneton", "Electric", 50, 70, 1.15, Thunder_Wave, Discharge, Thunderbolt, Zap_Canon,
                    new Image("Images/Pokemon/82.0.gif"), new Image("Images/Pokemon/82.1.gif"), 82),

            new Pokemon("Farfetch'd", "Flying", 52, 60, 1, Swords_Dance, Agility, Brave_Bird, Poison_Jab,
                    new Image("Images/Pokemon/83.0.gif"), new Image("Images/Pokemon/83.1.gif"), 83),

            new Pokemon("Doduo", "Flying", 35, 75, 0.8, Growl, Scratch, Struggle, Struggle,
                    new Image("Images/Pokemon/84.0.gif"), new Image("Images/Pokemon/84.1.gif"), 84),

            new Pokemon("Dodrio", "Flying", 60, 110, 1.2, Swords_Dance, Close_Combat, Hurricane, Double_Edge,
                    new Image("Images/Pokemon/85.0.gif"), new Image("Images/Pokemon/85.1.gif"), 85),

            new Pokemon("Seel", "Water", 65, 45, 0.75, Aurora_Beam, Aqua_Tail, Struggle, Struggle,
                    new Image("Images/Pokemon/86.0.gif"), new Image("Images/Pokemon/86.1.gif"), 86),

            new Pokemon("Dewgong", "Ice", 90, 70, 0.95, Ice_Beam, Aqua_Tail, Signal_Beam, Take_Down,
                    new Image("Images/Pokemon/87.0.gif"), new Image("Images/Pokemon/87.1.gif"), 87),

            new Pokemon("Grimer", "Poison", 80, 25, 0.8, Tackle, Mud_Bomb, Struggle, Struggle,
                    new Image("Images/Pokemon/88.0.gif"), new Image("Images/Pokemon/88.1.gif"), 88),

            new Pokemon("Muk", "Poison", 105, 50, 0.95, Gunk_Shot, Mud_Bomb, Sludge_Wave, Poison_Jab,
                    new Image("Images/Pokemon/89.0.gif"), new Image("Images/Pokemon/89.1.gif"), 89),

            new Pokemon("Shellder", "Ice", 30, 40, 1, Tackle, Aurora_Beam, Water_Pulse, Leer,
                    new Image("Images/Pokemon/90.0.gif"), new Image("Images/Pokemon/90.1.gif"), 90),

            new Pokemon("Cloyster", "Ice", 50, 70, 1.33, Ice_Beam, Hydropump, Aurora_Beam, Water_Pulse,
                    new Image("Images/Pokemon/91.0.gif"), new Image("Images/Pokemon/91.1.gif"), 91),

            new Pokemon("Gastly", "Ghost", 30, 80, 0.8, Lick, Night_Shade, Struggle, Struggle,
                    new Image("Images/Pokemon/92.0.gif"), new Image("Images/Pokemon/92.1.gif"), 92),

            new Pokemon("Haunter", "Ghost", 45, 95, 1, Shadow_Ball, Hex, Dream_Eater, Night_Shade,
                    new Image("Images/Pokemon/93.0.gif"), new Image("Images/Pokemon/93.1.gif"), 93),

            new Pokemon("Gengar", "Ghost", 60, 110, 1.35, Shadow_Ball, Hex, Dream_Eater, Night_Shade,
                    new Image("Images/Pokemon/94.0.gif"), new Image("Images/Pokemon/94.1.gif"), 94),

            new Pokemon("Onix", "Rock", 35, 70, 1.05, Tackle, Earthquake, Stone_Edge, Double_Edge,
                    new Image("Images/Pokemon/95.0.gif"), new Image("Images/Pokemon/95.1.gif"), 95),

            new Pokemon("Drowzee", "Psychic", 60, 42, 0.8, Psybeam, Zen_Headbutt, Tackle, Nasty_Plot,
                    new Image("Images/Pokemon/96.0.gif"), new Image("Images/Pokemon/96.1.gif"), 96),

            new Pokemon("Hypno", "Psychic", 85, 67, 1.2, Zen_Headbutt, Psychic, Nasty_Plot, Psybeam,
                    new Image("Images/Pokemon/97.0.gif"), new Image("Images/Pokemon/97.1.gif"), 97),

            new Pokemon("Krabby", "Water", 30, 50, 0.8, Bubble, Leer, Take_Down, Mud_Bomb,
                    new Image("Images/Pokemon/98.0.gif"), new Image("Images/Pokemon/98.1.gif"), 98),

            new Pokemon("Kingler", "Water", 55, 75, 1.15, Crabhammer, Take_Down, Mud_Bomb, Bubble,
                    new Image("Images/Pokemon/99.0.gif"), new Image("Images/Pokemon/99.1.gif"), 99),

            new Pokemon("Voltorb", "Electric", 40, 100, 0.8, Tackle, Spark, Discharge, Rollout,
                    new Image("Images/Pokemon/100.0.gif"), new Image("Images/Pokemon/100.1.gif"), 100),

            new Pokemon("Electrode", "Electric", 60, 150, 1.1, Thunderbolt, Spark, Discharge, Rollout,
                    new Image("Images/Pokemon/101.0.gif"), new Image("Images/Pokemon/101.1.gif"), 101),

            new Pokemon("Exeggcute", "Psychic", 60, 40, 0.9, Struggle, Struggle, Struggle, Struggle,
                    new Image("Images/Pokemon/102.0.gif"), new Image("Images/Pokemon/102.1.gif"), 102),

            new Pokemon("Exeggutor", "Psychic", 95, 55, 1.2, Psychic, Psybeam, Leaf_Storm, Wood_Hammer,
                    new Image("Images/Pokemon/103.0.gif"), new Image("Images/Pokemon/103.1.gif"), 103),

            new Pokemon("Cubone", "Ground", 50, 35, 1, Growl, Take_Down, Bonemerang, Bone_Club,
                    new Image("Images/Pokemon/104.0.gif"), new Image("Images/Pokemon/104.1.gif"), 104),

            new Pokemon("Marowak", "Ground", 60, 45, 1.4, Thrash, Double_Edge, Bonemerang, Earthquake,
                    new Image("Images/Pokemon/105.0.gif"), new Image("Images/Pokemon/105.1.gif"), 105),

            new Pokemon("Hitmonlee", "Fighting", 50, 87, 1, Close_Combat, Swords_Dance, Fire_Punch, Ice_Punch,
                    new Image("Images/Pokemon/106.0.gif"), new Image("Images/Pokemon/106.1.gif"), 106),

            new Pokemon("Hitmonchan", "Fighting", 50, 76, 1.28, Close_Combat, Swords_Dance, Fire_Punch, Ice_Punch,
                    new Image("Images/Pokemon/107.0.gif"), new Image("Images/Pokemon/107.1.gif"), 107),

            new Pokemon("Lickitung", "Normal", 90, 50, 1.2, Lick, Struggle, Struggle, Struggle,
                    new Image("Images/Pokemon/108.0.gif"), new Image("Images/Pokemon/108.1.gif"), 108),

            new Pokemon("Koffing", "Poison", 40, 35, 1, Tackle, Acid_Spray, Struggle, Struggle,
                    new Image("Images/Pokemon/109.0.gif"), new Image("Images/Pokemon/109.1.gif"), 109),

            new Pokemon("Weezing", "Poison", 65, 60, 1.25, Belch, Sludge_Bomb, WillOWisp, Psybeam,
                    new Image("Images/Pokemon/110.0.gif"), new Image("Images/Pokemon/110.1.gif"), 110),

            new Pokemon("Rhyhorn", "Ground", 80, 25, 0.9, Earthquake, Stone_Edge, Take_Down, Megahorn,
                    new Image("Images/Pokemon/111.0.gif"), new Image("Images/Pokemon/111.1.gif"), 111),

            new Pokemon("Rhydon", "Ground", 105, 40, 1.1, Earthquake, Stone_Edge, Take_Down, Megahorn,
                    new Image("Images/Pokemon/112.0.gif"), new Image("Images/Pokemon/112.1.gif"), 112),

            new Pokemon("Chansey", "Normal", 150, 50, 0.55, Double_Edge, Recover, Take_Down, Thunder_Wave,
                    new Image("Images/Pokemon/113.0.gif"), new Image("Images/Pokemon/113.1.gif"), 113),

            new Pokemon("Tangela", "Grass", 65, 60, 0.9, Vine_Whip, Slash, Solar_Beam, Razor_Leaf,
                    new Image("Images/Pokemon/114.0.gif"), new Image("Images/Pokemon/114.1.gif"), 114),

            new Pokemon("Kangaskhan", "Normal", 105, 90, 1.25, Outrage, Hyperbeam, Swords_Dance, Leer,
                    new Image("Images/Pokemon/115.0.gif"), new Image("Images/Pokemon/115.1.gif"), 115),

            new Pokemon("Horsea", "Water", 30, 60, 0.75, Bubble, Leer, Dragon_Rage, Water_Pulse,
                    new Image("Images/Pokemon/116.0.gif"), new Image("Images/Pokemon/116.1.gif"), 116),

            new Pokemon("Seadra", "Water", 55, 85, 1.1, Hydropump, Dragon_Dance, Outrage, Bubble,
                    new Image("Images/Pokemon/117.0.gif"), new Image("Images/Pokemon/117.1.gif"), 117),

            new Pokemon("Goldeen", "Water", 45, 63, 0.8, Tackle, Agility, Horn_Attack, Water_Pulse,
                    new Image("Images/Pokemon/118.0.gif"), new Image("Images/Pokemon/118.1.gif"), 118),

            new Pokemon("Seaking", "Water", 80, 68, 1.1, Megahorn, Poison_Jab, Water_Pulse, Agility,
                    new Image("Images/Pokemon/119.0.gif"), new Image("Images/Pokemon/119.1.gif"), 119),

            new Pokemon("Staryu", "Water", 30, 85, 0.9, Recover, Psychic, Bubble, Water_Pulse,
                    new Image("Images/Pokemon/120.0.gif"), new Image("Images/Pokemon/120.1.gif"), 120),

            new Pokemon("Starmie", "Water", 60, 115, 1.3, Psychic, Thunderbolt, Ice_Beam, Hydropump,
                    new Image("Images/Pokemon/121.0.gif"), new Image("Images/Pokemon/121.1.gif"), 121),

            new Pokemon("Mr.Mime", "Psychic", 40, 90, 1.1, Psychic, Calm_Mind, Struggle, Psybeam,
                    new Image("Images/Pokemon/122.0.gif"), new Image("Images/Pokemon/122.1.gif"), 122),

            new Pokemon("Scyther", "Flying", 70, 105, 1.25, Air_Slash, Bug_Buzz, Swords_Dance, Slash,
                    new Image("Images/Pokemon/123.0.gif"), new Image("Images/Pokemon/123.1.gif"), 123),

            new Pokemon("Jynx", "Ice", 65, 95, 0.95, Blizzard, Psychic, Calm_Mind, Lick,
                    new Image("Images/Pokemon/124.0.gif"), new Image("Images/Pokemon/124.1.gif"), 124),

            new Pokemon("Electabuzz", "Electric", 65, 105, 1.2, Thunderbolt, Close_Combat, Thunder_Wave, Discharge,
                    new Image("Images/Pokemon/125.0.gif"), new Image("Images/Pokemon/125.1.gif"), 125),

            new Pokemon("Magmar", "Fire", 65, 93, 1.2, Flamethrower, Inferno, Fire_Punch, Double_Kick,
                    new Image("Images/Pokemon/126.0.gif"), new Image("Images/Pokemon/126.1.gif"), 126),

            new Pokemon("Pinsir", "Bug", 65, 85, 1.25, Bug_Buzz, Air_Slash, Close_Combat, Swords_Dance,
                    new Image("Images/Pokemon/127.0.gif"), new Image("Images/Pokemon/127.1.gif"), 127),

            new Pokemon("Tauros", "Normal", 75, 110, 1.05, Double_Edge, Thrash, Hyperbeam, Take_Down,
                    new Image("Images/Pokemon/128.0.gif"), new Image("Images/Pokemon/128.1.gif"), 128),

            new Pokemon("Magikarp", "Water", 20, 80, 10, Splash, Struggle, Struggle, Struggle,
                    new Image("Images/Pokemon/129.0.gif"), new Image("Images/Pokemon/129.1.gif"), 129),

            new Pokemon("Gyarados", "Water", 95, 81, 1.32, Hurricane, Dragon_Dance, Hydropump, Dragon_Rage,
                    new Image("Images/Pokemon/130.0.gif"), new Image("Images/Pokemon/130.1.gif"), 130),

            new Pokemon("Lapras", "Ice", 130, 60, 1.26, Ice_Beam, Hydropump, Water_Pulse, Growl,
                    new Image("Images/Pokemon/131.0.gif"), new Image("Images/Pokemon/131.1.gif"), 131),

            new Pokemon("Ditto", "Normal", 48, 48, 1.5, Transform, Struggle, Struggle, Struggle,
                    new Image("Images/Pokemon/132.0.gif"), new Image("Images/Pokemon/132.1.gif"), 132),

            new Pokemon("Eevee", "Normal", 55, 55, 0.9, Growl, Tackle, Struggle, Struggle,
                    new Image("Images/Pokemon/133.0.gif"), new Image("Images/Pokemon/133.1.gif"), 133),

            new Pokemon("Vaporeon", "Water", 130, 65, 1.25, Hydropump, Last_Resort, Aurora_Beam, Tackle,
                    new Image("Images/Pokemon/134.0.gif"), new Image("Images/Pokemon/134.1.gif"), 134),

            new Pokemon("Jolteon", "Electric", 65, 130, 1.25, Thunderbolt, Shadow_Ball, Last_Resort, Thunder_Wave,
                    new Image("Images/Pokemon/135.0.gif"), new Image("Images/Pokemon/135.1.gif"), 135),

            new Pokemon("Flareon", "Fire", 65, 65, 1.44, Flamethrower, Last_Resort, Tackle, Ember,
                    new Image("Images/Pokemon/136.0.gif"), new Image("Images/Pokemon/136.1.gif"), 136),

            new Pokemon("Porygon", "Normal", 65, 40, 1.2, Tri_Attack, Psybeam, Recover, Discharge,
                    new Image("Images/Pokemon/137.0.gif"), new Image("Images/Pokemon/137.1.gif"), 137),

            new Pokemon("Omanyte", "Rock", 35, 35, 1, Water_Gun, Leer, Tackle, Rock_Throw,
                    new Image("Images/Pokemon/138.0.gif"), new Image("Images/Pokemon/138.1.gif"), 138),

            new Pokemon("Omastar", "Rock", 70, 55, 1.2, Hydropump, Ancient_Power, Water_Gun, WillOWisp,
                    new Image("Images/Pokemon/139.0.gif"), new Image("Images/Pokemon/139.1.gif"), 139),

            new Pokemon("Kabuto", "Rock", 30, 55, 0.7, Leer, Scratch, Mud_Bomb, Water_Gun,
                    new Image("Images/Pokemon/140.0.gif"), new Image("Images/Pokemon/140.1.gif"), 140),

            new Pokemon("Kabutops", "Rock", 60, 80, 1.23, Ancient_Power, Stone_Edge, Hydropump, Mud_Bomb,
                    new Image("Images/Pokemon/141.0.gif"), new Image("Images/Pokemon/141.1.gif"), 141),

            new Pokemon("Aerodactyl", "Rock", 80, 130, 1.15, Hurricane, Ancient_Power, Ice_Punch, Fire_Punch,
                    new Image("Images/Pokemon/142.0.gif"), new Image("Images/Pokemon/142.1.gif"), 142),

            new Pokemon("Snorlax", "Normal", 180, 30, 0.86, Recover, Hyperbeam, High_Horsepower, Shadow_Ball,
                    new Image("Images/Pokemon/143.0.gif"), new Image("Images/Pokemon/143.1.gif"), 143),

            new Pokemon("Articuno", "Ice", 90, 85, 1.5, Blizzard, Roost, Hurricane, Ice_Beam,
                    new Image("Images/Pokemon/144.0.gif"), new Image("Images/Pokemon/144.1.gif"), 144),

            new Pokemon("Zapdos", "Electric", 90, 100, 1.5, Zap_Canon, Thunder_Wave, Thunderbolt, Hurricane,
                    new Image("Images/Pokemon/145.0.gif"), new Image("Images/Pokemon/145.1.gif"), 145),

            new Pokemon("Moltres", "Fire", 90, 90, 1.5, Hurricane, Burn_Up, Roost, Flamethrower,
                    new Image("Images/Pokemon/146.0.gif"), new Image("Images/Pokemon/146.1.gif"), 146),

            new Pokemon("Dratini", "Dragon", 41, 50, 0.8, Dragon_Rage, Thunder_Wave, Leer, Aqua_Tail,
                    new Image("Images/Pokemon/147.0.gif"), new Image("Images/Pokemon/147.1.gif"), 147),

            new Pokemon("Dragonair", "Dragon", 61, 70, 1, Dragon_Rage, Thunder_Wave, Leer, Aqua_Tail,
                    new Image("Images/Pokemon/148.0.gif"), new Image("Images/Pokemon/148.1.gif"), 148),

            new Pokemon("Dragonite", "Dragon", 91, 70, 1.45, Dragon_Dance, Outrage, Hurricane, Fire_Punch,
                    new Image("Images/Pokemon/149.0.gif"), new Image("Images/Pokemon/149.1.gif"), 149),

            new Pokemon("Mewtwo", "Psychic", 106, 130, 1.65, Calm_Mind, Psychic, Ice_Beam, Shadow_Ball,
                    new Image("Images/Pokemon/150.0.gif"), new Image("Images/Pokemon/150.1.gif"), 150),

            new Pokemon("Mew", "Psychic", 100, 100, 1.38, Psychic, Ice_Beam, Shadow_Ball, Thunderbolt,
                    new Image("Images/Pokemon/151.0.gif"), new Image("Images/Pokemon/151.1.gif"), 151)
    };
    /* ^ Making the first 151 Pokemon from Gen 1, assigning their stats, info, moves and gifs. All gifs are from:
        http://www.pokestadium.com/tools/sprites */


}
