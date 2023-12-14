package com.homework;
import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		int sum=0;
		for(int i=n;  i>0; i--) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		sc.close();
	

	}

}
