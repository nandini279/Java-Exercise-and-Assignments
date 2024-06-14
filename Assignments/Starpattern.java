package com.hcltech.Assignments;

public class Starpattern {
	 
	public static void main(String[] args) {
		
		//for loop to print the stars as given in the input 
		int rows=3;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			
			// prompt the user
			System.out.println();
		}
		
	}
 
}