package com.homework;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,6,3,5,0,66, 9, 11,10};
		int mx = Integer.MIN_VALUE;
		int mn = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>mx) {
				mx=arr[i];
			}
			
				if(arr[i]<mn) {
					mn=arr[i];
				}

			}
		
		System.out.println("Maximum element in array is : "+mx);
		System.out.println("Minimum element in array is : "+mn);
	
		

	}

}
