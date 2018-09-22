package com.openmuseum.core.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Oeuvre {
	
	private String denomination;
	private String titre;
	// private PeriodeCrea periodeCrea; ?
	private String periodeCrea;
	private String materiaux;
	private String dimensions;
	private String decouverte;
	// reference OR numInventaire ?
	private String reference;
	private Domaine domaine;
	private Auteur auteur;
	private Epoque epoque;
	private Musee localisation;
	private StatutJuridique statutJuridique;
	
	public Oeuvre() {
		super();
	}

	public Oeuvre(String denomination, String titre, String periodeCrea, String materiaux, String dimensions,
			String decouverte, String reference, Domaine domaine, Auteur auteur, Epoque epoque, Musee localisation,
			StatutJuridique statutJuridique) {
		this.denomination = denomination;
		this.titre = titre;
		this.periodeCrea = periodeCrea;
		this.materiaux = materiaux;
		this.dimensions = dimensions;
		this.decouverte = decouverte;
		this.reference = reference;
		this.domaine = domaine;
		this.auteur = auteur;
		this.epoque = epoque;
		this.localisation = localisation;
		this.statutJuridique = statutJuridique;
	}

	public String getDenomination() {
		return denomination;
	}
	
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getPeriodeCrea() {
		return periodeCrea;
	}
	
	public void setPeriodeCrea(String periodeCrea) {
		this.periodeCrea = periodeCrea;
	}
	
	public String getMateriaux() {
		return materiaux;
	}
	
	public void setMateriaux(String materiaux) {
		this.materiaux = materiaux;
	}
	
	public String getDimensions() {
		return dimensions;
	}
	
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	public String getDecouverte() {
		return decouverte;
	}
	
	public void setDecouverte(String decouverte) {
		this.decouverte = decouverte;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public Domaine getDomaine() {
		return domaine;
	}
	
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	
	public Auteur getAuteur() {
		return auteur;
	}
	
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	public Epoque getEpoque() {
		return epoque;
	}
	
	public void setEpoque(Epoque epoque) {
		this.epoque = epoque;
	}
	
	public Musee getLocalisation() {
		return localisation;
	}
	
	public void setLocalisation(Musee localisation) {
		this.localisation = localisation;
	}
	
	public StatutJuridique getStatutJuridique() {
		return statutJuridique;
	}
	
	public void setStatutJuridique(StatutJuridique statutJuridique) {
		this.statutJuridique = statutJuridique;
	}
	
	
	
	
	

}
