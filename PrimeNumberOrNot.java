package com.homework;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=100;
//		for(int i=0; i<a; i++) {
//			int temp=i, count=0;
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//						count++;
//				}
//				
//				}
//			if(count==2)
//				System.out.print(temp+" ");
//			
//			}

		for(int i=2; i<=100; i++) {
			Boolean flag=true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
				flag=false;
				break;
				}
			}
			if(flag) {
				System.out.print(i+" ");
			}
		}
		
		
			
		}
		

	}


