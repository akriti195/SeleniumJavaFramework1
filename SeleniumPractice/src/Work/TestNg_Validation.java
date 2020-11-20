package Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Validation {
	
@BeforeTest()
//open the browser
	public void beforeTest() {
	System.out.println("beforeTest");	
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8080/login.do");
	driver.manage().window().maximize();
	}
	
@AfterTest()
//close the browser
public void afterTest() {
System.out.println("afterTest");
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://localhost:8080/login.do");
driver.manage().window().maximize();
driver.close();
}
	@Test
	public void testA() {
		System.out.println("I am in testA");
		String expectedValue="A";
		String ActualValue="B";
		//Assert.assertEquals(expectedValue, ActualValue);
		//Assert.assertTrue(10>6, "Error message");
		//Assert.fail("Some error");
	}

}
