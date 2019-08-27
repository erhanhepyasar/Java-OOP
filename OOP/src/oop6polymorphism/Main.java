package oop6polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Polymorphism
		Shape s1 = new Circle("Red", 2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		Shape s3 = new Rectangle("Green", 3, 5);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		// Polymorphism
		List<Shape> shapes = new ArrayList<>();
		shapes.add(s1);
		shapes.add(s2);
		shapes.add(s3);
		
		for(Shape s : shapes) {
			System.out.println(s.color);
			System.out.println(s.area());	
		}
		
		for(Shape s : shapes) {
			if (s instanceof Circle) {
				System.out.println("Circle");
			} else if (s instanceof Rectangle) {
				System.out.println("Rectangle");
			}		
			
		}
	}

}
