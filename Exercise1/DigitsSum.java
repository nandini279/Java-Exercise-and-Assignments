package com.hcltech.Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Ask the user to input a 4-digit number
            System.out.print("Enter a 4-digit number: ");
            int num = sc.nextInt();

            if (isValidNumber(num)) {
                // Calculate the sum of digits
                int sum = 0;
                int temp = num;
                while (temp != 0) {
                    int digit = temp % 10;
                    sum += digit;
                    temp /= 10;
                }

                // Print the sum of digits
                System.out.println("The sum of all digits are " + sum);
            } else {
                System.out.println("Invalid input! Please enter a 4-digit number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            sc.close();
        }
    }

    // Method to check if the number is 4-digit or not
    private static boolean isValidNumber(int num) {
        return num >= 1000 && num <= 9999;
    }
}
