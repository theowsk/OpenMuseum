package com.openmuseum.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Denomination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDenomination", unique=true, nullable=false)
	private int id;
	
	@Column(name="lib", unique=false, nullable=false, length=60)
	private String lib;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}
	
}
