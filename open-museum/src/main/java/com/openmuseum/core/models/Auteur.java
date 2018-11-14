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
public class Auteur {
	
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
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="auteur", fetch=FetchType.LAZY)
	private List<Oeuvre> oeuvres;

	public Auteur() {
		
	}
	
	public Auteur(int id, String nom, String prenom, String nomUsage, String prenomUsage, String preposition) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nomUsage = nomUsage;
		this.prenomUsage = prenomUsage;
		this.preposition = preposition;
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
	
	public List<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(List<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}

}
