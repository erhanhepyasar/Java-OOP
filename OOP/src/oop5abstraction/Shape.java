package oop5abstraction;

public abstract class Shape {
	String color;

	// abstract methods
	abstract double area();
	public abstract String toString();

	// abstract class can have constructor
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() {
		return color;
	}
}
