package oop4inheritance.multipleinheritance;

public class Three implements One, Two {
	
	@Override
	public void printOne() {
		System.out.println("One");
	}
	
	@Override
	public void printTwo() {
		System.out.println("Two");

	}

	

}
