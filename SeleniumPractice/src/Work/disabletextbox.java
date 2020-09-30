package Work;

import org.openqa.selenium.JavascriptExecutor;

public class disabletextbox extends Base{

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium/DisabledTextBox.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");
		js.executeScript("document.getElementById('t2').value='manager'");
		js.executeScript("document.getElementById('t2').type='button'");
		js.executeScript("document.getElementById('t1').type='button'");
		Thread.sleep(2000);
		driver.close();
		
	}

}
