package com.homework;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7,0,9,2,4,6,8};
		int min = Integer.MAX_VALUE;
		int s_min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				s_min=min;
				min=arr[i];
			}if(arr[i]<s_min && arr[i]!= min) {
				s_min=arr[i];
			}
			
		}
		System.out.println("Second smallest no. in array is: "+s_min);
		System.out.println("Smallest no. in array is: "+min);

	}

}
