package com.homework;
import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		int count=0;
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)=='u'){
				count++;
			}
			
			
			}
		if(count>0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
			
		sc.close();
			
		}

	}


