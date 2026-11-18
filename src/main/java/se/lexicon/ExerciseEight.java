package se.lexicon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExerciseEight {
    static void main() {
        String content = "Hello, World! 1 2 3";

        // Define the file path (write to resources or user's home directory)
        String filePath = "src/main/resources/output.txt";

        // Check if the directory is writable; if not, write to user's home directory
        try {
            Path path = Paths.get(filePath);
            if (Files.isWritable(path.getParent())) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(content);
                    System.out.println("File written to: " + filePath);
                }
            } else {
                // Fallback: write to user's home directory
                filePath = System.getProperty("user.home") + "/output.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(content);
                    System.out.println("File written to: " + filePath);
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}