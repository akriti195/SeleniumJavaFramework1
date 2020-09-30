package Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		String PageSource=driver.getPageSource();
		System.out.println("Actitime Login Page Source is : "+PageSource);
		Thread.sleep(2000);
		driver.close();


	}

}
