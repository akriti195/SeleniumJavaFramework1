package Work;

import java.util.Scanner;

public class number_is_positive_or_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println(n+" "+" is the positive number");
		}
		else {
			System.out.println(n+" "+" is the negative number");
		}
           sc.close();
	}

}
