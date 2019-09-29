package com.java.assignment;

public class Maruti extends Car{
	
	String showroom;
	
	Maruti(String name, String showroom) {
		this.name=name;
		this.showroom=showroom;
	}
	
	public void display() {
		
		System.out.println("Maruti details are " + name + " " + showroom);
//		super.display();
	}

	public static void main(String[] args) {
		Car car1 = new Maruti("Swift", "Nexa");
		Car car2 = new Car("Baleno", "Silver", 2010);
		car1.display();
		car2.display();
		new Car("Ignis" , "White").display(); 
		
		
		
	}


	
	

}
