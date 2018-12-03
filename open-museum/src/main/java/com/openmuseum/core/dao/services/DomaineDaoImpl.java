package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.openmuseum.core.dao.repository.DomaineRepository;
import com.openmuseum.core.models.Domaine;

public class DomaineDaoImpl {
	private final DomaineRepository domaineRepository;
	
	@Autowired
	public DomaineDaoImpl (DomaineRepository domaineRepository) {
		this.domaineRepository = domaineRepository;
	}
	
	
	public Optional<Domaine> findById(long domaineId) {
		return domaineRepository.findById(domaineId);
	}

	public List<Domaine> findAll() {
		return domaineRepository.findAll();
	}

	public List<Domaine> findAll(int pageNumber, int pageSize) {
		//TODO
		return null;
	}

	public long count() {
		return domaineRepository.count();
	}

	public void deleteById(long denominationId) {
		domaineRepository.deleteById(denominationId);
	}

	public void delete(Domaine domaine) {
		domaineRepository.delete(domaine);
	}

	public void save(Domaine domaine) {
		domaineRepository.save(domaine);
	}
}
