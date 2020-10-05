package Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Signup_page {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
        driver.switchTo().alert();
        Thread.sleep(3000);
        driver.findElement(By.id("u_4_b")).sendKeys("Ram Mani");
        Thread.sleep(3000);
        driver.findElement(By.id("u_4_d")).sendKeys("Rai");
        Thread.sleep(3000);
        driver.findElement(By.id("u_4_g")).sendKeys("9140621650");
        Thread.sleep(3000);
        driver.findElement(By.id("password_step_input")).sendKeys("A@m2511o87");
        Thread.sleep(3000);
        WebElement day = driver.findElement(By.id("day"));
        Select s= new Select(day);
        s.selectByIndex(5);
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.id("month"));
        Select s1= new Select(month);
        s1.selectByVisibleText("Oct");
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.id("year"));
        Select s2= new Select(year);
        s2.selectByValue("2020");
        driver.quit();
	}

}
