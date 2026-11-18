package se.lexicon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerciseSeven {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        NameManager nameManager = new NameManager();

        // Predefined list of names for testing
        List<String> testNames = Arrays.asList("Alice", "Bob", "Charlie");

        // Set the predefined names in the NameManager
        nameManager.setNames(testNames);

        // Test finding names
        try {
            nameManager.findName("Alice");
            nameManager.findName("Bob");
            nameManager.findName("Charlie");
            nameManager.findName("Kent");
        } catch (NameNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test adding a duplicate name
        try {
            nameManager.addName("Alice"); // This will throw DuplicateNameException
        } catch (DuplicateNameException e) {
            System
                    .out.println("Error: " + e.getMessage());
        }

        // Test adding a new name
        try {
            nameManager.addName("David");
            nameManager.printNames(); // Print the updated list
        } catch (DuplicateNameException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}