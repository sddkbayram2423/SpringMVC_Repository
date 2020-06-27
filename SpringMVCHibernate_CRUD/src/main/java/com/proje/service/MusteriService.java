package com.proje.service;

import java.util.List;

import com.proje.model.Musteri;

public interface MusteriService {
	
public List<Musteri> findAllMusteri();
	
	public List<Musteri> findByMusteriName(String musteriName);
	
	public Musteri findByMusteriId(long musteriId);
	
	public void createMusteri(Musteri musterri);
	
	public Musteri updateMusteri(Musteri musteri);
	
	public void deleteMusteri(long musteriId);

}
