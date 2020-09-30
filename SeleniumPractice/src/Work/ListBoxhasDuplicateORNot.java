package Work;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBoxhasDuplicateORNot extends Base{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("E:\\\\Selenium\\\\ListBox_Breakfast.html");
        WebElement list=driver.findElement(By.id("mtr"));
        Select s=new Select(list);
        List<WebElement> option=s.getOptions();
        int count1=option.size();
        System.out.println("List text count is : "+count1);
        HashSet hashset=new HashSet();
        for(int i=0;i<count1;i++) {
        	String text=option.get(i).getText();
        	hashset.add(text);
        }
        int count2=option.size();
        System.out.println("HashSet text count is : "+count2);
        if(count1==count2) {
        	System.out.println("Listbox has no duplicate value");
        }else {
        	System.out.println("Listbox has duplicate value");
        }
            System.out.println("Listbox text order is :"+hashset);
            driver.close();
	}
}
