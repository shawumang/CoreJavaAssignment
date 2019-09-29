package com.java.assignment;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String branch="cse";
		String subject="java";
		
		switch(branch) {
		case "civil":
			System.out.println("Branch is civil");
			switch(subject) {
				case "cadd":
				System.out.println("subject is cadd");
					break;
				case "maths":
				System.out.println("subject is M2");
					break;
				default:System.out.println("Not valid");	
				
			}
		case "cse":
			System.out.println("Branch is cse");
			switch(subject) {
				case "java":
				System.out.println("subject is java");
					break;
				case "dbms":
				System.out.println("subject is dbms");
					break;
				default:System.out.println("optional");
			}
			
		}
		
	}

}
