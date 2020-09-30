package Work;

public class Special_two_digit_number {

	public static void main(String[] args) {
		int n = 59;
		int d1 = n%10;//remainder=9
		int d2 = n/10;//divisor=8
		int sum = (d1+d2)+(d1*d2);
		if(n==sum) {
			System.out.println(n+" "+"is a special two digit number");
		}else {
			System.out.println(n+" "+"is not a special two digit number");

		}

	}

}
