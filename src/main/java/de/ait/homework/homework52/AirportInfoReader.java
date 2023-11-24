package de.ait.homework.homework52;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AirportInfoReader {
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsolutePath());
        String filename = "airports.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processLine(String line) {
        String[] parts = line.split(" ");
        if (parts.length >= 3) {
            String name = String.join(" ", java.util.Arrays.copyOfRange(parts, 0, parts.length - 2));
            String code = parts[parts.length - 2];
            String country = parts[parts.length - 1];
            System.out.println("Название: " + name + ", Код IATA: " + code + ", Страна: " + country);

        }
    }
}
