package test2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice_project6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Square root of the number: " + calculateSquareRoot(number));
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot calculate square root of a negative number.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new ArithmeticException("Negative number not allowed.");
        }
        return Math.sqrt(number);
    }
}
