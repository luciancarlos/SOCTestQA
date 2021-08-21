package com.luciancarlos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.luciancarlos.support.Web;

public class BasePage extends Web {

	public void escrever(String xpath, String texto) {
		driver.findElement(By.xpath(xpath)).sendKeys(texto);
	}

	public void clicarBotao(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public String obterResultado(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public void moverMouseParaElemento(String xpath) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		actions.moveToElement(element).click();
		actions.perform();
	}
}
