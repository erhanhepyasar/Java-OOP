package oop5abstraction.interfaces.multipleinheritance;

import oop5abstraction.interfaces.drawable.Drawable;
import oop5abstraction.interfaces.printable.Printable;

public class A5 implements Drawable, Printable {

	@Override
	public void print() {
		System.out.println("A5 printing ...");

	}

	@Override
	public void draw() {
		System.out.println("A5 drawing ...");
	}

}
