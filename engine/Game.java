package engine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import model.characters.*;
import model.world.Cell;

public class Game {
    public static ArrayList<Hero> availableHeroes = new ArrayList<Hero>();
    public static ArrayList<Zombie> zombies = new ArrayList<Zombie>();
    public static ArrayList<Hero> heroes = new ArrayList<Hero>();
    public static Cell[][] map = new Cell[15][15];

    public static void loadHeros(String filePath) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        while(line != null)
        {
            String [] data = line.split(",");
            switch(data[1])
            {
                case "FIGH":
                    availableHeroes.add(new Fighter(data[0], Integer.parseInt(data[2]), Integer.parseInt(data[4]), Integer.parseInt(data[3])));
                    break;
                case "EXP":
                    availableHeroes.add(new Explorer(data[0], Integer.parseInt(data[2]), Integer.parseInt(data[4]), Integer.parseInt(data[3])));
                    break;
                default:
                    availableHeroes.add(new Medic(data[0], Integer.parseInt(data[2]), Integer.parseInt(data[4]), Integer.parseInt(data[3])));
                    break;
            }
        }
        br.close();
    }
}
