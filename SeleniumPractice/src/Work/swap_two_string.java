package Work;

public class swap_two_string {
	
	public static void main(String[] args) {
     String a = "Ram";
     String b="Mani";
     a=a+b;
    System.out.println("Before swapping the string is :"+a);
    b=a.substring(0, a.length()-b.length());
    System.out.println(b);
    a=a.substring(b.length());
    System.out.println("After swapping :a="+a+" and b="+b);
}}
