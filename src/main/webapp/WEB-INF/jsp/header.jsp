<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<title>Sistema de horas</title>

<link href="<c:url value ='/css/bootstrap.css'/>" rel = "stylesheet"/> 
<link href="<c:url value ='/css/site.css'/>" rel = "stylesheet"/> 
</head>
<body>

<nav>
	<ul class = "nav nav-tabs"	>
		<li><a href="${linkTo[IndexController].index()}">Home</a></li>
		<li><a href="${linkTo[UsuarioController].lista()}">Usu�rios</a></li>
			<c:if test="${usuarioLogado.logado}">
				<li><a href="${linkTo[LoginController].logout()}">Logout</a></li>	
			</c:if>
			<c:if test="${!usuarioLogado.logado}">
				<li><a href="${linkTo[LoginController].form()}">Autenticar</a></li>	
			</c:if>			
	</ul>
</nav>
	<div class="container">
	
		<main class ="coL-sm-8">
		
		