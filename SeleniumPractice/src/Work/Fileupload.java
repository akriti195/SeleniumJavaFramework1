package Work;

import org.openqa.selenium.By;

public class Fileupload extends Base{

	public static void main(String[] args) throws Exception {
		driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        driver.findElement(By.xpath("(//input[@type='file'][@nv-file-select=''])[2]")).sendKeys("E:\\Kreatio Docs\\upload.xlsx");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-upload'])[1]")).click();
        Thread.sleep(3000);
        

	}

}
