package com.homework;
import java.util.Scanner;
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence..: ");
		String s = sc.nextLine();
		String rev="";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				rev=rev+s.charAt(i);
				
			}
			
		}
		
		System.out.println(rev);
		sc.close();

	}

}
