package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoTestMethodsareDependentoneachOtherforException {
	@Test(priority=1, dependsOnMethods="deleteUser")
	public void createUser() {
		System.out.println("user craeted");
	}
    @Test(priority=3, dependsOnMethods="createUser")
    public void deleteUser() {
    	System.out.println("user deleted");
    }}

