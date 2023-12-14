package com.homework;

public class SecondLargestElement {
	void secondLargest(int arr[]) {
		int mx=Integer.MIN_VALUE;
		int s_mx = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>mx) {
				s_mx=mx;
				mx=arr[i];
			}if(arr[i]>s_mx && arr[i] != mx) {
				s_mx=arr[i];
			}
			
		}
		System.out.println("Second largest no. in array is: "+s_mx);
		System.out.println("Largest no. in array is: "+mx);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargestElement s = new SecondLargestElement();
		
		
		int arr[]= {1,4,3,5,6,7,53,2,4,10,66,6,9};
		s.secondLargest(arr);
	}

}

