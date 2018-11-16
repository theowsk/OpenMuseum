package com.openmuseum.core.dao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.openmuseum.core.dao.repository.OeuvreRepository;
import com.openmuseum.core.models.Oeuvre;

public class OeuvreDaoImpl implements OeuvreDao {
	private final OeuvreRepository oeuvreRepository;
	//private final AuteurDAL auteurDAL;
	
	@Autowired
	public OeuvreDaoImpl (OeuvreRepository oeuvreRepository) {
		this.oeuvreRepository = oeuvreRepository;
	}
	
	
	@Override
	public Optional<Oeuvre> findById(long oeuvreId) {
		return oeuvreRepository.findById(oeuvreId);
	}

	@Override
	public List<Oeuvre> findAll() {
		return oeuvreRepository.findAll();
	}

	@Override
	public List<Oeuvre> findAll(int pageNumber, int pageSize) {
		//TODO
		return null;
	}

	@Override
	public long count() {
		return oeuvreRepository.count();
	}

	@Override
	public void deleteById(long auteurId) {
		oeuvreRepository.deleteById(auteurId);
	}

	@Override
	public void delete(Oeuvre oeuvre) {
		oeuvreRepository.delete(oeuvre);
	}

	@Override
	public void save(Oeuvre auteur) {
		oeuvreRepository.save(auteur);
	}

}
