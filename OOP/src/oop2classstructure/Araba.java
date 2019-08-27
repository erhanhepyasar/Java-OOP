package oop2classstructure;

public class Araba {
	
	// Fields
	private String marka;
	private int modelYili;
	private int yakitMiktari;
	
	// No-args Constructor
	public Araba() {
	
	}	
	
	// Constructor with Parameters
	public Araba(String marka) {
		this.marka = marka;
	}
	
		
	public Araba(int modelYili) {
		super();
		this.modelYili = modelYili;
	}
	
	
	public Araba(String marka, int modelYili) {
		super();
		this.marka = marka;
		this.modelYili = modelYili;
	}

	public Araba(String marka, int modelYili, int yakitMiktari) {
		this.marka = marka;
		this.modelYili = modelYili;
		this.yakitMiktari = yakitMiktari;
	}	
	

	// Other Methods
	public void yakitDoldur(int eklenecekMiktar) {
		yakitMiktari = yakitMiktari + eklenecekMiktar;
	}
	
	public void yakitHarca(int harcanacakMiktar) {
		yakitMiktari = yakitMiktari - harcanacakMiktar;
	}

}
