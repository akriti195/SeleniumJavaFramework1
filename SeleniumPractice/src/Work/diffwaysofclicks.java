package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class diffwaysofclicks extends Base{

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
        driver.get("http://localhost:8080/login.do");
        Thread.sleep(3000);
        WebElement un=driver.findElement(By.xpath("//input[@id='username']"));
        un.clear();
        un.sendKeys("admin");
        Thread.sleep(3000);
        WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
        pwd.clear();
        pwd.sendKeys("manager");
        Thread.sleep(3000);
        WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
        login.click();
        //login.sendKeys(Keys.ENTER);
        driver.close();
        
        

	}

}
