package Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
   	    driver.manage().window().maximize();
        driver.get("http://localhost:8080/login.do");
        Thread.sleep(3000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        Runtime runtime=Runtime.getRuntime();
        runtime.exec("E:\\Selenium\\printpopupmy.exe");
        Thread.sleep(3000);
        driver.close();
	}
}
