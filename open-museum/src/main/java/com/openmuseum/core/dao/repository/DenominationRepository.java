package com.openmuseum.core.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Denomination;

@Repository
public interface DenominationRepository extends JpaRepository<Denomination, Long> {
	// Requêtes complexes
}
