package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodsDependencyonOtherMethods {
	@Test(priority=1)
	public void createUser() {
		System.out.println("user craeted");
	Assert.fail();
	}
    @Test(priority=3, dependsOnMethods="createUser")
    public void deleteUser() {
    	System.out.println("user deleted");
    }}
