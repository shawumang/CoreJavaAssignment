package com.java.assignment;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=25/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("rest statements");
		
	}

}
