package com.homework;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 12345;
		int rev=0;
		int temp=n;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println(temp+ " number is Palindrome");
		}else {
			System.out.println(temp+" Number is not palindrome....");
		}

	}

}
