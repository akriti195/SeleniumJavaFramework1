package Work;

import java.util.Scanner;

public class Welcome_to_HCL {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		if(str.contains("m")) {
			System.out.println("m is present");
		}else {
			System.out.println("m is not present");
		}

	}

}
