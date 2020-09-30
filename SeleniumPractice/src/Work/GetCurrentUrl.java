package Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrl extends Base {

	public static void main(String[] args) throws Exception {
		
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Actitime Login Page CurrentUrl is : "+currentUrl);
		Thread.sleep(2000);
		driver.close();

	}

}
