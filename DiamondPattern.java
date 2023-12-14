package com.homework;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
		
			for(int j=1; j<=i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		
		

	}
		for(int i=5; i>0; i--) {
			for(int j=5-1; j>=i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
		
			for(int j=1; j<=i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		
		

	}
	}

}
