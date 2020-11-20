package Work;

public class reverse_string {

	public static void main(String[] args) {
		String a="Ram Mani Rai is a QA engineer";
		StringBuilder sb=new StringBuilder();
		sb.append(a);
		StringBuilder reverse = sb.reverse();
		System.out.println("reverse string is :"+reverse);

	}

}

