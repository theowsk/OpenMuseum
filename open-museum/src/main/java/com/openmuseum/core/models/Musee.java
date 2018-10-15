package com.openmuseum.core.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Musee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idMusee", unique=true, nullable=false)
	private int id;
	
	@Column(name="nom", unique=true, nullable=false)
	private String nom;
	
	@Column(name="ville", unique=false, nullable=true)
	private String ville;

	@Column(name="departement", unique=false, nullable=true)
	private String departement;
	
	@Column(name="region", unique=false, nullable=true)
	private String region;
	
	@Column(name="codePostal", unique=false, nullable=true)
	// pas de int cause dept 0+chiffre
	private String codePostal;
	
	@Column(name="dateOuverture", unique=false, nullable=true)
	private Date dateOuverture;
	
	@Column(name="accessibilite", unique=false, nullable=true)
	private Boolean accessible;
	
	public Musee() {
		
	}
	
	public Musee(int id, String nom, String ville, String departement, String region, String codePostal, Date dateOuverture,
			Boolean accessible) {
		this.id = id;
		this.nom = nom;
		this.ville = ville;
		this.departement = departement;
		this.region = region;
		this.codePostal = codePostal;
		this.dateOuverture = dateOuverture;
		this.accessible = accessible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getDepartement() {
		return departement;
	}
	
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getCodePostal() {
		return codePostal;
	}
	
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	public Date getDateOuverture() {
		return dateOuverture;
	}
	
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	public Boolean getAccessible() {
		return accessible;
	}
	
	public void setAccessible(Boolean accessible) {
		this.accessible = accessible;
	}
	
	

}
