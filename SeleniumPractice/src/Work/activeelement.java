package Work;

public class activeelement extends Base
{

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("admin");
		
	}

}
