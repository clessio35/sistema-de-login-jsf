<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro de Login</title>
</head>
<body>
	<div align="center">
		<div id="cabe�alho"></div>
		<div id="corpo">
			<hr />
			Error:
			<%= exception.getMessage() %> <!-- Mensagem da exce��o -->
			<br /> Excess�o ocorrida:
			<%= exception.getClass() %> <!-- Classe da exce��o -->
			<br />
			<hr />
			<a href="login.jsp">Tentar Novamente</a>
		</div>
		<div id="rodape"></div>
	</div>
</body>
</html>
