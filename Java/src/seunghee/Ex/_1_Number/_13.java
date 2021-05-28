package seunghee.Ex._1_Number;

public class _13 {
    public static void main(String[] args) {

    	// Sum = 2 -3 +5 -8 +12 - ... + NUM
    	
        int num = 10;
        int sum = 0;
        int j = 2;

        for (int i=1; i<=num; i++) {
            j += (i-1);

            if (i%2==1) {
            	sum += j;
            } else {
            	sum -= j;
            }
        }
        
        System.out.println(sum);
    }
}