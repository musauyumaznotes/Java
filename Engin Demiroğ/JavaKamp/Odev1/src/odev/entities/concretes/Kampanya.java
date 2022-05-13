package odev.entities.concretes;

public class Kampanya {
	private int id;
	private String isim;
	private double indirimOrani;
	
	public Kampanya(int id, String isim, double indirimOrani) {
		super();
		this.id = id;
		this.isim = isim;
		this.indirimOrani = indirimOrani;
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

	public double getIndirimOrani() {
		return indirimOrani;
	}

	public void setIndirimOrani(double indirimOrani) {
		this.indirimOrani = indirimOrani;
	}
	
}
