package Work;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider="getData")
	public void test(String user, String pass, String browser) {
	//System.out.println("For testing");
	}
	@DataProvider
	public Object [][] getData(){
		Object [][] data= new Object[2][3];
		//1st row
		data[0][1]="user1";
		data[0][2]="pass1";
		data[0][3]="Mozilla";
		
		//2nd row
		data[1][1]="user2";
		data[1][2]="pass2";
		data[1][3]="Chrome";
		
		return data;
	}

}
