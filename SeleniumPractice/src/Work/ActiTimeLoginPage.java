package Work;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActiTimeLoginPage extends Base {
	
@BeforeTest
public void launchBrowser(){
	Reporter.log("BeforeTest", true);
	driver.get("http://localhost:8080/login.do");
    driver.manage().window().maximize();
}
@Test
public void clickOnLogin() throws Exception {

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
}
@AfterTest
public void closeBrowser() {
	Reporter.log("AfterTest", true);
	driver.close();				  
}}

		

	


