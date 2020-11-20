package Work;

import java.util.Scanner;

public class sum_of_1_to_n {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) 
		{
			 sum=sum+i;
			 
		}
		System.out.println("The Sum Of "+n+" Numbers are:" +sum);	
		sc.close();
		
	}

}
