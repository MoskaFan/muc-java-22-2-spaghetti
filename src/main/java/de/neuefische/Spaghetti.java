package de.neuefische;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Spaghetti {

    public static int getNumberOfPortionsOfSpaghetti() throws IOException {
        List<String> spaghettiStock;
        try{
            spaghettiStock = Files.readAllLines(Paths.get("spaghettiStock.txt"));
        }
        catch (IOException exception){
            spaghettiStock = List.of("4");
        }
        int numberOfPortions = Integer.valueOf(String.valueOf(spaghettiStock.get(0)));
        return numberOfPortions;
    }
}
