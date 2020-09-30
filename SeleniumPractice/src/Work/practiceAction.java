package Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class practiceAction extends Base {

	public static void main(String[] args) throws Exception {
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		//DragAndDrop---http://demo.guru99.com/test/drag_drop.html
//		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
//		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//		action.dragAndDrop(source, target).perform();
	
		//MouseHiwer----http://demoqa.com/menu/
//		WebElement target = driver.findElement(By.xpath("//div[.='Electronics']"));
//		action.moveToElement(target).perform();
//		driver.findElement(By.xpath("//div[.='Utilities']")).click();
		
		
		//Double click----https://demoqa.com/tooltip-and-double-click/
		
		WebElement target = driver.findElement(By.xpath("//button[.='Hello, Double-click me']"));
		action.doubleClick(target).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
}
