package com.proje.model;

public class Kullanici {
	
	private String kullaniciAdi;
	private String email;
	
	public Kullanici() {
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Kullanici [kullaniciAdi=" + kullaniciAdi + ", email=" + email + "]";
	}
	

}
