package com.luciancarlos.steps;

import static org.junit.Assert.assertTrue;

import com.luciancarlos.pages.SOCBlogPage;
import com.luciancarlos.support.Screenshot;
import com.luciancarlos.support.Web;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BuscaBlogTest {
	
	private SOCBlogPage blogPage = new SOCBlogPage();
	private String busca = "covid";
	private String localArquivo = "target/Screenshots/";

	@Dado("que o usuario acesse o blog da SOC")
	public void queOUsuarioAcesseOBlogDaSOC() {
		blogPage.abrirNavegador();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Dado("aceitar cookies")
	public void aceitarCookies() {
		blogPage.aceitarCookies();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Dado("preencher o campo de Pesquisa do blog")
	public void preencherOCampoDePesquisaDoBlog() {
		blogPage.preencherPesquisa(busca);
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Quando("clicar no botão Pesquisar")
	public void clicarNoBotãoPesquisar() {
		blogPage.clicarPesquisar();
	}

	@Então("o resultado sera exibido")
	public void oResultadoSeraExibido() {
		assertTrue(blogPage.obterResultado().contains(busca));
		Screenshot.tirarPrint(Web.driver, localArquivo);
		Web.fecharNavegador();
	}
}