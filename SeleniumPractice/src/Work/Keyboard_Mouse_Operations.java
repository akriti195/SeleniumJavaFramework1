package Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Keyboard_Mouse_Operations extends Base {

	public static void main(String[] args) throws Exception {
		driver.navigate().to("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		Robot r=new Robot();
		r.mouseMove(300, 500);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
	}

}
