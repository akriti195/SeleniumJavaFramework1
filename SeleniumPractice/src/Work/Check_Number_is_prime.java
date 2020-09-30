package Work;

import java.util.Scanner;



public class Check_Number_is_prime {
	
	public static void main(String [] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
	
	//loop through the numbers one by one
	for (int i=1; i <n; i++)
	{
	boolean isPrime = true;
	//check to see if the number is prime
	for (int j=2; j < i ; j++)
	{
	if (i % j == 0)
	{
	isPrime = false;
	break;
	}
	}
	// print the number
	if (isPrime)
	System.out.print(i + " ");
	}
	}
	}