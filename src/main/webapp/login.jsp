<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Sistema Login</title>
    <script type="text/javascript">
        function validarLogin() {
            // Verificar se o usu�rio n�o foi informado
            if (document.formLogin.txtUsuario.value == "") {
                alert("Usu�rio n�o informado");
                return false;
            }

            // Verificar se a senha n�o foi informada
            if (document.formLogin.txtSenha.value == "") {
                alert("Senha n�o informada");
                return false;
            }

            // Se tudo estiver ok, submete o formul�rio
            document.formLogin.submit();
        }
    </script>
    <style>
        /* Estilo para centralizar o formul�rio na p�gina */
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        table {
            border-collapse: collapse;
            margin: 20px;
            padding: 10px;
        }
        td {
            padding: 10px;
        }
        input[type="text"], input[type="password"] {
            width: 200px;
            padding: 5px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <form action="Login" method="post" name="formLogin">
        <table>
            <tr>
                <td>Usu�rio:</td>
                <td><input type="text" name="txtUsuario" /></td>
            </tr>
            <tr>
                <td>Senha:</td>
                <td><input type="password" name="txtSenha" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Logar" onclick="return validarLogin();" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
