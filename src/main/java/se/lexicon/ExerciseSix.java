package se.lexicon;

import java.util.Scanner;

public class ExerciseSix {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.print("Enter an email address: ");
            String email = scanner.nextLine();
            EmailValidator.validateEmail(email);
            System.out.println("Valid email");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}