package com.java.assignment;

//inherited by Maruti.java
public class Car {

	String name;
	String color;
	int year;
	
	Car(){
		System.out.println("Default constructor neccessary during inheritence");
	};

	Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	Car(String name, String color, int year) {
		this(name, color);
		this.year = year;
	}

	public void display() {
		System.out.println("Details of car are " + name + " " + color + " " + year);
	}

	
}
