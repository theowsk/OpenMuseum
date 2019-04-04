package com.openmuseum.core.models;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "auteur")
public class Auteur {
	
	@Id
	@GeneratedValue
	@Column(name="idAuteur", unique=true, nullable=false)
	private int id;
	
	@Column(name="nom", unique=false, nullable=false, length=60)
	private String nom;
	
	@Column(name="prenom", unique=false, nullable=true, length=30)
	private String prenom;
	
	@Column(name="nomUsage", unique=false, nullable=false, length=60)
	private String nomUsage;
	
	@Column(name="prenomUsage", unique=false, nullable=true, length=30)
	private String prenomUsage;
	
	@Column(name="preposition", unique=false, nullable=true, length=50)
	private String preposition;
	
	//Déclaration des tables d'associations et des différentes jointures à réaliser
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "auteur")
    private Set<Oeuvre> oeuvres;
	
	/**
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAuteur", unique=true, nullable=false)
	private int id;
	
	@Column(name="nom", unique=false, nullable=false, length=60)
	private String nom;
	
	@Column(name="prenom", unique=false, nullable=true, length=30)
	private String prenom;
	
	@Column(name="nomUsage", unique=false, nullable=false, length=60)
	private String nomUsage;
	
	@Column(name="prenomUsage", unique=false, nullable=true, length=30)
	private String prenomUsage;
	
	@Column(name="preposition", unique=false, nullable=true, length=50)
	private String preposition;
	
	//Déclaration des tables d'associations et des différentes jointures à réaliser
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "auteurs")
    private Set<Oeuvre> oeuvres = new HashSet<>();
	 
	*/

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
	
	public String getNomUsage() {
		return nomUsage;
	}

	public void setNomUsage(String nomUsage) {
		this.nomUsage = nomUsage;
	}
	
	public String getPrenomUsage() {
		return prenomUsage;
	}
	
	public void setPrenomUsage(String prenomUsage) {
		this.prenomUsage = prenomUsage;
	}
	
	public String getPreposition() {
		return preposition;
	}
	
	public void setPreposition(String preposition) {
		this.preposition = preposition;
	}
	
	public Set<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(Set<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}

}
