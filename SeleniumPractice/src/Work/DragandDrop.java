package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base
{

	public static void main(String[] args) 
	{
		driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        WebElement Block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
        WebElement Block2=driver.findElement(By.xpath("//h1[text()='Block 3']"));
        Actions action=new Actions(driver);
        action.dragAndDrop(Block1, Block2).perform();
        
	}

}
