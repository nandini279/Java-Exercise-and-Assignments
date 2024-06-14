package com.hcltech.Exercise1;

public class PrimeNumberdemo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Give input through Arguments");
        } else {
            int numb = Integer.parseInt(args[0]);
            if (isPrime(numb)) {
                System.out.println(numb + " is prime number");
            } else {
                System.out.println(numb + " not a prime number");
            }
        }
    }

    public static boolean isPrime(int numb) {
        if (numb <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numb); i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
