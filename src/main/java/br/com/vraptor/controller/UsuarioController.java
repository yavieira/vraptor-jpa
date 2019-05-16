package br.com.vraptor.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.validator.Validator;
import br.com.vraptor.dao.UsuarioDao;
import br.com.vraptor.model.Usuario;

@Controller
public class UsuarioController {

	private UsuarioDao dao;
	private Result result;
	private Validator validator;

	@Inject
	public UsuarioController(UsuarioDao dao, Result result, Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}
	
	public UsuarioController() {}
	
	public void form() {
		
	}
	
	@IncludeParameters
	public void add(@Valid Usuario user) {
		validator.onErrorRedirectTo(this).form();
		dao.add(user);
		result.redirectTo(this).lista();
	}
	
	public void lista() {
		List<Usuario> users = dao.lista();
		result.include("users", users);
	}
}
