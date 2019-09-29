package com.java.assignment;

public class Loops {
	public static void main(String[] args) {
		
	
	int i=1,j=1,k=1;

	System.out.println("While loop using continue");
	
	while(i<=10) {
		if(i==5) {
			i++;
			continue;
		}
		System.out.println(i);
		i++;
	}
	
	System.out.println("For loop using continue");
	
	for( ;j<=10; j++) {
		if(j==5) {
			continue;
		}
		System.out.println(j);
	}
	
	System.out.println("do-while loop using continue");
	
	do {
		if(k==5) {
			k++;
			continue;
		}
		System.out.println(k);
		k++;
		
	}while(k<=10);
}
}