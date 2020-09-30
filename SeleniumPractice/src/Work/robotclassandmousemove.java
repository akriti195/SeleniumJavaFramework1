package Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class robotclassandmousemove extends Base
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		Robot r=new Robot();
		r.mouseMove(300, 500);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_T);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		
		
		
		

	}

}
