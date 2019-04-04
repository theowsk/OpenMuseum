package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import com.openmuseum.core.models.Epoque;

public interface EpoqueDao {
	
	public Optional<Epoque> findById(long epoqueId);
	public List<Epoque> findAll();
	public List<Epoque> findAll(int pageNumber, int pageSize);
	
	public long count();
	
	public void deleteById(long epoqueId);
	public void delete(Epoque epoque);
	
	public void save(Epoque epoque);
}