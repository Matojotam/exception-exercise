package se.lexicon;

import java.util.Scanner;

public class ExerciseOne {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        try {
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic Exception");

        } finally {
            input.close();
        }

    }
}
