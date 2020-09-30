package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class isselected extends Base
{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement tooltip=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		if(tooltip.isSelected()) 
		{
			System.out.println("Checkbox is selected");
		} 
		else
			{
			
			System.out.println("Checkbox is not selected");
	}

}}