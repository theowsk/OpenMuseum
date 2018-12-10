package com.openmuseum.core.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.openmuseum.core.models.Oeuvre;

@Repository
public interface OeuvreRepository extends JpaRepository<Oeuvre, Long> {
	
	// Recherche toutes les oeuvres d'une époque précise
	@Query("SELECT * FROM Oeuvre as 'o' "
			+ "INNER JOIN Oeuvre_has_Epoque as 'oe' ON o.id = oe.idOeuvre "
			+ "INNER JOIN Epoque as 'e' ON oe.idEpoque = e.id "
			+ "WHERE oe.idEpoque = :idEpoque")
	public List<Oeuvre> findOeuvreByEpoque(@Param("idEpoque") Integer idEpoque);
	
	// Recherche de toutes les oeuvres d'une technique précise
	@Query("SELECT * FROM Oeuvre as 'o' "
			+ "INNER JOIN Oeuvre_has_Technique as 'ot' ON o.id = ot.idOeuvre "
			+ "INNER JOIN Technique as 't' ON ot.idTechique = t.id "
			+ "WHERE ot.idTechnique = :idTechnique")
	public List<Oeuvre> findOeuvreByTechnique(@Param("idTechnique") Integer idTechnique);
	
	// Recherche de toutes les oeuvres d'un auteur précis
	@Query("SELECT * FROM Oeuvre as 'o' "
			+ "INNER JOIN Oeuvre_has_Auteur as 'oa' ON o.id = oa.idOeuvre "
			+ "INNER JOIN Auteur as 'a' ON oa.idAuteur = a.id "
			+ "WHERE oa.idAuteur = :idAuteur")
	public List<Oeuvre> findOeuvreByAuteur(@Param("idAuteur") Integer idAuteur);
	
	// Recherche de toutes les oeuvres d'une denomination précise
	@Query("SELECT * FROM Oeuvre as 'o' "
			+ "INNER JOIN Oeuvre_has_Denomination as 'od' ON o.id = od.idOeuvre "
			+ "INNER JOIN Denomination as 'd' ON od.idDenomination = d.id "
			+ "WHERE od.idDenomination = :idDenomination")
	public List<Oeuvre> findOeuvreByDenomination(@Param("idDenomination") Integer idDenomination);
	
	// Recherche de toutes les oeuvres d'un musée précis
	@Query("SELECT * FROM Oeuvre as 'o' "
			+ "INNER JOIN Oeuvre_has_Musee as 'om' ON o.id = om.idMusee "
			+ "INNER JOIN Musee as 'm' ON om.idMusee = m.id "
			+ "WHERE om.idMusee = :idMusee")
	public List<Oeuvre> findOeuvreByMusee(@Param("idMusee") Integer idMusee);
}
