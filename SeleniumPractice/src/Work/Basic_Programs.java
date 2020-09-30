package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Basic_Programs extends Base{

	public static void main(String[] args) {
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
        String CssValue = driver.findElement(By.xpath("//span[contains(text(),'invalid')]")).getCssValue("color");
	    System.out.println("Css text color is : "+CssValue);
	    String hex = Color.fromString(CssValue).asHex();
	    System.out.println("Hex color value is : "+hex);
	    if(hex.equals("#ce0100")) {
	    	System.out.println("Color is red");
	    }else {
	    	System.out.println("Color is not matching");
	    }
         driver.close();
	}

}
