package Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class openwindowinincognitomode extends Base
{

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

}
