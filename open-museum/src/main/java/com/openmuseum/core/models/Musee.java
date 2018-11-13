package com.openmuseum.core.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Musee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idMusee", unique=true, nullable=false)
	private int id;
	
	@Column(name="nom", unique=true, nullable=false, length=255)
	private String nom;
	
	@Column(name="adresse", unique=false, nullable=true, length=255)
	private String adresse;
	
	@Column(name="ville", unique=false, nullable=true, length=60)
	private String ville;

	@Column(name="departement", unique=false, nullable=true, length=60)
	private String departement;
	
	@Column(name="region", unique=false, nullable=true, length=60)
	private String region;
	
	@Column(name="codePostal", unique=false, nullable=true, length=10)
	// pas de int cause dept 0+chiffre
	private String codePostal;
	
	@Column(name="telephone", unique=false, nullable=true, length=20)
	private String telephone;

	@Column(name="periode_ouverture", unique=false, nullable=true, length=255)
	private String periode_ouverture;
	
	@Column(name="site_web", unique=false, nullable=true, length=255)
	private String site_web;
	
	@Column(name="fermeture_annuelle", unique=false, nullable=true, length=255)
	private String fermeture_annuelle;
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="localisation", fetch=FetchType.LAZY)
	private List<Oeuvre> oeuvres;
	
	public Musee() {
		
	}
	
	public Musee(int id, String nom, String adresse, String ville, String departement, String region, 
			String codePostal, String telephone, String periode_ouverture, String site_web, String fermeture_annuelle) 
	{
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
		this.departement = departement;
		this.region = region;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.periode_ouverture = periode_ouverture;
		this.site_web = site_web;
		this.fermeture_annuelle = fermeture_annuelle;

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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPeriode_ouverture() {
		return periode_ouverture;
	}

	public void setPeriode_ouverture(String periode_ouverture) {
		this.periode_ouverture = periode_ouverture;
	}

	public String getSite_web() {
		return site_web;
	}

	public void setSite_web(String site_web) {
		this.site_web = site_web;
	}

	public String getFermeture_annuelle() {
		return fermeture_annuelle;
	}

	public void setFermeture_annuelle(String fermeture_annuelle) {
		this.fermeture_annuelle = fermeture_annuelle;
	}

	public List<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(List<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}


	

}
