package Work;

import org.openqa.selenium.WebElement;

public class Print_windowHandle extends Base
{
     public static void main(String[] args) {
    	 driver.manage().window().maximize();
         driver.get("http://localhost:8080/login.do");
         String windowhandle=driver.getWindowHandle();
         System.out.println(windowhandle);
         driver.close();

	}

}
