package Work;

public class navigate extends Base
{
public static void main(String[] args) throws InterruptedException 
	{
		driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();  
        Thread.sleep(3000);
        driver.close();
	}

}
