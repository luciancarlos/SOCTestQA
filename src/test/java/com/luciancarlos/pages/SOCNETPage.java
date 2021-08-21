package com.luciancarlos.pages;

public class SOCNETPage extends BasePage {
	public static final String BOTAO_BUSCAR_CREDENCIADOS = "//span[.='Buscar credenciados']";

	public RedeCredenciadaPage clicarBotaoBuscarCredenciados() {
		clicarBotao(BOTAO_BUSCAR_CREDENCIADOS);
		return new RedeCredenciadaPage();
	}
}
