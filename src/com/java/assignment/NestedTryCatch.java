package com.java.assignment;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			try {
				int a=25/0;
			}catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				int arr[]=new int[5];
				System.out.println(arr[10]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}catch(Exception e) {
			System.out.println("Exception handeled");
		}
		
		System.out.println("rest of the code");
		
		
	}

}
