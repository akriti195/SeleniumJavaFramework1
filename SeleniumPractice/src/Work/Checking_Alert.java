package Work;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checking_Alert {
	@Test
	public void alert() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
        Alert alertmsg = driver.switchTo().alert();
        String alertText = alertmsg.getText();
        System.out.println("alert text is :"+alertText);
        alertmsg.accept();
        String expectedMsg="Please select start place.";
        Assert.assertEquals(expectedMsg, alertText);
        driver.quit();
		
	}

}
