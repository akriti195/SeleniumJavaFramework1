package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class versionofactitime extends Base {

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement version=driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]"));
		String text=version.getText();
		System.out.println("ActiTime Version is : "+text);
		driver.close();
		
             }

}
