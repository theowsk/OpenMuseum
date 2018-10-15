package com.openmuseum.core.models;

import java.util.Date;

public class Auteur {
	
	private String nom;
	private String prenom;
	private String nationalite;
	private Date birthDate;
	private Date deathDate;
	// private Epoque epoqueAppartenance;
	
	public Auteur() {
		
	}
	
	public Auteur(String nom, String prenom, String nationalite, Date birthDate, Date deathDate) {
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
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
