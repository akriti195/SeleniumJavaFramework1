package Work;

import java.util.Scanner;

public class Check_number_is_even_or_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" "+"Number is even");
		}else {
			System.out.println(n+" "+"Number is odd");
		}

	}

}
