package Work;

import java.util.Scanner;

public class print_1_to_n_numbers {

	public static void main(String[] args) {
		System.out.println("Enter number of n");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			System.out.println("Numbers are :"+i);
			
		}
		
	}

}
