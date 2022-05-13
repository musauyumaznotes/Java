package odev.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

public class Oyuncu {
	private int id;
	private String ad;
	private String soyad;
	private String tcNo;
	private String dogumTarihi;
	
	public Oyuncu() {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.dogumTarihi = dogumTarihi;
	}
	public Oyuncu(int id, String ad, String soyad, String tcNo, String dogumTarihi) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.dogumTarihi = dogumTarihi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
}
