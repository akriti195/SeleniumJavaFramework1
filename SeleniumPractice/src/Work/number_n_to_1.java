package Work;

import java.util.Scanner;

public class number_n_to_1 {

	public static void main(String[] args) {
		System.out.println("Enter number /n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			System.out.println(i);
		}

	}

}
