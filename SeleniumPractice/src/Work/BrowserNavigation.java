package Work;

import java.util.concurrent.TimeUnit;

public class BrowserNavigation extends Base{

	public static void main(String[] args) {
		
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.navigate().to("https://mail.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();

	}

}
