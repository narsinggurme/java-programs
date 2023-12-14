package com.homework;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Narsing";
		String rev = "";
		char ch;
		for(int i=0; i<s.length(); i++) {
			ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);

	}

}
