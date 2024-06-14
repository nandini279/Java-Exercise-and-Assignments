package com.hcltech.Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNegitivedemo {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
            try {
	        // Ask the user to input a number
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (number > 0) {
	            System.out.println("Number is positive.");
	        } else if (number < 0) {
	            System.out.println("Number is negative.");
	        } else {
	        	System.out.println("The number is zero.");
	        }
            }catch(InputMismatchException e) {
            	System.out.println("Invalid input! Please enter a valid number.");
            }
	        sc.close();
	    }
	}

