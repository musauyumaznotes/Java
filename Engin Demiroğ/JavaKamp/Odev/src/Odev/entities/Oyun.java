package Odev.entities;

public class Oyun implements Entity{
	private int id;
	private String isim;
	private double fiyat;
	
	public Oyun(int id, String isim, double fiyat) {
		super();
		this.id = id;
		this.isim = isim;
		this.fiyat = fiyat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	}
