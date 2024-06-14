package com.hcltech.Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindromedemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// Ask the user to input a string
			System.out.print("Enter a string: ");
			String str = sc.nextLine().toLowerCase(); // Convert the input to lowercase

			// Check if the string is a Palindromme
			boolean isPalindrome = true;
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					isPalindrome = false;
					break;
				}
			}

			// Print the result
			if (isPalindrome) {
				System.out.println("The string \"" + str + "\" is a palindrome.");
			} else {
				System.out.println("The string \"" + str + "\" is not a palindrome.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter a valid string containing only letters.");
		} finally {
			sc.close();
		}
	}
}

