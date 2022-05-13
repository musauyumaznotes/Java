package odev.entities.concretes;

public class Oyun {
	private int id;
	private String isim;
	private double ücret;
	
	public Oyun(int id, String isim, double ücret) {
		super();
		this.id = id;
		this.isim = isim;
		this.ücret = ücret;
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

	public double getÜcret() {
		return ücret;
	}

	public void setÜcret(double ücret) {
		this.ücret = ücret;
	}
}
