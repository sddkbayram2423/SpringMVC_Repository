package com.proje.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Kullanici {
	
	@NotEmpty
	@Size(min = 1,max = 25,message = "Kullanici adi alani bos gecilemez")
	private String kullaniciAdi;
	
	
	@NotEmpty
	@Size(min = 4,max = 8, message = "Parola alani bos gecilemez")
	private String parola;
	
	public Kullanici() {
	}

	public Kullanici(String kullaniciAdi, String parola) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
	}



	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	@Override
	public String toString() {
		return "Kullanici [kullaniciAdi=" + kullaniciAdi + ", parola=" + parola + "]";
	}


	
	
	
	
	
}
