package br.com.vraptor.security;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.vraptor.model.Usuario;
@Named
@SessionScoped
public class UsuarioLogado implements Serializable{

	private static final long serialVersionUID = 1L;

	private Usuario user;
	
	public void login(Usuario user) {
		this.user = user;
	}
	
	public void logout() {
		this.user = null;
	}
	
	public boolean isLogado() {
		return this.user != null;
	}

	public Usuario getUser() {
		return user;
	}
}
