package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import com.openmuseum.core.models.Domaine;

public interface DomaineDao {
	
	public Optional<Domaine> findById(long domaineId);
	public List<Domaine> findAll();
	public List<Domaine> findAll(int pageNumber, int pageSize);
	
	public long count();
	
	public void deleteById(long domaineId);
	public void delete(Domaine domaine);
	
	public void save(Domaine domaine);
}
