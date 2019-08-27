package oop6polymorphism.overriding;

public class Main {

	public static void main(String[] args) {
		
		Shape shape;
		shape = new Rectangle();
		shape.draw();
		shape = new Circle();
		shape.draw();
		shape = new Triangle();
		shape.draw();

	}

}
