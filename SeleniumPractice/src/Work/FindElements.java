package Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base {

	public static void main(String[] args) {
		driver.manage().window().maximize();
        driver.get("http://localhost:8080/login.do");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int count=links.size();
        System.out.println("Total link count is :"+count);

	}

}
