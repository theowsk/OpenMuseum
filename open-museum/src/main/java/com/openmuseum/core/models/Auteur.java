package com.openmuseum.core.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auteur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAuteur", unique=true, nullable=false)
	private int id;
	
	@Column(name="nom", unique=false, nullable=false)
	private String nom;
	
	@Column(name="prenom", unique=false, nullable=true)
	private String prenom;
	
	@Column(name="nationalite", unique=false, nullable=true)
	private String nationalite;
	
	@Column(name="dateNaissance", unique=false, nullable=true)
	private Date birthDate;
	
	@Column(name="dateMort", unique=false, nullable=true)
	private Date deathDate;
	
	// private Epoque epoqueAppartenance;
	
	public Auteur() {
		
	}
	
	public Auteur(int id, String nom, String prenom, String nationalite, Date birthDate, Date deathDate) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
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
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNationalite() {
		return nationalite;
	}
	
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Date getDeathDate() {
		return deathDate;
	}
	
	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

}
