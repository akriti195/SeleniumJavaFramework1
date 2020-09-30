package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class NavigatetoBottomofthePage extends Base
{
  public static void main(String[] args) throws Exception 
  {
		driver.manage().window().maximize();
        driver.get("http://www.seleniumhq.org/download/");
        driver.findElement(By.xpath("(//a[@id='close'])[1]")).click();
        WebElement footerlogo=driver.findElement(By.id("footerLogo"));
        int x=footerlogo.getLocation().getX();
        int y=footerlogo.getLocation().getY();
        System.out.println("x-coordinate is : "+x);
        System.out.println("y-coordinate is : "+y);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(2000);
	}

}
