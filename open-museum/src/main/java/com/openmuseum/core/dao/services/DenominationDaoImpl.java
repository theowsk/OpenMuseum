package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.openmuseum.core.dao.repository.DenominationRepository;
import com.openmuseum.core.models.Denomination;

public class DenominationDaoImpl {
	private final DenominationRepository denominationRepository;
	
	@Autowired
	public DenominationDaoImpl (DenominationRepository denominationRepository) {
		this.denominationRepository = denominationRepository;
	}
	
	
	public Optional<Denomination> findById(long denominationId) {
		return denominationRepository.findById(denominationId);
	}

	public List<Denomination> findAll() {
		return denominationRepository.findAll();
	}

	public List<Denomination> findAll(int pageNumber, int pageSize) {
		//TODO
		return null;
	}

	public long count() {
		return denominationRepository.count();
	}

	public void deleteById(long denominationId) {
		denominationRepository.deleteById(denominationId);
	}

	public void delete(Denomination denomination) {
		denominationRepository.delete(denomination);
	}

	public void save(Denomination denomination) {
		denominationRepository.save(denomination);
	}
}
