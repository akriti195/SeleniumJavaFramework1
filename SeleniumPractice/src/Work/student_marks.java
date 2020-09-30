package Work;

public class student_marks {

	public static void main(String[] args) {
		int m1=35,m2=45,m3=55,m4=65;
		if(m1<35||m2<35||m3<35||m4<35) 
			System.out.println("Fail");
		else {
			double per = (m1+m2+m3+m4)/4.0;
			if(per>=85) 
				System.out.println("Distinction");
			else if(per>=60) 
				System.out.println("First Class");	
			else if(per>=50)
				System.out.println("Second Class");	
			else
				System.out.println("Pass");	
			}
		}

	}


