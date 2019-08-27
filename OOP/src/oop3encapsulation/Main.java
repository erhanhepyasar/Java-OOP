package oop3encapsulation;

import oop1classobject.Motosiklet;

public class Main {

	public static void main(String[] args) {
		
		Araba araba1 = new Araba();
	
		araba1.setMarka("Ford");
		araba1.setModelYili(2009);
		araba1.setYakitMiktari(90);
		
		System.out.println(araba1.getMarka());
		System.out.println(araba1.getModelYili());
		System.out.println(araba1.getYakitMiktari());
		
		araba1.yakitHarca(30);
		System.out.println(araba1.getYakitMiktari());
		
		// Diger paketteki class a erisim:
		Motosiklet motor1 = new Motosiklet();
		motor1.marka = "Harley Davidson";	// public
		
	}

}
