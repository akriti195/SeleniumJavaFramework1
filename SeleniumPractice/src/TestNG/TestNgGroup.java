package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestNgGroup {
	@Test(priority=1, groups= {"user","smoke"})
	public void createUser() {
		Reporter.log("createUser",true);
	}
	@Test(priority=2,invocationCount=1,enabled=true,groups= {"user"})
	public void editUser() {
		Reporter.log("editUser",true);
	}
	@Test(priority=3, groups={"user"})
	public void deleteUser(){
		Reporter.log("deleteUser", true);
	}
	@Test(priority=1, groups={"product", "smoke"})
	public void createProduct(){
		Reporter.log("createProduct", true);
	}
	@Test(priority=2, invocationCount=1, enabled=true, groups={"product"})
	public void editProduct(){
		Reporter.log("editProduct", true);
	}
	@Test(priority=3, groups={"product"})
	public void deleteProduct(){
		Reporter.log("deleteProduct", true);
	}

}
