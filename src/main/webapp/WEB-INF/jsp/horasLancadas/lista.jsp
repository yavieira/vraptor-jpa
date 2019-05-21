<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp"/>

<a href="${link[HorasLancadasController].form()}">Cadastrar hora</a>
<table class="table table-hover">
    <thead>
        <tr>
            <th>Id</th>
            <th>Data</th>
            <th>Hora Entrada</th>
            <th>Hora Sa�da</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach items="${horas}" var="h">
            <tr>
                <td>${h.id}</td>
                <td>${h.data.time}</td>
                <td>${h.horaEntrada}</td>
                <td>${h.horaSaida}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<c:import url="/WEB-INF/jsp/footer.jsp"/>