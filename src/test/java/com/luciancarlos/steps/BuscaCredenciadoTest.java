package com.luciancarlos.steps;

import static org.junit.Assert.assertEquals;

import com.luciancarlos.pages.PerfilCredenciadoPage;
import com.luciancarlos.pages.RedeCredenciadaPage;
import com.luciancarlos.pages.SOCHomePage;
import com.luciancarlos.pages.SOCNETPage;
import com.luciancarlos.support.Screenshot;
import com.luciancarlos.support.Web;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BuscaCredenciadoTest {
	
	private SOCHomePage homePage = new SOCHomePage();
	private SOCNETPage socnetPage = new SOCNETPage();
	private RedeCredenciadaPage redeCredenciadaPage = new RedeCredenciadaPage();
	private PerfilCredenciadoPage perfilCredenciadoPage = new PerfilCredenciadoPage();
	
	private String busca = "Avenida Dona Ana Costa, 255 - Gonzaga, Santos - SP, Brasil";
	private String localArquivo = "target/Screenshots/";

	@Dado("que o usuario acesse o site da SOC")
	public void queOUsuarioAcesseOSiteDaSOC() {
		homePage.abrirNavegador();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Dado("selecionar campo Funcionalidades")
	public void selecionarCampoFuncionalidades() {
		homePage.selecionarCampoFuncionalidades();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Dado("clicar no campo RedeSOCNet")
	public void clicarNoCampoRedeSOCNet() {
		homePage.selecionarCampoRedeSOCNET();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Quando("clicar no botao BuscarCredenciados")
	public void clicarNoBotaoBuscarCredenciados() {
		socnetPage.clicarBotaoBuscarCredenciados();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Quando("selecionar Filtros")
	public void selecionarFiltros() {
		redeCredenciadaPage.selecionarFiltros();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Quando("preencher o campo de Pesquisa do credenciado")
	public void preencherOCampoDePesquisaDoCredenciado() {
		redeCredenciadaPage.preencherPesquisa(busca);
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Quando("Pesquisar Credenciado")
	public void pesquisarCredenciado() {
		redeCredenciadaPage.clicarPesquisarCredenciado();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Quando("acessar o perfil do credenciado")
	public void acessarOPerfilDoCredenciado() {
		redeCredenciadaPage.selecionarPerfilCredenciado();
		Screenshot.tirarPrint(Web.driver, localArquivo);
	}

	@Então("sera exibido o perfil do credenciado com sucesso")
	public void seraExibidoOPerfilDoCredenciadoComSucesso() {
		String perfil = "https://socnet.soc.com.br/perfil";
		assertEquals(perfil, perfilCredenciadoPage.exibirPerfil());
		Screenshot.tirarPrint(Web.driver, localArquivo);
		Web.fecharNavegador();
	}

}