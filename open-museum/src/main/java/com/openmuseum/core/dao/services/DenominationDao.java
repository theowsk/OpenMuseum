package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import com.openmuseum.core.models.Denomination;

public interface DenominationDao {
	
	public Optional<Denomination> findById(long denominationId);
	public List<Denomination> findAll();
	public List<Denomination> findAll(int pageNumber, int pageSize);
	
	public long count();
	
	public void deleteById(long denominationId);
	public void delete(Denomination denomination);
	
	public void save(Denomination denomination);
	
}
