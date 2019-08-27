package oop2classstructure;

import oop1classobject.Motosiklet;

public class Main {

	public static void main(String[] args) {
		
		Araba araba1 = new Araba();		
		Araba araba2 = new Araba("Ford", 2009, 90);	

		araba2.yakitHarca(30);
		araba2.yakitDoldur(100);
		
		// Diger paketteki class a erisim:
		Motosiklet motor1 = new Motosiklet();
		motor1.marka = "Harley Davidson";	// public
		
	}

}
