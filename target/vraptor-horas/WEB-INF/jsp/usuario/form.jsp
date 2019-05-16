<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="tag"%>
<c:import url="/WEB-INF/jsp/header.jsp"></c:import>

<form action="${linkTo[UsuarioController].add(null) }" method="POST">

		<label for="nome">Nome: </label>
		<input type="text" name ="user.nome" id="nome" class="form-control" value="${user.nome}">
		<tag:validationMessage name="user.nome"/>
 		
		<label for="email">E-mail: </label>
		<input type="text" name ="user.email" id="email" class="form-control" value="${user.email}">
		<tag:validationMessage name="user.email"/>
		
		<label for="login">Login: </label>
		<input type="text" name ="user.login" id="login" class="form-control" value="${user.login}">
		<tag:validationMessage name="user.login"/>
		
		<label for="senha">Senha: </label>
		<input type="password" name ="user.senha" id="senha" class="form-control">
		<tag:validationMessage name="user.senha"/>
	
		<input type="submit" value="Cadastrar" class="btn">	

</form>


<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>
