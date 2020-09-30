package Work;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextTextmethodofActionclass extends Base
{

	public static void main(String[] args) throws Exception 
	{
		driver.manage().window().maximize();
        driver.get("http://localhost:8080/login.do");
        WebElement link=driver.findElement(By.xpath("//a[contains(text(),'actiTIME')]"));
        Actions a=new Actions(driver);
        a.contextClick(link).perform();
        Thread.sleep(3000);
        Robot r=new Robot();
        //r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        //r.keyRelease(KeyEvent.VK_CONTROL);
        //Thread.sleep(3000);
        //driver.quit();
        

	}

}
