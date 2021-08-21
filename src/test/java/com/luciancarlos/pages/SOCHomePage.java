package com.luciancarlos.pages;

public class SOCHomePage extends BasePage {
	public static final String SOC_SITE = "https://www.soc.com.br/";
	public static final String CAMPO_FUNCIONALIDADES = "//ul[@id='menu-1-4350684' ]//a[contains(text(),'Funcionalidades')]";
	public static final String CAMPO_REDE_SOCNET = "//ul[@id='menu-1-4350684']//a[contains(text(),'Rede SOCNET')]";

	public SOCHomePage abrirNavegador() {
		createChrome();
		driver.get(SOC_SITE);
		return this;
	}

	public SOCHomePage selecionarCampoFuncionalidades() {
		clicarBotao(CAMPO_FUNCIONALIDADES);
		return this;
	}

	public SOCNETPage selecionarCampoRedeSOCNET() {
		clicarBotao(CAMPO_REDE_SOCNET);
		return new SOCNETPage();
	}
}