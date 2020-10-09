package Work;

import java.awt.Dimension;
import java.awt.List;
import java.util.Collection;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBox extends Base{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("file:\\E:\\Selenium\\ListBox_Breakfast.html");
		WebElement list=driver.findElement(By.id("mtr"));
		Select s=new Select(list);
        Collection<WebElement> options=s.getOptions();
        System.out.println("Options are :"+options);
        int count=options.size();
        System.out.println("Web Element present inside the list box is : "+count);
        for(WebElement webelement:options) {
        	String allelement=webelement.getText();
        	System.out.println("All web element  text is : "+allelement);
        	s.selectByIndex(0);
        	s.selectByValue("v");
        	s.selectByVisibleText("Poori");
        	//System.out.println("***Print all the selected value***");
        	java.util.List<WebElement> allselected =s.getAllSelectedOptions();
        	int selectedtextcount=allselected.size();
        	System.out.println("All selected text count is : "+selectedtextcount);
        	s.deselectAll();
        	driver.close();
        	
        	
        }
	}

}
