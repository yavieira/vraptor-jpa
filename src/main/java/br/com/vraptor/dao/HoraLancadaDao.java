package br.com.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.vraptor.model.Horas;

public class HoraLancadaDao {

	private EntityManager em;

	@Inject
	public HoraLancadaDao(EntityManager em ) {
		this.em = em;
	}
	
	public HoraLancadaDao() {
		
	}
	
	public List<Horas> lista() {
		String jpql = "select h from Horas h";		
		TypedQuery<Horas> query =  em.createQuery(jpql, Horas.class);
		return query.getResultList();
	}

	
	public void add(Horas horas) {
		em.getTransaction().begin();
		em.persist(horas);
		em.getTransaction().commit();
	}
}