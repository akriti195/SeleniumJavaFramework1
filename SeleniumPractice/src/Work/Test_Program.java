package Work;

import java.util.Scanner;

public class Test_Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int sum=0;
		for(int i=0; i<s.length(); i++) {
		    char temp = s.charAt(i);
		    if (Character.isDigit(temp)) {
		        int b = Integer.parseInt(String.valueOf(temp));
		        sum=sum+b;
		    }
		}
		System.out.println(sum);
		
	}

}

