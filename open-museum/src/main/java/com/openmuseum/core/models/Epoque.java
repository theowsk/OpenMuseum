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
public class Epoque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEpoque", unique=true, nullable=false)
	private int id;
	
	@Column(name="libelle", unique=false, nullable=false, length=255)
	private String libelle;
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="epoque", fetch=FetchType.LAZY)
	private List<Oeuvre> oeuvres;
	
	public Epoque() {
		
	}
	
	public Epoque(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
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

	public List<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(List<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}
	

}
