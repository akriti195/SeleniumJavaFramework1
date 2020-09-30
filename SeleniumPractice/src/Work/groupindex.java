package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class groupindex extends Base
{

	public static void main(String[] args) throws Exception 
	{
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='popup_menu_icon warning_icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='testing']")).click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		if(logout.isDisplayed())
		{
			System.out.println("Home page is present");
		}
		else
		{
			System.out.println("Home page is not present");
		}
		driver.close(); 
		
		
	}

}
