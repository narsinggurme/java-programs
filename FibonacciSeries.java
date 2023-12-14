package com.homework;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		int b=1;
		System.out.print(a+" ");
		
		for(int i=2; i<=15; i++) {
			int temp=b+a;
			b=a;
			a=temp;
			System.out.print(a+" ");
		}
		
		

	}

}
