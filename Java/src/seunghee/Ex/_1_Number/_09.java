package seunghee.Ex._1_Number;

public class _09 {
	public static void main(String[] args) {
		
		// Sum = 1 + 1 + 2 + 3 + 5 + 8 + 13 + ... + NUM
		
		int num = 10;
	    int sum = 0;
	
	    int a = 1;
	    int b = 0;
	    int c = 0;
	
	    for (int i=1; i<=num; i++) {
	        sum += a;
	        c=a;
	        a=a+b;
	        b=c;
	    }
	    
	    System.out.println(sum);
	}
}