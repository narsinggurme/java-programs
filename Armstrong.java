// try using for loop ..................

package com.homework;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum=0;
		
		int temp=n;
//		while(n!=0) {
//			int rem=n%10;
//			sum=sum+(rem*rem*rem);
//			
//			n=n/10;
//		}
//		if(sum==temp) {
//			System.out.println("Number is armstrong");
//		}
//		else {
//			System.out.println("Number is not armstrong");
//		}
		
		for(int i=n; i>0; i--) {
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("No.  is armstrong");
			
		}else {
			System.out.println("No.  is not armstrong");
		}
		sc.close();

	}

}
