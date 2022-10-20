package teste2;


import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumteste {

	private WebDriver driver;
	private String baseUrl;
	//private static String driverPath = "/home/marlus.marcos.018/Downloads/chromedriver";

	@Before
	public void setUp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl = "C:\\Users\\marlus.marcos.018\\Downloads\\pagina.html";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void testSiteGoogle() throws Exception {
		driver.get(baseUrl);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
