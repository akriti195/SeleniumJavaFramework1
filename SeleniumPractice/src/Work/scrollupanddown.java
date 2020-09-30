package Work;

import org.openqa.selenium.JavascriptExecutor;

public class scrollupanddown extends Base{

	public static void main(String[] args) throws Exception {
	 driver.manage().window().maximize();	
     driver.get("http://seleniumhq.org/download");
     JavascriptExecutor js=(JavascriptExecutor)driver;
     for(int i=1; i<10; i++) 
     {
    	 //Scroll down
    	 js.executeScript("window.scrollBy(0,1000)");
    	 Thread.sleep(3000);
     }
     for(int i=1; i<10; i++) 
     {
    	 //Scroll up
    	 js.executeScript("window.scrollBy(0,-1000)");
    	 
	}

}}
