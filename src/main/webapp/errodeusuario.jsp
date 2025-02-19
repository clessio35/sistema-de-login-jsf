<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro de Login</title>
</head>
<body>
	<div align="center">
		<div id="cabeçalho"></div>
		<div id="corpo">
			<hr />
			Error:
			<%= exception.getMessage() %> <!-- Mensagem da exceção -->
			<br /> Excessão ocorrida:
			<%= exception.getClass() %> <!-- Classe da exceção -->
			<br />
			<hr />
			<a href="login.jsp">Tentar Novamente</a>
		</div>
		<div id="rodape"></div>
	</div>
</body>
</html>
