package Work;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_handle_for_actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc')]")).click();
        Set<String> child = driver.getWindowHandles();
        int windowCount = child.size();
        System.out.println(windowCount);
        for(String tab:child) {
        	//driver.switchTo().window(tab);
        	if(!parent.equalsIgnoreCase("child")) {
        		driver.switchTo().window(tab);
        		System.out.println(driver.getTitle());
        		
        	}
        	driver.close();
        }
	}

}
