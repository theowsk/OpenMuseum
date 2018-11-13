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
	
	@Column(name="decoupage", unique=false, nullable=true, length=20)
	private String decoupage;
	
	@Column(name="siecle", unique=false, nullable=false, length=20)
	private String siecle;
	
	@Column(name="libelle", unique=false, nullable=false, length=350)
	private String libelle;
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="epoque", fetch=FetchType.LAZY)
	private List<Oeuvre> oeuvres;
	
	public Epoque() {
		
	}
	
	public Epoque(int id, String decoupage, String siecle, String libelle) {
		this.id = id;
		this.decoupage = decoupage;
		this.siecle = siecle;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDecoupage() {
		return decoupage;
	}
	
	public void setDecoupage(String decoupage) {
		this.decoupage = decoupage;
	}
	
	public String getSiecle() {
		return siecle;
	}
	
	public void setSiecle(String siecle) {
		this.siecle = siecle;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	// setLibelle(String decoupage, String siecle) avec append ?
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
