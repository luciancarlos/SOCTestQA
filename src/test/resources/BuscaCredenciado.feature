# language : pt
#encoding : UTF-8

Funcionalidade: Realizar busca no site da SOC
  Como um usuario
  Eu quero realizar uma busca no site da SOC
  Para que eu possa encontrar os dados pesquisados

	@buscaCredenciado 
	Cenario: Deve realizar uma busca no site da SOC
    Dado que o usuario acesse o site da SOC
    E aceitar cookies
    E selecionar campo Funcionalidades
    Quando clicar no campo RedeSOCNet
    Quando clicar no botao BuscarCredenciados
    E selecionar Filtros
    E preencher o campo de Pesquisa do credenciado
    E Pesquisar Credenciado
    Quando acessar o perfil do credenciado
    Então sera exibido o perfil do credenciado com sucesso