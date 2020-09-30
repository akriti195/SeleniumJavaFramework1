package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class gettootiptext extends Base
{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement tooltip=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		String tooltiptext=tooltip.getAttribute("title");
		System.out.println("tooltiptext is : "+tooltiptext);
		driver.close();
		

	}

}
