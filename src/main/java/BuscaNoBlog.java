import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscaNoBlog {
	WebDriver driver = new ChromeDriver();		
	
	@Before
	public void inicializar() {		
		driver.get("https://ww2.soc.com.br/blog/");				
	}
	
	@Test
	public void teste() {
		WebElement elemento = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-0d410f5 elementor-search-form--skin-classic elementor-search-form--button-type-icon elementor-search-form--icon-search exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-search-form']//input[@placeholder='Procurar']"));
		//Digitar "alguma coisa"
		String busca = "alguma coisa";
		elemento.sendKeys(busca);
				
		//clicar no botao "elementor-search-form__submit"
		driver.findElement(By.className("elementor-search-form__submit")).click();
		
		//String resultadoBusca = driver.findElement(By.xpath("//h2[normalize-space()='Search Results for: alguma coisa']")).getText();
		String resultadoBusca = driver.findElement(By.xpath("//div/h2[contains(text(),busca)]")).getText();
		//String textoInserido = driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div/div/div/div/div/section/div/div/div/div/div/div[2]/div/h2")).getText();		
		
		System.out.println("Busca foi: " + busca);
		System.out.println("Resultado do site foi : " + resultadoBusca);

		//Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Search Results for: alguma coisa']")).getText().contains(busca));
		Assert.assertTrue(resultadoBusca.contains(busca));
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}
}
