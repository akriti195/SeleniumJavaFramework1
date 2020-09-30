package Work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPopup extends Base
{

	public static void main(String[] args) throws Exception 
	{
		driver.manage().window().maximize();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        WebElement saymyname=driver.findElement(By.xpath("//input[@type='button']"));
        saymyname.click();
        Thread.sleep(2000);
        Alert alerttext=driver.switchTo().alert();
        
        Thread.sleep(2000);
        System.out.println(alerttext.getText());
        Thread.sleep(2000);
        alerttext.sendKeys("Ram");
        Thread.sleep(2000);
        alerttext.accept();
        System.out.println(alerttext.getText());
        alerttext.dismiss();
        Thread.sleep(2000);
        driver.close();
	}

}
