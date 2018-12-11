package com.openmuseum.core.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Musee;

@Repository
public interface MuseeRepository extends JpaRepository<Musee, Long> {
	//Tout les musées où l'oeuvre existe 
	@Query("SELECT * FROM Musee as 'm' "
			+ "INNER JOIN Musee_has_Oeuvre as 'mo' ON m.id = mo.idMusee "
			+ "INNER JOIN Oeuvre as 'e' ON mo.idOeuvre = m.id "
			+ "WHERE mo.idOeuvre = :idOeuvre")
	public List<Musee> findOeuvreByMusee(@Param("idOeuvre") Integer idOeuvre);
}
