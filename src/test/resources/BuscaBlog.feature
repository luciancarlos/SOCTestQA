#language : pt
#encoding : UTF-8

Funcionalidade: Realizar busca no blog da SOC
  Como um usuario
  Eu quero realizar uma busca no blog da SOC
  Para que eu possa encontrar os dados pesquisados
	
	@blog
  Cenario: Deve realizar uma busca no blog da SOC
    Dado que o usuario acesse o blog da SOC
    E clica no botão Aceitar cookies
    Quando preencher campo de pesquisa
    E clicar no botão Pesquisar
    Então o resultado da pesquisa será exibido
