package com.luciancarlos.pages;

import org.openqa.selenium.By;

public class PerfilCredenciadoPage extends BasePage {
	String nomeCredenciado = driver.findElement(By.xpath("//*[@id='div-header-perfil']//span[@class='truncate detalhe-nome']")).getText();

	public String exibirPerfil() {
		return nomeCredenciado;
	}
}
