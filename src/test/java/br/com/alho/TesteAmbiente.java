package br.com.alho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAmbiente {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chome.driver", "C:\\0work\\Ferramentas\\Automação\\chomedriver\\123\\chomedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\0work\\Ferramentas\\Automação\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.br");
		
	}

}
