package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
        password.sendKeys("manager");
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Login ']")));
		login.click();

	}

}
