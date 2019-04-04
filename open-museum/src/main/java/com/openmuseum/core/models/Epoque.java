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
@Table(name = "epoque")
public class Epoque {
	
	@Id
	@GeneratedValue
	@Column(name="idEpoque", unique=true, nullable=false)
	private int id;
	
	@Column(name="libelle", unique=false, nullable=false, length=255)
	private String libelle;

	
	//Déclaration des tables d'associations et des différentes jointures à réaliser
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "epoque")
    private Set<Oeuvre> oeuvres;
	
	

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

	public Set<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(Set<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}
	
}
