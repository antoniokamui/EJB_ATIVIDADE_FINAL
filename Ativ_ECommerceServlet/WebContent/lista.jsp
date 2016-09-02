<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista Comentarios</h1>

		<table border="1" align="center" style="text-align: center">
			<tr style="font-weight: bold;">
				<td>
					Data
				</td>
				<td>
					Titulo
				</td>
				<td>
					Assunto
				</td>
				<td>
					Comentario
				</td>
				<td>
					Avaliação
				</td>
			</tr>
		<c:forEach var="li" items="${lista}">
			<tr>
				<td>
					<fmt:formatDate  type="date" dateStyle="short" value="${li.data.time}"/>
					
				</td>
				<td>
					${li.titulo}
				</td>
				<td>
					${li.assunto}
				</td>
				<td>
					${li.comentario}
				</td>
				<td>
					${li.avaliacao}
				</td>
			</tr>
		</c:forEach>
		</table>

</body>
</html>
