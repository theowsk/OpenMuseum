package com.openmuseum.core.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "musee")
public class Musee {
	
	@Id
	@GeneratedValue
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
	private String periodeOuverture;
	
	@Column(name="site_web", unique=false, nullable=true, length=255)
	private String siteWeb;
	
	@Column(name="fermeture_annuelle", unique=false, nullable=true, length=255)
	private String fermetureAnnuelle;
	
	//Déclaration des tables d'associations et des différentes jointures à réaliser
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "musees")
    private Set<Oeuvre> oeuvres;
	
	/*public Musee() {
		
	}

	public Musee(int id, String nom, String adresse, String ville, String departement, String region, String codePostal,
			String telephone, String periodeOuverture, String siteWeb, String fermetureAnnuelle, Set<Oeuvre> oeuvres) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
		this.departement = departement;
		this.region = region;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.periodeOuverture = periodeOuverture;
		this.siteWeb = siteWeb;
		this.fermetureAnnuelle = fermetureAnnuelle;
		this.oeuvres = oeuvres;
	}*/

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

	public String getPeriodeOuverture() {
		return periodeOuverture;
	}

	public void setPeriodeOuverture(String periodeOuverture) {
		this.periodeOuverture = periodeOuverture;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getFermetureAnnuelle() {
		return fermetureAnnuelle;
	}

	public void setFermetureAnnuelle(String fermetureAnnuelle) {
		this.fermetureAnnuelle = fermetureAnnuelle;
	}

	public Set<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(Set<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}


	

}
