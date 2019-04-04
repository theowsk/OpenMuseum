package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import com.openmuseum.core.models.Oeuvre;

public interface OeuvreDao {
	public Optional<Oeuvre> findById(long oeuvreId);
	public List<Oeuvre> findAll();
	public List<Oeuvre> findAll(int pageNumber, int pageSize);
	
	public long count();
	
	public void deleteById(long oeuvreId);
	public void delete(Oeuvre oeuvre);
	
	public void save(Oeuvre oeuvre);
}
