package com.hcltech.Exercise1;

public class Abctechnology {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ModifyString <string1> <string2>");
        } else {
            String str1 = args[0];
            String str2 = args[1];
            String result = Abctechnology(str1, str2);
            System.out.println(result);
        }
    }

    public static String Abctechnology(String str1, String str2) {
        if (str1.equals("Stackrout") && str2.equals("Bangalore")) {
            return "ABC Technologies Bangalore";
        } else if (str1.equals("ABC") && str2.equals("Mumbai")) {
            return "ABC Technologies Mumbai";
        } else {
            return "Invalid input";
        }
    }
}
