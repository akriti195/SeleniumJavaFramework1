package Work;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UniqueContentOfTheListBox extends Base{

	public static void main(String[] args) {
		driver.manage().window().maximize();
        driver.get("E:\\\\Selenium\\\\ListBox_Breakfast.html");
        WebElement list=driver.findElement(By.id("mtr"));
        Select s=new Select(list);
        List<WebElement> options=s.getOptions();
        int count=options.size();
        System.out.println("List box text count is : "+count);
        HashSet hashset=new HashSet();
        for(WebElement webelement:options) {
        	String text=webelement.getText();
        	hashset.add(text);
        	 	
        }
        System.out.println("HashSet text is : "+hashset);
    	driver.close();
	}

}
