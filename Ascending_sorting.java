package com.homework;

public class Ascending_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 5, 2, 3, 1 , 6, 7 , 8};
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
			System.out.print(arr[i]+" ");
		}
		

	}

}
