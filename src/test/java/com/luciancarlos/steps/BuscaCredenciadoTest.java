package com.luciancarlos.steps;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.luciancarlos.support.Web;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.SOCSitePage;

public class BuscaCredenciadoTest {
	private WebDriver driver;	
	private SOCSitePage page;
	private String busca;
	private String filtro = "Estacionamento";	
	
	@Before
	public void setUp() {
		//driver = Web.createChrome();
	}
	
	@Dado("que o usuario acesse o site da SOC")
	public void queOUsuarioAcesseOSiteDaSOC() {
		page = new SOCSitePage(driver);
		page.queOUsuarioAcesseOSiteDaSOC();
	}

	@Quando("clicar no botao Buscar credenciado")
	public void clicarNoBotaoBuscarCredenciado() {
		page.buscarCredenciado();
	}	

	@Quando("preencher filtros de pesquisa")
	public void preencherFiltrosDePesquisa() {
		page.preencherFiltro(filtro );
	}	

	@Quando("clicar no botão Saiba mais")
	public void clicarNoBotãoSaibaMais() {
		page.clicarSaibaMais(); //Provisorio
	}	

	@Então("exibe o perfil do Credenciado")
	public void exibeOPerfilDoCredenciado() {
		//Assert aqui
	}	

}

