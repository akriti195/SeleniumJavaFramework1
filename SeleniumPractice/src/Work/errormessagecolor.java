package Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class errormessagecolor extends Base{

	public static void main(String[] args) throws Exception {
			driver.manage().window().maximize();
	        driver.get("http://localhost:8080/login.do");
	        WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
	        login.click();
	        WebElement errormsg=driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
	        String errortext=errormsg.getText();
	        System.out.println("Error msg text is : "+errortext);
	        String c=errormsg.getCssValue("color");
	        String colorhex=Color.fromString(c).asHex();
	        System.out.println("Text color is : "+colorhex);
	        if(colorhex.equals("#ce0100")) {
	        	System.out.println("Text color is : Red");
	        }else {
	        	System.out.println("Text color is not : Red");

	        }
	        String fontsize=errormsg.getCssValue("font-size");
	        System.out.println("Text color font size is : "+fontsize);
	        String fontweight=errormsg.getCssValue("font-weight");
	        System.out.println("Text color font weight is : "+fontweight);
	        
	        driver.close();

	}

}
