package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class alignment extends Base
{
public static void main(String[] args) throws Exception 
{
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(2000);
		WebElement un=driver.findElement(By.xpath("//input[@id='username']"));
		int un_x=un.getLocation().getX();
		//int un_y=un.getLocation().getY();
		int un_height=un.getSize().getHeight();
		int un_width=un.getSize().getWidth();
		
		WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
		int pwd_x=pwd.getLocation().getX();
		//int pwd_y=pwd.getLocation().getY();
		int pwd_height=pwd.getSize().getHeight();
		int pwd_width=pwd.getSize().getWidth();
		
		if(un_x==pwd_x && un_height==pwd_height && un_width==pwd_width) 
		{
         System.out.println("Username and Password text box are aligned ");
		}
		else
		{
	         System.out.println("Username and Password text box are not aligned ");
		
	}

}}
