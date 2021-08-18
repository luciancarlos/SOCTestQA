package com.luciancarlos.support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver driver;

	public WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		return driver;
	}
}
