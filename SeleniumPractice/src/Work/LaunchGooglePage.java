package Work;

public class LaunchGooglePage extends Base{
	public static void main(String[] args)
	{
	driver.manage().window().maximize();	
	driver.get("http://www.google.com");
	String title=driver.getTitle();
	System.out.println("Title is : "+title);
	String currentUrl=driver.getCurrentUrl();
	System.out.println("Current Url is : "+currentUrl);
	String pageSource=driver.getPageSource();
	System.out.println("Page Source is : "+pageSource);
	driver.close();
}
}
