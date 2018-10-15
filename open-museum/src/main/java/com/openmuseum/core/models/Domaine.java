package com.openmuseum.core.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Domaine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDomaine", unique=true, nullable=false)
	private int id;
	
	@Column(name="libelle", unique=false, nullable=false)
	private String libelle;
	
	@Column(name="estimatedDateDebut", unique=false, nullable=true)
	private Date estDebDate;
	
	@Column(name="estimatedDateFin", unique=false, nullable=true)
	private Date estEndDate;
	
	public Domaine() {
		
	}
	
	public Domaine(int id, String libelle, Date estDebDate, Date estEndDate) {
		this.id = id;
		this.libelle = libelle;
		this.estDebDate = estDebDate;
		this.estEndDate = estEndDate;
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
	
	

}
