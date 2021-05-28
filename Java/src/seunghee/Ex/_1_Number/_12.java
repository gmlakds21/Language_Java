package seunghee.Ex._1_Number;

public class _12 {
    public static void main(String[] args) {

    	// Sum = 1 - 2 + 3 - 4 + ... + NUM
    	
        int num = 10;
        int sum = 0;

        for (int i=1; i<=num; i++) {
            if(i%2==1) {
                sum += i ;
            } else {
                sum -= i ;
            }
        }
        
        System.out.println(sum);
    }
}