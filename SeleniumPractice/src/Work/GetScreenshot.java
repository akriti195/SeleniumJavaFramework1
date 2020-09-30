package Work;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class GetScreenshot extends Base {

	public static void main(String[] args) throws Exception {
		Date d=new Date();
		String date1=d.toString();
		System.out.println("date1");
		String date2=date1.replaceAll(":", "_");
		System.out.println("date2"); 
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File desFile=new File("./Screenshot/"+date2+"_ActitimeLoginwithdate.png");
		Files.copy(srcFile, desFile);
		driver.close();
	}

}
