package oop6polymorphism.overloading;

public class Main {

	public static void main(String[] args) {
		
		   Calculator calc = new Calculator();
	       System.out.println(calc.add(10, 20));
	       System.out.println(calc.add(10, 20, 30));
	       System.out.println(calc.add(10, 20, 30, 40));
		
	}

}
