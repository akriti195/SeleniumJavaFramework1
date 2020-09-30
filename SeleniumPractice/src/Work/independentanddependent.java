package Work;

import org.openqa.selenium.By;

public class independentanddependent extends Base
{

	public static void main(String[] args) throws Exception 
	{
		driver.manage().window().maximize();
		driver.get("https://docs.seleniumhq.org/download/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Change log']")).click();
		

	}

}
