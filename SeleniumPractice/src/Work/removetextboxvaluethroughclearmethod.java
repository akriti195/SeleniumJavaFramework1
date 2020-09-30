package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class removetextboxvaluethroughclearmethod extends Base
{

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement un=driver.findElement(By.xpath("//input[@id='username']"));
		un.clear();	
		un.sendKeys("admin");
		un.clear();

	}

}
