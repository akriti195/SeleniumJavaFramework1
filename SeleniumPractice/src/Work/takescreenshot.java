package Work;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class takescreenshot extends Base
{
	public static void main(String[] args) throws Exception 
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshot/Google.jpeg");
		Files.copy(srcFile, destFile);
		driver.close();
		

	}

}
