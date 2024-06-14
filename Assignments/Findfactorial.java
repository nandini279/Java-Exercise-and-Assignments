package com.hcltech.Assignments;

import java.util.Scanner;

public class Findfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = sc.nextInt();

        int Fact = 1;
        int i = 1;

        // Calculate factorial using do-while loop
        do {
            Fact *= i;
            i++;
        } while (i <= Num);

        System.out.println("Factorial of " + Num + " is: " + Fact);
    }
}
