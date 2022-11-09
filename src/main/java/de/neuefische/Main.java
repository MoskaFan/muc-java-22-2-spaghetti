package de.neuefische;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("There are " + (Spaghetti.getNumberOfPortionsOfSpaghetti() - 1)
                + " portions in the stock");
    }
}