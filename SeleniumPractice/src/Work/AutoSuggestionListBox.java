package Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestionListBox extends Base {

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
        Thread.sleep(3000);
        List<WebElement> autosuggetion=driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
        int count=autosuggetion.size();
        System.out.println("Auto Suggetion count is : "+count);
        driver.findElement(By.xpath("//b[contains(text(),'interview questions')]")).click();
	}

}
