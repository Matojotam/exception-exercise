package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseTwo {
    static class NumberRangeException extends Exception {

        public NumberRangeException() {

        }
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");


        try {
            int num1 = scanner.nextInt();

            if (num1 < 1 || num1 > 100) {
                throw new NumberRangeException();

            }
        } catch(InputMismatchException e) {
                    System.out.println("Please enter a number");

        } catch(NumberRangeException e) {
                    System.out.println("Please enter a number between 1 and 100");
        } finally{
                scanner.close();
            }

        }
    }
