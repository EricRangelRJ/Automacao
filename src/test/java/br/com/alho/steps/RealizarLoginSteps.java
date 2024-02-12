package br.com.alho.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class RealizarLoginSteps {

	private WebDriver driver;

	@Dado("Acessar a página de autenticação de usuário")
	public void acessarAPáginaDeAutenticaçãoDeUsuário() {

		System.setProperty("webdriver.gecko.driver", "C:\\0work\\Ferramentas\\Automação\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("http://localhost:4200");

	}

	@Dado("Informar o email de acesso {string}")
	public void informarOEmailDeAcesso(String email) {

		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(email);
	}

	@Dado("Informar a senha de acesso {string}")
	public void informarASenhaDeAcesso(String senha) {
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(senha);
	}

	@Quando("Solicitar o acesso ao sistema")
	public void solicitarOAcessoAoSistema() {
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/button/span[2]")).click();
	}

	@Então("Sistema autentica o usuário com sucesso")
	public void sistemaAutenticaOUsuárioComSucesso() {

		WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-nav/mat-drawer-container/mat-drawer-content/div/app-header/div/h1"));
		Assert.assertEquals("Sistema de Controle Comercial",element.getText());
		driver.quit();
	}

	@Então("Sistema não autentica usuário")
	public void sistemaNãoAutenticaUsuário() {

		WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[2]/a"));
		Assert.assertEquals("Criar conta", element.getText());
		driver.quit();

	}

}
