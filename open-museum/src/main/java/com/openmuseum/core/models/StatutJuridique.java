package com.openmuseum.core.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StatutJuridique {
	
	@Id
	@Column(name="idOeuvreStatut", unique=true, nullable=false)
	// FK
	private int idOeuvre;
	
	@Column(name="proprietaire", unique=false, nullable=true)
	private String proprietaire;
	
	@Column(name="identiteJuridique", unique=false, nullable=false)
	private String identiteJuridique;
	
	@Column(name="proprietePrivee", unique=false, nullable=false)
	private Boolean proprietePrivee;
	
	@Column(name="don", unique=false, nullable=true)
	private Boolean don;
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="statutJuridique", fetch=FetchType.LAZY)
	private List<Oeuvre> oeuvres;
	
	public StatutJuridique() {
		
	}

	public StatutJuridique(int idOeuvre, String proprietaire, String identiteJuridique, Boolean proprietePrivee, Boolean don) {
		this.idOeuvre= idOeuvre;
		this.proprietaire = proprietaire;
		this.identiteJuridique = identiteJuridique;
		this.proprietePrivee = proprietePrivee;
		this.don = don;
	}

	public int getIdOeuvre() {
		return idOeuvre;
	}

	public void setIdOeuvre(int idOeuvre) {
		this.idOeuvre = idOeuvre;
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

	public List<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(List<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}

}
