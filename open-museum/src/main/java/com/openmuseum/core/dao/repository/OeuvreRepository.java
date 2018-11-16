package com.openmuseum.core.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Oeuvre;

@Repository
public interface OeuvreRepository extends JpaRepository<Oeuvre, Long> {
	// Requêtes complexes
}
