package Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QA_Kreatio_Site {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://qa.kreatio.site/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//i[@class='search-icon fa fa-search']"));
        search.click();
        WebElement searchOption = driver.findElement(By.xpath("//input[@name='query']"));
        searchOption.sendKeys("test");
        driver.findElement(By.xpath("//button[text()='Search']")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        for(int i=1;i<10;i++) {
        	js.executeScript("window.scrollBy(0,1000)");
        	Thread.sleep(3000);
        }
        for(int i=1;i<10;i++) {
        	js.executeScript("window.scrollBy(0,-1000)");
        	Thread.sleep(3000);
        }
		driver.close();

	}

}
