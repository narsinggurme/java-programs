package com.homework;

public class PrimeNumber {
	int a= 11;
	int count=0;
	void prime() {
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				count++;
			}
			
		}
		if(count>0) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}
	}

}
