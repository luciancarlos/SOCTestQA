package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.luciancarlos.support.Web;

public class SOCSitePage extends Web{
	public WebDriver driver;
	String site = "https://www.soc.com.br/";
	
	public SOCSitePage(WebDriver driver) {
		driver = createChrome();
	}

	public SOCSitePage queOUsuarioAcesseOSiteDaSOC(){
		driver.get("https://www.soc.com.br/");
		return this;
	}
	
	public SOCSitePage clicarAceitarCookies(){
		driver.findElement(By.xpath("//span[contains(text(), 'Aceitar cookies')]")).click();
		return this;
	}

	public SOCSitePage buscarCredenciado() { 
		driver.findElement(By.partialLinkText("Buscar credenciados")).click();
		return this;
	}
	
	public SOCSitePage preencherFiltro(String filtro) {		
		driver.findElement(By.xpath("//div[@id='div-filtro-conveniencias']//section//span[contains(text()," + filtro + ")]")).click();
		return this;
	}
	
	public SOCSitePage clicarSaibaMais() {
		driver.findElement(By.xpath("//div[@id='conteudo-resultados']//section//button[contains(text(),'Saiba mais')]")).click();
		return this;
	}
}
