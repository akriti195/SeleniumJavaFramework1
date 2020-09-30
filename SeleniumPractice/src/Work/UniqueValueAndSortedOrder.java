package Work;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UniqueValueAndSortedOrder extends Base{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("E:\\\\Selenium\\\\ListBox_Breakfast.html");
        WebElement list=driver.findElement(By.id("mtr"));
        Select s=new Select(list);
        List<WebElement> option=s.getOptions();
        int count=option.size();
        System.out.println("List text count is : "+count);
        TreeSet treeset=new TreeSet();
        for(WebElement webelement:option) {
        	String text=webelement.getText();
        	treeset.add(text);
        }
        System.out.println("TreeSet Sorted order is : "+treeset);
        driver.close();
	}

}

