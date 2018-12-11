package com.openmuseum.core.models;

import java.util.Date;
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

@Entity
public class Domaine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDomaine", unique=true, nullable=false)
	private int id;
	
	@Column(name="libelle", unique=false, nullable=false, length=350)
	private String libelle;
	
	@Column(name="estimatedDateDebut", unique=false, nullable=true)
	private Date estDebDate;
	
	@Column(name="estimatedDateFin", unique=false, nullable=true)
	private Date estEndDate;
	
	
	//Déclaration des tables d'associations et des différentes jointures à réaliser
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "domaines")
    private Set<Oeuvre> oeuvres = new HashSet<>();
	
	public Domaine() {
		
	}
	
	public Domaine(int id, String libelle, Date estDebDate, Date estEndDate, Set<Oeuvre> oeuvres) {
		this.id = id;
		this.libelle = libelle;
		this.estDebDate = estDebDate;
		this.estEndDate = estEndDate;
		this.oeuvres = oeuvres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getEstDebDate() {
		return estDebDate;
	}
	public void setEstDebDate(Date estDebDate) {
		this.estDebDate = estDebDate;
	}
	public Date getEstEndDate() {
		return estEndDate;
	}
	public void setEstEndDate(Date estEndDate) {
		this.estEndDate = estEndDate;
	}

	public Set<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(Set<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}
	

}
