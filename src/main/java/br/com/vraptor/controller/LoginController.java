package br.com.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.vraptor.dao.UsuarioDao;
import br.com.vraptor.model.Usuario;
import br.com.vraptor.security.UsuarioLogado;

@Controller
public class LoginController {

	private UsuarioDao dao;
	private UsuarioLogado userLogado;
	private Result result;
	private Validator validator;

	public LoginController(UsuarioDao dao, UsuarioLogado userLogado, Result result, Validator validator) {
		this.dao = dao;
		this.userLogado = userLogado;
		this.result = result;
		this.validator = validator;
	}
	
	public void form() {
		
	}
	
	public void autentica(String login, String senha) {
		Usuario user = dao.find(login, senha);
		if(user != null) {
			userLogado.login(user);
			result.redirectTo(UsuarioController.class).lista();
		} else {
			validator.add(new SimpleMessage("loginInvalido",
					"Login ou Senha incorretos"));
			validator.onErrorRedirectTo(this).form();
		}
	}
	
	public void logout() {
		userLogado.logout();
		result.redirectTo(this).form();
	}
}
