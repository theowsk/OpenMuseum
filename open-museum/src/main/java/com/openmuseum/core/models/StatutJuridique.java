package com.openmuseum.core.models;

public class StatutJuridique {
	
	private String proprietaire;
	private String identiteJuridique;
	private Boolean proprietePrivee;
	private Boolean don;
	
	public StatutJuridique() {
		
	}

	public StatutJuridique(String proprietaire, String identiteJuridique, Boolean proprietePrivee, Boolean don) {
		this.proprietaire = proprietaire;
		this.identiteJuridique = identiteJuridique;
		this.proprietePrivee = proprietePrivee;
		this.don = don;
	}

	public String getProprietaire() {
		return proprietaire;
	}
	
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public String getIdentiteJuridique() {
		return identiteJuridique;
	}
	
	public void setIdentiteJuridique(String identiteJuridique) {
		this.identiteJuridique = identiteJuridique;
	}
	
	public Boolean getProprietePrivee() {
		return proprietePrivee;
	}
	
	public void setProprietePrivee(Boolean proprietePrivee) {
		this.proprietePrivee = proprietePrivee;
	}
	
	public Boolean getDon() {
		return don;
	}
	
	public void setDon(Boolean don) {
		this.don = don;
	}

}
