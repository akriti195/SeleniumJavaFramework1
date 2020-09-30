package Work;

import java.io.IOException;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxAndChromeTogether {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
	WebDriver driver;
	@Test
	
	//@Parameters({browser})
	
	public void loginFFandCHROME(String browser) throws InterruptedException, IOException{
		//Reporter.log(browser, true);
		if (browser.equals("firefox")) {
			 driver = new FirefoxDriver();
		} else {
			 driver = new ChromeDriver();
		}

		

	}

}
