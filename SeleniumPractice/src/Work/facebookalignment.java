package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class facebookalignment extends Base
{
public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
		int un_y=un.getLocation().getY();
		int un_height=un.getSize().getHeight();
		int un_width=un.getSize().getWidth();
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		int pwd_y=pwd.getLocation().getY();
		int pwd_height=pwd.getSize().getHeight();
		int pwd_width=pwd.getSize().getWidth();
		
		if(un_y==pwd_y && un_height==pwd_height && un_width==pwd_width) 
		{
         System.out.println("Username and Password text box are aligned ");
		}
		else
		{
	         System.out.println("Username and Password text box are not aligned ");
		
	}

}}
