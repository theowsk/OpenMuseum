package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import com.openmuseum.core.models.Auteur;

public interface AuteurDao {
	
	public Optional<Auteur> findById(long auteurId);
	public List<Auteur> findAll();
	public List<Auteur> findAll(int pageNumber, int pageSize);
	
	public long count();
	
	public void deleteById(long auteurId);
	public void delete(Auteur auteur);
	
	public void save(Auteur auteur);
}
