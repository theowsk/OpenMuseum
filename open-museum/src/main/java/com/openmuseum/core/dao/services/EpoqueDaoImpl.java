package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.openmuseum.core.dao.repository.EpoqueRepository;
import com.openmuseum.core.models.Epoque;

public class EpoqueDaoImpl implements EpoqueDao {

	private final EpoqueRepository epoqueRepository;
	
	@Autowired
	public EpoqueDaoImpl (EpoqueRepository epoqueRepository) {
		this.epoqueRepository = epoqueRepository;
	}
	
	
	@Override
	public Optional<Epoque> findById(long epoqueId) {
		return epoqueRepository.findById(epoqueId);
	}

	@Override
	public List<Epoque> findAll() {
		return epoqueRepository.findAll();
	}

	@Override
	public List<Epoque> findAll(int pageNumber, int pageSize) {
		//TODO
		return null;
	}

	@Override
	public long count() {
		return epoqueRepository.count();
	}

	@Override
	public void deleteById(long epoqueId) {
		epoqueRepository.deleteById(epoqueId);
	}

	@Override
	public void delete(Epoque epoque) {
		epoqueRepository.delete(epoque);
	}

	@Override
	public void save(Epoque epoque) {
		epoqueRepository.save(epoque);
	}	
}
