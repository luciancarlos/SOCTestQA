package com.luciancarlos.steps;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.luciancarlos.support.Screenshot;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.SOCBlogPage;

public class BuscaBlogTest {
	private WebDriver driver;
	private SOCBlogPage page;	
	private String busca = "alguma coisa";
	private String screenshotArquivo = "target/Screenshots/" +  System.currentTimeMillis() + ".png";

	@Before
	@Dado("que o usuario acesse o blog da SOC")
	public void queOUsuarioAcesseOBlogDaSOC() {
		page = new SOCBlogPage(driver);
		page.acessarBlog();
	}

	@Dado("clica no botão Aceitar cookies")
	public void clicaNoBotãoAceitarCookies() {
		page.clicarAceitarCookies();
	}

	@Quando("preencher campo de pesquisa")
	public void preencherCampoDePesquisa() {
		page.preencherCampoDePesquisa(busca);
	}

	@Quando("clicar no botão Pesquisar")
	public void clicarNoBotãoPesquisar() {
		page.realizarBuscaBlog(busca);
	}

	@Então("o resultado da pesquisa será exibido")
	public void oResultadoDaPesquisaSeráExibido() {
		assertTrue(page.obterResultadoPesquisa().contains(busca));
		Screenshot.tirarPrint(page.driver, screenshotArquivo);
		page.tearDown();
	}
	
}

/*
 * @Test public void realizarPesquisaBlog() {
 * driver.get("https://www.soc.com.br/blog/"); busca = "outra coisa";
 * page.clicarAceitarCookies(); page.preencherCampoDePesquisa(busca);
 * page.realizarBuscaBlog(busca); resultado = page.obterResultadoPesquisa();
 * Assert.assertTrue(resultado.contains(busca)); Screenshot.tirarPrint(driver,
 * screenshotArquivo ); }
 */