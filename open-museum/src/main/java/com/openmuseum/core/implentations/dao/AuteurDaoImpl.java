package com.openmuseum.core.implentations.dao;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.openmuseum.core.models.Auteur;
import com.openmuseum.core.services.dao.AuteurDao;

public class AuteurDaoImpl implements AuteurDao {

	private SessionFactory sessionFactory;
	
	public void setSessioNFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public Auteur findById(int auteurId) {
		return null;
		
		/*Session session = this.sessionFactory.openSession();
		//Auteur auteur = (Auteur) session.createQuery("from Auteur a where a.id = :id").setString(auteurId, "id").uniqueResult();
		session.close();
		
		return auteur;*/
	}

	@Override
	public List<Auteur> findAll() {
		return null;
		
		/*Session session = this.sessionFactory.openSession();
		List<Auteur> auteurList = (List<Auteur>)session.createQuery("from Auteur").list();
		session.close();
		
		return auteurList;*/
	}


	@Override
	public void save(Auteur auteur) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		Session session = this.sessionFactory.openSession();
		Transaction tx = (javax.transaction.Transaction) session.beginTransaction();
		
		session.persist(auteur);
		tx.commit();
		session.close();
	}
}
