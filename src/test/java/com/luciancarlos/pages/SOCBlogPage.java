package com.luciancarlos.pages;

public class SOCBlogPage extends BasePage {

	public static final String SOC_SITE = "https://www.soc.com.br/blog";
	public static final String ACEITAR_COOKIES = "//span[.='Aceitar cookies']";
	public static final String INPUT_BUSCA_BLOG = "//button[@class='elementor-search-form__submit']/../input";
	public static final String BOTAO_BUSCA_BLOG = "//button[@class='elementor-search-form__submit']";
	public static final String RESULTADO_BUSCA_BLOG = "//h2[contains(text(), 'Search Results for:')]";

	public void abrirNavegador() {
		createChrome();
		driver.get(SOC_SITE);
	}

	public void aceitarCookies() {
		clicarBotao(ACEITAR_COOKIES);
	}

	public void preencherPesquisa(String busca) {
		escrever(INPUT_BUSCA_BLOG, busca);
	}

	public void clicarPesquisar() {
		clicarBotao(BOTAO_BUSCA_BLOG);
	}

	public String obterResultado() {
		return obterResultado(RESULTADO_BUSCA_BLOG);
	}
}