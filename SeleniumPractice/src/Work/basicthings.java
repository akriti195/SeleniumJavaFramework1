package Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicthings {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Google page title is : "+title);
		String currenturl=driver.getCurrentUrl();
		System.out.println("Googe Page Current URL is : "+currenturl);
		String pagesource=driver.getPageSource();
		System.out.println("Googe Page Current URL is : "+pagesource);
		Thread.sleep(2000);
		driver.close();

	}

}
