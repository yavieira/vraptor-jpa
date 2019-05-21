package br.com.vraptor.security;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.vraptor.controller.LoginController;

@Intercepts
public class AutorizacaoInterceptor {

	private UsuarioLogado userLogado;
	private Result result;
	private ControllerMethod method;

	public AutorizacaoInterceptor() {
	}
	
	@Inject
	public AutorizacaoInterceptor(UsuarioLogado userLogado, Result result, ControllerMethod method) {
		this.userLogado = userLogado;
		this.result = result;
		this.method = method;

	}
	
	@Accepts
	public boolean accept() {
		return !method.containsAnnotation(Open.class);
	}
	
	@AroundCall
	public void intercept(SimpleInterceptorStack stack) {
		if (userLogado.isLogado()) {
			stack.next();
		} else {
			result.redirectTo(LoginController.class).form();
		}
	}

}
