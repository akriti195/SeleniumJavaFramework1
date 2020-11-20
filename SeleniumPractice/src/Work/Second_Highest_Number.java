package Work;

public class Second_Highest_Number {

	public static void main(String[] args) {
		int ar[]= {5,9,3,2,1,10};
		int fbig=ar[0];
		int sbig=ar[1];
		for(int i=0;i<ar.length;i++) {
			if(fbig<ar[i]) {
				sbig=fbig;
				fbig=ar[i];
			}else if(sbig<ar[i]){
				sbig=ar[i];
			}
				
		}
          System.out.println(fbig);
          System.out.println(sbig);
	}

}
