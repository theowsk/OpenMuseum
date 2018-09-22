package com.openmuseum.core.models;

import java.util.Date;

public class Domaine {
	
	private String libelle;
	private Date estDebDate;
	private Date estEndDate;
	
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
