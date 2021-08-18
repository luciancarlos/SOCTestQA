# language : pt
#encoding : UTF-8

Funcionalidade: Realizar busca no site da SOC
  Como um usuario
  Eu quero realizar uma busca no site da SOC
  Para que eu possa encontrar os dados pesquisados

	@credenciado  
	Cenario: Deve realizar uma busca no site da SOC
    Dado que o usuario acesse o site da SOC
    E clica no botão Aceitar cookies
    Quando clicar no botao Buscar credenciado
    E preencher filtros de pesquisa
    E preencher campo de pesquisa
    E clicar no botão Pesquisar
    Quando clicar no botão Saiba mais
    Então exibe o perfil do Credenciado