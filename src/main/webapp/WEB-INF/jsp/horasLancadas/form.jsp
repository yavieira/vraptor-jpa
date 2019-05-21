<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="tag" %>

<c:import url="/WEB-INF/jsp/header.jsp"/>

<form action="${linkTo[HorasLancadasController].add(null)}" method="post">
    <label for="data">Data:</label>
    <input type="text" name="horaLancada.data" id="data" class="form-control"/>
    <alura:validationMessage name="horaLancada.data"/>

    <label for="horaInicial">Hora Entrada:</label>
    <input type="text" name="horaLancada.horaEntrada" id="horaEntrada" class="form-control"/>
    <alura:validationMessage name="horaLancada.horaEntrada"/>

    <label for="horaFinal">Hora Saída:</label>
    <input type="text" name="horaLancada.horaSaida" id="horaSaida" class="form-control"/>
    <alura:validationMessage name="horaLancada.horaSaida"/>

    <label for="comentario">Comentário</label>
    <textarea name="horaLancada.comentario" id="comentario" class="form-control"></textarea>

    <input type="submit" value="Cadastrar" />
</form>
<c:import url="/WEB-INF/jsp/footer.jsp"/>