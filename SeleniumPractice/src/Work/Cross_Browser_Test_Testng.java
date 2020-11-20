package Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Test_Testng {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void firefox(String browser) throws Exception {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
	}
		else {
			throw new Exception("browser is not correct");
		}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testCase() throws Exception {
		Reporter.log("TestCase", true);
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
    WebElement unTB=driver.findElement(By.id("username"));
	unTB.clear();
	unTB.sendKeys("admin");
	WebElement passTB=driver.findElement(By.name("pwd"));
	passTB.clear();
	passTB.sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
	//driver.findElement(By.linkText("Click ActiTIME link")).click();
	Thread.sleep(3000);
	driver.close();	
}}
