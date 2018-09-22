package com.openmuseum.core.models;

import java.util.Date;

public class Musee {
	
	private String nom;
	private String ville;
	private String departement;
	private String region;
	// pas de int cause dept 0+chiffre
	private String codePostal;
	private Date dateOuverture;
	private Boolean accessible;
	
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
