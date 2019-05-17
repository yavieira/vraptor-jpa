package br.com.vraptor.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.vraptor.model.Usuario;

@RequestScoped
public class UsuarioDao {

	private EntityManager em;

	@Inject
	public UsuarioDao(EntityManager em) {
		this.em = em;
	}

	public UsuarioDao() {

	}

	public void add(Usuario user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}

	public List<Usuario> lista() {
		TypedQuery<Usuario> query = em.createQuery("select u from Usuario u", Usuario.class);
		return query.getResultList();
	}

	public Usuario find(String login, String senha) {
		TypedQuery<Usuario> query = em.createQuery("select u from Usuario u"
				+ "where u.login = :login and u.c= :senha", Usuario.class);
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		return query.getSingleResult();
	}

}
