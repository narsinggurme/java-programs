package com.homework;

public class DistinctElementInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "you are a champ.";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			int flag=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j) && i!=j) {
					flag=1;
					break;
				}
			}
			if(flag==0) 
				System.out.print(s.charAt(i));	
			
		}
		System.out.println(count);
		}

}
