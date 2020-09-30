package Work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListboxContentinSortedorder extends Base {

	public static void main(String[] args) {
		driver.manage().window().maximize();
        driver.get("E:\\\\Selenium\\\\ListBox_Breakfast.html");
        WebElement list=driver.findElement(By.id("mtr"));
        Select s=new Select(list);
        List<WebElement> options=s.getOptions();
        int count=options.size();
        System.out.println("List box content text count is : "+count);
        ArrayList list1=new ArrayList();
        for(WebElement webelement: options) {
        	String text=webelement.getText();
        	System.out.println("List box content text is : "+text);	
        	list1.add(text);
        	
        }
        Collections.sort(list1); 
		System.out.println("List box content text order is : "+list1);
		driver.close();
		
	}

}
