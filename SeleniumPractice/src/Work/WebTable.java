package Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends Base{

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium/WebTable.html");
		List<WebElement> totalrowcount=driver.findElements(By.xpath("//tr"));
		int count=totalrowcount.size();
		System.out.println("Total row count is : "+count);
		List<WebElement> totalcellcount=driver.findElements(By.xpath("//th|//td"));
		int cellcount=totalcellcount.size();
		System.out.println("Total cell count is : "+cellcount);
		driver.close();

	}

}
