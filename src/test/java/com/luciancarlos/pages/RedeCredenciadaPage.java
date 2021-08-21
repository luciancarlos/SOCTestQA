package com.luciancarlos.pages;

import java.util.concurrent.TimeUnit;

public class RedeCredenciadaPage extends BasePage {
	String nomeCredenciado;
	public static final String FILTRO_ESTACIONAMENTO = "//div[@id='div-filtro-conveniencias']//section//span[contains(text(),'Estacionamento')]";
	public static final String FILTRO_LAUDOS_PERICIAIS = "//div[@id='div-filtro-servicos']//span[contains(text(),'Laudos periciais')]";
	public static final String INPUT_BUSCA_CREDENCIADO = "//*[@id='ipt-busca-credenciado-2']";
	public static final String BOTAO_BUSCA_CREDENCIADO = "//*[@id='botao-buscar']";
	public static final String BOTAO_SAIBA_MAIS = "//*[@id='conteudo-resultados']//section//a/button[contains(text(),'Saiba mais')]";
	public static final String DADOS_CREDENCIADO = "(//*[@id='conteudo-resultados']//div/section//p)[1]";
	public static final String BOTAO_BUSCAR_CREDENCIADOS = "//span[.='Buscar credenciados']";
	
	public RedeCredenciadaPage preencherPesquisa(String busca) {
		escrever(INPUT_BUSCA_CREDENCIADO, busca);
		return this;
	}

	public RedeCredenciadaPage selecionarFiltros() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicarBotao(FILTRO_ESTACIONAMENTO);
		clicarBotao(FILTRO_LAUDOS_PERICIAIS);
		return this;
	}

	public RedeCredenciadaPage clicarPesquisarCredenciado() {
		clicarBotao(BOTAO_BUSCA_CREDENCIADO);
		return this;
	}

	public PerfilCredenciadoPage selecionarPerfilCredenciado() {
		//new Actions(driver).doubleClick(driver.findElement(By.xpath("//div[@class='titulo-rede-credenciada']")));
		moverMouseParaElemento(DADOS_CREDENCIADO);
		clicarBotao(BOTAO_SAIBA_MAIS);
		return new PerfilCredenciadoPage();
	}

//	public RedeCredenciadaPage clicarBotaoBuscarCredenciados() {
//		clicarBotao(BOTAO_BUSCAR_CREDENCIADOS);
//		return this;		
//	}

}