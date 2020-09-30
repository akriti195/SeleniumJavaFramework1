package Work;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PomClassforLoginPage {
	//Declaration
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	//Initialization
public PomClassforLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
}
//Utilization
	public void setUserName(String un) { 
		username.sendKeys(un);
	}
	public void setPassword(String pw) {
		pwd.sendKeys(pw);
	}
	public void clickLogin(){
		login.click();
	}}



