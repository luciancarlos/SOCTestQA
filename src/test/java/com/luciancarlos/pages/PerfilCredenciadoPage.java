package com.luciancarlos.pages;

public class PerfilCredenciadoPage extends BasePage {
	
	public String exibirPerfil() {
		return driver.getCurrentUrl();
	}
}
