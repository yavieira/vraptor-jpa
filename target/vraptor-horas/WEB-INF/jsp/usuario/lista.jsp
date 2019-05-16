<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/header.jsp"></c:import>

<a href="${linkTo[UsuarioController].form()}">Novo Usuário</a>

<table class="table table-hover">
	<thead>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Email</th>
			<th>Login</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach items="${users}" var=user>
			<tr>
				<td>${user.id}</td>
				<td>${user.nome}</td>
				<td>${user.email}</td>
				<td>${user.login}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>








<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>
