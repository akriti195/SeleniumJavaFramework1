package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeLoginPage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
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

	}

}
