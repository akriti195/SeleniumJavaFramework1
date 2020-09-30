package Work;

import org.openqa.selenium.By;

public class frame  extends Base
{

	public static void main(String[] args) 
	{
		driver.manage().window().maximize();
        driver.get("file:///E:/Selenium/Page2.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("a");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("a");
        
        

		

	}

}
