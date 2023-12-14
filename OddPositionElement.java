package com.homework;

public class OddPositionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,3,4,5,6,7,8,9,10,11};
		int count=0;
		for(int i=1; i<arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
			count++;
			
			
		}
		System.out.println();
		System.out.println("Total element in odd position is: "+count);

	}

}
