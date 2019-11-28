import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OlxTestingDojo {

	// Definimos que o driver é da classe e todo método pode usá-lo.
	private static WebDriver driver; 

	// Tudo isso acontece antes do teste.
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception 
	{
		// Carregamos o driver (obs: configurar de acordo com o local do driver baixado)
		System.setProperty("webdriver.chrome.driver", "/home/pedro/eclipse/browser_drivers/chromedriver_78");

		// Definimos o tipo do browser *Chrome - Firefox - IE - Etc.
		driver = new ChromeDriver(); 

		// Abrimos o browser e navegamos para a URL escolhida.
		driver.get("https://conta.olx.com.br/"); 
	}

	// Isso acontece após o teste
	@AfterClass 
	public static void tearDownAfterClass() throws Exception 
	{
		// Após o teste é necessário fechar o navegador
		driver.quit(); 
	}

	// O teste propriamente dito
	@Test 
	public void testLogin() throws InterruptedException 
	{
		WebDriverWait waitHelper = new WebDriverWait(driver, 10);

		WebElement emailInput = driver.findElement(By.cssSelector("input[type=email]"));
		waitHelper.until(ExpectedConditions.elementToBeClickable(emailInput));
		emailInput.sendKeys("email");

		WebElement passwordInput = driver.findElement(By.cssSelector("input[type=password]"));
		waitHelper.until(ExpectedConditions.elementToBeClickable(passwordInput));

		passwordInput.sendKeys("senha");

		WebElement submitBtn = driver.findElement(By.cssSelector(".sc-dnqmqq.eUKrOH"));

		submitBtn.click();

		waitHelper.until(ExpectedConditions.elementToBeClickable(By.linkText("Anunciar")));

		driver.findElement(By.linkText("Anunciar")).click();

		waitHelper.until(ExpectedConditions.elementToBeClickable(By.id("input_subject")));

		WebElement titulo = driver.findElement(By.id("input_subject"));
		titulo.sendKeys("All star usado tam 42");

		WebElement descricao = driver.findElement(By.id("input_body"));
		waitHelper.until(ExpectedConditions.elementToBeClickable(descricao));
		descricao.sendKeys("All star \nusado tam 42");

		WebElement modaEBelezaLink = driver.findElement(By.id("category_item-8000"));
		waitHelper.until(ExpectedConditions.elementToBeClickable(modaEBelezaLink));
		modaEBelezaLink.click();

		WebElement roupasECalcadosLink = driver.findElement(By.id("category_item-8040"));
		waitHelper.until(ExpectedConditions.elementToBeClickable(roupasECalcadosLink));
		roupasECalcadosLink.click();

		Thread.sleep(5000);
	}
}

