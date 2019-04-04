package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.openmuseum.core.dao.repository.AuteurRepository;
import com.openmuseum.core.models.Auteur;

public class AuteurDaoImpl implements AuteurDao {
	private final AuteurRepository auteurRepository;
	//private final AuteurDAL auteurDAL;
	
	@Autowired
	public AuteurDaoImpl (AuteurRepository auteurRepository) {
		this.auteurRepository = auteurRepository;
	}
	
	
	@Override
	public Optional<Auteur> findById(long auteurId) {
		return auteurRepository.findById(auteurId);
	}

	@Override
	public List<Auteur> findAll() {
		return auteurRepository.findAll();
	}

	@Override
	public List<Auteur> findAll(int pageNumber, int pageSize) {
		//TODO
		return null;
	}

	@Override
	public long count() {
		return auteurRepository.count();
	}

	@Override
	public void deleteById(long auteurId) {
		auteurRepository.deleteById(auteurId);
	}

	@Override
	public void delete(Auteur auteur) {
		auteurRepository.delete(auteur);
	}

	@Override
	public void save(Auteur auteur) {
		auteurRepository.save(auteur);
	}	
}
