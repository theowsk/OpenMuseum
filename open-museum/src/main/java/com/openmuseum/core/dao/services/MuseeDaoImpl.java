package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.openmuseum.core.dao.repository.MuseeRepository;
import com.openmuseum.core.models.Musee;

public class MuseeDaoImpl implements MuseeDao  {

	private final MuseeRepository museeRepository;
	//private final AuteurDAL auteurDAL;
	
	@Autowired
	public MuseeDaoImpl (MuseeRepository museeRepository) {
		this.museeRepository = museeRepository;
	}
	
	
	@Override
	public Optional<Musee> findById(long auteurId) {
		return museeRepository.findById(auteurId);
	}

	@Override
	public List<Musee> findAll() {
		return museeRepository.findAll();
	}

	@Override
	public List<Musee> findAll(int pageNumber, int pageSize) {
		//TODO
		return null;
	}

	@Override
	public long count() {
		return museeRepository.count();
	}

	@Override
	public void deleteById(long auteurId) {
		museeRepository.deleteById(auteurId);
	}

	@Override
	public void delete(Musee auteur) {
		museeRepository.delete(auteur);
	}

	@Override
	public void save(Musee auteur) {
		museeRepository.save(auteur);
	}

}
