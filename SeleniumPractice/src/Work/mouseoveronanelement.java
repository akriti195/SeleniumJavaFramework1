package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseoveronanelement extends Base
{
    public static void main(String[] args) throws Exception 
    {
    	driver.manage().window().maximize();
        driver.get("https://www.actimind.com/");
        WebElement aboutcompany=driver.findElement(By.xpath("//a[contains(text(),'ABOUT COMPANY')]"));
        Actions a= new Actions(driver);
        a.moveToElement(aboutcompany).perform();
        aboutcompany.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement ourarea=driver.findElement(By.xpath("//h3[contains(text(),'Our Areas of Expertise')]"));
        Thread.sleep(3000);
        a.moveToElement(ourarea).perform();
        WebElement ca=driver.findElement(By.linkText("Cloud Applications"));
        Thread.sleep(3000);
        a.moveToElement(ca).perform();
        Thread.sleep(3000);
        a.moveToElement(ourarea).moveToElement(ca).click().build().perform();
         
        
        

	}

}
