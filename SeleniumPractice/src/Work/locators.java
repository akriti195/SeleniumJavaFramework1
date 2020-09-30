package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class locators extends Base
{

	public static void main(String[] args) throws Exception 
	{
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement un=driver.findElement(By.xpath("//input[@id='username']"));
		un.clear();
        un.sendKeys("admin");
        WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.clear();
        pass.sendKeys("manager");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        Thread.sleep(2000);
        driver.close();
		

	}

}
