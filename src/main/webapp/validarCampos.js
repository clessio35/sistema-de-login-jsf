 function validarLogin() {
            // Verificar se o usuário não foi informado
            if (document.formLogin.txtUsuario.value == "") {
                alert("Usuário não informado");
                return false;
            }

            // Verificar se a senha não foi informada
            if (document.formLogin.txtSenha.value == "") {
                alert("Senha não informada");
                return false;
            }

            // Se tudo estiver ok, submete o formulário
            document.formLogin.submit();
        }