package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GmailloginandClickonArchieve extends Base
{

	public static void main(String[] args) throws InterruptedException 
	{
		driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        WebElement username=driver.findElement(By.id("identifierId"));
        username.clear();
        username.sendKeys("rai.rammani@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
        
        pwd.clear();
        pwd.sendKeys("R@m143o87");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        

	}

}
