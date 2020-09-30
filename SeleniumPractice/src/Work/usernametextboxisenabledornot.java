package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class usernametextboxisenabledornot extends Base
{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		if(username.isEnabled()) 
		{
			System.out.println("Username is enabled");
		} 
		else
			{
			
			System.out.println("Username is disabled");
	}
             driver.close();
}}