package Work;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test4 
{
	@Test
	public void beforeMethod() {
		System.out.println("Before Method");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
        WebElement number = driver.findElement(By.id("number"));
        number.clear();
        number.sendKeys("5");
        driver.findElement(By.id("getFactorial")).click();
	
	

}}
