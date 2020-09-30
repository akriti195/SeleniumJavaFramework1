package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class istbscenario extends Base {

	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().maximize();
        driver.get("https://www.istqb.in/");
        WebElement foundation=driver.findElement(By.linkText("FOUNDATION"));
        Actions a= new Actions(driver);
        a.moveToElement(foundation).perform();
        Thread.sleep(3000);
        WebElement enrollment=driver.findElement(By.linkText("ENROLLMENT"));
        Thread.sleep(3000);
        a.moveToElement(enrollment).perform();
        WebElement corporateenrollment=driver.findElement(By.xpath("//ul[@class='uk-nav uk-nav-navbar']//li[@class='uk-parent uk-nav-header'][contains(text(),'CORPORATE ENROLLMENT')]"));
        Thread.sleep(3000);
        a.moveToElement(corporateenrollment).perform();
        Thread.sleep(3000);
        WebElement onlineenrollment=driver.findElement(By.xpath("(//a[text()='ONLINE ENROLLMENT'])[1]"));
        a.moveToElement(onlineenrollment).click();
        



	}

}
