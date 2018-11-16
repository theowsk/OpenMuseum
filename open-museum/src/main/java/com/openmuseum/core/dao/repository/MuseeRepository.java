package com.openmuseum.core.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Musee;

@Repository
public interface MuseeRepository extends JpaRepository<Musee, Long> {
	// Requêtes complexes
}
