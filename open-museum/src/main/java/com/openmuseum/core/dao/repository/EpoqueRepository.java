package com.openmuseum.core.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Epoque;

@Repository
public interface EpoqueRepository extends JpaRepository<Epoque, Long> {
	// Requêtes complexes
}
