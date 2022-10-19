package selenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teste {

	private WebDriver driver;
	private String baseUrl;
	//private static String driverPath = "/home/marlus.marcos.018/Downloads/chromedriver";

	@Before
	public void setUp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl = "/home/marlus.marcos.018/Downloads/pagina.html";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void testSiteGoogle() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("portal inova");
		driver.findElement(By.name("btnK")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
