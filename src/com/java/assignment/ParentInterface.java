package com.java.assignment;

//inherited by ChildAbstarct.java
public interface ParentInterface {
	
int add(int a,int b);

int sub(int a, int b);

default void show() {
	System.out.println("java 8 feature with default");
}

static void print() {
	System.out.println("java 8 featuire with static");
}

}
