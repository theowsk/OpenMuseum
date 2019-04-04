package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import com.openmuseum.core.models.Musee;

public interface MuseeDao {
	
	public Optional<Musee> findById(long museeId);
	public List<Musee> findAll();
	public List<Musee> findAll(int pageNumber, int pageSize);
	
	public long count();
	
	public void deleteById(long museeId);
	public void delete(Musee musee);
	
	public void save(Musee musee);
}
