package com.java.assignment;

public class ChildClass extends ChildAbstract{

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	public static void main(String[] args) {
		ParentInterface parent = new ChildClass();
		parent.show();
		ParentInterface.print();
		System.out.println(parent.add(5, 10));
		System.out.println(parent.sub(10, 5));
		
	}

}
