package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseThree {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        account.deposit(1000.0); // Initial deposit

        try {
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();

            try {
                account.withdraw(withdrawalAmount);
                System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
            } catch (IllegalArgumentException | InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}