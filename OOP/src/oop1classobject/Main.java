package oop1classobject;

public class Main {

	public static void main(String[] args) {
		
		Araba araba1 = new Araba();
		araba1.marka = "Opel";
		araba1.modelYili = 2015;
				
		Araba araba2 = new Araba();
		araba2.marka = "Hyundai";
		araba2.modelYili = 2019;
		
		araba2.yakitMiktari = 50;
		
		araba2.yakitDoldur(30);
		System.out.println(araba2.yakitMiktari);
		
		araba2.yakitHarca(5);
		System.out.println(araba2.yakitMiktari);
		
		Motosiklet motor1 = new Motosiklet();
		motor1.marka = "Honda"; 		// public
		motor1.toplamKm = 8000;			// package
		motor1.yakitMiktari = 80;		// protected
		
	}

}
