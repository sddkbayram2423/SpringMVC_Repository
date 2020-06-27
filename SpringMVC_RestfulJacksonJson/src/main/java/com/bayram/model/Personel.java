package com.bayram.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class Personel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String adi;
	
	public Personel() {
		this.id = 0;
		this.adi = "BOÞ";
	}

	public Personel(int id, String adi) {
		super();
		this.id = id;
		this.adi = adi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", adi=" + adi + "]";
	}
	

}
