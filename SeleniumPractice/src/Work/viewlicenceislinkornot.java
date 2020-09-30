package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class viewlicenceislinkornot extends Base{

	
		public static void main(String[] args) {
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/login.do");
			String viewlicence=driver.findElement(By.xpath("//a[text()='View License']")).getTagName();
			if(viewlicence.equals("a"))
			{
		System.out.println("view licence is a link");

	}
			else
			{
		
		System.out.println("view licence is not a link");

}
			driver.close();
			
		}
		}
