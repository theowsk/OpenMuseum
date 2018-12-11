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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
	
	//Déclaration des tables d'associations et des différentes jointures à réaliser
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "Oeuvre_Domaine",
            joinColumns = { @JoinColumn(name = "idOeuvre") },
            inverseJoinColumns = { @JoinColumn(name = "idDomaine") })
    private Set<Domaine> domaines = new HashSet<>();
	
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "Oeuvre_Auteur",
            joinColumns = { @JoinColumn(name = "idOeuvre") },
            inverseJoinColumns = { @JoinColumn(name = "idAuteur") })
    private Set<Auteur> auteurs = new HashSet<>();
	
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "Oeuvre_Epoque",
            joinColumns = { @JoinColumn(name = "idOeuvre") },
            inverseJoinColumns = { @JoinColumn(name = "idEpoque") })
    private Set<Epoque> epoques = new HashSet<>();
	
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "Oeuvre_Musee",
            joinColumns = { @JoinColumn(name = "idOeuvre") },
            inverseJoinColumns = { @JoinColumn(name = "idMusee") })
    private Set<Musee> localisations = new HashSet<>();
	
	
	public Oeuvre() {

	}

	public Oeuvre(int id, String denomination, String titre, String periodeCrea, String materiaux, String dimensions,
			String decouverte, String reference, String numInventaire, Set<Domaine> domaines, Set<Auteur> auteurs, Set<Epoque> epoques,
			Set<Musee> localisations) {
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
		this.domaines = domaines;
		this.auteurs = auteurs;
		this.epoques = epoques;
		this.localisations = localisations;
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
	
	public Set<Domaine> getDomaine() {
		return domaines;
	}
	
	public void setDomaine(Set<Domaine> domaines) {
		this.domaines = domaines;
	}
	
	public Set<Auteur> getAuteur() {
		return auteurs;
	}
	
	public void setAuteur(Set<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	
	public Set<Epoque> getEpoque() {
		return epoques;
	}
	
	public void setEpoque(Set<Epoque> epoques) {
		this.epoques = epoques;
	}
	
	public Set<Musee> getLocalisation() {
		return localisations;
	}
	
	public void setLocalisation(Set<Musee> localisations) {
		this.localisations = localisations;
	}

	public String getNumInventaire() {
		return numInventaire;
	}

	public void setNumInventaire(String numInventaire) {
		this.numInventaire = numInventaire;
	}
	
}
