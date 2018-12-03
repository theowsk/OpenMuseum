package com.openmuseum.core.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Domaine;

@Repository
public interface DomaineRepository extends JpaRepository<Domaine, Long> {
	// Requêtes complexes
}
