package oop2classstructure.methodsignature;

public class Islemler {
	
	public static int topla(int a, int b) {
		return a + b;
	}
	
	public static double topla(double a, double b) {
		return a + b;
	}
	
	public static String topla(String a, String b) {
		return a + b;
	}
	
//	Error: Duplicate method topla(int, int) in type Islemler
//	public static double topla(int a, int b) {
//		return a + b;
//	}
	
	public static int cikar(int a, int b) {
		return a - b;
	}	
	
	public static double cikar(double a, double b) {
		return a - b;
	}

}
