package com.hcltech.Assignments;

import java.util.Scanner;

public class Monthdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number 1-12: ");
        int MonthNumber = sc.nextInt();

        String MonthName = "";

        switch (MonthNumber) {
            case 1:
                MonthName = "January";
                break;
            case 2:
                MonthName = "February";
                break;
            case 3:
                MonthName = "March";
                break;
            case 4:
                MonthName = "April";
                break;
            case 5:
                MonthName = "May";
                break;
            case 6:
                MonthName = "June";
                break;
            case 7:
                MonthName = "July";
                break;
            case 8:
                MonthName = "August";
                break;
            case 9:
                MonthName = "September";
                break;
            case 10:
                MonthName = "October";
                break;
            case 11:
                MonthName = "November";
                break;
            case 12:
                MonthName = "December";
                break;
            default:
                System.out.println("Invalid : Please enter valid Month number. ");
                return;
        }

        System.out.println("The month of the number " + MonthNumber + " is " + MonthName + ".");
    }
}
