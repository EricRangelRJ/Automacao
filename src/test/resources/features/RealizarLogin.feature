# language: pt


Funcionalidade: Realizar Autenticação
como um usuário do sistema
eu quero acessar minha conta
de modo que eu possa utilizar o mesmo

Cenário: Autenticar usuário com sucesso
Dado Acessar a página de autenticação de usuário
E Informar o email de acesso "ericlsrangel@gmail.com"
E Informar a senha de acesso "eric1985"
Quando Solicitar o acesso ao sistema
Então Sistema autentica o usuário com sucesso

Cenário: Falha na autenticação do usuário
Dado Acessar a página de autenticação de usuário
E Informar o email de acesso "emailerrado@gmail.com"
E Informar a senha de acesso "1234"
Quando Solicitar o acesso ao sistema
Então Sistema não autentica usuário

