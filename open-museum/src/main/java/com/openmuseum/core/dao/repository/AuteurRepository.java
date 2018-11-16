package com.openmuseum.core.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Auteur;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Long> {
	// Requêtes complexes
}
