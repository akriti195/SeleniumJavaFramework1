package Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle extends Base {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Actitime Login Page title is : "+title);
		Thread.sleep(2000);
		driver.close();
		

	}

}
