package Odev.entities;

import java.util.Date;

public class Oyuncu implements Entity{
	private int id;
	private String ad;
	private String soyad;
	private Date dogum;
	private Long TcNo;
	
	public Oyuncu(int id, String ad, String soyad, Date dogum, Long tcNo) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.dogum = dogum;
		TcNo = tcNo;
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

	public Date getDogum() {
		return dogum;
	}

	public void setDogum(Date dogum) {
		this.dogum = dogum;
	}

	public Long getTcNo() {
		return TcNo;
	}

	public void setTcNo(Long tcNo) {
		TcNo = tcNo;
	}
}
