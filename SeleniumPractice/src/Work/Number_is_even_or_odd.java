package Work;

import java.util.Scanner;

public class Number_is_even_or_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%2==0)
		{
		System.out.println(n+" "+"is the even number");
		}else{
		System.out.println(n+" "+"is the odd number");
		sc.close();
		}
		}
	}


