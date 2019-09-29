package com.java.assignment;

 class EligibilityExcep extends Exception{
	EligibilityExcep(String s){
		super(s);
	}
}


public class CustomException {
static  void check(int marks)throws EligibilityExcep{
	if(marks<60) {
		throw new EligibilityExcep("Failed");
	}else {
			System.out.println("passed");
		}
}

public static void main(String[] args) {
	try {
		check(58);
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("rest statement");
}
}
