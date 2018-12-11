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


@Entity
public class Denomination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDenomination", unique=true, nullable=false)
	private int id;
	
	@Column(name="lib", unique=false, nullable=false, length=60)
	private String lib;
	
	//Déclaration des tables d'associations et des différentes jointures à réaliser
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "denominations")
    private Set<Oeuvre> oeuvres = new HashSet<>();

	public Denomination() {
		
	}
	
	public Denomination(int id, String libelle, Set<Oeuvre> oeuvres) {
		this.id = id;
		this.lib = libelle;
		this.oeuvres = oeuvres;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}
	
	public Set<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(Set<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}
	
}
