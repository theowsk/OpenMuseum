package com.openmuseum.core.services.dao;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import com.openmuseum.core.models.Auteur;

public interface AuteurDao {
	
	public Auteur findById(int auteurId);
	
	public List<Auteur> findAll();
	
	public void save(Auteur auteur) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
}
