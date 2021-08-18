package com.luciancarlos.steps;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.luciancarlos.support.GeradorArquivo;

public class SOCTestSteps { //Nao é mais necessario

	WebDriver driver = new ChromeDriver();
	String resultado;
	String busca = "alguma coisa";
	//BuscaBlogPage page = new BuscaBlogPage(driver);
	String screenshotArquivo = "C:\\PrintsSOCTest\\" + GeradorArquivo.dataHoraParaArquivo()
	+ Thread.currentThread().getStackTrace()[1].getMethodName() + ".png";
	
	@Test
	public void realizarPesquisaBlog() {
		/*
		 * driver.get("https://www.soc.com.br/blog/"); busca = "outra coisa";
		 * page.clicarAceitarCookies(); page.preencherCampoDePesquisa(busca);
		 * page.realizarBuscaBlog(busca); resultado = page.obterResultadoPesquisa();
		 * Assert.assertTrue(resultado.contains(busca)); Screenshot.tirarPrint(driver,
		 * screenshotArquivo);
		 */
	}

}