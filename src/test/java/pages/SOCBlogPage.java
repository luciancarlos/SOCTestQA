package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.luciancarlos.support.Web;

public class SOCBlogPage extends Web{	
	
	public SOCBlogPage(WebDriver driver) {
		createChrome();
	}
	
	public SOCBlogPage acessarBlog() {
		driver.get("https://www.soc.com.br/blog/");
		return this;
	}

	public SOCBlogPage clicarAceitarCookies() {
		driver.findElement(By.xpath("//div/section[3]/div//a")).click();
		return this;
	}

	public SOCBlogPage preencherCampoDePesquisa(String busca) {
		driver.findElement(By.xpath("//div/section//div/section//div//input")).sendKeys(busca);
		return this;
	}

	public SOCBlogPage realizarBuscaBlog(String busca) {
		driver.findElement(By.xpath("//div/section//div/section//div//button")).sendKeys(busca);
		return this;
	}

	public String obterResultadoPesquisa() {
		String resultadoBusca = driver.findElement(By.xpath("//div/section//div/section//div//h2")).getText();
		return resultadoBusca;
	}

	public void tearDown() {
		driver.quit();
	}
}
