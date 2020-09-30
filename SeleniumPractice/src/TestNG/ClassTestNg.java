package TestNG;

import org.testng.annotations.Test;

public class ClassTestNg {
      @Test(invocationCount=2, enabled=false)
      public void editUser() {
    	  System.out.println("edit user");
    	  
      }
}
