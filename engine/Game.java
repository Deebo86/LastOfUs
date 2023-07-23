package engine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import model.characters.*;
import model.world.Cell;

public class Game {
    public static ArrayList<Hero> availableHeros = new ArrayList<Hero>();
    public static ArrayList<Zombie> zombiesn = new ArrayList<Zombie>();
    public static ArrayList<Hero> heros = new ArrayList<Hero>();
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
                    availableHeros.add(new Fighter(data[0], Integer.parseInt(data[2]), Integer.parseInt(data[4]), Integer.parseInt(data[3])));
                    break;
                case "EXP":
                    availableHeros.add(new Explorer(data[0], Integer.parseInt(data[2]), Integer.parseInt(data[4]), Integer.parseInt(data[3])));
                    break;
                default:
                    availableHeros.add(new Medic(data[0], Integer.parseInt(data[2]), Integer.parseInt(data[4]), Integer.parseInt(data[3])));
                    break;
            }
        }
    }
}
