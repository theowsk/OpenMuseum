package com.openmuseum.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Oeuvre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idOeuvre", unique=true, nullable=false)
	private int id;
	
	@Column(name="denomination", unique=false, nullable=true, length=150)
	private String denomination;
	
	@Column(name="titre", unique=false, nullable=false, length=300)
	private String titre;
	
	@Column(name="periode_creation", unique=false, nullable=true, length=100)
	private String periodeCrea;
	
	@Column(name="materiaux", unique=false, nullable=true, length=150)
	private String materiaux;
	
	@Column(name="dimensions", unique=false, nullable=true, length=100)
	private String dimensions;
	
	@Column(name="decouverte", unique=false, nullable=true, length=250)
	private String decouverte;
	
	@Column (name="reference", unique=false, nullable=true, length=100)
	private String reference;
	
	@Column(name="num_inventaire", unique=false, nullable=true, length=50)
	private String numInventaire;
	
	@ManyToOne
	@JoinColumn(name="idDomaine")
	private Domaine domaine;
	
	@ManyToOne
	@JoinColumn(name="idAuteur")
	private Auteur auteur;
	
	@ManyToOne
	@JoinColumn(name="idEpoque")
	private Epoque epoque;
	
	@ManyToOne
	@JoinColumn(name="idMusee")
	private Musee localisation;
	
	
	public Oeuvre() {

	}

	public Oeuvre(int id, String denomination, String titre, String periodeCrea, String materiaux, String dimensions,
			String decouverte, String reference, String numInventaire, Domaine domaine, Auteur auteur, Epoque epoque,
			Musee localisation) {
		super();
		this.id = id;
		this.denomination = denomination;
		this.titre = titre;
		this.periodeCrea = periodeCrea;
		this.materiaux = materiaux;
		this.dimensions = dimensions;
		this.decouverte = decouverte;
		this.reference = reference;
		this.numInventaire = numInventaire;
		this.domaine = domaine;
		this.auteur = auteur;
		this.epoque = epoque;
		this.localisation = localisation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNumInventaire() {
		return numInventaire;
	}

	public void setNumInventaire(String numInventaire) {
		this.numInventaire = numInventaire;
	}
	
}
