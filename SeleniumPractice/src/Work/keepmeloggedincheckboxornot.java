package Work;

import org.openqa.selenium.By;

public class keepmeloggedincheckboxornot extends Base{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		String keepmeloggedincheckbox=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).getAttribute("type");
		if(keepmeloggedincheckbox.equalsIgnoreCase("checkbox"))
		{
	System.out.println("This is check box");

}
		else
		{
	
	System.out.println("This is not check box");

}
		driver.close();
		
	}
	}

