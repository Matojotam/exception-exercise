package se.lexicon;

import java.io.*;

public class ExerciseFour {
    static void main() {
        InputStream inputStream = ExerciseFour.class.getClassLoader().getResourceAsStream("data.txt");
        if (inputStream == null) {
            System.out.println("Error: File not found in classpath.");
            return;
        }

        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = buffer.readLine();
            try {
                int number = Integer.parseInt(line);
                System.out.println("Parsed number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            }
        } catch (IOException e) {
            System.out.println("Error: I/O error occurred.");
        }
    }
}