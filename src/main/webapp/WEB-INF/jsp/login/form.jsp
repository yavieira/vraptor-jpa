<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="tag"%>

<c:import url="/WEB-INF/jsp/header.jsp"></c:import>

<form action="${linkTo[LoginController].autentica(null, null)}" method = "post">

		<tag:validationMessage name="loginInvalido"></tag:validationMessage>

		<label for="login">Login: </label>
		<input type="text" name ="login" id="login" class="form-control" value="${user.login}">

		<label for="senha">Senha: </label>
		<input type="password" name ="senha" id="senha" class="form-control" value="${user.senha}">

		<input type="submit" value="Autenticar" class="btn">

</form>




<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>
