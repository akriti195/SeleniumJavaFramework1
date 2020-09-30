package Work;

import java.util.Set;

public class windowHandles extends Base
{
             public static void main(String[] args) {
	    	 driver.manage().window().maximize();
	         driver.get("https://www.naukri.com/");
	         String parentbrowserwindow=driver.getWindowHandle();
	         Set<String> windowhandles=driver.getWindowHandles();
	         System.out.println("Window Handle Id's is : " +windowhandles);
	         int count=driver.getWindowHandles().size();
	         System.out.println("Count is :"+count);
	         for(String windowhandle : windowhandles) {
	         driver.switchTo().window(windowhandle);
	         if(windowhandle.equals(parentbrowserwindow)) {
	         String title=driver.getTitle();
	         //System.out.println("Window Handle Id's : "+title+" is "+windowhandles);
	         System.out.println("Main Window browser : "+title+" is closed");
	         driver.close();
	}

}}
}