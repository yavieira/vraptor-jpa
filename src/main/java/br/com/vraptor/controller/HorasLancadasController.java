package br.com.vraptor.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.vraptor.dao.HoraLancadaDao;
import br.com.vraptor.model.Horas;
import br.com.vraptor.security.UsuarioLogado;

@Controller
public class HorasLancadasController {

	private HoraLancadaDao dao;
	private Validator validator;
	private Result result;
	private UsuarioLogado usuario;

	@Inject
	public HorasLancadasController(HoraLancadaDao dao, Validator validator, Result result, UsuarioLogado usuario) {
		this.dao = dao;
		this.validator = validator;
		this.result = result;
		this.usuario = usuario;
	}
	
	public HorasLancadasController() {
		
	}
	
	public void form() {
		
	}
	
	public void add(@Valid Horas horaLancada) {
		validator.onErrorRedirectTo(this).form();
		horaLancada.setUser(usuario.getUser());
		dao.add(horaLancada);
		result.redirectTo(this).lista();
	}
	
	public void lista() {
		result.include("horas", dao.lista());
	}
}
