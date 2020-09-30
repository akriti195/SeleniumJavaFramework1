package Work;

public class special_two_digit_numbers {

	public static void main(String[] args) {
		int n=59;
        int d1 = n/10;
        int d2 = n%10;
        int sum = (d1+d2)+(d1*d2);
        if(n==sum) {
        	System.out.println(n+" "+"is special two digit number");
        }
        else {
        	System.out.println(n+" "+"is not special two digit number");
        }
	}

}
