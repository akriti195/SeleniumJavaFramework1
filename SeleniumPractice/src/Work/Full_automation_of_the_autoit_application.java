package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Full_automation_of_the_autoit_application {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
        username.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd")); 
		pwd.clear();
        pwd.sendKeys("manager");
        WebElement keepLoggedIn = driver.findElement(By.id("keepLoggedInLabel"));
        keepLoggedIn.click();
        WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
        login.click();
        Thread.sleep(2000);
        WebElement addRecentTask = driver.findElement(By.xpath("//span[text()='Add Recent Task']"));
        addRecentTask.click();
        WebElement alphaTesting = driver.findElement(By.xpath("//span[text()='Alpha Testing']"));
		Thread.sleep(2000);
        driver.close();

	}

}
