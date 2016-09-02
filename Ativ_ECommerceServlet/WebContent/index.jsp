<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Ativ_ECommerceServlet" method="post">
		<input name="data" type="date" placeholder="Data"/><br/><br/>
		<input name="titulo" type="text" placeholder="Titulo"/><br/><br/>
		<input name="assunto" type="text" placeholder="Assunto"/><br/><br/>
		<input name="comentario" type="text" placeholder="Comentario"/><br/><br/>
		<input name="avaliacao" type="number" placeholder="Avaliação"/><br/><br/>
		<input type="submit" value="Salva"></input><br/><br/>
		<input type="reset" value="Limpar"></input>	
	</form>
</body>
</html>