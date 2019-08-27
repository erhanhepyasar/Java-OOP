package oop1classobject;

public class Araba {
	String marka;
	int modelYili;
	int yakitMiktari;
	
	void yakitDoldur(int eklenecekMiktar) {
		yakitMiktari = yakitMiktari + eklenecekMiktar;
	}
	
	void yakitHarca(int harcanacakMiktar) {
		yakitMiktari = yakitMiktari - harcanacakMiktar;
	}

}
