package com.java.assignment;

public class ArrayMin {
 public static void main(String[] args) {
	
	int arr[]=new int[] {2,5,1,7,9};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("Minimum is " + min);
	
	int max=arr[arr.length-1];
	
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("Max value is "+ max);
	
	int arr2[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr2[i]=arr[i];
	}
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}
	
}
}