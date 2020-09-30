package Work;

import java.util.Set;

import org.openqa.selenium.By;

public class getWindowHandlesinmultipletabs extends Base{

	
		public static void main(String[] args) {
	    	 driver.manage().window().maximize();
	         driver.get("http://localhost:8080/login.do");
	         String parentwindowhandle=driver.getWindowHandle();
	         System.out.println("Parent Window Handle is : "+parentwindowhandle);
	         driver.findElement(By.id("username")).sendKeys("admin");
		     driver.findElement(By.name("pwd")).sendKeys("manager");
		     driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
             Set<String> awhs=driver.getWindowHandles();
             System.out.println("All Window Handle is : "+awhs);

	}

}
