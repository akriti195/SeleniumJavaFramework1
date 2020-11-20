package Work;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle_for_naukri {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
        String parentWindow = driver.getWindowHandle();
        Set<String> childWindow = driver.getWindowHandles();
        int count = childWindow.size();
        System.out.println("Child window count is :"+count);
        for(String windowHandle:childWindow) {
        	driver.switchTo().window(windowHandle);
        	String title = driver.getTitle();
        	System.out.println("Title is :"+title);
        	if(!windowHandle.equals(parentWindow)) {
        		driver.close();
                System.out.println("All child browser window is with"+title+" is closed");
        	}	
        	
        }
        driver.quit();
	}

}
