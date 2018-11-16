package com.openmuseum.core.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.openmuseum.core.models.Musee;

public interface MuseeRepository extends JpaRepository<Musee, Long> {
	// Requêtes complexes
}
