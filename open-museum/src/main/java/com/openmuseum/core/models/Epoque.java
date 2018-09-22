package com.openmuseum.core.models;

public class Epoque {
	
	private String decoupage;
	private String siecle;
	private String libelle;
	
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
	
	

}
