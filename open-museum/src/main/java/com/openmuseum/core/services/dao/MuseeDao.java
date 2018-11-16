package com.openmuseum.core.services.dao;

import java.util.List;

import com.openmuseum.core.models.Musee;

public interface MuseeDao {
	
	public Musee findById();
		
	public List<Musee> findAll();
		
	public void save(Musee musee);
}
