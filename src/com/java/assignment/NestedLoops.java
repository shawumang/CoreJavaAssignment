package com.java.assignment;

public class NestedLoops {
	public static void main(String[] args) {
		
		int i,j,k,l;
		
		System.out.println("nested for loop using continue");
		
		for(i=1;i<=2;i++) {
			for(j=1;j<=5;j++) {
				if(j==4) {
					continue;
				}
				System.out.println(i +" "+ j);
			}
			

		}
		
		
		System.out.println("Nested for loop using break");
		
		for(k=1;k<=3;k++) {
			for(l=1;l<=5;l++) {
				if(l==4) {
					break;
				}
				if(k==3) {
					break;
				}
				System.out.println(k + " " + l);

			}
		}
	}

}
