#language : pt
#encoding : UTF-8

Funcionalidade: Realizar busca no blog da SOC
  Como um usuario
  Eu quero realizar uma busca no blog da SOC
  Para que eu possa encontrar os dados pesquisados
	
@buscaBlog
Cenario: Deve realizar uma busca no blog da SOC
	Dado que o usuario acesse o blog da SOC
  E aceitar cookies
  E preencher o campo de Pesquisa do blog
  Quando clicar no botão Pesquisar
  Então o resultado sera exibido
